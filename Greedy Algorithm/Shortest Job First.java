class Solution{
  public static int shortestJobfirst(int[] arr){
      Arrays.sort(arr);
      int currentTime = 0;
      int total_weight_time = 0;
      for(int i = 0;i<arr.length;i++){
          total_weight_Time += currentTime;
          total_weight_Time += arr[i];
      }
      return (total_weight_time / arr.length);
  }
  
}
