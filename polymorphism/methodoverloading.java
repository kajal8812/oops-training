
class addition{
  public int add(int a, int b, int c){
 int r1 = a + b + c;
 return r1;
    }
 public double add(double a, double b){
  double r2 = a * b;
  return r2;
}
}
  
class methodoverloading{
public static void main(String[] args){
  calculator c = new calculator();
  int r1 =c.add(1,2,3);
  System.out.println(r1);
  double r2 =c.add(1.0,2.0);
  System.out.println(r2);
}
}
  