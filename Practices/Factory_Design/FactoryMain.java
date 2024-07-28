package Practices.Factory_Design;
import Practices.Factory_Design.os_package.OS;
import Practices.Factory_Design.os_package.Android;

public class FactoryMain {
    public static void main(String[] args) {
          OS obj = new Android();
          obj.spec();
    }
} 
