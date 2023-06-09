class Bank{  
void bank(){System.out.println("Bank is the main class");}  
}  
class HDFC extends Bank{  
void hdfc(){System.out.println("hdfc is the sub class");}  
}  
class Inheritance{  
public static void main(String args[]){  
HDFC h=new HDFC();  
h.bank();  
h.hdfc();  
}}  