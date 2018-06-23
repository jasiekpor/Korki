package Zadanie26;

public class Main {

    public static void main(String args[]) {
        System.out.println(Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek"));
        System.out.println(Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek"));
        System.out.println(Article.scanArticleCode("-1:Matematyka dla opornych:5.50:Janek"));
        System.out.println(Article.scanArticleCode("1:Matematyka dla opornych:5.50"));
    }
}
