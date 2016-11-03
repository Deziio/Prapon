public class Member extends Customer{
  private double points;
  
  public Member(String fn , String ln , int c){
    super(fn , ln , c);
    points = 0;
  }
  public double getPoints(){
    return points;
  }
  public void setPoints(double p){
    points = points + (p/1000);
  }
  public double convertPoints(double cp){
    double converted = cp*20;
    points = points - cp;
    return converted;
  }
  
}