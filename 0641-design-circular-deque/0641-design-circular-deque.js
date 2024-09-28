/**
 * @param {number} k
 */
var MyCircularDeque = function(k) {
    this.myQueue = [];
    this.len = k;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertFront = function(value) {
    if(this.myQueue.length >= this.len) {
        return false;
    }
    this.myQueue.unshift(value);
    return true;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertLast = function(value) {
    if(this.myQueue.length >= this.len) {
        return false;
    }
    this.myQueue.push(value);
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteFront = function() {
    if(this.myQueue.length === 0) {
        return false;
    }
    this.myQueue.shift();
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteLast = function() {
    if(this.myQueue.length === 0) {
        return false;
    }
    this.myQueue.pop();
    return true;
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getFront = function() {
    console.log(this.myQueue);
    if(this.myQueue.length === 0) {
        return -1;
    }
    return this.myQueue[0];
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getRear = function() {
    console.log(this.myQueue);
    if(this.myQueue.length === 0) {
        return -1;
    }
    return this.myQueue[this.myQueue.length-1];
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isEmpty = function() {
    if(this.myQueue.length == 0) {
        return true;
    }
    return false;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isFull = function() {
    if(this.myQueue.length == this.len) {
        return true;
    }
    return false;
};

/** 
 * Your MyCircularDeque object will be instantiated and called as such:
 * var obj = new MyCircularDeque(k)
 * var param_1 = obj.insertFront(value)
 * var param_2 = obj.insertLast(value)
 * var param_3 = obj.deleteFront()
 * var param_4 = obj.deleteLast()
 * var param_5 = obj.getFront()
 * var param_6 = obj.getRear()
 * var param_7 = obj.isEmpty()
 * var param_8 = obj.isFull()
 */