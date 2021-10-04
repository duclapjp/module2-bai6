package book;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;

    public ProgrammingBook(String bookCode, String name,int price, String author, String language, String framework) {
        super(bookCode, name,price,author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }
    public ProgrammingBook(){

    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
