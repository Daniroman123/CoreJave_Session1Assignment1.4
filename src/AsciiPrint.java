/*Write a program to print the characters corresponding to ASCII codes from 65 to 90*/

public class AsciiPrint {

	public static void main(String[] args) {
		String ch; // Initialize a string
        int i;
        for(i=65; i<=90; i++)
        {
            ch = new Character((char)i).toString(); // typecasting int to char gives ascii code
            // toString is used to represent oobject as string
            System.out.print(i+ "-" + ch + "\n");
        }

	}

}
