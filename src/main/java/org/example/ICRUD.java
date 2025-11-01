package org.example;

/*
 * 단어 CRUD 기능을 위한 인터페이스
 */
public interface ICRUD {
    public void addItem();
    public void listAll();
    public void updateItem();
    public void deleteItem();
    public void searchLevel();
    public void searchWord();
}