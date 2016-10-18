package fcu.iecs;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			if(i==0||i==2||i==4){
				continue;
			}
			else{
				System.out.println(i);
			}
		}
		
	}

}
