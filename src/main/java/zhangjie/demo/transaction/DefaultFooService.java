package zhangjie.demo.transaction;

public class DefaultFooService implements FooService {
    public Foo getFoo(String fooName) {
        return null;
    }

    public Foo getFoo(String fooName, String barName) {
        return null;
    }

    public void insertFoo(Foo foo) {
        System.out.println("insertFoo....");
    }

    public void updateFoo(Foo foo) {

    }
}
