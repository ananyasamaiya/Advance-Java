package utils;

public class Util{
    public static String generatedVerificationCode(){
        return java.util.UUID.randomUUID().toString().replace("-","");
    }
}