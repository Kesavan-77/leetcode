/**
 * @param {number[]} arr
 * @param {number[][]} queries
 * @return {number[]}
 */
var xorQueries = function(arr, queries) {
    let res = [];
    for(let val of queries) {
        let cal = 0;
        for(let i=val[0];i<=val[1];i++){
            cal ^= arr[i];
        }
        res.push(cal);
    }
    return res;
};