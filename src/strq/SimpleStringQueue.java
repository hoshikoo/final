package strq;import java.util.ArrayList;import java.util.Queue;import java.util.Stack;/** * Created by Hoshiko on 12/10/15. */public class SimpleStringQueue implements StringQueue{    ArrayList<Character> queues = new ArrayList<Character>();    @Override    public int length()    {        return queues.size();    }    @Override    public void enqueue(String string)    {        for(int i = 0; i < string.length(); i++){            queues.add(string.charAt(i));        }    }    @Override    public String dequeue(int length)    {        String newStr = "";        for(int i = 0 ;  i < length ; i ++){           char charAtI =  queues.get(i);            newStr = newStr +String.valueOf(charAtI);        }        return newStr;    }}