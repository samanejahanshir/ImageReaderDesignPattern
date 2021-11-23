package models;

import models.enums.PicType;

public class PngImage implements ImageReader {
    @Override
    public String loadPic(User user ,String address) {
        return user.getName()+" format pic was supported . png was loaded .";
    }
}
