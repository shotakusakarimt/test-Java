public class Main{
    public static void main(String[] args){
        int[][] seiseki;
        seiseki=new int[4][3];
        
        seiseki[0][0]=20;
        seiseki[0][1]=50;
        seiseki[0][2]=60;
        seiseki[1][0]=30;
        seiseki[1][1]=60;
        seiseki[1][2]=70;
        seiseki[2][0]=45;
        seiseki[2][1]=60;
        seiseki[2][2]=80;
        seiseki[3][0]=35;
        seiseki[3][1]=40;
        seiseki[3][2]=50;
        
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
               System.out.println("社員"+(i+1)+"番目の"+"点数は"+seiseki[i][j]+"点です。");
           }
           
       }
       
    }
}