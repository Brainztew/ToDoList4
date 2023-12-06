console.log("Cihan testar");

// Dagens datum.
let todayDate = new Date();
// Gårdagens datum.
let yesterdayDate = new Date();
yesterdayDate.setDate(todayDate.getDate() - 1);
// Input-fältet där man anger deadline.
let deadlineInput = document.getElementById("deadline");
deadlineInput.setAttribute("min", yesterdayDate.toLocaleDateString());

// Loopar igenom varje task och kontrollerar deadline.
let tasks = document.getElementsByClassName("task-description");
for (let i = 0; i < tasks.length; i++) {
    let deadlineDate = new Date(tasks.item(i).innerHTML.slice(tasks.item(i).innerHTML.length - 10, tasks.item(i).innerHTML.length)).toLocaleDateString();
    // Är deadlinen passerad? Då blir texten röd.
    if (deadlineDate < todayDate.toLocaleDateString()) {
        tasks.item(i).style.color = "red";
    }
}

let doneButtons = document.getElementsByClassName("done-button");
for (let i = 0; i < doneButtons.length; i++) {
    doneButtons.item(i).addEventListener("change", (e) => {
        if (e.target.checked == true) {
            tasks.item(i).style.textDecoration = "line-through";
        } else {
            tasks.item(i).style.textDecoration = "none";
        }
    });
}
