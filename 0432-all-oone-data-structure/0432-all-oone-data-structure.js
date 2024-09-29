
var AllOne = function() {
    this.map = new Map();
};

/** 
 * @param {string} key
 * @return {void}
 */
AllOne.prototype.inc = function(key) {
    if (this.map.has(key)) this.map.set(key, this.map.get(key) + 1);
    else this.map.set(key, 1);
};

/** 
 * @param {string} key
 * @return {void}
 */
AllOne.prototype.dec = function(key) {
    if (this.map.has(key)){
        if(this.map.get(key) == 1) {
            this.map.delete(key);
        }
        else {
            this.map.set(key, this.map.get(key) - 1);
        }
    }
};

/**
 * @return {string}
 */
AllOne.prototype.getMaxKey = function() {
    maxWord = '';
    maxCount = 0;
    this.map.forEach((count, word) => {
        if (count > maxCount) {
            maxWord = word;
            maxCount = count;
        }
    });
    return maxWord;
};

/**
 * @return {string}
 */
AllOne.prototype.getMinKey = function() {
    minWord = '';
    minCount = Number.POSITIVE_INFINITY;
    this.map.forEach((count, word) => {
        if (count < minCount) {
            minWord = word;
            minCount = count;
        }
    });
    return minWord;
};

/** 
 * Your AllOne object will be instantiated and called as such:
 * var obj = new AllOne()
 * obj.inc(key)
 * obj.dec(key)
 * var param_3 = obj.getMaxKey()
 * var param_4 = obj.getMinKey()
 */