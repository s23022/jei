// s23022
//このプログラムは信号の色を判別し、その色に応じたメッセージを出力します

enum Signal {
	RED, YELLOW, GREEN;
}
public class d52Q27kadai {
	public static void main(String[] args) {
		Signal sig = Signal.YELLOW;
		if (sig == Signal.GREEN) {
			System.out.println("緑");
		} else if (sig == Signal.YELLOW) {
			System.out.println("黄");
		} else {
			System.out.println("赤");
		}
	}
}
