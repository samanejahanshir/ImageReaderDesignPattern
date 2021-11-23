package models;

import models.enums.PicType;

public class JpegImage implements  ImageReader{
    @Override
    public String loadPic(User user ,String address) {
        return user.getName()+" format pic was supported . jpeg pic was loaded .";
    }
}
