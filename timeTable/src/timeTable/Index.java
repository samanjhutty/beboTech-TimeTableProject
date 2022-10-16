 package timeTable;
 
 import java.util.*;

public class Index {
	Scanner scanner =new Scanner(System.in);
	int row_length=0;
	
	private int fun_gotoMainMenu() {
		
		System.out.print("\n\nIf you want to go to main menu press 1 else 0: ");
		int get_input=scanner.nextInt();
		
		if(get_input==1) {
			mainMenu();
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

		System.out.print("1. Add\n"
				+ "2. Update\n"
				+ "3. Delete\n"
				+ "4. Show Table\n\n"+
				"To select please choose the corresponding number:\n");
		
		int menu_input=scanner.nextInt();
		switch(menu_input) {
		case 1:rowColumn();
			fun_gotoMainMenu();
			break;
			
		case 2:System.out.print("2");
		fun_gotoMainMenu();
			break;
			
		case 3:System.out.print("3");
		fun_gotoMainMenu();
			break;
			
		case 4:AddRowColumn addRowColumn= new AddRowColumn();
		row_length=addRowColumn.rlength;
		
			new ShowTable(row_length);
		fun_gotoMainMenu();
			break;
			
//		case (isLetter(menu_input)):
//			fun_gotoMainMenu();
//			break;
			
			default:System.out.print("Invalid Input\n\n");
			fun_gotoMainMenu();
		}
		return 0;
	}
	
	private int rowColumn() {
		
		System.out.print("\nTo add row press 1, for column press 2: ");
		int rcInput=scanner.nextInt();
		AddRowColumn addRowColumn = new AddRowColumn();
		
		if(rcInput==1) {
			addRowColumn.addRow();
			fun_gotoMainMenu();
		}
		else if(rcInput==2) {
			addRowColumn.addColumn();
			fun_gotoMainMenu();
		}
		else if(rcInput!=1 && rcInput!=2){
			System.out.print("Invalid Input");
			fun_gotoMainMenu();
		}
		return 0;
	}

	public static void main(String[] args) {
		
		Index index=new Index();		
		index.mainMenu();

	}
}

