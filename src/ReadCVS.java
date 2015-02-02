import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadCVS {
 
  public static void main(String[] args) {
 
	ReadCVS obj = new ReadCVS();
	obj.run();
 
  }
 
  public void run() {
 
	String csvFile = "E:/data-folder/geoIp.csv";
	String[] ConnectorType = csvFile.split("/");
	System.out.println("connector type is "+ConnectorType[2] );
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		int i=1;
		
		while ((line = br.readLine()) != null) {
			if(i==1)
			{
             line=br.readLine();
             i++;
			}
		        // use comma as separator
			String[] country = line.split(cvsSplitBy);
 
			System.out.println("Country [code= " + country[4] 
                                 + " , name=" + country[5] + "]");
 
		}
 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {

			
			try {
				br.close();
				
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
	System.out.println("Done");
  }
 
}