package 練習;
  public class java10 {
    public static void main(String[] args) {
      int i = (int)(Math.random()*100)+1;
        System.out.println(i);
      if (i <= 10 || i >= 90) {
    	System.out.println("10以下、90以上の値です");
      } else if (i > 10 || i < 90){
    	System.out.println("１０より大きく９０未満です");
      }
    }
}
