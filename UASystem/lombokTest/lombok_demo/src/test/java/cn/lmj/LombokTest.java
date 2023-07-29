package cn.lmj;

import org.example.entity.User;

public class LombokTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(10);
        user.getId();
        User user1 = new User(10,"梁铭",18);

        User user2 = User.builder().id(1).age(12).name("123").build();
        System.out.println(user2.toString());
    }
}
