package Proxy.user;

public class UserServiceImpl implements UserService {
    private final User user = User.getInstance();
    @Override
    public Object getData(String resource) {
        System.out.println("캐싱되지 않은 데이터");
        if(resource.equals("name")){
            return user.getName();
        }else if(resource.equals("age")){
            return user.getAge();
        }else{
            throw new RuntimeException();
        }
    }
}
