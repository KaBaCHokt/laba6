import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("               Задание 1");
        B b = new B();
        System.out.println(b);
        System.out.println(" ");

        try {
            System.out.println("               Задание 2.1");
            an1 obj = new an1();
            Class<?> clazz = obj.getClass();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Invoke.class)) {
                    System.out.println("Найден метод с аннотацией @Invoke: " + method.getName());
                }
            }

            inspectClass(an2.class);

            inspectToString(an3.class);

            inspectValidate(an4.class);

            inspectTwo(an5.class);

            inspectCache(an6.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void inspectClass(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Default.class)) {
            Default annotation = clazz.getAnnotation(Default.class);
            System.out.println(" ");
            System.out.println("               Задание 2.2");
            System.out.println("Тип " + clazz.getSimpleName() + " аннотирован @Default с value: " + annotation.value());
        }

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Default.class)) {
                Default annotation = field.getAnnotation(Default.class);
                System.out.println("Поле " + field.getName() + " в классе " + clazz.getSimpleName() + " аннотировано @Default с value: " + annotation.value());
            }
        }
    }

    private static void inspectToString(Class<?> clazz) {
        if (clazz.isAnnotationPresent(ToString.class)) {
            ToString annotation = clazz.getAnnotation(ToString.class);
            System.out.println(" ");
            System.out.println("               Задание 2.3");
            System.out.println("Тип " + clazz.getSimpleName() + " аннотирован @ToString с value: " + annotation.value());
        }

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(ToString.class)) {
                ToString annotation = field.getAnnotation(ToString.class);
                System.out.println("Поле " + field.getName() + " в классе " + clazz.getSimpleName() + " аннотировано @ToString с value: " + annotation.value());
            }
        }
    }
    private static void inspectValidate(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            Validate annotation = clazz.getAnnotation(Validate.class);
            System.out.println(" ");
            System.out.println("               Задание 2.4");
            System.out.println("Тип " + clazz.getSimpleName() + " аннотирован @Validate с value: " + Arrays.toString(annotation.value()));
        }
    }

    private static void inspectTwo(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Two.class)) {
            Two annotation = clazz.getAnnotation(Two.class);
            System.out.println(" ");
            System.out.println("               Задание 2.5");
            System.out.println("Тип " + clazz.getSimpleName() + " аннотирован @Two с first: " + annotation.first() + " и second: " + annotation.second());
        }
    }
    private static void inspectCache(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Cache.class)) {
            Cache annotation = clazz.getAnnotation(Cache.class);
            System.out.println(" ");
            System.out.println("               Задание 2.6");
            System.out.println("Тип " + clazz.getSimpleName() + " аннотирован @Cache с value: " + Arrays.toString(annotation.value()));
        }
    }
}