/**
 * 
 */
const arr1 = [1, 3, 5];
const arr2 = [2, 4, 6];
 function mergeSortedArrays(arr1, arr2) {
    let i = 0, j = 0;
    const result = [];
    
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            result.push(arr1[i++]);
        } else {
            result.push(arr2[j++]);
        }
    }
    
    while (i < arr1.length) result.push(arr1[i++]);
    while (j < arr2.length) result.push(arr2[j++]);
    
    return result;
}


console.log(mergeSortedArrays(arr1, arr2)); 
