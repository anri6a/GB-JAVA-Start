/*
* 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
* 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
* Создайте несколько экземпляров этого класса, выведите их в консоль.

2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
* (или другие параметры на ваше усмотрение).
*
* 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
* Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
* Убедитесь, что все они сохранились во множество.
3. Создайте метод
**public boolean**
equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
* только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод
**public int hashCode()**
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

* */
package seminar06;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import seminar06.*;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private int age;
    private String comm;

    private List<String> healthHistory;

    public Cat(String name, String owner, String bread, int age) {
        this.name = name;
        this.owner = owner;
        this.breed = bread;
        this.age = age;
        this.comm = "without comments";
    }

    public Cat(String name, String owner, String bread, int age, String comm) {
        this.name = name;
        this.owner = owner;
        this.breed = bread;
        this.age = age;
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "\nname : " + name + "\nowner : " + owner + "\nbread : " + breed + "\nage : " + age + "\ncomment : " + comm;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && owner.equals(cat.owner) && breed.equals(cat.breed) && age == cat.age;
    }

    @Override
    public int hashCode() {
        return 18 * age + 9 * name.hashCode() + 6 * owner.hashCode() + 3 * breed.hashCode();
    }
}
