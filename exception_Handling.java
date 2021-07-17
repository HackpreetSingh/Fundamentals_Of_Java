import java.io.IOException;  
class exception_Handling{  
  void m()throws IOException{  
    throw new IOException("device error khujli");//checked exception  
  }  
  void n()throws IOException{  
	  System.out.println("before");
	    m();
	    System.out.println("after");
	    }  
  void p(){  
   try{ 
	   System.out.println("before");
    n();
    System.out.println("after");
   }catch(Exception e)
   {System.out.println("exception handled "+e.getMessage());}  
   finally {
	   System.out.println("Finally Block");
   }
  }  
  public static void main(String args[]){  
   exception_Handling obj=new exception_Handling();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  