package java_example;

public class trainee {

		String name;
		String sex;
		String address;
		int fee;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 trainee obj= new trainee();
			    
			    obj.name="regina"; //fill obj.name
				obj.sex= "Male";//fill obj.sex 
				obj.address="Virgania";
				obj.fee= 2000;
				
				System.out.println("Name of customer1 "+obj.name);
				System.out.println("Sex of customer1 "+obj.sex);
				System.out.println("Address of customer1 "+obj.address);
				System.out.println("Fee of customer1 "+obj.fee);
				
				trainee kinza= new trainee();
				kinza.name ="kinza";
				kinza.sex ="F";
				kinza.address = "Aldie";
				kinza.fee = 1000;
}
	
	
	
}
