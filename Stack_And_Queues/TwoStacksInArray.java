import java.io.*;
import java.util.*;

public class Main {

  public static class TwoStack {
    int[] data;
    int tos1;
    int tos2;
    int si1;
    int si2;

    public TwoStack(int cap){
        data = new int[cap];
        tos1 = -1;
        tos2 = cap;
        si1 = 0;
        si2 = 0;
    }

    int size1() {
      return si1;
    }

    int size2() {
      return si2;
    }

    void push1(int val) {
        if((si1 + si2) == data.length ){
            System.out.println("Stack overflow");
            return;
        }
        
        tos1++;
        data[tos1] = val;
        si1++;
    }

    void push2(int val) {
        if((si1 + si2) == data.length ){
            System.out.println("Stack overflow");
            return;
        }
        tos2--;
        data[tos2] = val;
        si2++;
    }

    int pop1() {
        if(tos1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = data[tos1];
        tos1--;
        si1--;
        
        return val;
        
    }

    int pop2() {
        if(tos2 == data.length){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = data[tos2];
        tos2++;
        si2--;
        
        return val;
    }

    int top1() {
        if(tos1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }
      return data[tos1];
    }

    int top2() {
        if(tos2 == data.length){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[tos2];
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    TwoStack st = new TwoStack(n);

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push1")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push1(val);
      } else if (str.startsWith("pop1")) {
        int val = st.pop1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top1")) {
        int val = st.top1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size1")) {
        System.out.println(st.size1());
      } else if (str.startsWith("push2")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push2(val);
      } else if (str.startsWith("pop2")) {
        int val = st.pop2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top2")) {
        int val = st.top2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size2")) {
        System.out.println(st.size2());
      }
      str = br.readLine();
    }
  }
}
