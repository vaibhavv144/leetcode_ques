class Solution {
    public int search(int[] nums, int target) {
        
        int n=nums.length;
        return check(nums,target,n);

    }

    public static int check(int[]arr,int target,int n){
        int l=0;
        int h=n-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return mid;
            //if left side is sorted check and see
            if(arr[mid]>=arr[l]){
                //if it is true check if target lies here and chg pointer accordingly
                if((arr[l]<=target)&&(arr[mid]>=target)) //low ar mid k beech h to high wle pointer ko aage laao
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            //right is sorted
            else{
                if((arr[mid]<=target)&&(arr[h]>=target)) //low ar mid k beech h to high wle pointer ko aage laao
                {
                    l=mid+1;
                   
                }
                else{
                     h=mid-1;
                }

            }            
        }
        return -1;

    }
}