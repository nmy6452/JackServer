package nmy.Jack.test;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class RandomWordCrawler {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++)
        RandomWord();
/*

        // 랜덤으로 선택할 페이지의 URL 목록
         String[] urls = {
//                 "https://randomwordgenerator.com/",
                 "https://random-word-api.herokuapp.com/word"
                 // 추가적인 사전 사이트 URL을 넣을 수 있습니다.
                  };
         // 랜덤한 페이지 선택
         Random random = new Random();
         String url = urls[random.nextInt(urls.length)];
         // 페이지에서 단어 가져오기
         Document doc = Jsoup.connect(url).get();
         Elements words = doc.select("h1, h2, h3, p");

        System.out.println("--------------------------------------------------------");
        System.out.println(words);
        System.out.println("--------------------------------------------------------");
         // 단어가 들어갈 가능성 있는 태그 선택
         String randomWord = "";
         for (Element word : words) {
             String text = word.text();
             if (!text.isEmpty() && text.matches("[a-zA-Z]+")) {
                 // 알파벳으로만 이루어져 있는지 확인
                randomWord = text;
                System.out.println("랜덤한 단어: " + randomWord);
//                  break;
             }
         }*/
    }

    static public void RandomWord(){
        URL url = null;
        try {
            url = new URL("https://random-word-api.herokuapp.com/word");
        } catch(MalformedURLException e1) {
            e1.printStackTrace();
        }

        InputStream in = null;
        try {
            in = url.openStream();
            byte[] buffer = new byte[128];
            int readCount = 0;
            StringBuilder result = new StringBuilder();

            while((readCount = in.read(buffer)) != -1) {
                String part = new String(buffer, 0, readCount);
                result.append(part);
            }
            System.out.println(result);
//            return result.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
//            return null;
        }
    }
}
