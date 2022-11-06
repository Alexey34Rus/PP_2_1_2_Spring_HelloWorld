import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("references beans HelloWord: " + (bean1 == bean2));

        Cat beanCat1 = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("references beans Cat: " + (beanCat1 == beanCat2));
    }
}