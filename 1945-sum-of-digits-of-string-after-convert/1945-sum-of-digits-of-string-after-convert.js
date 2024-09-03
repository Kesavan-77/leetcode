/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var getLucky = function(s, k) {
    let numValue = '';
    for(let char of s) numValue += (char.charCodeAt(0) - 96);
    while(k>0){
        let sum = 0;
        for(let char of numValue) sum += Number(char);
        numValue = String(sum);
        k--;
    }
    return Number(numValue);
};