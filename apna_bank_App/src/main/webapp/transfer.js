
function validateTransfer() {
    var accountNo = document.getElementById('accountNo').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var targetAccountNo = document.getElementById('targetAccountNo').value;
    var amount = document.getElementById('amount').value;

    if (!accountNo || !username || !password || !targetAccountNo || !amount) {
        alert('Fill out all fields');
        return false;
    }
    if (isNaN(accountNo) || isNaN(targetAccountNo)) {
        alert('Account numbers must be numeric');
        return false;
    }
    if (isNaN(amount)) {
        alert('Amount must be a number');
        return false;
    }


    alert('Transfer initiated successfully.');
}
