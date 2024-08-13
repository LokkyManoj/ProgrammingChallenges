/**
 * 
 */
const numbers = [1, 2, 3, 4, 3, 2, 1];
const target = 4;
console.log(findPairs(numbers, target));
function findPairs(arr, target) {
    const pairs = [];
    const seen = new Set();
    for (const num of arr) {
        const complement = target - num;
        if (seen.has(complement)) {
            pairs.push([complement, num]);
        }
        seen.add(num);
    }
    return pairs;
}


