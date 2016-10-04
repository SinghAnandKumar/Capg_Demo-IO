import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "testIO.prmtv";
		IOUtils io = new IOUtils();

		try (FileOutputStream fOut = new FileOutputStream(fileName)) {
			io.writePrimitiveValues(fOut);
		}

		try (FileInputStream fOut = new FileInputStream(fileName)) {

			io.readPrimitiveValues(fOut);
		}
	}

	
	public void writePrimitiveValues(OutputStream out) throws IOException {
		// WRITE A LONG,DOUBLE,BOOL value

		try (DataOutputStream dOut = new DataOutputStream(out)) {
			dOut.writeLong(1L);
			dOut.writeDouble(12.34);
			dOut.writeBoolean(false);
		}
	}

	
	public void readPrimitiveValues(InputStream in) throws IOException {
		try (DataInputStream dIs = new DataInputStream(in)) {
			long lValue = dIs.readLong();
			System.out.print(lValue + "\t");
			double dValue = dIs.readDouble();
			System.out.print(dValue + "\t");
			boolean bValue = dIs.readBoolean();
			System.out.print(bValue + "\t");
		}
	}
}
