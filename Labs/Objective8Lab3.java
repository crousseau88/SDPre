public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for(counter = 1; counter < 21; counter++ ) {
      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else if(counter % 2 == 1) {
        System.out.println(counter + " is odd");
      }
    }
  }
}
