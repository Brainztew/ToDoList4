console.log("Cihan testar");

// Dagens datum.
let todayDate = new Date().toLocaleDateString();
// Input-fältet där man anger deadline.
let deadlineInput = document.getElementById("deadline");
// Vi kommer bara kunna välja dagens datum eller senare som deadline.
deadlineInput.setAttribute("min", todayDate);

// Vi hämtar varje task.
let tasks = document.getElementsByClassName("task");
// Loopar igenom varje task och kontrollerar deadline.
for (let i = 0; i < tasks.length; i++) {
    let deadlineDate = new Date(tasks.item(i).innerHTML.slice(tasks.item(i).innerHTML.length - 10, tasks.item(i).innerHTML.length)).toLocaleDateString();
    // Är deadlinen passerad? Då blir texten röd.
    if (deadlineDate < todayDate) {
        tasks.item(i).style.color = "red";
    }
}
