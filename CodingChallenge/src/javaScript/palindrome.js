/**
 * 
 */
const testString = "racecar";

 function isPalindrome(str) {
    const cleanedStr = str.replace(/[^a-zA-Z0-9]/g, ''); 
    const reversedStr = cleanedStr.split('').reverse().join('');
    return cleanedStr === reversedStr;
}

console.log(isPalindrome(testString)); 
