package org.example;

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;

    /*
     * Word 객체를 생성하는 생성자
     */
    Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /*
     * 객체 정보를 문자열로 반환
     */
    @Override
    public String toString() {
        String slevel = "";

        for(int i = 0; i < level; i++) slevel += "*";

        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + "   " + meaning;

        return str;
    }
    public String toFileString(){
        return this.level + "|" + this.word + "|" + this.meaning;
    }
}