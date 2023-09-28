
package pertemuan_2_TolibKhoiri;

public class Game {
    public static void main(String[] args) {
        Player petani = new Player();
        
        petani.name = " Tolib Khoiri";
        petani.speed = 100;
        petani.healtpoin = 0;
        
        petani.run();
        
        if(petani.isdead()){
            System.out.println("Game Over");
        }
    }
}
