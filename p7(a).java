interface Human {
    void learn(String str);
    void work();
    int duration = 10;
}
class Programmer implements Human {
    public void learn(String str){
        System.out.println("Learn using " + str);
    }
    public void work() {
        System.out.println("Develop applications");
    }
}
class HumanTest {
    public static void main(String[] args) {
        Programmer trainee = new Programmer();
        trainee.learn("coding");
        trainee.work();
    }
}