package 練習;
  public class java9 {
    public static void main (String[] args) {
      int num = (int)(Math.random()*100)+1;
      System.out.println(num);
      if (num < 50) {
        System.out.println("５０未満です");
      } else if (num > 50) {
        System.out.println("50以上です");
      }
    }
}
