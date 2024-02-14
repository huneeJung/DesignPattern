package Proxy.proxy;

import Proxy.user.UserService;
import Proxy.user.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProxyService implements UserService {
    private final Set<String> resourceList
            = Set.of("name","age");

    private final UserService userService;
    private final Map<String,Object> cache = new HashMap<>();

    public ProxyService(){
        this.userService = new UserServiceImpl();
    }

    @Override
    public Object getData(String resource) {
        if(!resourceList.contains(resource)){
            throw new RuntimeException("잘못된 접근입니다");
        }
        if(cache.containsKey(resource)){
            System.out.println("캐싱된 데이터");
            return cache.get(resource);
        }else{
            Object result = userService.getData(resource);
            cache.put(resource,resource);
            return result;
        }
    }
}
