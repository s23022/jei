// s23022
// このプログラムは温度の値を設定および取得するためのクラスを定義し、テストします。

public class Temper {
    private double temperature; // 温度

    // ゲッター
    public double getTemperature() { 
        return temperature; 
    }

    // セッター
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        // インスタンス生成
        Temper t = new Temper();
        
        // セッターを使って温度を設定
        t.setTemperature(17.2);
        
        // ゲッターを使って温度を取得し、出力
        System.out.println(t.getTemperature());
    }
}

