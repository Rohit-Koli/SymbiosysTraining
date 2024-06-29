package stringIntro;

public class ImmutableEx extends mul{
	public ImmutableEx(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul m = new mul("ROhit");
		System.out.println();
	}

}
class mul{
	private final String name ;
	public mul(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	private  String printH() {
		return name;
	}
}
