
public class Program1 {
public static void main(String[] args) {
	int math=80;
	int Sci=72;
	int Eng=65;
	 if (math>35 && Sci>35 && Eng > 35 )
	 { 
		  int a;
		a= (math+Sci+Eng) /3;
		if (a<75) {
			System.out.println("Distinction");
		}else if (a>=60 && a<75) {
			System.out.println("frist class");
		}
		else if (a>=50 && a<=60) {
			System.out.println("second class");
		}
		else if(a>=35 &&a<50)
		{
			System.out.println(" only pass");
		}
		 
	} else {
		 System.out.println("student is fail");
	 }
}
}
