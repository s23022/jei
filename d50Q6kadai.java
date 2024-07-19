// s23022
//コマンドライン引数として2つの整数を受け取り、その範囲内の素数を見つける

class d50Q6kadai {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("2つの整数を入力してください。");
            return;
        }

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        StringBuilder primes = new StringBuilder();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                if (count > 0) {
                    primes.append(", ");
                }
                primes.append(i);
                count++;
            }
        }

        System.out.println(primes);
        System.out.println(start + "から" + end + "までの素数の数は" + count + "個です");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
	}
}
