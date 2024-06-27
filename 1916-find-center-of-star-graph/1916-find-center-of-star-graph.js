/**
 * @param {number[][]} edges
 * @return {number}
 */
var findCenter = function (edges) {

    //   Because it is a star graph
    let edgeA = edges[0];
    let edgeB = edges[1];
    if (edgeA[0] == edgeB[0]) return edgeA[0];
    else if (edgeA[1] == edgeB[0]) return edgeA[1];
    else if (edgeA[0] == edgeB[1]) return edgeA[0];
    else return edgeA[1];

};