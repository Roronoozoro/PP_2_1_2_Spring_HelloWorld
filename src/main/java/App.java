import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());
        System.out.println(beanHello2.getMessage());
        System.out.println(beanHello1 == beanHello2);

        ApplicationContext applicationContextCat = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat1 = (Cat) applicationContextCat.getBean("cat");
        Cat beanCat2 = (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat1.sayMaName());
        System.out.println(beanCat2.sayMaName());
        System.out.println(beanCat1  == beanCat2);
    }
}