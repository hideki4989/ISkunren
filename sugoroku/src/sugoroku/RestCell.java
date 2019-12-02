package sugoroku;

public class RestCell extends Cell {

	public RestCell() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		coma.addPoint(-100);  //とりあえず適当に
		coma.proceed(0);
		System.out.println("NERV本部に戻って修理！");
		return false;
	}

	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "初号機が撃破された！一回休み";
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "R";
	}

}
