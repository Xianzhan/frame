package xianzhan.frame.json.gson.pojo;



import java.util.Date;

/**
 * @author xianzhan
 * @since 2022-12-25
 */
//@Data
public class Student {

    private String name;
    private int    age;
    private Date   birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
