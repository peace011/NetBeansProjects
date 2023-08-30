
package labwork;


import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    // Getters and Setters for name, age, and address
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

