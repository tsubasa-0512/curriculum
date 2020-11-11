package check;

import constants.Constants;

public class Check {

	private String firstName = null;
	private String lastName = null;

	private Check() {
		this.firstName = "Tsubasa";
		this.lastName = "Oshima";
	}

	private void printName() {
		System.out.println("printNameメソッド→ " + lastName + firstName);
	}

	public static void main(String[] args) {
		 Check fn = new Check();
		 fn.printName();

		 Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		 pet.introduce();

		 RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		 rp.introduce();
	}
}
