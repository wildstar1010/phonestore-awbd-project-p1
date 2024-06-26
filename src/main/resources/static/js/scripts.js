document.addEventListener("DOMContentLoaded", function() {
    console.log("Document loaded");

    // Example function to show alert on button click
    document.getElementById("exampleButton").addEventListener("click", function() {
        alert("Button clicked!");
    });
});
function redirectToRegister() {
    window.location.href = '/register';
}

function redirectToLogin() {
    window.location.href = '/login';
}

