@ToString(value = ToString.Value.YES)
public class an3 {
    @ToString(value = ToString.Value.NO)
    private String name = "дед инсайд";
    private int age = 9;
    private String opg = "Psychokids";

    public String toString() {
        return "an3{я " + name + ", мне " + age + " лет, я хочу в " + opg + "}";
    }
}
