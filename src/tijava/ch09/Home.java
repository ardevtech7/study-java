package tijava.ch09;

public class Home {
    // 필드에 익명 구현 객체 대입
    private RemoteController rc = new RemoteController() {
        @Override
        public void turnOn() {
            System.out.println("Tv On");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv Off");
        }
    };

    // 메소드 (필드 이름)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드 (로컬 변수 이름)
    public void use2() {
        // 로컬 변수에 익명 구현 객체 대입
        RemoteController rc = new RemoteController() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 On");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 Off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드 (매개변수 이용)
    public void use3(RemoteController rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
