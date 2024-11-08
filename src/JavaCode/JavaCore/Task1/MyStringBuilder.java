package JavaCode.JavaCore.Task1;

import java.util.Arrays;
import java.util.Stack;


public class MyStringBuilder {

     private String str;
     private SnapShotBuilder shot;
     private Stack<MyStringBuilder> stackBuilder;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyStringBuilder(String str) {
        this.str = str;
    }
    public MyStringBuilder() {}

    public void append(String str1) {
        this.str = str;
        SnapShotBuilder snap = new SnapShotBuilder();
        MyStringBuilder my = new MyStringBuilder(str);
        Stack<MyStringBuilder> stack = new Stack<>();

        if (str != null)
            str = str.concat(str1);
        else
            str = str1;

        stack.push(snap.snapshot(my));
        this.stackBuilder = stack;
    }

    public void undo(){

        this.str = str;
        SnapShotBuilder snap = new SnapShotBuilder();
        MyStringBuilder my = new MyStringBuilder(str);
        MyStringBuilder builder = this.stackBuilder.peek();

        this.stackBuilder.push(snap.snapshot(my));
        this.str = builder.getStr();


    }

}
