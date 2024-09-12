/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    res = words.length;
    let map = new Map();
    for(let char of allowed) {
        map.set(char,1);
    }
    for(let word of words) {
        for(let w of word) {
            if(!map.get(w)){
                res--;
                break;
            }
        }
    }
    return res;
};