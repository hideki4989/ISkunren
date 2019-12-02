package sugoroku;

public class ReturnCell extends Cell {
	private int ret ; 
	public ReturnCell(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		ret = i;
	}

/*	@Override
	public void doEvent() {
		// TODO 自動生成されたメソッド・スタブ

	}*/

	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "大変だ！使徒の襲撃に遭った";
	}

	@Override
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		coma.addPoint(-100);  //とりあえず適当に
		coma.proceed(-ret);
		System.out.println("撤退！！"+ ret + "マス戻るぞ！！");
		return false;
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "B";
	}

}
