// s23022
// d48Q22がコンパイルエラーにならないように修正

enum Connection {OFFLINE, ONLINE}

class d48Q22kadai {
	public static void main(String[] args) {
		Connection s = Connection.OFFLINE;
		if (s == Connection.OFFLINE) {
		   s = Connection.ONLINE;
		}
		System.out.print(s);
	}
}

