 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DublicateElement {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.print("Duplicate element are : ");
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.print(nums[i] + " ");
                    break;
                }
            }
        }
    }
}
