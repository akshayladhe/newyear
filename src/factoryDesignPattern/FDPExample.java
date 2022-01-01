package factoryDesignPattern;

public class FDPExample {

	public static void main(String[] args) {
		
		Profession pro = ProfessionFactory.professon("Doctor");
		pro.profession();
	}
}
