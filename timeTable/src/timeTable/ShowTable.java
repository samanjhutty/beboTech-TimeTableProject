package timeTable;

public class ShowTable {
	
	public ShowTable(int length) {
		
	TableStructure tableStructure=new TableStructure();
	tableStructure.tableHeading();
	tableStructure.tableRows(length);
		
	}

}
