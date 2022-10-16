package timeTable;

public class AddRowColumn {
	Index index=new Index();
	int rlength;
	 AddRowColumn() {
		
		rlength=index.row_length;
	}
	
	public int addRow() {
		rlength=0;
		rlength++;
		new ShowTable(rlength);
		
		
		return rlength;	
	}
	
	public int  addColumn() {
		
		
		
		
		return 0;
	}

}