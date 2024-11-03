document.addEventListener("DOMContentLoaded", function() {
    var form = document.querySelector('.account-form form');
    form.addEventListener('submit', function(event) {
        var username = document.getElementById('username').value;
        var password = document.getElementById('password').value;
        var repassword = document.getElementById('re-password').value;
        var amount = document.getElementById('amount').value;
        var address = document.getElementById('address').value;
        var phone = document.getElementById('phone').value;

        // Validate filled out fields
        if (!username || !password || !repassword || !amount || !address || !phone) {
            alert('Please fill out all fields.');
            event.preventDefault();
            return false;
        }

        // Validate passwords match
        if (password !== repassword) {
            alert('Passwords do not match.');
            event.preventDefault();
            return false;
        }

        // Validate numeric fields
        if (isNaN(amount) || isNaN(phone)) {
            alert('Please enter valid numbers for amount and phone.');
            event.preventDefault();
            return false;
        }
        
        // If all validations pass, the form will submit
        alert('Form submitted successfully.');
    });
});
