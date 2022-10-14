package timeTable;
 

public class TableStructure {
	
	
	private int table(int loop_length , String loop_print) {
		int loop;
		for(loop=1;loop<=loop_length;loop++)
			System.out.print(loop_print);
		
	return 0;
	}
	
public int showTable() {
		
		System.out.print(" ");
		table(63,"_");
		table(1,"\n|\t");
		System.out.print(" ");
		table(1,"\t|\t");
		System.out.print("Tims1");
		table(1,"\t|\t");
		System.out.print("Time2");
		table(1,"\t|\t");
		System.out.print("time3");
		table(1,"\t|\t\n");
		return 0;
	}

public int tableRows(int loop_length) {
	for(int i=1;i<=loop_length;i++) {
		System.out.print(" ");
		table(63,"_");
		table(1,"\n|\t");
		System.out.print(" ");
		table(1,"\t|\t");
		System.out.print("Time1");
		table(1,"\t|\t");
		System.out.print("Time2");
		table(1,"\t|\t");
		System.out.print("time3");
		table(1,"\t|\t\n");
		
	}
	table(63,"_");
	
	return 0;
}
}
