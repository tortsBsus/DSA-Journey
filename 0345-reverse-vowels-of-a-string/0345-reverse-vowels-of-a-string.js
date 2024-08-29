/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {

    //convert to lowercase for conveinience
    let temp = s.split('');
    
   //start two pointers, one from 0 and another from n-1 and continue the loop till they meet or surpass eachother
   let Opointer = 0;
   let Npointer = s.length - 1;

    const isVowel = (character)=> {
        if(character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u'||character == 'A' ||character == 'E' ||character == 'I' ||character == 'O' ||character == 'U') return true
        return false
    }
   while(Opointer < Npointer){

    if(isVowel(temp[Opointer]) && isVowel(temp[Npointer])){
        let replacer = temp[Opointer];
        temp[Opointer] = temp[Npointer];
        temp[Npointer] = replacer;
        Opointer++;
        Npointer--;
    }
    if(!isVowel(temp[Npointer])) Npointer--;
    if(!isVowel(temp[Opointer])) Opointer++;
   }
    return temp.join("");
};