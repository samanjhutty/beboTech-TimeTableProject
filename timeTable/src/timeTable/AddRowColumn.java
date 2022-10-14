package timeTable;

public class AddRowColumn {
	int ifColumnAdded=0;
	
	private int passingRows() {
		TableStructure tableStructure=new TableStructure();
		tableStructure.tableHeading();
		tableStructure.tableRows(3);//make dynamic
		tableStructure.tableRows(1);// make dynamic
		
		return 0;	
	}
	
	public int addRow() {
		passingRows();
		
		return 0;
	}
	
	public int  addColumn() {
		ifColumnAdded=1;
		
		
		
		
		return 0;
	}

}