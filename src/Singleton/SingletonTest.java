package Singleton;

import Singleton.logger.Logger;

public class SingletonTest {
    public static void main(String[] args) {
        var logger1 = Logger.getInstance();
        logger1.log("logger1");

        var logger2 = Logger.getInstance();
        logger2.log("Logger2");

        // 객체 동일성 비교 ( 객체가 서로 같은지 ) , 동등성 비교는 객체의 내용이 서로 같은지이다.
        if(logger1==logger2){
            System.out.println("logger1 == logger2");
        }else{
            System.out.println("logger1 != logger2");
        }
        // 싱글톤 패턴은 생성자를 private 으로 설정한 후, 객체가 생성되는 시점에서 단 한번만 생성되도록 static 필드로써 정의한다.
        // 만약 정적 맴버 변수로 정의하지 않게 된다면, 더 이상 해당 객체를 참조하지 않은 시점에서는 가비지 컬렉터의 대상이 되어 새로 생성이 된다.
        // static final 로 객체를 정의해도 될 것처럼 보이지만, 실제로 이는 객체지향에 어긋나며, 객체의 상속 및 다형성을 이용할 수 없게된다.
        // 클래스 레벨에서 이미 정의가 되어버리므로, 객체 지향적인 코딩을 수행하려면 인스턴스 레벨에서 작업해야 한다.
        // Logger 또는 DBPool 과 같은 하나의 객체로써 표상하는 바가 존재한다면 이는 싱글톤으로써 생성하는 것이 맞다.
        // 그러나 하나의 객체로써 표상되는 바가 존재하지 않고, util 로써 존재한다면 static 이 어울린다고 볼 수 있다.
        // 스태틱 클래스는 이너 클래스로 존재할때만 가능하다.
    }
}
