/*
    Time Complexity - O(N)
    Space Complexity - O(N)

    where N is the number of elements in the array
*/

import java.util.Stack;
public class Solution 
{
    public static int[] nextGreaterElement(int[] arr, int n) 
    {
        // Create a vetor to store next Greater elements
        int[] ans = new int[n];

        // Stack, to keep track of next greater element
        Stack<Integer> s = new Stack<Integer>();

        // Traverse in reverse fashion in the array
        for(int i = n - 1; i >= 0; i--)
        {
            // If current element is greater than or equal to stack's top 
            // element, we can pop it since now it will never get picked
            // as the next greater element
            while(!s.empty() && arr[i] >= s.peek())
            {
                 s.pop();
            }

            // If stack is not empty, stack's top element is 
            // the next greater element, else there is none
            if(!s.empty())
            {
                ans[i] = s.peek();
            }
            else
            {
                ans[i] = -1;
            }

            // Push current element onto stack
            s.push(arr[i]);
        }

        // return final answer vector
        return ans;
    }
}
