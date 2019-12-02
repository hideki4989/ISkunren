package sugoroku;
/**
 * すごろくのプレイヤーと位置を表すコマクラス
 * @author 3d161 井口
 *
 */
public class Coma {
	/**
	 * プレイヤーの名前
	 */
	private String name;
	/**
	 * 現在位置
	 */
	private int position;
	
	/**
	 * コンストラクタ
	 * @param name プレイヤー名
	 */
	public Coma (String name) {
		this.name = name;
		this.position = 0;  //現在位置初期値
	}
	/**
	 * このコマの現在位置を返します
	 * @return 位置を表す数値
	 */
	public int getPositoin() {
		return this.position;
	}
	/**
	 * ポイント変数の作成
	 */
	int point = 0;
	
	/**
	 * このコマが指定された分量 進みます
	 * @param amount 進むコマ数
	 */
	public void proceed(int amount) {
		this.position += amount;	
	}
	public void addPoint( int amount ) {
		System.out.println(name + "は" + amount + "ポイントをゲットした！");
		this.point += amount;
	}
	/**
	 * このコマの現在の状態を表示します
	 */
	public void showProfile() {
		System.out.println(name + "の現在のポイントは" + point + "で" + position + "コマ目にいます");
	}
}
