# Design Pattern<br/>
### 1. Factory : 객체 생성을 추상화하여 유연성을 높일 수 있다.

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/Factory.png?raw=true"></img>

### 2. Abctract Factory : 여러개의 관련된 객체의 집합을 인터페이스로 정의하여 일관성과 호환성을 유지할 수 있다.

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/AbstractFactory.png?raw=true"></img>

### 3. Singleton : 인스턴스는 오직 단 하나만 생성이 되어야만 하고, 어디든 이 인스턴스에 접근이 가능해야 할 때 사용한다.
 1) 일반적으로 객체는 상태(field)를 가지지 않는다면 static method 로 선언할 수 있다. ex) Util Class
 2) 그러나 특정 행위(Method)의 모음들을 객체로써 표상할 수 있다면 싱글톤 패턴으로 생성하는 것이 바람직하다.
 3) Eager Initialization : 정적인 맴버 변수로써 컴파일 시점에서 초기화
 4) Lazy Initialization : 런타임 환경에서 객체가 생성되는 시점에 단 한번만 생성

<img style="width:500px; height:300px;" src="https://github.com/huneeJung/DesignPattern/blob/main/Singleton.png?raw=true"></img>
