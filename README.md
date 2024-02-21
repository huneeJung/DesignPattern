# Design Pattern<br/>
### 1. Factory Pattern

---

1) 객체 생성을 추상화하여 유연성을 높일 수 있다.
2) 스프링의 DI 컨테이너는 팩토리 패턴으로써 동작하며, 빈으로 등록한 이름을 기반으로 객체가 생성 및 관리된다.

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/Factory.png?raw=true"></img>

### 2. Abctract Factory Pattern

---

1) 여러개의 관련된 객체의 집합을 인터페이스로 정의하여 일관성과 호환성을 유지할 수 있다.

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/AbstractFactory.png?raw=true"></img>

### 3. Singleton Pattern

---

1) 인스턴스는 오직 단 하나만 생성이 되어야만 하고, 어디든 이 인스턴스에 접근이 가능해야 할 때 사용한다.
2) 일반적으로 객체는 상태(field)를 가지지 않는다면 static method 로 선언할 수 있다. ex) Util Class
3) 그러나 특정 행위(Method)의 모음들을 객체로써 표상할 수 있다면 싱글톤 패턴으로 생성하는 것이 바람직하다.
4) Eager Initialization : 정적인 맴버 변수로써 컴파일 시점에서 초기화
5) Lazy Initialization : 런타임 환경에서 객체가 생성되는 시점에 단 한번만 생성
6) 스프링 빈은 일반적으로 싱글톤 패턴을 기반으로써 Eager Initialization 방식으로 객체가 초기화되며 @Lazy 어노테이션으로 초기화 지연이 가능하다.

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/Singleton.png?raw=true"></img>

### 4. Proxy Pattern

---

1) 실제 객체를 대신하여 그 객체의 동작을 제어하거나 추가적인 기능을 제공하는 패턴
2) 클라이언트는 실제 객체와 무관하게 프록시를 통해서만 작업을 수행
3) 스프링의 AOP 와 같은 프로그래밍 패러다임에서 핵심적인 역할을 한다.
4) 횡단 관심사(cross-cutting concerns)를 분리하여 코드 중복을 줄이고, 프로그램의 유지 보수성을 향상시키는 데 이용된다.
5) 비슷한 개념으로 Filter(서블릿 컨테이너에서 제공), Interceptor(스프링에서 지원) 등이 있다.
6) AOP 활용 예시 : 캐싱, 로깅, 접근 제어, 스프링 시큐리티, 트랜젝션 등


<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/Proxy.png?raw=true"></img>
