package main;
import modeling.Bus;

public class Bus_Test {
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        bus1.showInfo();
        System.out.println();

        Bus bus2 = new Bus();
        bus2.showInfo();
        System.out.println();


        //버스 고유 번호 다른지 확인
        if (bus1.Num != bus2.Num){
            continue;
        }

        // 승객 2명 탑승
        bus1.takeOnPassenger(2);
        bus1.showInfo();

        // 연료량 -50
        bus1.usefuel(-50);
    }

}











