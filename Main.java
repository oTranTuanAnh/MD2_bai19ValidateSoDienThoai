public class Main {
    private static PhoneNumber phoneNumbers;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)"," (84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumbers = new PhoneNumber();
        for (String s: validPhone){
            boolean isValid = phoneNumbers.validate(s);
            System.out.println("phone number "+s+" is valid: "+isValid);
        }
        for (String s: invalidPhone){
            boolean isValid = phoneNumbers.validate(s);
            System.out.println("phone number "+s+" is valid: "+isValid);
        }
    }
}
