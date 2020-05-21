    class A{  
    private int data=40;  
    private A(int a , int b){System.out.println("Hello java");}
    A(){System.out.println("Hello java 123");}
    }  
     
      
    public class Simple{  
     public static void main(String args[]){  
       A obj=new A();  
       //System.out.println(obj.data);//Compile Time Error  
       //obj.msg();//Compile Time Error  
       }  
    }  