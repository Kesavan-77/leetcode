/**
 * @param {number[]} arr
 * @param {number[][]} queries
 * @return {number[]}
 */
var xorQueries = function(arr, queries) {
    let values = [];
    let cal = 0;
    for(let i=0;i<arr.length;i++){
        cal ^= arr[i];
        values.push(cal)
    }
    let res = [];
    for(let val of queries){
        if(val[0]-1>=0){
            res.push(values[val[1]] ^ values[val[0]-1]);
        } else {
            res.push(values[val[1]]);
        }
    }
    return res;
};