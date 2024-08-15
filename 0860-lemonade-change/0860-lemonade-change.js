/**
 * @param {number[]} bills
 * @return {boolean}
 */
var lemonadeChange = function(bills) {
    let arr = [0,0,0];
    for(let bill of bills) {
        if(bill===5) arr[0]+=1;
        else if(bill===10){
            arr[1]+=1;
            if(arr[0]>0) arr[0]-=1;
            else return false;
        }
        else {
            arr[2]+=1;
            if(arr[1]>0) {
                arr[1]-=1
                if(arr[0]>0) {
                    arr[0]-=1;
                } else return false;
            } else if(arr[0]>=3) {
                arr[0]-=3;
            } else return false;
        }
        console.log(arr)
    }
    return true;
};