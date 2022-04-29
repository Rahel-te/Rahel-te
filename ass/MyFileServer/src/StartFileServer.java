import java.rmi.Naming;
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1009);
			
			FileServer fs=new FileServer();
			fs.setFile("rich.doc");			
			Naming.rebind("rmi://10.194.119.71/abc", fs);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}