package models;

import models.enums.PicType;

public class PngImage implements ImageReader {
    @Override
    public String loadPic(String address) {
        return "png pic was loaded .";
    }
}
