package Proxy.user;

public class UserServiceImpl implements UserService {
    @Override
    public Object getData(String resource) {
        call();
        if(resource.equals("name")){
            return User.getInstance().getName();
        }else if(resource.equals("age")){
            return User.getInstance().getAge();
        }else{
            throw new RuntimeException();
        }
    }
    private void call(){
        System.out.println("캐싱되지 않은 데이터");
    }
}
