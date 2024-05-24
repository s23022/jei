// s23022
// 11行目のコンパイルエラーを修正

class d48Q23kadai {
	public static void main(String[] args) {
		int i = 1;
		for (;;) {
			i = i + 3;
			if (i < 10) {
				continue;
			} else {
				System.out.println(i);
				break;
			}
		}
	}
}

