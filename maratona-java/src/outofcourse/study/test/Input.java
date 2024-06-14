package outofcourse.study.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedReader(new StringReader("Hello world")));

        System.out.println(input);
    }
}
