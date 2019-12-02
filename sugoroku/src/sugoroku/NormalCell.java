/**
 * 
 */
package sugoroku;

public class NormalCell extends Cell {
/**
 * 	コンストラクタ
 */
	public NormalCell() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
	 * 非javadoc
	 * @see sugoroku.Cell#doEvent()
	 */
	@Override
	public boolean doEvent( Coma coma ) {
		// TODO 自動生成されたメソッド・スタブ
		coma.addPoint(100);  //とりあえず適当に
		return true;
	}
	/**
	 * 非javadoc
	 * @see sugoroku.Cell#getCaption()
	 */
	@Override
	public String getCaption() {
		// イベント発生しないマス目
		return "ゆっくりしといてくらはい。";
	}
	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return ">";
	}
	

}
