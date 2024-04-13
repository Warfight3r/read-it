function toggleDot() {
    var dot = document.getElementById("vibrating-dot");
    if (dot.style.opacity === "0") {
        dot.style.opacity = "1";
    } else {
        dot.style.opacity = "0";
    }
}

setInterval(toggleDot, 500); // Toggle every 0.5 seconds