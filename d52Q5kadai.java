public class d52Q5kadai {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("少なくとも1つの数値を入力してください。");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("入力は整数でなければなりません: " + args[i]);
                return;
            }
        }

        // グラフの目盛りを10単位に設定
        String scale = "      +----+----+----+----";
        System.out.println(scale);

        // 各数値に対するグラフを描画
        for (int number : numbers) {
            // 出力フォーマットに合わせて文字列を構築
            StringBuilder line = new StringBuilder();
            line.append(String.format("%3d : ", number));
            for (int i = 0; i < number / 10; i++) {
                line.append('*');
            }
            System.out.println(line.toString());
        }
    }
}

