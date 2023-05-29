//java file permission
import java.io.*;
import java.security.Permission;
import java.security.PermissionCollection;
public class Java69_FilePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string of the home directory
		String srg = "/home/saga/Desktop//Fout.txt";
		//giving the file permission
   FilePermission file1 = new FilePermission("/home/saga/Desktop//Fout.txt", "write");
   //It is used to store collection of permission
   PermissionCollection permission = file1.newPermissionCollection();
   permission.add(file1);
   if(permission.implies(new FilePermission(srg, "read,write"))) {  
       System.out.println("Read, Write permission is granted for the path "+srg );  
       }else {  
      System.out.println("No Read, Write permission is granted for the path "+srg);            } 
   
	}

}
