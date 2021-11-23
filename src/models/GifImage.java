package models;

import models.enums.PicType;

public class GifImage implements ImageReader{
    @Override
    public String loadPic(String address) {
        return "gif pic was loaded .";

    }
}
