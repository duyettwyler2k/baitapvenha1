public class Main {
    public static void main(String[] args) {
        Book[]books=new Book[10];
        ProgrammingBook book1=new ProgrammingBook(1,"a",1000,"tao","b","java");
        ProgrammingBook book2=new ProgrammingBook(2,"a",1000,"tao","b","c");
        ProgrammingBook book3=new ProgrammingBook(3,"a",1000,"tao","b","java");
        ProgrammingBook book4=new ProgrammingBook(4,"a",1000,"tao","b","c");
        ProgrammingBook book5=new ProgrammingBook(5,"a",1000,"tao","b","java");

        books[0]=book1;
        books[1]=book2;
        books[2]=book3;
        books[3]=book4;
        books[4]=book5;
        FictionBook book6=new FictionBook(6,"sdas",2000,"me","as");
        FictionBook book7=new FictionBook(7,"sdas",2000,"me","as");
        FictionBook book8=new FictionBook(8,"sdas",2000,"me","as");
        FictionBook book9=new FictionBook(9,"sdas",2000,"me","as");
        FictionBook book10=new FictionBook(10,"sdas",2000,"me","as");
        books[5]=book6;
        books[6]=book7;
        books[7]=book8;
        books[8]=book9;
        books[9]=book10;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        int total=0;
        for (int i = 0; i < books.length ; i++) {

            total+=books[i].getPrice();
        }
        System.out.println("tong gia tien la "+total);
        int count = 0;
        for (Book newbook : books) {
            if (newbook instanceof ProgrammingBook) {
                if (((ProgrammingBook) newbook).getLanguage().equals("java")) {
                    count++;
                }
            }
        }
        System.out.println("Số cuốn sách có ngôn ngữ là java : " + count);


    }
}
