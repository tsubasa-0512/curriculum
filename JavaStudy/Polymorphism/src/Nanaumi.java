
public class Nanaumi implements OrderFromMotoki,  OrderFromShihandai{

	private String name;
	private String date;

	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + "、";

		if(shoriFlg == 0) {
			System.out.println(nameAnd + date + "の勤務表出しました(｀･ω･´)ゞ！！！！！！");
		} else if(shoriFlg == 1) {
			System.out.println(nameAnd + date + "の交通費も出しました(｀･ω･´)ゞ！！！！！！");
		} else {
			System.out.println(nameAnd +  "本当はまだ何も出してません(｀･ω･´)ドヤ！！！！！！");
		}
	}

	public void doNothing() {
		submitOrder(-1);
	}

	@Override
	 // 勤務表出せや！: OrderFromMotoki
	 public void daseyaKinmuhyo() {
	 submitOrder(0);
	 }

	 @Override
	 // できれば交通費も出せや！: OrderFromMotoki
	 public void daseyaKotsuhi() {
	 submitOrder(1);
	 }

	 @Override
	 // セブンイレブン行けや！: OrderFromMotokiのお邪魔虫メソッド
	 // （わざわざsubmitOrder(int)で処理させる必要もないよね！
	 public void goToSevenEleven() {
	 System.out.println("先にセブンイレブン行ってきやす！");
	 }

	 @Override
	  // Javaカリキュラム作れ！: OrderFromShihandai
	 public String doCreateJavaCurriculum() {
	 return "Javaカリキュラム完成しました！";
	 }
}
