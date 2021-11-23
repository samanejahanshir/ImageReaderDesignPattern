package models;

import models.enums.PicType;

public class JpegImage implements  ImageReader{
    @Override
    public String loadPic(String address) {
        return "jpeg pic was loaded .";
    }
}
