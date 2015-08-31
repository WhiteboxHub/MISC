package edu.wbqa.examples.june2012;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Integer [] team = new Integer[3];
		team[0] = 101;
		team[1] = 101;
		team[2] = 101;
		
		int [] team1 = {100,234,122};
		
		Employees e = new Employees(111,"Tim");
		
		Manager m =  new Manager(112,"Kim","WBQA",team);
		Manager m1 =  new Manager(112,"Kim","WBQA",team1);
		
		Employees e1  = new Manager(113,"John","WBQA",team);
		
		System.out.println(Employees.companyName);
		e1.companyName = "Whiteboxqa";
		
		e.print();
		m.print();
		e1.print();
		
		Integer x  = new Integer(10);
		x = 12; //Auto Boxing
		
		int y = x.intValue(); //
		int y1 = x; // Auto- unboxing
		
		System.out.println("Nummber of manager instances" + Manager.count);
		
	}

}
