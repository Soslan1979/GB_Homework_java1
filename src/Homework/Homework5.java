/*
 * Java_1 Homework 5
 * @author Kalabekov Soslan
 * @date 19/10/2021
 */

public class Homework5 {
    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivanov Ivan", "Manager", "ivanov@gmail.com", 79001001010L, 46000, 45);
        workersArray[1] = new Worker("Petrov Petr", "Salesman", "petrov@gmail.com", 79001001111L, 32000, 33);
        workersArray[2] = new Worker("Fedorov Fedor", "Lawyer", "fedorov@gmail.com", 79001001212L, 43000, 41);
        workersArray[3] = new Worker("Vasiliev Vasily", "Engineer", "vasiliev@gmail.com", 79001001313L, 38000, 38);
        workersArray[4] = new Worker("Mikhailov Mikhail", "Director", "mikhailov@gmail.com", 79001001414L, 55000, 52);

        for (Worker person : workersArray)
            if (person.getAge() > 40)
                System.out.println(person);
    }
}

class Worker{ // создаем класс
   private String fullName;
   private String position;
   private String email;
   private long contact;
   private int salary;
   private int age;


    Worker(String fullName, String position, String email, long contact, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String toString() {
        return fullName + "; " + position + "; " + email + "; " + contact + "; " + salary + "; " + age;
    }
}

