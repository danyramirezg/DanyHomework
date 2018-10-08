import java.util.Arrays;

public class Class8 {

    public static void main(String... r) {
        String name = "Dany";
        //System.out.print(name.charAt(0));

        String[] students = {"Dany", "Paola", "Celeste", "Tom"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println(students[0]);
    }
}
