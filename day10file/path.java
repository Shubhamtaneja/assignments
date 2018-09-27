import java.io.*;
class Path {
	public static void main(String args[]) {
		try {
				FileWriter fw=new FileWriter("new.txt");
				String str="C:/Users/Test/video.mp$";
				fw.write(str);
				fw.close();
				System.out.println("Done");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		File f=new File("new.txt");
		System.out.println("File Absolutepath: "+f.getAbsolutePath());
	}
}