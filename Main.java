import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String tekst;
    System.out.println("Podaj tekst");
    tekst=in.nextLine();
    
    System.out.println(tekst.replace(' ', '_'));
    in.close();
    
  }
}