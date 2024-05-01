public class Main{
    public static void main(String[] args){
        boolean key=true;
        while(key==true){
        System.out.println("1~100の整数を入力してください。");
        int numbers=new java.util.Scanner(System.in).nextInt();
        if(numbers%7==0){
            System.out.println("処理を終了しました。");
            break;
        }
        }
    }
}