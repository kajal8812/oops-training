class vehicle{  
  void speed(){System.out.println("30 km/hr");}  
}  
class car extends vehicle{  
  void speed(){System.out.println("40 km/hr");}  
  
  public static void main(String args[]){  
    vehicle v = new car();  
   v.speed();  
  }  
}  