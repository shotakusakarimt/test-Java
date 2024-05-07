package seattle;

public class SeattleEmployee {

   	/**
    * 社員氏名
    */
    	private String empName;
	
   	/**
	    * 社員氏名を取得する(return empNameを指定)
	    * @return empName
	    */
    	public String getEmpName() {
        		return empName;
    	}

   	/**
    * 社員氏名をセットする (変数にemoNameを指定)
    * @param empName
    */
    	public void setEmpName(String empName) {
       		this.empName = empName;
    	}
	
   	/**
    * 所属部署を取得する
    */
    	public String getDept(){
        		return "無所属";
    	}
}