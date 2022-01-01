package factoryDesignPattern;

public class ProfessionFactory {

	public static Profession professon(String TypeOfProfession) {

		if (TypeOfProfession == null) {
			return null;
		}

		if (TypeOfProfession.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		}

		if (TypeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}

		if (TypeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}

		return null;
	}
}
