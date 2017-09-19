
public class Patient {

	private String name;
	private int age;
	private double bmi;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public double dosage() {
		return 600.0;
	}

	public double bmi(double heightInMeters, double weightInKilograms) {
		// return 2.2;
		return weightInKilograms / (heightInMeters * heightInMeters);

	}

	public double bmi(double heightNum, String heightUnits, double weightNum, String weightUnits) {
		if (heightUnits.equals("cm")) {
			heightNum = heightNum / 100.00; // 0.01

		} else if (heightUnits.equals("in")) {
			heightNum = heightNum / 39.370; // 0.0254
		}

		if (weightUnits.equals("lbs")) {
			weightNum = (1 / 2.2) * weightNum; // 4

		} else if (weightUnits.equals("stone")) {
			weightNum = (1 / 0.16) * weightNum;
		}

		bmi = weightNum / (heightNum * heightNum);

		return bmi;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getBMI() {
		return bmi;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Patient " + getName() + " is " + getAge() + " years old.";
	}
}
