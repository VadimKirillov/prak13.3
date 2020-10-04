import java.util.*;

public class MergeLists {
    //первый список
    Student[] students1 = {
            new Student("Иванов",18,241,4.2),
            new Student("Кузнецов",23, 123,4.6),
            new Student("Воробьёв",19,154,3.7),
            new Student("Петров",21,278,5.0)
    };

    //второй список
    Student[] students2 = {
            new Student("Иванова",19,242,4.1),
            new Student("Кузнецова",24, 125,4.7),
            new Student("Воробьёва",18,157,3.4),
            new Student("Петрова",23,279,4.9)
    };


    public void merge(){

        List <Student> list1 = new ArrayList<>(Arrays.asList(students1));
        List <Student> list2 = new ArrayList<>(Arrays.asList(students2));

        List <Student> listres = new ArrayList<>();
        listres.addAll(list1);
        listres.addAll(list2);
        Collections.sort(listres, Comparator.comparing(Student::getName));

        System.out.println(listres.toString());
    }

}