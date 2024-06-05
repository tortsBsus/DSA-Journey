/**
 * @param {string[]} words
 * @return {string[]}
 */
var commonChars = function (words) {


    let common = {};
    //Create a frequency list for the first word
    for (let a = 0; a < words[0].length; a++) {
        if (words[0][a] in common) common[words[0][a]] += 1;
        else common[words[0][a]] = 1;
    }
    //Check if others have the same frequencies as first word
    for (let word of words) {

        let current = {};
        for (let a = 0; a < word.length; a++) {
            if (word[a] in current) current[word[a]] += 1;
            else current[word[a]] = 1;
        }

        for (let alphabet in common) {
            if (alphabet in current) common[alphabet] = Math.min(common[alphabet], current[alphabet]);
            else delete common[alphabet];
        }

    }
    //Create answer array as required
    let answer = [];
    for (let alphabet in common) {
        while (common[alphabet] > 0) {
            answer.push(alphabet);
            common[alphabet] -= 1;
        }
    }


    return answer;
};