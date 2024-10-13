package GeneralPrograms;
class OwnImmutbleClass {
public static void main(String[] args) {
	ImmutableStudent i1= new ImmutableStudent("Yashu", 1);
	System.out.println(i1.getName());
	System.out.println(i1.getId());
}}
public final class ImmutableStudent{
	private final String name;
	private final int id;
	public ImmutableStudent(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	}
