/**
 * @param {number} start
 * @param {number} goal
 * @return {number}
 */

var minBitFlips = function(start, goal) {
    let startBin = start.toString(2);
    let goalBin = goal.toString(2);
    let totSteps = 0;
    let p1 = startBin.length - 1, p2 = goalBin.length - 1;
    console.log(startBin, goalBin)
    while(p1>=0 && p2>=0) {
        if(startBin[p1--]!==goalBin[p2--]) totSteps++;
    }
    while(p1>=0){
        if(startBin[p1--]!=0) totSteps++;
    }
    while(p2>=0){
        if(goalBin[p2--]!=0) totSteps++;
    }
    return totSteps;
};