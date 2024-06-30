/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
    let sum = digits.join('');
    sum=(BigInt(sum)+BigInt(1))+'';
    sum = sum.split('')
    sum = sum.map((val)=>Number(val));
    return sum;
};