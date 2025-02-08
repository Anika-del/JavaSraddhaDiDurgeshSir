package chapter9_Vector;

public class UniqueValue {
    
    public static int main(String[] args) {
            
            int[] nums = {2,2,1};
            int ans=0;
            int val=1;
             for(int i=0; i<nums.length; i++){
                    ans = ans^val;
                }
                return ans;
            }
           
            }
        

