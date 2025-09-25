package homework.lesson10.task2v1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pet pet = new Pet(21,"Barsic");
        User user = new User("Bob", "boblike@yandex", 21, pet, 535376537);
        User user1 = (User) user.clone();

        System.out.println(user == user1);
        System.out.println(user.getPet() == user1.getPet());
    }
}