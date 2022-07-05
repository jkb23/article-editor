package main;

import java.util.regex.Pattern;

/**
 * @author Matus Jakab
 */
public class App {

    public static String Editor(String[] toEdit){
        // concat list of string to one string and erase all digits
        String article = String.join(" ", toEdit).replaceAll("\\d", "");

        // splits string by words to array, so it can be iterated by words
        String[] words = article.split("\\b");
        String result = "";

        // makes first character from every word upper case and concat words to one string
        for (String word : words){
            result = result.concat(word.substring(0, 1).toUpperCase() + word.substring(1));
        }

        return result.replaceAll("\\s+", " ").strip();

        // the same but nicer with regex library
        /*return Pattern.compile("\\b(.)(.*?)\\b")
                .matcher(article)
                .replaceAll(word -> word.group(1).toUpperCase() + word.group(2))
                .replaceAll("\\s+", " ")
                .strip();*/
    }
}
