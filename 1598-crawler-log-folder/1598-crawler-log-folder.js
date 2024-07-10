/**
 * @param {string[]} logs
 * @return {number}
 */
var minOperations = function(logs) {
    let currLog = [];
    for(let log of logs){
        if(log==='../'){
            if(currLog) currLog.pop();
        }
        else if(log==='./');
        else currLog.push(log);
    }
    return currLog.length;
};