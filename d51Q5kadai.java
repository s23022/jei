public class d51Q5kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
            return;
        }

        if (amount < 0.0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
        double[] unit = {0.0, 2.0, 3.0, 5.0};
        int[] rate = {10, 19, 17, 14};

        // 値上げを反映
        int basicFeeIncrease = 100;
        int[] rateIncrease = {0, 1, 1, 1};

        for (int i = 0; i < rate.length; i++) {
            rate[i] += rateIncrease[i];
        }

        int price = basicFeeIncrease;
        int i;
        for (i = 1; amount >= level[i]; i++) {
            price += (int) ((level[i] - level[i - 1]) / unit[i]) * rate[i];
        }
        price += (int) ((amount - level[i - 1]) / unit[i]) * rate[i];

        System.out.println("今月のガス料金 " + price + "円");
    }
}

