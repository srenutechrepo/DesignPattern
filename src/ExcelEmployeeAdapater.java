
public class ExcelEmployeeAdapater implements Employee {

	ExcelEmployee excelEmployee=null;
	
	public ExcelEmployeeAdapater(ExcelEmployee excelEmployee)
	{
		this.excelEmployee=excelEmployee;
	}
	@Override
	public String getId() {
		return String.valueOf(excelEmployee.getEid());
	}

	@Override
	public String getFirstName() {
		
		return excelEmployee.getEfirstname();
	}

	@Override
	public String getLastName() {
		
		return excelEmployee.getElastname();
	}

	@Override
	public String getEmail() {
		
		return excelEmployee.getEmailAdd();
	}

}
