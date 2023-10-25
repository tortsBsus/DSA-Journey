/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
  let maxArea = 0;
    let [left,right] =[0,height.length-1];
    while(left<right){
      let currentArea = (right-left)*Math.min(height[left],height[right]);
      maxArea = Math.max(currentArea,maxArea);
      if(height[left]<=height[right]){left++;}
      else right--;
    }
  
  return maxArea;
};