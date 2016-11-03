public class Customer{
  private String firstname;
  private String lastname;
  private int customerId;
  
  public Customer(String fn , String ln , int c){
    firstname = fn;
    lastname = ln;
    customerId = c;
  }
  public String getFirstname(){
    return firstname;
  }
  public void setFirstname(String fn){
    firstname = fn;
  }
  public String getLastname(){
    return lastname;
  }
  public void setLastname(String ln){
    lastname = ln;
  }
  public int getCustomerId(){
    return customerId;
  }
  public void setCustomerId(int c){
    customerId = c;
  }
  
}
  