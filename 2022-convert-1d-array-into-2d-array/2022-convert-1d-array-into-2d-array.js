/**
 * @param {number[]} original
 * @param {number} m
 * @param {number} n
 * @return {number[][]}
 */
var construct2DArray = function(original, m, n) {
    let res = [];
    if(m*n !== original.length) return res;
    let start = 0;
    while(m>0 && original.length){
        let temp = [],col=0;
        while(col<n && start<original.length){
            temp.push(original[start++]);
            col++;
        }
        res.push(temp);
        m--;
    }
    return res;
};