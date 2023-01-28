class First{
	public static void main(String[] args){

		System.out.println("Hello world 1");
		First.main();
		First obj = new First();
		obj.main();

	}

	public static void main(){

		System.out.println("Hello world 2");
		
	}

	
	

}

class Second{

	public void main(){

		System.out.println("Hello world 2");
	}
}
