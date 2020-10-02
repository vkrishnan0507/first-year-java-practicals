
import java.io.*;
class PrintLines
{
public static void main(String args[])throws IOException
    {
int ai;
try(FileInputStream fin = new FileInputStream(args[0]) )
       {
			do
              {
                  ai=fin.read();
                  	if((char)ai=='/')
                    {
                  		ai=fin.read();
                  		if((char)ai=='/')
                        {
                  		do
                          {
                             ai=fin.read();
                             if(ai!=(int)'\n')
                             {
                            	 
                            	 System.out.print((char)ai);
                             }
                          }while((char)ai!='.');
                       }
                    }
              }while(ai!=-1);
         }
	

    
  }
}  
