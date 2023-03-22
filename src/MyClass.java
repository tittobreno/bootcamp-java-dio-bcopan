public class MyClass {
    public static void main(String[] args) {
        String firstName = "Breno";
        String lastName = "Moraes";

        String fullName = getFullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String getFullName(String firstName, String lastname) {
        return firstName + ' ' + lastname;
    }
}
