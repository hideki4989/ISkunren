package sugoroku;

public class RestartCell extends Cell {

	public RestartCell() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		coma.addPoint(-300);  //とりあえず適当に
		coma.proceed(StartCell());
		System.out.println("サードインパクト発生！！振り出しに戻る！");
		return false;
	}

	private int StartCell() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "セントラルドグマに使徒が侵入！！";
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "R";
	}

}
