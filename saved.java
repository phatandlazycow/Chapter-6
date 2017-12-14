//-------------------------------------------------------
//Matchup
public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for (int x=0;x<nums1.length;x++){
    if(nums1[x] !=nums2[x])
      if(nums1[x]-nums2[x]<=2)
        if(nums2[x]-nums1[x]<=2)
          count +=1;
    
  }
  return count;
}
//----------------------------------------------------------
// shiftleft
public int[] shiftLeft(int[] nums) {
  int[] newnums = new int[nums.length];
  int move;
 
  for (int index = 0; index<nums.length;index++){
      if(index == 0){
        move = nums[index];
        newnums[nums.length-1]=move;
      }
      else{
    move=nums[index];
    newnums[index-1]=move;
      }
      }
  return newnums;
}
//---------------------------------------------------
//tenrun
public int[] tenRun(int[] nums) {
  int change = 2;
  for(int x = 1;x<nums.length;x++){
    if(10/nums[x] == 2 ){
      change = 5;
    }
    if(10/nums[x] == 5){
      change = 2;
    }
    nums[x] = change;
    if(10/nums[x]==1){
      change = 10;
    }
    nums[x] = change;
  }
  return nums;
}
