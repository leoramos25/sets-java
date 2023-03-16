package application;

public class Main {

  public static void main(String[] args) {
    Client c1 = new Client("Maria", "Maria@gmail.com");
    Client c2 = new Client("Maria", "Alex@gmail.com");

    String s1 = "test";
    String s2 = "test";

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
