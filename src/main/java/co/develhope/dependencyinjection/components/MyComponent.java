package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        this.myComponentName="ionut";
        System.out.println("MyComponent conconstructor() has been called");
    }

    public String getMyComponentName(){
        return "myComponentImmutableName is " + myComponentName + " MyComponent.getMyComponentName() has been called";
    }

}
