package sugoroku;

import java.util.Random;
import java.util.Scanner;

/*
 * すごろくチャレンジ！
 * @author 井口
 */
public class Main {
	//すごろくインスタンスで使用する乱数発生装置を準備！
	private Random rand = new Random();
	//すごろくインスタンスで使用する入力装置を準備！
	private Scanner input = new Scanner(System.in);
	/**
	 * すごろくのマス目配列
	 * @param args
	 */
	private Cell[] path;
	/**
	 * プレイヤーのコマ
	 * @param args
	 */
	private Coma[] players;
			
	/*
	 * すごろくのメインプログラム
	 * @param args 起動時引数
	 */
	public static void main(String[] args) {
		//以下の機能を盛り込んでいきます。
		// ダイスの作成(do while or while)
		// マス目の作成
		//	ふりだし、あがり、その他いろいろなマスがあるはず
		// プレイヤーの作成（コンピュータも参戦）
		//	どの位置にいるかを記録しておく
		//  お金の概念とかを入れてみる
		// start goalとかはifもしくは多態性
		// どんなマスが存在しているか、画面に表示する
		// 競争するので、それぞれのプレイヤーの位置を画面表示する

//		Main m = new Main();
//		m.run();
		new Main().run(); //上の２行をこのように表すことも可能

	}

	/*
	 * すごろくプログラムの動作
	 */
	private void run() {
		//ゲームを始めるための下準備
		initGame();
		// ターンを繰り返し
		boolean goal = false;
		do {
			showPath(); //現在位置の表示
			for( int i = 0; i < players.length; i++ ) {
				if ( i == 0 ) {
					//プレイヤーがダイスを振る
					System.out.println("ダイスを振ってね♪（エンターキーを押すだけ！）");
					input.nextLine();  //入力待ち（データは読み取らない）ホントはthis.input.nextLine();
				}
				//1~4のどれか適当に（経路少な目なので4面体のすごろくにした）proceedは「進む」という意味
				int proceed = rand.nextInt(4) + 1;  //ホントはint proceed = this.rand.nextInt(4)+1;
				System.out.println( proceed + "が出たよ！" );
				// コマを出目分進める
				players[i].proceed(proceed);
				
				int pos = players[i].getPositoin();
				
				if ( pos < path.length ) {
					Cell now = path[pos];
					//どんなマスに来たかの情報を表示する
					System.out.println( now.getCaption() );
					//System.out.println(path[ pos ].getCaption() );
					//マス目に割り振られたイベントが発動する
					now.doEvent(players[i]);
					players[i].showProfile();
				}
				//もしゴールだったらゲーム終了(マス目の数pathとplayerの位置が以下の関係の場合はゴール)
				goal = path.length -1 == players[i].getPositoin();  //ゴール判定(ここだけはgetPosition()として残しておく)
				if ( (path.length -1) < players[i].getPositoin() ) {
					players[i].proceed(-(path.length -1 )-(players[i].getPositoin()));
					System.out.println((path.length -1 )-(players[i].getPositoin()) + "マス戻ります");
				} 
				if(goal) {
					System.out.println("ゴーーーーールですよ");
					break;
				}
			}
		} while(!goal);
		//ゲームが終わった時の処理
		exitGame();
	}
	/**
	 * 現状のすごろく状態を表示する
	 */
	private void showPath() {
		//マス目番号を表示
		System.out.println(" ");
		for (int i = 0; i < path.length; i++) {
			if(i < 10) {
				System.out.print(" ");
			}
			System.out.print( i + " ");
		}
		System.out.println(); //改行
		//マス目のイメージを表示
		System.out.print("");
		for (int i = 0; i < path.length; i++) {
			System.out.print(" " + path[i].getMark() + " " );
		}
		System.out.println();  //改行
		//プレイヤーの位置表示
		for( int i = 0; i < players.length; i++ ) {
			showComaPos(i);
		}
	}

	private void showComaPos( int pid ) {
		Coma coma = players[pid];
		System.out.println( pid + ":");
		for ( int i = 0; i <path.length; i++ ) {
			if( i != coma.getPositoin() ) {
				System.out.print("   ");
			}else {
				System.out.print(" * ");
			}
		}
		System.out.println(); //改行
	}

	/*
	 * ゲームが終わった時の処理
	 */
	private void exitGame() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("すごろくゲーム、これにて終了♪");
		showPath();
	}
	/*
	 * ゲームを始めるための下準備
	 */
	private void initGame() {
		// マスを準備
		path = new Cell[] {
			new StartCell(),
			new NormalCell(),
			new RestartCell(),
			new ReturnCell(2),
			new NormalCell(),
			new NormalCell(),
			new RestartCell(),
			new ReturnCell(2),
			new NormalCell(),
			new NormalCell(),
			new ReturnCell(3),
			new NormalCell(),
			new RestartCell(),
			new ReturnCell(3),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new ReturnCell(2),
			new ReturnCell(2),
			new GoalCell(),
		};
	/*	path[0] = new StartCell();
		for (int i = 0; i < path.length; i++) {
			//とりあえず通常マスで作成
			path[i] = new NormalCell();
		}
		path[path.length-1] = new GoalCell();*/
		//プレイヤーを準備
		players = new Coma[] {
				new Coma("(*^-^*)"),
				new Coma("COM1")
		};
		System.out.println(path[0].getCaption() );
	}

}
