package Proxy;

import Proxy.proxy.ProxyService;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyService proxyService = new ProxyService();
        proxyService.getData("name");
        proxyService.getData("name");
        proxyService.getData("age");
        proxyService.getData("age");
    }
}
