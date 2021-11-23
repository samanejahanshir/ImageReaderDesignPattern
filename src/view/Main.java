package view;

import models.ImageReader;
import models.ImageReaderFactory;
import models.enums.PicType;

public class Main {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory=new ImageReaderFactory();
        ImageReader imageReader=imageReaderFactory.getImageInstance(PicType.GIF);
        System.out.println(imageReader.loadPic("c://pic"));
        imageReader=imageReaderFactory.getImageInstance(PicType.JPEG);
        System.out.println(imageReader.loadPic("c://pic"));
        imageReader=imageReaderFactory.getImageInstance(PicType.PNG);
        System.out.println(imageReader.loadPic("c://pic"));

    }
}
