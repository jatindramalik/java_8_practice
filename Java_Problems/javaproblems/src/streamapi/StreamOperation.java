package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamOperation {

    public static void main(String[] args) {
        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee(101, "jua", "badmash", 500000));
        eList.add(new Employee(102, "siddhu", "analysis", 700000));
        eList.add(new Employee(103, "tupu", "balaka", 800000));
        eList.add(new Employee(104, "krishna", "dance", 900000));
        eList.add(new Employee(105, "kaveri", "doctor", 100000));
        eList.add(new Employee(106, "rakhi", "it", 1200000));
        eList.add(new Employee(107, "gudi", "account", 1300000));
        eList.add(new Employee(108, "gugly", "ds", 1700000));


        Collections.sort(eList,new MyComparator());

        for(Employee employee : eList){
            System.out.println(employee);
        }
        eList.stream().map(t -> t.getEsalary()).mapToInt(t -> t+50).forEach(System.out::println);
        List<Book>books = new ArrayList<>();
        books.add(new Book(101, "TnG", 100));
        books.add(new Book(102, "MnG", 150));
        books.add(new Book(103, "GnG", 200));
        books.add(new Book(104, "AnG", 250));

        books.stream().map(t->t.getBookPrice()).mapToInt(t->t+50).forEach(System.out::println);

    }

}
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee arg0, Employee arg1) {
        
        return arg0.getEname().compareTo(arg1.getEname());
    }
    
}
