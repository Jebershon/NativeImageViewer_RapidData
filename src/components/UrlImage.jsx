import { Image, PixelRatio } from "react-native";
import { createElement } from "react";

export function UrlImage({ uri, imageWidth, imageHeight }) {
    const pixelRatio = PixelRatio.get();
    const adjustedWidth = imageWidth * pixelRatio;
    const adjustedHeight = imageHeight * pixelRatio;

    return (
        <Image
            source={{ uri }}
            resizeMode="contain"
            style={{ width: adjustedWidth, height: adjustedHeight }}
        />
    );
}