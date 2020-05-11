import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Задание:
//1. Прочитайте про виды бинов.
//2. Создайте POJO-класс Cat.
//3. В классе AppConfig, по аналогии, создайте бин с именем “cat”.
//4. Настройте этот бин так, чтобы он создавался новым при каждом запросе.
//5. В классе App, по аналогии, вызовите еще раз бин HelloWorld, затем 2 раза вызовите бин cat.
// Сравните 2 пары бинов по ссылке и выведите результат в консоль.
// Для пары HelloWorld должно вернуться true, для cat - false.
// Так вы можете увидеть результат того, как работает наш контейнер.
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        if (bean1 == bean2) {
            System.out.println("bean1 and bean2 are equal ");
        } else {
            System.out.println("bean1 and bean2 are NOT equal ");
        }
        if (catBean1 == catBean2) {
            System.out.println("catBean1 and catBean2 are equal ");
        } else {
            System.out.println("catBean1 and catBean2 are NOT equal ");
        }
//        System.out.println(bean.getMessage());
    }
}