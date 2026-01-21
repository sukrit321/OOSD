public abstract class Book
{
    private String title;
    private double basePrice;
    
    public Book(String title, double basePrice){
        this.title = title;
        this.basePrice = basePrice;
    }
    
    public String getTitle(){
        return title;
    }
    
    public  double getPrice(){
        return basePrice;
    }
    
    public String toString(){
        return "ชื่อเรื่อง : " + title + " ราคา : " + basePrice;
    }
}