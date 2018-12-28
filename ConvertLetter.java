class ConvertLetter{
  public static void main(String [] args)
     throws java.io.IOException{
		 char ch;
		 do{
			 ch = (char) System.in.read();
			 if(ch >= 'a'  && ch <= 'z')
				 ch -= 32;
			 else if(ch >= 'A' && ch <= 'Z')
				 ch += 32;
			 System.out.print(ch);
		 }while(ch != '.');
		 System.out.println();
	 }
}