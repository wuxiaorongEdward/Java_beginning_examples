class MathDemo {
	public static void main(String[] args) {
		//generate a random number
		int randomNum = (int) (Math.random() * 100 + 1);
		System.out.println("the randomNum is " + randomNum);
		
		//get the max of two numbers
		System.out.println("the max of 10 and 20 is " + Math.max(10 , 20));
		
		//get the ceil number
		System.out.println("the ceil number of 12.4  is " + Math.ceil(12.4));
		
		//get the floor number
        System.out.println("the floor number of 12.4   is " + Math.floor(12.4));
		
		System.out.println("the round number of 12.4   is " + Math.floor(12.4f) + " and " + "the round number of 12.65  is " + Math.floor(12.65f));
	}
}