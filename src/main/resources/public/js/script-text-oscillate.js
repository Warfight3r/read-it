// Define the list of strings
var textStrings = ["Create your Blog...", "Write a story...", "Share an Experience..."];

// Get the <p> element
var pElement = document.getElementById('oscillating-text');

// Function to animate text (append and delete)
function animateText(strings, index) {
    // Exit condition: If all strings have been animated, reset the index
    if (index >= strings.length) {
        index = 0;
    }

    // Get the current string
    var currentString = strings[index];

    // Append text with interval
    function appendTextWithInterval(text, charIndex) {
        if (charIndex < text.length) {
            // Append the character at the current index
            pElement.textContent += text[charIndex];

            // Increment the index and set the interval
            setTimeout(function () {
                appendTextWithInterval(text, charIndex + 1);
            }, 150); // Change this value (in milliseconds) to adjust the interval
        } else {
            // Call the function to delete characters after a delay
            setTimeout(deleteTextWithInterval, 700);
        }
    }

    // Delete text with interval
    function deleteTextWithInterval() {
        var textContent = pElement.textContent;
        if (textContent.length > 0) {
            // Remove the last character
            pElement.textContent = textContent.slice(0, -1);

            // Set the interval for the next deletion
            setTimeout(deleteTextWithInterval, 70); // Change this value (in milliseconds) to adjust the interval
        } else {
            // Call the function to animate the next string after a delay
            setTimeout(function () {
                animateText(strings, index + 1);
            }, 700); // Change this value (in milliseconds) to adjust the interval before moving to the next string
        }
    }

    // Clear the previous content of the <p> element
    pElement.textContent = '';

    // Call the function to append text with the initial index
    appendTextWithInterval(currentString, 0);
}

// Call the function to start the animation with the initial index
animateText(textStrings, 0);