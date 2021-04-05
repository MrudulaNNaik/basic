package basics;

public class A2 {
	void m(){  
		System.out.println(this);
		}  
		public static void main(String args[]){  
		A2 obj=new A2();  
		System.out.println(obj);
		obj.m();  
		}  

}
