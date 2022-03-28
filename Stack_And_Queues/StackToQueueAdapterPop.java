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
        Queue<Integer> helperQ = new ArrayDeque<>();
        
        while(mainQ.size() > 0){
            int rval = mainQ.remove();
            helperQ.add(rval);
        }
        
        mainQ.add(val);
        
        while(helperQ.size() > 0){
            int rval = helperQ.remove();
            mainQ.add(rval);
        }
    }

    int pop() {
        return mainQ.remove();
    }

    int top() {
        return mainQ.peek();
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
