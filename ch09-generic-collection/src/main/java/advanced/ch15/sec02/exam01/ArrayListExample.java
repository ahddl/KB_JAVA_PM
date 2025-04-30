package main.java.advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1","내용1","쓰니1"));
        list.add(new Board("제목2","내용2","쓰니2"));
        list.add(new Board("제목3","내용3","쓰니3"));
        list.add(new Board("제목4","내용4","쓰니4"));
        list.add(new Board("제목5","내용5","쓰니5"));

        System.out.println(list.size());
        Board b3 = list.get(2);
        System.out.println(b3.getSubject()+" "+b3.getContent()+" "+ b3.getWriter());
        System.out.println("-----------------------");

        for (Board board : list) {
            System.out.println(board.getSubject()+" "+board.getContent()+" "+board.getWriter());
        }

        System.out.println("-----------------------");

        list.remove(2);
        for (Board board : list) {
            System.out.println(board.getSubject()+" "+board.getContent()+" "+board.getWriter());
        }

    }
}
