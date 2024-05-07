package seattle;

public class Main {
    public static void main(String[] args){
        SeattleEmployee Seat=new SeattleEmployee();
        SeattleSSEmployee NewSeat=new SeattleSSEmployee();
        Seat.setEmpName("Pepper");
        NewSeat.setEmpName("森本真由");
        
        System.out.println("社員名："+NewSeat.getEmpName());
        System.out.println("所属部署:"+NewSeat.getDept());
        System.out.println("社員名："+Seat.getEmpName());
        System.out.println("所属部署:"+Seat.getDept());
    }
}
