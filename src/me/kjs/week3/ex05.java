package me.kjs.week3;

public class ex05 {
    public static void main(String[] args) {
        String s = "";
        boolean stringInstanceOfObject = s instanceof Object;
        System.out.println("Declare String, make object String\ninstance of Object = " + stringInstanceOfObject);
        Book book = new Book();
        boolean bookInstanceOfItem = book instanceof Item;
        System.out.println("Declare Book, make object Book\ninstance of Item = " + bookInstanceOfItem);
        Item item1 = new Book();
        boolean itemInstanceOfBook = item1 instanceof Book;
        System.out.println("Declare Item, make object Book\ninstance of Item = " + itemInstanceOfBook);
        Item item2 = new Book();
        boolean itemInstanceOfNovel = item2 instanceof Novel;
        System.out.println("Declare Item, make object Novel\ninstance of Book = " + itemInstanceOfNovel);


    }
    static interface Item {

    }
    static class Book implements Item {

    }
    static class Novel implements Item {

    }
}



