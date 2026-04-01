class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        int ptr1 = 0;
        int ptr2 = 0;
        int i=0;
        while(ptr1<m&&ptr2<n)
        {
            if(nums1[ptr1]<=nums2[ptr2])
            {
                arr[i++]=nums1[ptr1];
                ptr1++;
            }
            else
            {
                arr[i++]=nums2[ptr2];
                ptr2++;
            }
        }
        while(ptr1<m)
        {
            arr[i++]=nums1[ptr1];
            ptr1++;
        }
        while(ptr2<n)
        {
            arr[i++]=nums2[ptr2];
            ptr2++;
        }
        int len = m+n;
        double med=0;
        if(len%2==0)
        {
            med = (arr[len/2]+arr[(len/2)-1])/2.0;
        }
        else
        {
            med = arr[len/2];
        }
        return med;
    }
}
