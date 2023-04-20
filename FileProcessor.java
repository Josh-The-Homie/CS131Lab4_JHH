import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor{

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList ;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		this.setFileName(fileName);=fileName;
		this.stringLength=stringLength;
		stringList=new ArrayList<String>();
		
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile() {
		Scanner input=new Scanner(this.fileName);
		try {
			while(input.hasNextLine()) {
				String newString= input.nextLine();
				if(newString.length()>this.stringLength) {
					stringList.add(newString);
				}
				else { throw new StringTooLongException("String too Long!");
					}
				catch(StringTooLongException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		
	}//end processFile

	private String getFileName() {
		return fileName;
	}

	private void setFileName(String fileName) {
		if(fileName!=null) {
			this.fileName=fileName;
		}
	}

	private int getStringLength() {
		return stringLength;
	}

	private void setStringLength(int stringLength) {
		if(stringLength<5) {
			stringLength=5;
		}
		else {
			this.stringLength = stringLength;
		}
	}
}//end class
