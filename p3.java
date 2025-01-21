//WAP in java for conditional and looping statements
//for loop
class Forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

//while loop
class Whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

//dowhile loop
class Dowhileloop {
    public static void main(String[] args) {
        int i = 0;
        do { 
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

//if statement
class Ifstat {
    public static void main(String[] args) {
        int i = 10;
        if (i < 15) {
            System.out.println("Inside if block");
            System.out.println("10 is less than 15.");
            System.out.println("I am not in if");
        }
    }
}

//if-else statement
class Ifelse {
    public static void main(String[] args) {
        int i = 10;
        if (i < 15) {
            System.out.println("i is smaller than 15.");
        }
        else {
            System.out.println("i is greater than 15.");
        }
    }
}

//switch case
class Switchcase {
    public static void main(String[] args) {
        int num = 20;
        switch (num) {
            case 5:
            System.out.println("It is 5");
            break;
            case 10:
            System.out.println("It is 10.");
            break;
            case 15:
            System.out.println("It is 15.");
            break;
            case 20:
            System.out.println("It is 20.");
            break;
            default:
            System.out.println("It is not 5, 10, 15 or 20");
        }
    }
}