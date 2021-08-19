
public class Application {
	public static void main(String[]args) {
		Item<String> myItem=new Item<String>();
		myItem.setE("Lacey");
		
		Item<Integer> anotherItem=new Item<Integer>();
		anotherItem.setE(100);
		
		Smallbag<Item> baggie=new Smallbag<Item>();
		baggie.setItem(myItem);
		System.out.println(baggie.getItem().getE());
		
		baggie.setItem(anotherItem);
		System.out.println(baggie.getItem().getE());
		
	}
}
