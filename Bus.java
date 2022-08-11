package modeling;

public class Bus extends Transportation {




    // 버스 객체 생성
    public Bus() {
    //  버스 초기 설정
        this.Num = createNum();
        this.passengerNum = 0;
        this.max_passenger = 30;
        this.basic_fare = 1000;
        this.speed = 0;
        this.full_oil = 100;

    }


    //  승객 탑승
    public void takeOnPassenger(int add_passenger) {
        if (add_passenger <= 30){
            passengerNum += add_passenger;
        }
        else {
            System.out.println("최대 승객 수 초과");
        }

    }


    // 수입
    public void income(int money) {
        this.money += money; // 버스 요금만큼 수입 증가

    }



    // 버스 속도
    public void speed() {
    }


    @Override
    // 버스 주유량
    public  void oil() {
        if(oil_state > 50) {
            System.out.println("운행중");
        }
        else if(oil_state < 50 && oil_state > 5) {
            System.out.println("차고지행");
        }
        else {
            System.out.println("주유 필요");
        }
    }









}
