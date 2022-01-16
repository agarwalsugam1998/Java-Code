class Solution {
    public int findPeakElement(int[] arr) {
        
     int start = 0;
      int end = arr.length - 1;
      while(start<end)
      {
          int mid = start + (end-start)/2;
          if(arr[mid]>arr[mid+1])
          {
              // i am in the decreasing part, means ans will lie in the right
              end = mid;
          }
          else
          {
                  start = mid+1;
          }
      }
        return start;
    }
}
