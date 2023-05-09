package co.develhope.dependencyinjection.services;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;
    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("MyService constructor has been called");
    }

    public String getName(){
        return myComponent.getMyComponentName()+"MyService.getName() has been called";
    }

}
