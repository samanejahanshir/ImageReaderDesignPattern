package models;

import models.enums.PicType;

public class GifImage implements ImageReader{
    @Override
    public String loadPic(User user ,String address) {
        return user.getName()+" format pic was supported . gif pic was loaded .";

    }
}
