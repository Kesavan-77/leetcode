/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
var uncommonFromSentences = function(s1, s2) {
    let map = new Map();
    let res = [];
    let words = s1.split(" ").concat(s2.split(" "));
    for (let word of words) {
        map.set(word, (map.get(word) || 0) + 1);
    }
    for (let [word, count] of map) {
        if (count === 1) {
            res.push(word);
        }
    }
    return res;
};
