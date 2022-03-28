import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
    }

    int size() {
        return mainQ.size();
    }

    void push(int val) {
      mainQ.add(val);
    }

    int pop() {
        Queue<Integer> helperQ = new ArrayDeque<>();
        int count = mainQ.size() - 1;
        
        for(int i = 1; i <= count; i++){
            helperQ.add(mainQ.remove());
        }
        
        int val = mainQ.remove();
        mainQ = helperQ;
        
        return val;
    }

    int top() {
        Queue<Integer> helperQ = new ArrayDeque<>();
        int count = mainQ.size() - 1;
        
        for(int i = 1; i <= count; i++){
            helperQ.add(mainQ.remove());
        }
        
        int val = mainQ.remove();
        helperQ.add(val);
        mainQ = helperQ;
        
        return val;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}
