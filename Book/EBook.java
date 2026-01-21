public class EBook extends Book implements Discountable
{
   public EBook(String title, double basePrice){
       super(title, basePrice);
   }
   
   @Override
   public double getPrice(){
       return super.getPrice() - calculateDiscount();
   }
   
   @Override
   public double calculateDiscount(){
       return super.getPrice() * 0.05;
   }
   
   @Override
   public String toString(){
       return "ชื่อเรื่อง : " + getTitle() + " ราคาหลังส่วนลด : " + getPrice();
   }
}