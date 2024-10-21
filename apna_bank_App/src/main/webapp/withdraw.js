function validateForm() {
    var accountNo = document.getElementById('accountNo').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var amount = document.getElementById('amount').value;

    if (!accountNo) {
        alert('A/C No. must be number & can\'t be null');
        return false;
    }
    if (isNaN(accountNo)) {
        alert('A/C No. must be a number');
        return false;
    }
    if (!username || !password || !amount) {
        alert('Please fill out all fields.');
        return false;
    }

    alert('Form submitted successfully.');
}
