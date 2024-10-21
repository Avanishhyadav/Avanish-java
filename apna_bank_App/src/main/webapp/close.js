function validateForm() {
    var accountNo = document.getElementById('accountNo').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
  
    if (accountNo === "" || username === "" || password === "") {
      alert("Fill out all fields");
      return false;
    }

    alert("Form submitted successfully!");
  }
  