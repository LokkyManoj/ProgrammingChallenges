/**
 * 
 */

const array1 = [1, 2, 3, 4];
const array2 = [3, 4, 5, 6];
function findCommonElements(arr1, arr2) {
    const set1 = new Set(arr1);
    const set2 = new Set(arr2);
    const common = [...set1].filter(item => set2.has(item));
    return common;
}


console.log("The common elements are:"+findCommonElements(array1, array2)); 
