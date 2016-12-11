public class mainy{
    public static void main(String[] args){
	Barcode dog = new Barcode("06054");
	System.out.println(dog);
	Barcode WRONG = new Barcode("0505a");
	
	//System.out.println(dog.checkSum());
    }
}
