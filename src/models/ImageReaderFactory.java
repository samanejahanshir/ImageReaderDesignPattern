package models;

import exceptions.TypeNotFoundException;
import models.enums.PicType;

public class ImageReaderFactory {
    public ImageReader getImageInstance(PicType type){
        ImageReader imageReader=null;
        switch (type){
            case GIF:
                imageReader=new GifImage();
                break;
            case PNG:
                imageReader=new PngImage();
                break;
            case JPEG:
                imageReader=new JpegImage();
                break;
            default:
                throw  new TypeNotFoundException("this type not supported ! ");
        }
        return  imageReader;
    }
}
