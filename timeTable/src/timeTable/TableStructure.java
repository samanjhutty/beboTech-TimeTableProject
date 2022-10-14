package timeTable;
 

public class TableStructure {
	
	
	private int table(int loop_length , String loop_print) {
		int loop;
		for(loop=1;loop<=loop_length;loop++)
			System.out.print(loop_print);
		
	return 0;
	}
	
	private int underScore() {
		string(" ");
		table(63,"_");
		
		return 0;
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
	
public int showTable() {
		
		underScore();
		newVerticalLine();
		string(" ");
		verticalLine();
		string("time1");
		verticalLine();
		string("time2");
		verticalLine();
		string("time3");
		endVerticalLine();
		underScore();
		return 0;
	}

public int tableRows(int loop_length) {
	for(int i=1;i<=loop_length;i++) {
		
		newVerticalLine();
		string(" ");
		verticalLine();
		string("time3");
		verticalLine();
		string("time2");
		verticalLine();
		string("time3");
		endVerticalLine();
		underScore();
		
	}
	return 0;
}
}
