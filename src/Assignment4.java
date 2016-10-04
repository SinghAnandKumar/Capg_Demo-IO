import java.io.File;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {

		String basePath = "D:\\dev\\demos\\eclipse-workspace\\Demo-Stream-IO\\", filename = "";
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter home directory : "); basePath =
		 * sc.nextLine();
		 */

		System.out.println("Enter file name : ");
		filename = sc.nextLine();

		File f = new File(filename);
		if (f.isDirectory()) {
			System.out.println(filename + " is a Directory \n. Its Contents are ----------");
			File files[] = f.listFiles();
			int fileCounter = 0, dirCounter = 0;

			for (File file : files) {
				if (file.isFile()) {
					fileCounter++;
					System.out.print("File : ");
				} else {
					dirCounter++;
					System.out.print("Dir :");
				}
				System.out.println(file.getName());
			}

			System.out.println("Total files = " + fileCounter + " \nTotal Dirs = " + dirCounter);

			files = f.listFiles();
			for (File file : files) {
				boolean flag = false;
				if (file.isFile()) {
					if (file.getName().contains(".txt")) {
						System.out.println("Do u want to delete " + file.getName() + " (Y/N) ?:");
						String choice = sc.next();
						if (choice.contains("Y") || choice.contains("y")) {
							flag = file.delete();
							if (flag) {
								fileCounter--;
								System.out.println("file deleted successfully");
							}
						}
					}
				}
			}
			
			System.out.println("Finally Total files = " + fileCounter + " \nTotal Dirs = " + dirCounter);

		} else {
			System.out.println(filename + " is a File");
			System.out.println("Absolute Path : " + f.getAbsolutePath());
			System.out.println("Rlative path : " + f.getPath());
			System.out.println("Size (KB)= " + f.length() / 1024);
			System.out.println("Can read ? " + f.canRead());
			System.out.println("Can write ? " + f.canWrite());
			System.out.println("Can execute ? " + f.canExecute());
		}

	}
}
