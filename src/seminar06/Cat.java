/*
* 1. ���������� ��������� ������ ���. ����� ���� � ������ ����� ��������� ��� ����������, ������� ��������
�) �������������� �������� ������������ �������
�) ������� �������� �����
�) �������������� �������� ������ ����� �. �. ���������
* 1. ���������� 1 �� ��������� ������ Cat �� ����������� �������, ����� ������������ �� ��� ����������� ���� � ������.
* �������� ��������� ����������� ����� ������, �������� �� � �������.

2. ��������� ����, ����� ��� ������ � ������� ������� ���� Cat, ���������� ��� ������, ���� � �������
* (��� ������ ��������� �� ���� ����������).
*
* 1. �������� ���������, � ������� ����� ��������� ���������� ������ Cat - HashSet<Cat>.
* ��������� � ���� ��������� ���������� ��������.
2. �������� 2 ��� ����� ����� � ����������� ����������� � �����. ��������� �� �� ���������.
* ���������, ��� ��� ��� ����������� �� ���������.
3. �������� �����
**public boolean**
equals(Object o)
��������� � �� ������ ��������� ����� �� ����������, �������� � �����. �� ����, ����� ������ ���������� true,
* ������ ���� �������� �� ���� ����� ������������ �������� �����.
4. �������� �����
**public int hashCode()**
������� ����� ���������� hash, ����������� �� ������ ����� ������ Cat. (����� ������������ Objects.hash(...))
5. �������� ����� ���������� ��������� �� ������ 2, ���������, ��� ��������� ���������.

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
