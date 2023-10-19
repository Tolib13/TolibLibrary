
package TugasInherintance;

public class GameInfo {
    String namagame,genre;
    float ukuran;
    
    void namagame(String name){
        namagame = name;
        System.out.println("Nama game : " + namagame);
    }
    void genre (String Genre){
        genre = Genre;
        System.out.println("Genre Game : "+genre);
    }
    void ukuran(float Size){
        ukuran = Size;
        System.out.println("Ukuran : " + ukuran + "MB");
    }
    
}
