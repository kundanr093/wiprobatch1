class cube{
	public static void main(String args[]){

		int num = 123;
		int a=0;int b=0; int c=0;
		for(int i = 0; i<3; i++){
			a=num%10;
			b=a*a*a + b;
			num=num/10;
		}
		System.out.println(b);
	}


}