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
		if(/*use var ifColumnAdded is 1*/) {
			for(int i=63;i=i+10;i++)
			table(i,"_"); 
		}
		else if(/*use var ifColumnAdded is 0*/) {
		table(63,"_");   //make dynamic ie. 63
		
		}
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
	
public int tableHeading() {
		
		underScore();
		newVerticalLine();
		string("heading1"); //make dynamic
		
		verticalLine();
		string("heading2"); //make dynamic
		
		verticalLine();
		string("heading3"); //make dynamic
		if() {
			verticalLine();
			string("heading3.1"); //make dynamic
			verticalLine();
		}
		else {
			continue;
		}
		
		verticalLine();
		string("heading4"); //make dynamic
		endVerticalLine();
		
		underScore();
		return 0;
	}

public int tableRows(int loop_length) {
	for(int i=1;i<=loop_length;i++) {
		
		newVerticalLine();
		string(" ");
		verticalLine();
		string("time3"); //make dynamic
		
		verticalLine();
		string("time2"); //make dynamic
		verticalLine();
		if(/*use var ifColumnAdded is 1*/) {
			verticalLine();
			string("time2.1"); //make dynamic
			verticalLine();
		}
		else if(/*use var ifColumnAdded is 0*/) {
			continue;
		}
		string("time3"); //make dynamic
		endVerticalLine();
		
		underScore();
		
	}
	return 0;
}
}
