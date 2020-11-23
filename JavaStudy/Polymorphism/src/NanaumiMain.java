
public class NanaumiMain {
	public static void main(String[] args) {
		Nanaumi Nanaumi = new Nanaumi("七海", "2020/11");
		Nanaumi.daseyaKinmuhyo();
		Nanaumi.daseyaKotsuhi();
		Nanaumi.doNothing();
		Nanaumi.goToSevenEleven();

		final String message = Nanaumi.doCreateJavaCurriculum();
		System.out.println("message = " + message);
	}
}
