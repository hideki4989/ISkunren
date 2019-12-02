package sugoroku;

public class GoalCell extends Cell {
	
	public GoalCell() {
		
	}

/*	@Override
	public boolean doEvent() {
		// TODO 自動生成されたメソッド・スタブ

	}*/

	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "死海文書の遂行がなされた！";
	}

	@Override
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "G";
	}

}
