interface vehicle{  
void v();  
}  
 
class bus implements vehicle{  
public void v(){
System.out.println("bus");
}  
}  
class car implements vehicle{  
public void v(){
System.out.println("car");
}  
}  

class abstraction{  
public static void main(String args[]){  
vehicle v=new bus();  
v.v();  
}
}  