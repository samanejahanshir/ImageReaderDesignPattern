package view;

import exceptions.TypeNotFoundException;
import models.ImageReader;
import models.ImageReaderFactory;
import models.User;
import models.enums.PicType;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        User user1=new User();
        user1.setName("samane");
        user1.setImage("source/img.png");
        File fileUser1=new File(user1.getImage());
        String[] seperatFileUser1=fileUser1.getName().split("\\.");

        User user2=new User();
        user2.setName("samane");
        user2.setImage("source/image.jpg");
        File fileUser2=new File(user2.getImage());
        String[] seperatFileUser2=fileUser2.getName().split("\\.");
        try {
            ImageReaderFactory imageReaderFactory = new ImageReaderFactory();
            ImageReader imageReader = imageReaderFactory.getImageInstance(PicType.getValue(seperatFileUser1[1]));
            System.out.println(imageReader.loadPic(user1,user1.getImage()));
            imageReader = imageReaderFactory.getImageInstance(PicType.getValue(seperatFileUser2[1]));
            System.out.println(imageReader.loadPic(user2,user2.getImage()));
            imageReader = imageReaderFactory.getImageInstance(PicType.PNG);
            System.out.println(imageReader.loadPic(user1,"c://pic"));
        }catch (TypeNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
