package models.enums;

import java.util.Locale;

public enum PicType {
    GIF,PNG,JPEG,NONE;
    public static PicType  getValue(String type){
      switch (type.toLowerCase(Locale.ROOT)){
          case "gif":
              return PicType.GIF;
          case "png":
              return  PicType.PNG;
          case "jpeg":
              return  PicType.JPEG;
      }
      return NONE;
    }
}
