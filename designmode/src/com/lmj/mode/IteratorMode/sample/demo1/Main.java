package com.lmj.mode.IteratorMode.sample.demo1;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("三国"));
        bookShelf.appendBook(new Book("水浒"));
        bookShelf.appendBook(new Book("红楼"));
        bookShelf.appendBook(new Book("西游"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
