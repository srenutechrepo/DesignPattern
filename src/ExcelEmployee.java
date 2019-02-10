
public class ExcelEmployee {
	private int eid;
	private String efirstname;
	private String elastname;
	private String emailAdd;
	
	
	public ExcelEmployee(int eid, String efirstname, String elastname, String emailAdd) {
		super();
		this.eid = eid;
		this.efirstname = efirstname;
		this.elastname = elastname;
		this.emailAdd = emailAdd;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEfirstname() {
		return efirstname;
	}
	public void setEfirstname(String efirstname) {
		this.efirstname = efirstname;
	}
	public String getElastname() {
		return elastname;
	}
	public void setElastname(String elastname) {
		this.elastname = elastname;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

}
