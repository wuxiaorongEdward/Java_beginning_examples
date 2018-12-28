//read a character from the keyboard

class KBIn {
    public static void main(String [] args)
            throws java.io.IOException {
             char ch;
             
             System.out.print("Press a key followed by Enter : ");
             ch = (char) System.in.read();        //get a character from keyboard
              System.out.println("Your key is " + ch);
}
}