package edu.wbqa.examples.nov2012;

public class GradeSheet {
         private double sub1 ;
         private double sub2 ;
         private double sub3 ;
         private char grade;
        
        public GradeSheet(double sub1 , double sub2 , double sub3){
        	this.sub1 = sub1;
        	this.sub2 = sub2;
        	this.sub3 = sub3;
        	setGrade();
        }
		public double getSub1() {
			return sub1;
		}
		public void setSub1(double sub1) {
			this.sub1 = sub1;
		}
		public double getSub2() {
			return sub2;
		}
		public char getGrade(){
			return grade;
		}
		public void setGrade(){
			double sum = this.sub1 + this.sub2 + this.sub3;
			if (sum > 250)
				this.grade ='A';
			else if ( sum > 100 )
				this.grade ='B';
			else 
				this.grade ='C';
		}
}
