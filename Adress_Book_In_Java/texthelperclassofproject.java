package addressbook;
//texthepler class
import java.io.*;
import java.util.*;

public class TextHelper {

	
	public List<Address> Read() throws IOException{
		
		List<Address> liste =new LinkedList();
        
        File f = new File("projee.txt");
        if(f.exists()) { 
       

        BufferedReader read =new BufferedReader(new FileReader("projee.txt"));

        String row=null;

        row=read.readLine();

         while(row!=null) {
	
	            String id=row.split(",")[0];
	            String name=row.split(",")[1];
	            String street=row.split(",")[2];
	            String city=row.split(",")[3];
	            String gender=row.split(",")[4];
	            String zip=row.split(",")[5];
	
	        Address temp =new Address(id,name,street,city,gender,zip);
	        liste.add(temp);
	
	        row=read.readLine();
    }

      read.close();
        }
        else{
          f.createNewFile();
        }   

       return liste;
	}
	
	public void Write(List<Address> liste) {
		
		try {
			PrintStream writer =new PrintStream(new File("projee.txt"));
			
			
			for (Address person : liste) {
				writer.println(person.toString());
			}
			writer.close();
			
		}
		catch(IOException e){
			System.out.println("Hata var");
		}
		
		
		
		
	}	
	
}