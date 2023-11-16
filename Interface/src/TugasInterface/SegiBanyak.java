
package TugasInterface;


public interface SegiBanyak {
  void getLuas();
  
  default void getSisi() {
    System.out.println("getsisi bisa masuk ke get luas");
  }
}

