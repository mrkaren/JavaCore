package javaExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaExamples {

    public static void main(String[] args) {

        var names = List.of("aram", "babken", "aram","aramayis");

        var name = "poxos";
        int i;
        var p = names.stream()
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());


    }

}
