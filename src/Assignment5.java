import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Assignment5 {
	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		
//		Writer writer = new PrintWriter(new File("output.txt"));
		Writer writer = new PrintWriter(System.out);
		BufferedWriter bw = new BufferedWriter(writer);
		
		while(true){
			System.out.println("\nEnter : ");
			String inputLine = br.readLine();
			char input[] = inputLine.toCharArray(),output[]=new char[inputLine.length()];
			int cntr=0;
			for(char c: input){
				if(Character.isUpperCase(c))
					output[cntr++]=Character.toLowerCase(c);
				else if(Character.isLowerCase(c))
					output[cntr++]=Character.toUpperCase(c);
				else if(Character.isDigit(c))
					output[cntr++]='*';
				else
					output[cntr++]=c;
			}
			
//			bw.write(output);
//			bw.flush();
			writer.write(output);
			writer.flush();
			if(inputLine.contains("bye"))
				break;
			
		}
		
		br.close();
		bw.close();
	}
}
