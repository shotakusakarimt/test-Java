public class Main{
    public static void main(String[] args){
      int[] scores={20,30,45,35};
      for(int i=0;i<scores.length;i++){
          System.out.println((i+1)+"番目の社員の点数は"+scores[i]+"です。");
      }
      System.out.println("過去問を解いた社員の人数は全部で"+scores.length+"人です。");
    }
}