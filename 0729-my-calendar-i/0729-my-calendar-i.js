var MyCalendar = function() {
    this.bookings = []; 
};

/** 
 * @param {number} start 
 * @param {number} end
 * @return {boolean}
 */
MyCalendar.prototype.book = function(start, end) {
    for (let [s, e] of this.bookings) {
        if (start < e && end > s) {
            return false;
        }
    }
    this.bookings.push([start, end]);
    return true;
};

/** 
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = new MyCalendar()
 * var param_1 = obj.book(start,end)
 */