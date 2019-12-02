package sugoroku;

public class StartCell extends Cell {

	public StartCell() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

/*	@Override
	public void doEvent() {
		// TODO 自動生成されたメソッド・スタブ

	}*/

	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "すごろくゲームはじまるよ！ピッタリGOALに行かないと終わらないYO!";
	}

	@Override
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "S";
	}

}
