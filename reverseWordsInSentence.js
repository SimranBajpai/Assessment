function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Example:
const inputSentence = "Hello..! Good Morning Have a Nice Day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); 