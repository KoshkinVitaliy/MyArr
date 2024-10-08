public class Users {
    public static User[] users;

    public Users(int length) {
        users = new User[length];
    }

    public void add(User user, int index) {
        try {
            users[index] = user;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);

            var previousArr = users;
            var diff = index - (users.length - 1);
            users = new User[users.length + diff];

            for(var i = 0; i < previousArr.length; i++) {
                users[i] = previousArr[i];
            }

            users[index] = user;
        }
    }

    public void delete(int index) {
        var previousArr = users;
        users = new User[users.length - 1];


        System.out.println();
        var flag = false;

        for (int k = 0; k < users.length; k++) {
            if (k == index && k < users.length - 1) {
                users[k] = previousArr[k+1];
                flag = true;
            }
            else {
                if (flag) {
                    users[k] = previousArr[k+1];
                }
                else users[k] = previousArr[k];
            }
        }
    }

    public void update(User user, int index) {
        try {
            users[index] = user;
        }
        catch (IndexOutOfBoundsException e) {
            add(user, index);
        }
    }

    public void select() {
        for (var user : users) {
            System.out.print(user.getName() + " " + user.getSurname() + ", ");
        }
    }
}
