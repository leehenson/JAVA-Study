import java.util.*;

class LandAnimal { public void crying() { System.out.println("육지동물"); } }
class Cat10 extends LandAnimal { public void crying() {System.out.println("냐옹냐옹"); } }
class Dog10 extends LandAnimal { public void crying() {System.out.println("멍멍"); } }
class Sparrow { public void crying() {System.out.println("짹짹"); } }

class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}

public class ex_105 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.

        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat10());
        landAnimal.add(new Dog10());
        // landAnimal.add(new Sparrow());   // 오류가 발생함.

        for (int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
    }
}
