package lottery.test;

import lottery.models.LotteryDrum;
import lottery.models.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class TestLottery {
    public static void main(String[] args) {
        LotteryDrum lotteryDrum = new LotteryDrum();


        var players = new ArrayList<Player>();
        players.add(lotteryDrum.generateTicket("XX0"));
        players.add(lotteryDrum.generateTicket("XX1"));
        players.add(lotteryDrum.generateTicket("XX2"));
        players.add(lotteryDrum.generateTicket("XX4"));


        var running = true;

        while (running){

            lotteryDrum.fillBallSet(lotteryDrum.getRandomBall());

            for (Player player : players){
                var numbersPlayer = player.getTicket().split("-");
                var listNumBall = new ArrayList<>(Arrays.stream(numbersPlayer).map(Integer::parseInt).toList());
                for (Integer ballOfSet : lotteryDrum.getBallSet()){
                    for (Integer ballOfList : listNumBall){
                        if (Objects.equals(ballOfSet, ballOfList)){
                            listNumBall.remove(ballOfList);
                            break;
                        }
                    }
                }
                if (listNumBall.isEmpty()){
                    System.out.println("Win: " + player);
                    running = false;
                    break;
                }
            }
            //You can see by Comparing
            lotteryDrum.showBallSet();
        }



    }
}
