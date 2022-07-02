package test;

import main.App;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Matus Jakab
 */
class AppTest {

    @Test
    public void testEditor(){
        List<String> first = Arrays.asList("break3ing news5:", "1A 1circle is round!");
        assert App.Editor(first).equals("Breaking News: A Circle Is Round!");

        List<String> second = Arrays.asList("","Fresh fried fish - fish fresh fried");
        assert App.Editor(second).equals("Fresh Fried Fish - Fish Fresh Fried");

        List<String> third = Arrays.asList("123 ","eat;sleep;repeat","321");
        assert App.Editor(third).equals("Eat;Sleep;Repeat");

        List<String> fourth = Arrays.asList("    ", " 1", "arti15cle:", "", "", "something4447");
        assert App.Editor(fourth).equals("Article: Something");

        List<String> fifth = Arrays.asList("    ", "     ", "        ", "", "  ");
        assert App.Editor(fifth).equals("");

        List<String> sixth = Arrays.asList("tgdyuedchksvghs", "");
        assert App.Editor(sixth).equals("Tgdyuedchksvghs");
    }
}