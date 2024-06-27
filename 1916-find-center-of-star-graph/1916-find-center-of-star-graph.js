/**
 * @param {number[][]} edges
 * @return {number}
 */
var findCenter = function(edges) {
    let answer = 0;
    let initiatorsCount = {};

    for(let edge of edges) {
        if(edge[0] in initiatorsCount) initiatorsCount[edge[0]] += 1;
        else initiatorsCount[edge[0]] = 1;

          if(edge[1] in initiatorsCount) initiatorsCount[edge[1]] += 1;
        else initiatorsCount[edge[1]] = 1;
    }
    
    for( let initiator in initiatorsCount){
        if(initiatorsCount[initiator] > answer ) answer = initiator;
    }

    return answer;
};