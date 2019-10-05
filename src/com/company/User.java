package com.company;

public class User {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        this.name = name;
        if (name.length() > 20){
            throw new IllegalNameLengthException("Ваше имя превышает 20 символов!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        this.age = age;
        if (getAge() > 100 || getAge()<1){
            throw new IllegalAgeException("Ввели некорректное значение возраста");
        }
    }
}
