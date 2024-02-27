class demo {
    public static void main(String[] args) {
        int n1 = 19,n2 = 9,lcm;
        lcm = (n1>n2) ? n1:n2;
        while (true) {
            if (lcm%n1==0 && lcm%n2==0) {
                System.out.print("The lcm of the given number is "+lcm);
                break;
            }
            lcm++;
        }
    }
}