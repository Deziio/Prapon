public class Product{
  private String productName; 
  private int productId;
  private double price;
  
  public Product(String pn , int pid , double p){
    productName = pn;
    productId = pid;
    price = p;
  }
  public String getProductName(){
    return productName;
  }
  public void setProductName(String spn){
    productName = spn;
  }
  public int getProductId(){
    return productId;
  }
  public void setProductId(int spi){
    productId = spi;
  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double sp){
    price = sp;
  }
  
}