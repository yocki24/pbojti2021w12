public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEMp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEMp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("------------------------");
        System.out.println("" + pEMp.getEmployeeInfo());
    }
}
