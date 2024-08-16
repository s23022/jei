import java.util.Scanner;

public class d52Q6kadai {
    // ドリンク情報を格納するクラス
    static class Drink {
        String name;
        int price;

        Drink(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ドリンクのリストを作成
        Drink[] drinks = {
            new Drink("Gomacola", 150),
            new Drink("MrPepper", 130),
            new Drink("SaltWater", 320)
        };

        // ドリンクのリストを表示
        for (int i = 0; i < drinks.length; i++) {
            System.out.printf("〔%d〕[%s] %d円%n", i + 1, drinks[i].name, drinks[i].price);
        }

        // ドリンクの選択とお金の投入
        System.out.print("購入するドリンクの番号を選んでください: ");
        int choice = scanner.nextInt();
        System.out.print("お金を投入してください: ");
        int money = scanner.nextInt();

        // 選択の範囲チェック
        if (choice < 1 || choice > drinks.length) {
            System.out.println("不正な選択です。");
            return;
        }

        // 選択されたドリンクを取得
        Drink selectedDrink = drinks[choice - 1];

        // 購入処理
        if (money < selectedDrink.price) {
            System.out.println("お金が足りません。");
        } else {
            System.out.printf("[%s] %d円が排出されました%n", selectedDrink.name, selectedDrink.price);
            int change = money - selectedDrink.price;
            printChange(change);
        }

        scanner.close();
    }

    // お釣りの計算と表示
    private static void printChange(int change) {
        if (change == 0) {
            System.out.println("お釣り なし");
        } else {
            System.out.print("お釣り ");
            int[] denominations = {100, 50, 10};
            for (int denom : denominations) {
                int count = change / denom;
                if (count > 0) {
                    System.out.printf("%d円:%d枚 ", denom, count);
                }
                change %= denom;
            }
            System.out.println();
        }
    }
}

