
package MethodGetterSetter;

public class Run {
    public static void main(String[] args) {
      User user = new User();
      user.Setusername("Tolib Khoiri");
      user.SetPassword("1013");
        System.out.println("Username : " + user.Getusername());
        System.out.println("Password : " + user.GetPassword());
    }
    
    
}
