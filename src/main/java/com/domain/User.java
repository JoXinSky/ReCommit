package com.domain;

import java.util.Objects;

public class User implements Comparable<User>{
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public User(int uid, String userName, String password, int age) {
        super();
        this.id = uid;
        this.userName = userName;
        this.password = password;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, age);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        //return -1; 表示放在红黑树左边，即逆序输出
        //return 1；表示放在红黑树右边，即顺序输出
        //return 0; 元素相同
        int num = this.age - o.age;
        //s1.getName().compareTo(s2.getName())这里的compareTo方法是String类中的方法
        return num == 0 ? this.userName.compareTo(o.userName) : num;
    }
}