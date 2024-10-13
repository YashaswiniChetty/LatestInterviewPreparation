package GeneralPrograms;

public class NoOfobjectsCreated {

	public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		new Demo();
	}
	Demo.total();
	}

}
class Demo{
static	int count;
Demo(){
	System.out.println("Demo object created"+count);
	count++;
}
static void total() {
	System.out.println("Total number of cars:"+count);
}
}
