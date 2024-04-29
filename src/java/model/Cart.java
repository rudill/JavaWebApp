package model;

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
    

    public Cart(int ID, String ProductName, double Price, String Category, String Image,int Quantity) 
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
    
    
    
     public String getProductName() {
        return ProductName;
    }
    
    
    public String getCategory()
    {
        return Category;
    }
    
    
    public double getPrice()
    {
        return Price;
    }
    
    
    public String getImage()
    {
        return Image;
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




