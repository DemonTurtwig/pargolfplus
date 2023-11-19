package com.pgp.app.appcomponents.utility

import android.content.ContentValues
import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.pgp.app.R
import com.pgp.app.modules.signup.ui.SignupActivity

class SignupModule (
    private val context: Context,
    private val activity: SignupActivity,
    private val inputUsername: EditText,
    private val fnInput: EditText,
    private val lnInput: EditText,
    private val pwInput: EditText,
    private val confirmpwInput: EditText,
    private val agreeTnC: CheckBox,
    private val btnCreateAccount: Button

) {

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            updateButtonState()
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            // Not used
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            // Not used
        }
    }

    init {
        // Set up a text change listener for each input field
        inputUsername.addTextChangedListener(textWatcher)
        fnInput.addTextChangedListener(textWatcher)
        lnInput.addTextChangedListener(textWatcher)
        pwInput.addTextChangedListener(textWatcher)
        confirmpwInput.addTextChangedListener(textWatcher)

        // Set up a check change listener for the "agreeTnC" checkbox
        agreeTnC.setOnCheckedChangeListener { _, _ -> updateButtonState() }
    }

    private fun updateButtonState() {
        val isInputsNotEmpty = inputUsername.text.isNotEmpty() &&
                fnInput.text.isNotEmpty() &&
                lnInput.text.isNotEmpty() &&
                pwInput.text.isNotEmpty() &&
                confirmpwInput.text.isNotEmpty()

        val isTnCChecked = agreeTnC.isChecked

        btnCreateAccount.isEnabled = isInputsNotEmpty && isTnCChecked
        btnCreateAccount.setOnClickListener {
            if (validateInputs()) {

                val inputUsername = inputUsername.text.toString()
                val fnInput = fnInput.text.toString()
                val lnInput = lnInput.text.toString()
                val pwInput = pwInput.text.toString()

               AppPreferencesHelper.saveUserData(
                    context,
                    inputUsername,
                    fnInput,
                    lnInput,
                    pwInput
                )

                // Register the user
                registerUser(inputUsername, fnInput, lnInput, pwInput)

            }
        }
        if (isInputsNotEmpty && isTnCChecked) {
            // Set button color to "red_A101" and text color to "white"
            btnCreateAccount.setBackgroundResource(R.color.red_A101)
            btnCreateAccount.setTextColor(Color.WHITE)

        } else {
            // Set button color and text color to default
            btnCreateAccount.setBackgroundResource(R.color.bluegray_50)
            btnCreateAccount.setTextColor(Color.rgb(198,199,200))
        }

    }
    private fun validateInputs(): Boolean {
        // Validate inputUsername
        val isUsernameValid = inputUsername.text.matches("^(?=.*[a-zA-Z])(?=.*\\d).+\$".toRegex())
        if (!isUsernameValid) {
            inputUsername.error = "Please enter a valid username with any alphabet and number"
        }

        // Validate fnInput
        val isFirstNameValid = fnInput.text.matches("^[a-zA-Z]+$".toRegex())
        if (!isFirstNameValid) {
            fnInput.error = "Please enter a valid first name, only English characters are allowed"
        }

        // Validate lnInput
        val isLastNameValid = lnInput.text.matches("^[a-zA-Z]+$".toRegex())
        if (!isLastNameValid) {
            lnInput.error = "Please enter a valid last name, only English characters are allowed"
        }

        // Validate pwInput
        val isPasswordValid = pwInput.text.matches(".*\\d.*".toRegex())
        if (!isPasswordValid) {
            pwInput.error = "Please put at least one numeric character in your password"
        }

        // Validate confirmpwInput
        val isPasswordMatch = pwInput.text.toString() == confirmpwInput.text.toString()
        if (!isPasswordMatch) {
            confirmpwInput.error = "The passwords do not match. Please try again"
        }

        // Return true if all validations pass
        return isUsernameValid && isFirstNameValid && isLastNameValid && isPasswordValid && isPasswordMatch
    }
    private fun registerUser(username: String, firstName: String, lastName: String, password: String) {
        // Get a writable database
        val dbHelper =
            RegisterDBHelper(activity)
        val db = dbHelper.writableDatabase

        // Create a ContentValues object to store user information
        val values = ContentValues()
        values.put(RegisterDBHelper.COLUMN_USERNAME, username)
        values.put(RegisterDBHelper.COLUMN_FIRST_NAME, firstName)
        values.put(RegisterDBHelper.COLUMN_LAST_NAME, lastName)
        values.put(RegisterDBHelper.COLUMN_PASSWORD, password)

        // Insert user information into the database
        val newRowId = db.insert(RegisterDBHelper.TABLE_NAME, null, values)

        // Close the database
        db.close()

        // Handle registration success or failure
        if (newRowId != -1L) {
            // Registration successful
            Toast.makeText(activity, "Registration Successful", Toast.LENGTH_SHORT).show()
        } else {
            // Registration failed
            Toast.makeText(activity, "Registration Failed", Toast.LENGTH_SHORT).show()
        }
    }

}