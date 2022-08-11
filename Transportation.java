package modeling;

public class Transportation {
    public int Num;
    public int money;
    public int basic_fare;
    public int speed;
    public int oil;
    public int full_oil;

    public int oil_state;
    public int passengerNum;
    public int max_passenger;

    public String state;

    //고유 번호
    public int createNum() {

    }

    // 요금 합계
    public int checkMoney() {
        return money * passengerNum;
    }

    //연료


}
