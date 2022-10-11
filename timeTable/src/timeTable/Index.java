 package timeTable;
 
 import java.util.*;

public class Index {
	Scanner scanner =new Scanner(System.in);
	int input=0;
	
	private int fun_gotoMainMenu() {
		
		System.out.print("If you want to go to main menu press 1 else 0: ");
		int get_input=scanner.nextInt();
		
		if(get_input==1) {
			Index index= new Index();
			index.mainMenu();
		}
		else if(get_input==0){
			return 0;
			
		}
		else {
			System.out.print("Invalid Input");
		}
		
		return 0;
	}
	
	private int mainMenu() {
		System.out.print("1. Create\n"
				+ "2. Update\n"
				+ "3. Delete\n"
				+ "4. Show Table"+
				"to select please choose the corresponding number:\n");
		
		
		
		return 0;
		
	}

	public static void main(String[] args) {
		
		Index index=new Index();		
		
		index.mainMenu();
		index.fun_gotoMainMenu();
	}
}

