package beadando1_ht;


import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class simple_encryption {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader (new FileReader("input.txt"));
		StringBuffer str= new StringBuffer();
		int b,c;
		PrintWriter pw = new PrintWriter("encryption.txt");
		
		while((c=br.read())!=-1) {
			
			//betűk és egyébb karakterek külön kezelése
			if(Character.isLetter((char)c)) {
				
				//Z, z esetén újrakezdeni az abc-t
				if(Character.compare((char)c, 'z')==0) {
					b = 'a';
				}
				else if(Character.compare((char)c, 'Z')==0) {
					b = 'A';
				}
				else{
					b = c+1;
				}
				str.append((char)b);
			}
			else {
				str.append((char)c);
			}
			
				
		}
		
		System.out.print(str);
		pw.print(str);
		pw.flush();
		pw.close();
		br.close();
	}
}