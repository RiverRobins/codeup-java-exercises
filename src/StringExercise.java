public class StringExercise {
    public static void main(String[] args) {
        String str = "We don't need no education";
        System.out.println(str);
        System.out.println(str.replace("education", "thought control"));
        System.out.println(str.replace("We don't need no education", "Check \"this\" out!, \"s inside of \"s!"));
        System.out.println(str.replace("We don't need no education", "In windows, the main drive is usually C:\\"));
        System.out.println(str.replace("We don't need no education", "Check \"this\" out!, \"s inside of \"s!"));
        System.out.println(str.replace("We don't need no education", "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!"));
        System.out.println(str.replace("We don't need no education", "Check \"this\" out!, \"s inside of \"s!"));
    }
}
