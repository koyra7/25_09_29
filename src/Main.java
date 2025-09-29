import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] result1 = {"기절초풍","멋있는","재미있는"};
        String[] result2 = {"도전적인","노란색의","바보같은"};
        String[] result3 = {"돌고래","개발자","오랑우탄"};

        StringBuilder st = new StringBuilder();

        int index = rand.nextInt(3);

        st.append(result1[index]);
        st.append(result2[index]);
        st.append(result3[index]);


        System.out.println(st);

    }
}