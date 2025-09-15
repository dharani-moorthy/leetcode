class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> b=new ArrayList<>();
        for(int num1:nums1){
        b.add(num1);
        }
        for(int num2:nums2){
            b.add(num2);
            }
            Collections.sort(b);
            int n=b.size();
            if(n%2==0){
                return (b.get(n/2-1)+b.get(n/2))/2.0;//n/2-1 it wil used to get the element before mid (eg: 4/2-1 =1)(n/2=4/2=2) so it will take the value from index 1 and 2 for even
            }else{
                return b.get(n/2);
        }

        }
       
    }
