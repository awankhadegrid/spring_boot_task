package com.TaskProject.Test.Test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainService {

//    @Autowired
//    private Foo interfaceBean;
//
//    @Autowired
//    private FooImpl fooImpl;
//
//    public void runLogic() {
//        System.out.println("Task 1: Using both Interface and Implementation types");
//        interfaceBean.doSomething();
//        fooImpl.doSomething();
//    }





//    private final Foo interfaceBean;
//    private final FooImpl fooImpl;
//
//    public MainService(Foo interfaceBean, FooImpl concreteBean) {
//        this.interfaceBean = interfaceBean;
//        this.fooImpl = concreteBean;
//    }
//
//    public void runLogic() {
//        System.out.println("Task 2: Successful Constructor Injection with final fields");
//        interfaceBean.doSomething();
//        fooImpl.doSomething();
//    }




    private final Foo mySpecificBean;

    public MainService(Foo concreteBean) {
        this.mySpecificBean = concreteBean;
    }

    public void runLogic() {
        System.out.println("Injected specifically 'concreteBean' by matching the name");
        mySpecificBean.doSomething();
    }

}
