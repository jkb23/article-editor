package test;

import main.App;
import org.junit.jupiter.api.Test;

/**
 * @author Matus Jakab
 */
class AppTest {

    @Test
    public void testEditor(){
        String[] first = {"break3ing news5:", "1A 1circle is round!"};
        assert App.Editor(first).equals("Breaking News: A Circle Is Round!");

        String[] second = {"","Fresh fried fish - fish fresh fried"};
        assert App.Editor(second).equals("Fresh Fried Fish - Fish Fresh Fried");

        String[] third = {"123 ","eat;sleep;repeat","321"};
        assert App.Editor(third).equals("Eat;Sleep;Repeat");

        String[] fourth = {"    ", " 1", "arti15cle:", "", "", "something4447"};
        assert App.Editor(fourth).equals("Article: Something");

        String[] fifth = {"    ", "     ", "        ", "", "  "};
        assert App.Editor(fifth).equals("");

        String[] sixth = {"tgdyuedchksvghs", ""};
        assert App.Editor(sixth).equals("Tgdyuedchksvghs");
    }
}