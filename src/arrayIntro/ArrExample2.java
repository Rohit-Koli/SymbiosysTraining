package arrayIntro;

public class ArrExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std[]= new Students[] {
			new Students(1, "Rohit", 77.23,"Kuwe"),
			new Students(2, "Meghraj", 79.45,"Shirpur"),
			new Students(3, "Hitesh", 88.23,"Balkuwe"),
			new Students(4, "Tushar", 71.20, "Balkuwe"),
			new Students(5, "Umesh", 83.78, "Shirpur"),
		};
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].id+" "+std[i].name+" "+std[i].marks+" "+std[i].city);
		}
	}

}
