package sugoroku;
/**
 * すごろくに使用されるマス目を表現する抽象基底クラス
 * @author 3d161 井口
 *
 */
public abstract class Cell {
	/**
	 * コンストラクタ(newできないのでprotectedにしておく)
	 */
	protected Cell() {
		// 
	}
	/**
	 * なにかしらのイベント(仕掛け)を準備する
	 * まだどうするのかは決まっていないけど
	 * @param coma イベントの対象となる コマ
	 * @return 
	 */
	public abstract boolean doEvent( Coma coma );
	/**
	 * このマス目の表示名（具体的に表示していきたい）
	 * @return 表示文字列
	 */
	public abstract String getCaption();

	/**
	 * このマス目のイメージ文字
	 * @return イメージ文字
	 */
	public abstract String getMark();
	
	

}
