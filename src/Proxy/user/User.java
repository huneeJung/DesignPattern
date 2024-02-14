package Proxy.user;

public class User {
    private static User user;
    private User(String name,int age){}
    public static User getInstance(){
        if(user == null){
            user = new User("홍길동",20);
            return user;
        }
        return user;
    }
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
}
