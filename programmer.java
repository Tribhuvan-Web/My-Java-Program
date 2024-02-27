class programmer {
    int eid;
    String name;
    int salary;
    int age;

    programmer(int eid, String name, int salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    void setEid(int eid) {
        this.eid = eid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getEid() {
        return eid;
    }

    String getName() {
        return name;
    }

    int getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }

    public void writeCode() {
        System.out.println(this.name + " writes code.");
    }

    public void drinksCoffee() {
        System.out.println(this.name + " drinks coffee.");
    }
}
class main{
    public static void main(String[] args) {
        programmer p = new programmer(101, "Reyansh", 1110);
        p.drinksCoffee();
        programmer p2 = new programmer(101, "Himanshu", 1120);
        p2.writeCode();
    }
}