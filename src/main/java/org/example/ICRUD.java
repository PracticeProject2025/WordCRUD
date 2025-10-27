package org.example;

/*
 * 단어 CRUD 기능을 위한 인터페이스
 */
public interface ICRUD {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}

