public class PhysicalBook extends Book
{
    public PhysicalBook(String title, double basePrice){
       super(title, basePrice);
    }
   
    public double getPrice(){
        return super.getPrice() + 50;
    }
    
    @Override
    public String toString(){
        return "ชื่อเรื่อง : " + getTitle() + " ราคา : " + getPrice();
    }
}