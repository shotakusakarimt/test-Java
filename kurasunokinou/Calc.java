package kurasunokinou;

public class Calc {
    public static void sameName(){
        System.out.println("引数を持たないsameNameメソッドです。");
    }
    public static void sameName(int a){
        System.out.println("int型の引数を保持するsameNameメソッドです。引数:"+a);
    }
    public static void sameName(int a,int b){
        System.out.println("int型の引数を保持するsameNameメソッドです。引数:"+a+","+b);
    }
    public static void sameName(String a){
        System.out.println("String型の引数を保持するsameNameメソッドです。引数:"+a);
    }
    public static void sameName(String a,String b){
        System.out.println("String型の引数を保持するsameNameメソッドです。引数:"+a+","+b);
    }
}
