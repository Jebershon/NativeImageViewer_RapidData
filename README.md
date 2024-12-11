## NativeImageViewer
View images, with zoom and pan.

## Features
- Shows the image full screen
- Allows zooming and panning
- Tap image to close viewer
- Image source can be Mendix image, base64 encoded data URL, or a local file on the device
Image width / height
- The widget needs the image width and height. For images created in the backend, use CommunityCommons.GetImageDimensions. For images taken in the native app, use the TakePictureAdvanced JavaScript action, which returns the dimensions in the ImageMetaData object.

## Usage
Place the widget on a page, preferably with a full-page layout and no other content.
Configure a close action, usually just "Close page" is sufficient.
Please note that the widget assumes to show the image fullscreen, so use a full-page layout and remove any spacing.

The intended use of this widget is to show it without any other content on the page.

It is possible to put other content, like a header or footer, on the page; these will overlay the image.

## Data URL
For base64 encoded image data, the data must have the data URL prefix, where <ext> is the image format, like jpg or png:

(Do not include the < > in the data.)

It is possible to put other content, like a header or footer, on the page, these will overlay the image.

### Data URL
For base64 encoded image data, the data must have the data URL prefix, where `<ext>` is the image format, like jpg or png: 
```
data:image/<ext>;base64,<base64 data>
```
(Do not include the `< >` in the data.)

