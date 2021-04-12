public abstract class Employee {
    private String name, age, id, phone, email;

    Employee() {
    }

    public Employee(String id, String name, String age, String phone, String email) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getPayment();

    public String toString(){
        return id + ". \t "
                + name + " \t "
                + age + " \t "
                + phone + " \t "
                + email;
    }
}

