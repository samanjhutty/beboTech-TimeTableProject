package timeTable;
 

public class TableStructure {
	
	
	private void table(int loop_length , String loop_print) {
		int loop;
		for(loop=1;loop<=loop_length;loop++)
			System.out.print(loop_print);	
		}
	
	private void underScore() {
		string(" ");
		table(63,"_");   //make dynamic ie. 63
	}

	private void string( String stringInput) {
		System.out.print(stringInput);
	}
	
	public void verticalLine() {
		table(1,"\t|\t");
	}
	public void newVerticalLine() {
		table(1,"\n|\t");
	}
	public void endVerticalLine() {
		table(1,"\t|\t\n");
	}
	
public void tableHeading() {
		
		underScore();
		newVerticalLine();
		string("heading1"); //make dynamic
		
		verticalLine();
		string("heading2"); //make dynamic
		
		verticalLine();
		string("heading3"); //make dynamic
	
		verticalLine();
		string("heading4"); //make dynamic
		endVerticalLine();
		
		underScore();
	}

public void tableRows(int loop_length) {
	for(int i=1;i<=loop_length;i++) {
		
		newVerticalLine();
		string(" ");
		verticalLine();
		string("time3"); //make dynamic
		
		verticalLine();
		string("time2"); //make dynamic
		verticalLine();
	
		string("time3"); //make dynamic
		endVerticalLine();
		
		underScore();	
	}
}
}
