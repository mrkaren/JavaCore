package core.homework.author.storage;

import core.homework.author.model.User;
import core.homework.author.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        FileUtil.serializeUserMap(userMap);
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    //TODO add implementation later.
    public User getByEmailAndPassword(String email, String password) {
        return null;
    }


    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }
}
