//arithmatic operators
class Arith {
    public static void main(String[] args) {
        int add = 4 + 5;
        System.out.println("Addition: 4 + 5 = " + add);
        int sub = 2 - 1;
        System.out.println("Subtraction: 2 - 1 = " + sub);
        int mul = 4 * 5;
        System.out.println("Multiplication: 4 * 5 = " + mul);
        int div = 4 / 2;
        System.out.println("Division: 4 / 2 = " + div);
        int mod = 9 % 4;
        System.out.println("Modulus: 9 % 4 = " + mod);
    }
    
}

//increment & decrement operators
class Inc {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("Postincrement: " + (a++));
        System.out.println("Preincrement: " + (++a));
        System.out.println("Postdecrement: " + (b--));
        System.out.println("Predecrement: " + (--b));
    }
}

//Relational operators
class Rltn {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= c: " + (a >= c));
        System.out.println("a <= c: " + (a <= c));
        System.out.println("c == b: " + (c == b));
        System.out.println("a != b: " + (a != b));
    }
}

//bitwise operator
class Bit {
    public static void main(String[] args) {
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}

//logical operators
class Log {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println("x && y:" + (x && y));
        System.out.println("x || y:" + (x || y));
        System.out.println("!x:" + (!x));
    }
}

//assignment operators
class Asgn {
    public static void main(String[] args) {
        int f = 7;
        f += 3;
        System.out.println("f += 3: " + (f));
        f -= 2;
        System.out.println("f -= 2: " + (f));
        f *= 4;
        System.out.println("f *= 4: " + (f));
        f /= 3;
        System.out.println("f /= 3: " + (f));
        f %= 2;
        System.out.println("f %= 2: " + (f));
    }
}