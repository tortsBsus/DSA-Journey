/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const Stacks =[];
    for(let a=0;a<s.length;a++)
    {
        switch(s[a]){
            case '{': case '(': case '[': Stacks.push(s[a]); break;
            case '}': if(Stacks[Stacks.length-1]=='{') Stacks.pop();
                        else Stacks.push(s[a]); break; 
            case ')': if(Stacks[Stacks.length-1]=='(') Stacks.pop(); else Stacks.push(s[a]); break; 
            case ']': if(Stacks[Stacks.length-1]=='[') Stacks.pop(); else Stacks.push(s[a]); break; 
        }
    }
    return Stacks.length==0;
};