package GeneralPrograms;

public class LeapYear {

	public static void main(String[] args) {
		//400 4 but not 100
		
		int year=1998;
        if(year%400==0) {
        	System.out.println("Leap year");
        }else if((year%4==0)&&(year%100!=0)){
        	System.out.println("Leap");
        }else {
        	System.out.println("Not");
        }
	}

}
