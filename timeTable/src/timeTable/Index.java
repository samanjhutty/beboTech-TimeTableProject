 package timeTable;
 
 import java.util.*;

public class Index {
	Scanner scanner =new Scanner(System.in);
	
	private int fun_gotoMainMenu() {
		
		System.out.print("\n\nIf you want to go to main menu press 1 else 0: ");
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
				+ "4. Show Table\n\n"+
				"To select please choose the corresponding number:\n");
		
		int menu_input=scanner.nextInt();
		switch(menu_input) {
		case 1: table();
		fun_gotoMainMenu();
			break;
			
		case 2:System.out.print("2");
		fun_gotoMainMenu();
			break;
			
		case 3:System.out.print("3");
		fun_gotoMainMenu();
			break;
			
		case 4:System.out.print("4");
		fun_gotoMainMenu();
			break;
			
//		case (isLetter(menu_input)):
//			fun_gotoMainMenu();
//			break;
//		
			
			default:System.out.print("Invalid Input\n\n");
			fun_gotoMainMenu();
		}
		return 0;
		
	}


	private int table() {
	for(int i=0;i<31;i++) {
		System.out.print("_");
	}
	for(int i=0;i<11;i++) {
		System.out.print("|\n");
		
	}

	
		
		
		return 0;
	}
	public static void main(String[] args) {
		
		Index index=new Index();		
		
		index.mainMenu();

	}
}

