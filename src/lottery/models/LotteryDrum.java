package lottery.models;

import java.util.HashSet;

public class LotteryDrum {
    private HashSet<Integer> ballSet;

    public LotteryDrum(HashSet<Integer> ballSet) {
        this.ballSet = ballSet;
    }
    public LotteryDrum() {
        ballSet = new HashSet<>();
    }

    public HashSet<Integer> getBallSet() {
        return ballSet;
    }

    public void setBallSet(HashSet<Integer> ballSet) {
        this.ballSet = ballSet;
    }

    public void fillBallSet(Integer ball) {
        ballSet.add(ball);
    }

    public void showBallSet() {
        System.out.println(ballSet);
    }

    public Player generateTicket(String inputDni){
        StringBuilder numberTicket = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            numberTicket.append((int) Math.floor(Math.random() * 101)).append("-");
        }
        numberTicket.deleteCharAt(numberTicket.length()-1);
        var newTicket = new Player(inputDni,numberTicket.toString());
        System.out.println(newTicket);
        return newTicket;
    }


    public Integer getRandomBall(){
        return (int) Math.floor(Math.random() * 101);
    }





}
