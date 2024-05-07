package Classnokinou;

public class Employee2{
    String name;
    private static int instanceCount=0;
    public Employee2(){
        this.name="匿名希望";
        instanceCount++;
    }
    public Employee2(String name){
        //StringBuilderに引数nameをStringBuilderオブジェクトをインスタンス化
        StringBuilder val=new StringBuilder(name);
        //valのlength()で文字の長さを返すことができる(StringBuilderの機能)
        if(val.length()>=11){
            //文字数を１１文字に切り詰める(StringBuilderの機能)
            val.setLength(11);
        }
        //nameフィールドに引数nameを代入
        this.name=name;
        instanceCount++;
    }
    public void name(){
        System.out.println("私はシアトルコンサルティングに所属する"+this.name+"です。");
    }
    public void Count(){
        System.out.println("社員数は"+instanceCount+"人です。");
    }
}