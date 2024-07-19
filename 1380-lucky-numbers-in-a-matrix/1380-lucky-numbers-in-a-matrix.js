/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers = function (matrix) {

    const minElementInRow = (arr) => {
        return Math.min(...arr);
    }

    const maxElementInCol = (idx, arr) => {
        let maxi = -1;
        for (let row = 0; row < arr.length; row++) {
            maxi = arr[row][idx] > maxi ? arr[row][idx] : maxi;
        }
        return maxi;
    }

    const findIndex = (val, arr) => {
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === val) return i;
        }
    }

    let res = [];
    for (let i = 0; i < matrix.length; i++) {
        let minNo = minElementInRow(matrix[i]);
        let maxNo = maxElementInCol(findIndex(minNo, matrix[i]), matrix)
        if (minNo === maxNo) res.push(minNo)
    }

    return res;
};