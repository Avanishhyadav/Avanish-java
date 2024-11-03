document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('.account-form form');
    const usernameInput = document.getElementById('username');
    const passwordInput = document.getElementById('password');
    const rePasswordInput = document.getElementById('re-password');
    const amountInput = document.getElementById('amount');
    const aadharInput = document.getElementById('aadhar');
    const panInput = document.getElementById('pan');
    const mailInput = document.getElementById('mail');
    const phoneInput = document.getElementById('phone');

    form.addEventListener('submit', function(event) {
        const messages = validateForm();

        if (messages.length > 0) {
            event.preventDefault();
            displayErrors(messages);
        }
    });

    function validateForm() {
        let messages = [];

        if (!usernameInput.value.trim()) {
            messages.push('Username is required.');
        }

        if (!passwordInput.value.trim()) {
            messages.push('Password is required.');
        }

        if (!rePasswordInput.value.trim()) {
            messages.push('Please confirm your password.');
        }

        if (passwordInput.value !== rePasswordInput.value) {
            messages.push('Passwords do not match.');
        }

        if (!/^\d+(\.\d{1,2})?$/.test(amountInput.value) || parseFloat(amountInput.value) <= 0) {
            messages.push('Enter a valid positive amount.');
        }

        if (!/^\d{12}$/.test(aadharInput.value)) {
            messages.push('Enter a valid 12-digit Aadhar number.');
        }

        if (!/^[A-Z]{5}[0-9]{4}[A-Z]{1}$/.test(panInput.value.toUpperCase())) {
            messages.push('Enter a valid PAN card number.');
        }

        if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(mailInput.value)) {
            messages.push('Enter a valid email address.');
        }

        if (!/^\d{10}$/.test(phoneInput.value)) {
            messages.push('Enter a valid 10-digit phone number.');
        }

        return messages;
    }

    function displayErrors(messages) {
        const errorContainer = document.querySelector('.error-messages');
        if (!errorContainer) {
            const newErrorContainer = document.createElement('div');
            newErrorContainer.classList.add('error-messages');
            form.prepend(newErrorContainer);
        }
        
        document.querySelector('.error-messages').innerHTML = messages.map(message => `<p>${message}</p>`).join('');
    }
});
