public class User {

    private String name;
    private Integer age;

    public User() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20) {
            throw new IllegalNameException("ошибка.Длина именине может быть больше 20 символов.Вы ввели " + name);
        } else {
            this.name = name;
        }
    }

    public void setAge(Integer age) {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalAgeException("Ошибкка. возраст юзера не может быть больше 150 или меньше  нуля.Вы ввели" + age);
        }
    }
}

