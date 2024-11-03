document.addEventListener("DOMContentLoaded", function() {
    var form = document.querySelector('.balance-form form');
    form.addEventListener('submit', function(event) {
        var accountNo = document.getElementById('account-no').value;
        var username = document.getElementById('username').value;
        var password = document.getElementById('password').value;

       
        if (!accountNo || !username || !password) {
            alert('Please fill out all fields.');
            event.preventDefault();  
            return false;
        }

      
        alert('Form submitted successfully.'); 
    });
});
