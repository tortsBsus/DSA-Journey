/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if(s.length <=1)return true;
    s=s.toLowerCase();
  let [left,right] =[0,s.length-1];
  while(left<right){
      let leftChar = s[left];
      let rightChar = s[right];
      
      if(!/[a-zA-Z0-9]/.test(leftChar)){
          left++;
          }
      else if (!/[a-zA-Z0-9]/.test(rightChar)){ right--;}
      else{
          
          if(leftChar !== rightChar){return false;}
          right--;
          left++;
      }
      
  }
  return true;

};