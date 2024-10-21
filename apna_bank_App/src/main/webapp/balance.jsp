<!DOCTYPE html>
<html>
<head>
    <title>APANA - BANK</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        h1 {
            background-color: #4CAF50;
            color: white;
            padding: 20px;
            text-align: center;
        }

        p {
            text-align: center;
            font-size: 18px;
            color: #333;
            margin-top: 5px;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        nav ul li {
            float: left;
        }

        nav ul li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        nav ul li a:hover {
            background-color: #111;
        }

        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
            max-width: 800px;
        }

        table, th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        td {
            text-align: left;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        h3 {
            text-align: center;
            color: #333;
        }

        h2 {
            text-align: center;
            color: #4CAF50;
        }
    </style>
</head>
<body>

    <h1>APANA - BANK</h1>
    <p>ExtraOrdinary Service</p>

    <nav>
        <ul>
            <li><a href="createNewAccount.html">New Account</a></li>
            <li><a href="balance.html">Balance</a></li>
            <li><a href="deposit.html">Deposit</a></li>
            <li><a href="withdraw.html">Withdraw</a></li>
            <li><a href="transfer.html">Transfer</a></li>
            <li><a href="close.html">Close A/C</a></li>
            <li><a href="about.html">About Us</a></li>
        </ul>
    </nav>

    <h2>${msg}</h2>

    <h3>Balance Details</h3>
    <h2>${msg}</h2>

    <table>
        <tr>
            <th>Account No</th>
            <td>${accountNo}</td>
        </tr>
        <tr>
            <th>User ID</th>
            <td>${userid}</td>
        </tr>
        <tr>
            <th>Name</th>
            <td>${name}</td>
        </tr>
        <tr>
            <th>Amount</th>
            <td>${amount}</td>
        </tr>
        <tr>
            <th>Aadhar</th>
            <td>${adhar}</td>
        </tr>
        <tr>
            <th>PAN</th>
            <td>${pan}</td>
        </tr>
        <tr>
            <th>Address</th>
            <td>${address}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${mail}</td>
        </tr>
        <tr>
            <th>Phone</th>
            <td>${phone}</td>
        </tr>
    </table>

</body>
</html>
