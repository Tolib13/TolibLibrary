
package pertemuan_2_TolibKhoiri;

public class Player {
    String name;
    int speed;
    int healtpoin;
    
    void run (){
        System.out.println(name + " is running . . . .");
        System.out.println(" Speed : " + speed);
    }
    
    boolean isdead(){
        if (healtpoin <= 0) return true;
        return false;
    }
}
