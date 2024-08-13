/**
 * 
 */
const input = "I am Manoj";

function countVowels(str) {
    const vowels = 'aeiouAEIOU';
    return [...str].filter(char => vowels.includes(char)).length;
}

console.log(countVowels(input)); 
