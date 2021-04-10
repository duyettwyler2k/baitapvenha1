public class FictionBook extends Book {
    String category;
    FictionBook(){};
    FictionBook(int bookcode,String name,double price,String author,String category){
        super(bookcode, name, price, author);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "bookcode="+super.getBookcode()+
                "name="+super.getPrice()+
                "price="+super.getPrice()+
                "author="+super.getAuthor()+
                "category='" + category + '\'' +
                '}';
    }
}

