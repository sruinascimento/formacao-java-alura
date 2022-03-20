package br.com.ruicompany.class_string;

public class TesteSobrecarga {
    public static void main(String[] args) {
        println(new StringBuilder("12"));
    }

    public static void println(Object obj) {
        System.out.println(obj.getClass().getName());
    }

}
