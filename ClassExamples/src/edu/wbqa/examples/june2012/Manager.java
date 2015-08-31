package edu.wbqa.examples.june2012;

public class Manager extends Employees {
    
	public static int count = 0;
	private String projectName; 
	private Integer [] teamList = new Integer[3] ;
	private int [] a={0,0,0} ;
	
	public Manager(int empId, String empName, String projName, Integer [] teamList) {
		super(empId, empName);
		this.projectName = projName;
		for ( int i =0 ; i < teamList.length ; i++){
			this.teamList[i] = new Integer(teamList[i]) ;
		}
		count ++;
				
	}
	public Manager(int empId, String empName, String projName, int [] teamList) {
		super(empId, empName);
		this.projectName = projName;
		for ( int i =0 ; i < teamList.length ; i++){
			this.a[i] = teamList[i];
		}
		count ++;
			
	}
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer[] getTeamList() {
		return teamList;
	}

	public void setTeamList(Integer[] teamList) {
		this.teamList = teamList;
	}
	public void print(){
		System.out.println("This is Manager Class");
	}

}
