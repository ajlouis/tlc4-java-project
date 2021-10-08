package Streams;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;

import static org.hamcrest.CoreMatchers.containsString;

public class labs {
    public static void main(String[] args) {
        String path = "/Streams/Trades.txt";

    }
//
//    @Test
//    public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() {
//        String expectedData = "Hello, world!";
//
//        Class clazz = FileOperationsTest.class;
//        InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");
//        String data = readFromInputStream(inputStream);
//
//        Assert.assertThat(data, containsString(expectedData));
//    }

//   static private String readFromInputStream(InputStream inputStream)
//            throws IOException {
//        StringBuilder resultStringBuilder = new StringBuilder();
//        try (BufferedReader br
//                     = new BufferedReader(new InputStreamReader(inputStream))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                resultStringBuilder.append(line).append("\n");
//            }
//        }
//        return resultStringBuilder.toString();
//    }

}
