public class Main{
    public static void main(String[] args){
        int fortune=new java.util.Scanner(System.in).nextInt();
        switch(fortune){
            case 1:
                System.out.println("もっと頑張りましょう");
                break;
                
            case 2:
                System.out.println("もう少し頑張りましょう");
                break;
                
            case 3:
                System.out.println("さらに上を目指しましょう");
                break;

            case 4:
                System.out.println("大変よくできました");
                break;

            case 5:
                System.out.println("大変優秀です");
                break;
            
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("諦めたらそこで試合終了ですよ");
                break;

        }
    }
}