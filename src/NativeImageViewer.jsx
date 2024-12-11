import { PixelRatio, View, useWindowDimensions,StyleSheet } from "react-native";
import { MendixImage } from "./components/MendixImage";
import { ReactNativeZoomableView } from "@openspacelabs/react-native-zoomable-view";
import { UrlImage } from "./components/UrlImage";

import { createElement } from "react";

export function NativeImageViewer({
    imageSource,
    imageToView,
    imageUrl,
    imageWidthAttr,
    imageHeightAttr,
    onCloseAction
}) {
    const window = useWindowDimensions();

    switch (imageSource) {
        case "mendixImage":
            if (!imageToView || imageToView.status !== "available" || !imageToView.value) {
                return null;
            }
            break;

        case "url":
            if (!imageUrl || imageUrl.status !== "available" || !imageUrl.value) {
                return null;
            }
            break;

        default:
    }

    if (!imageWidthAttr.value || !imageHeightAttr.value) {
        return null;
    }
    // let imageWidth = Number(imageWidthAttr.value);
    // let imageHeight = Number(imageHeightAttr.value);
    // const pixelDensity = PixelRatio.get();
    // imageWidth = PixelRatio.roundToNearestPixel(imageWidth / pixelDensity);
    // imageHeight = PixelRatio.roundToNearestPixel(imageHeight / pixelDensity);
    // // Calculate the smallest zoom ratio and use that for the image zoom ratio.
    // const zoomRatioWidth = window.width / imageWidth;
    // const zoomRatioHeight = window.height / imageHeight;
    // const zoomRatio = zoomRatioHeight < zoomRatioWidth ? zoomRatioHeight : zoomRatioWidth;

    let imageWidth = Number(imageWidthAttr.value);
    let imageHeight = Number(imageHeightAttr.value);
    
    const pixelDensity = PixelRatio.get();

    // Instead of reducing the dimensions, use the original dimensions
    const adjustedWidth = PixelRatio.roundToNearestPixel(imageWidth * pixelDensity);
    const adjustedHeight = PixelRatio.roundToNearestPixel(imageHeight * pixelDensity);


    // Calculate the smallest zoom ratio and use that for the image zoom ratio.
    const zoomRatioWidth = window.width / adjustedWidth;
    const zoomRatioHeight = window.height / adjustedHeight;
    const zoomRatio = zoomRatioHeight < zoomRatioWidth ? zoomRatioHeight : zoomRatioWidth;

    // Calculate the aspect ratio of the image
    const aspectRatio = imageWidth / imageHeight;

     // Calculate the height based on the aspect ratio and available window width
     const calculatedHeight = window.width / aspectRatio;

    const renderImage = () => {
        switch (imageSource) {
            case "mendixImage":
                return <MendixImage imageToView={imageToView} imageWidth={imageWidth} imageHeight={imageHeight} style={styles.image}/>;

            case "url":
                return <UrlImage uri={imageUrl.value} imageWidth={imageWidth} imageHeight={imageHeight} style={styles.image}/>;

            default:
                return null;
        }
    };

    return (
        <View style={styles.container}>
            <ReactNativeZoomableView
                maxZoom={30}
                minZoom={zoomRatio}
                initialZoom={zoomRatio}
                contentWidth={imageWidth}
                contentHeight={imageHeight}
                onSingleTap={() => {
                    if (onCloseAction && onCloseAction.canExecute && !onCloseAction.isExecuting) {
                        onCloseAction.execute();
                    }
                }}
            >
               <View style={styles.imageContainer}>
                    {renderImage()}
                </View>
            </ReactNativeZoomableView>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        overflow: 'hidden', 
    },
    imageContainer: {
        width: '100%',
        height: '100%',
        justifyContent: 'center',
        alignItems: 'center',
        overflow: 'hidden', // Hide any overflow content
    },
    image: {
        width: '100%',
        height: '100%',
        resizeMode: 'contain', // Ensure the image maintains its aspect ratio and fits within the container
    },
});