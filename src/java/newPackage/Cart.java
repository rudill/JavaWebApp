package newPackage;

/**
 *
 * @author dillo
 */
public class Cart 
{
    private int ID;
    private String ProductName ;
    private String Category;
    private double Price ;
    private String Image;
    private int Quantity;;
    

    Cart(int ID, String ProductName, double Price, String Category, String Image,int Quantity) 
    {
     this.ID=ID;
     this.ProductName=ProductName;
     this.Category=Category;
     this.Price=Price;
     this.Image=Image;
     this.Quantity=Quantity;
    }

   

    public int getID()
    {
        return ID;
    }
    
    public void setID(int ID)
    {
        this.ID=ID;
    }
    
    
     public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName=ProductName;
    }
    
    
    public String getCategory()
    {
        return Category;
    }
    
    public void setCategory(String Category)
    {
        this.Category=Category;
    }
    
    public double getPrice()
    {
        return Price;
    }
    
    public void setPrice(double Price)
    {
        this.Price=Price;
    }
    
    public String getImage()
    {
        return Image;
    }
    
    public void setImage(String Image)
    {
        this.Image=Image;
    }
    
    public int getQuantity()
    {
        
        return Quantity;
    }

   public void setQuantity(int Quantity)
   {
       this.Quantity=Quantity;
   }

    
}




