// s23022
// コードの説明: 2つのチームのスコアとトライ数を比較し、勝敗または引き分けを表示するプログラム

class d48Q6kadai {
    public static void main(String[] args){
        if (args.length != 4) {
            System.out.println("整数を4つ指定してください");
            return;
        }

        Achievement teamA = new Achievement();
        teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Achievement teamB = new Achievement();
        teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

        Match match = new Match();
        match.setAchievements(teamA, teamB);
        System.out.println(match.showResult());

        int teamAPoints = match.winPoint(teamA.point, teamB.point, teamA.tryNumber);
        int teamBPoints = match.winPoint(teamB.point, teamA.point, teamB.tryNumber);

        if (teamAPoints > teamBPoints) {
            System.out.println("チームAの勝利！");
        } else if (teamAPoints < teamBPoints) {
            System.out.println("チームBの勝利！");
        } else {
            System.out.println("引き分け！");
        }
    }
}

class Match {
    Achievement teamA;
    Achievement teamB;

    void setAchievements(Achievement a, Achievement b) {
        teamA = a;
        teamB = b;
    }

    String showResult(){
        return
        "Team a: " + winPoint(teamA.point, teamB.point, teamA.tryNumber) +
        ", Team B: " + winPoint(teamB.point, teamA.point, teamB.tryNumber);
    }

    int winPoint(int teamXpoint, int teamYpoint, int teamTryNumber){
        return matchPoint(teamXpoint, teamYpoint) + bonusPoint(teamTryNumber);
    }

    int matchPoint(int teamXPoint, int teamYPoint){
        if (teamXPoint == teamYPoint){
            return 2;
        } else if (teamXPoint > teamYPoint) {
            return 4;
        } else if (teamXPoint - teamYPoint <= 2){
            return 1;
        }
        return 0;
    }

    int bonusPoint(int tryNumber){
        return tryNumber >= 4 ? 1 : 0;
    }
}

class Achievement {
    int point;
    int tryNumber;

    void set(int teamPoint, int teamTryNumber){
        point = teamPoint;
        tryNumber = teamTryNumber;
    }
}

