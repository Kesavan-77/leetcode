/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var findTheWinner = function (n, k) {
    let queue = [];
    for (let i = 1; i <= n; i++) queue.push(i);
    while (queue.length > 1) {
        for (let i = 0; i < k - 1; i++) {
            let val = queue.shift();
            queue.push(val);
        }
        queue.shift();
    }
    return queue[0];
};