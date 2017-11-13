package main.java.ua.nure.tsiunchyk;


import java.util.ResourceBundle;
import java.text.MessageFormat;

public class Bundle {
    private static final ResourceBundle bundle = ResourceBundle.getBundle(
            "some words");

    public static String getString(String key, Object... params) {
        String value = bundle.getString(key);
        if (params.length > 0) return MessageFormat.format(value, params);
        return value;
    }
}