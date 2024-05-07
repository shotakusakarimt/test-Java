package Classnokinou;

public class Main2 {
    public static void main(String[] args){
        CapsulationPractice cap=new CapsulationPractice();
        cap.setPrivateData(200);
        System.out.println("CapsulationData:"+cap.getPrivateData());
    }
}
