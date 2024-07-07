/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
    if(numBottles<numExchange) return numBottles;
    let res = numBottles;
    while(numBottles>=numExchange){
        let completed = Math.floor(numBottles/numExchange);
        let remaining = numBottles%numExchange;
        res+= completed;
        numBottles = completed + remaining;
    }
    return res;
};