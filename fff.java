class d50Q5 {
    public static void main(String[] args) {
        int[] num = new int[args.length];
        
        // コマンドライン引数を整数に変換
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        // ソート処理
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                // 値を交換
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
                // ソート途中の状態を出力
                printArray(num, "ソート途中");
            }
        }

        // 最終結果の出力
        System.out.println("-------------------");
        printArray(num, "ソート結果");
    }

    // 配列を出力するメソッド
    private static void printArray(int[] array, String message) {
        System.out.print(message + ":");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

