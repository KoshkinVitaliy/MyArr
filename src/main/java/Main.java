public class Main {
    public static void main(String[] args) {
        Users users = new Users(5);
        User user = new User(
                "user",
                "1234",
                "Vitaliy",
                "Koshkin",
                45);
        User user1 = new User(
                "user1",
                "1234",
                "Eva",
                "Muranova",
                52);
        User user2 = new User(
                "user2",
                "1234",
                "Olga",
                "Krasnitskaya",
                37);
        User user3 = new User(
                "user3",
                "1234",
                "Nikita",
                "Rodionov",
                24);
        User user4 = new User(
                "user4",
                "1234",
                "Ivan",
                "Ivanov",
                60);
        users.add(user, 0);
        users.add(user1, 1);
        users.add(user2, 2);
        users.add(user3, 3);
        users.add(user4, 4);
        User user5 = new User(
                "user5",
                "1234",
                "Fedor",
                "Lobyshev",
                60);
        users.update(user5, 3);
        users.select();
    }
}
