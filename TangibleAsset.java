public abstract class TangbleAsset {
  private String name;
  private int price ;
  private String color;

  private TangbleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;s
  }
  public String getName(){
    return this.name
  }
   public String getPrice(){
    return this.Price
  }
   public String getColor(){
    return this.color
  }
}
