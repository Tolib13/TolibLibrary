
package GamePackage;

public class RunGame {
    public static void main(String[] args) {
    Enemy monster = new Enemy();
    Zombie zumbi = new Zombie();
    Pocong poccy = new Pocong();
    Burung garuda = new Burung();
    
   //Monster
    monster.name="Joko";
    monster.attack();
    
    //Zombi
    zumbi.name = "Tolib";
    System.out.println(zumbi.name);
    zumbi.attack();
    zumbi.walk();
    
    //Pocong
    poccy.jump();
    poccy.attackPoin=100;
        System.out.println("Attack"+poccy.attackPoin);
    
    //garuda
    garuda.fly();
    garuda.jump();
    garuda.walk();
    garuda.name="GARUDA";
        System.out.println("nama"+garuda.name);
    
    }
}
