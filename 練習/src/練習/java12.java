package 練習;

public class java12 {
  public static void main(String[] args) {
	  int i =(int)(Math.random()*20)-10;
	  System.out.println(i);
	  if (i >= 1) {
	  System.out.println("正の値です");
      } else if (i <= -1) {
      System.out.println("負の値です");
      } else if (i == 0) {
      System.out.println("0の値です");
      }
  }
}
