public class ProgrammingBook extends Book{
 String framework;
 String language;
 ProgrammingBook(){};
 ProgrammingBook(int bookcode,String name,double price,String author,String framework,String language){
     super(bookcode, name, price, author);
     this.framework=framework;
     this.language=language;
 }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "bookcode="+super.getBookcode()+
                "name="+super.getPrice()+
                "price="+super.getPrice()+
                "author="+super.getAuthor()+
                "framework='" + framework + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
