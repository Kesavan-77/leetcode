/**
 * @param {string[]} timePoints
 * @return {number}
 */
var findMinDifference = function(timePoints) {

    timePoints.sort();

    const timeToMinutes = (time) => {
        let [hours, minutes] = time.split(':').map(Number);
        return hours * 60 + minutes;
    };

    let res = Number.POSITIVE_INFINITY;
    let minutesInDay = 1440;
    let timesInMinutes = timePoints.map(timeToMinutes);

    for (let i = 1; i < timesInMinutes.length; i++) {
        let diff = timesInMinutes[i] - timesInMinutes[i - 1];
        if (diff < res) res = diff;
    }

    let wrapAroundDiff = minutesInDay - timesInMinutes[timesInMinutes.length - 1] + timesInMinutes[0];
    
    return Math.min(wrapAroundDiff, res);
};
