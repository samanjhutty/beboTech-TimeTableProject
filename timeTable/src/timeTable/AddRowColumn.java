package timeTable;

public class AddRowColumn {
	Index index=new Index();
	int rlength;
	 AddRowColumn() {
		
		rlength=index.row_length;
	}
	
	public int addRow() {
		rlength++;
		System.out.print(rlength);
		
//		new ShowTable(rlength);
		
		int dummyvar=0;
		rlength+=dummyvar;
		
		
		return rlength;	
	}
	
	public int  addColumn() {
		
		
		
		
		return 0;
	}

}