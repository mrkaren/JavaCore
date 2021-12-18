package core.homework.author.storage;

import core.homework.author.model.User;

public class UserStorage {

    private User[] users = new User[16];
    private int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }


    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    //TODO add implementation later.
    public User getByEmailAndPassword(String email, String password) {
        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

}
