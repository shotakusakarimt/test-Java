public class Main{
    public static void main(String[] args){
        System.out.println("java Question1");
        System.out.println("1から10の和は、"+calcA()+"です。");
        System.out.println("1から100の和は、"+calcB()+"です。");
    }
    public static int calcA(){
        int sum=0;
        for(int i=1;i<11;i++){
            sum+=i;
        }
        return sum;
    }
    public static int calcB(){
        int sum=0;
        for(int i=1;i<101;i++){
            sum+=i;
        }
        return sum;
    }
}