package com.pgp.app.appcomponents.utility

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.pgp.app.modules.homelog.ui.HomelogActivity

class LoginModule

    (
    private val context: Context,
    private val btnLogin: Button,
    private val inputUsername: EditText,
    private val pwInput: EditText,

    )
    {

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
            // Set up a text change listener for input fields
            inputUsername.addTextChangedListener(textWatcher)
            pwInput.addTextChangedListener(textWatcher)

            // Set up click listener for the login button
            btnLogin.setOnClickListener {
                // Perform login when the button is clicked

                loginUser()
            }
        }

        private fun updateButtonState() {
            val isInputsNotEmpty = inputUsername.text.isNotEmpty() && pwInput.text.isNotEmpty()
            btnLogin.isEnabled = isInputsNotEmpty
        }

        private fun loginUser() {
            val dbHelper =
                RegisterDBHelper(context)
            val db: SQLiteDatabase = dbHelper.readableDatabase

            val username = inputUsername.text.toString()
            val password = pwInput.text.toString()
            AppPreferencesHelper.saveUsername(context, "username");
            // Check if the user exists in the database
            val cursor: Cursor = db.rawQuery(
                "SELECT * FROM ${RegisterDBHelper.TABLE_NAME} " +
                        "WHERE ${RegisterDBHelper.COLUMN_USERNAME}=?" +
                        "AND ${RegisterDBHelper.COLUMN_PASSWORD}=?",
                arrayOf(username, password)
            )

            if (cursor.moveToFirst()) {
                // User exists, login successful


                Toast.makeText(context, "Login successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(context, HomelogActivity::class.java)
                context.startActivity(intent)

            } else {
                // User does not exist or incorrect credentials
                Toast.makeText(context, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT).show()
            }

            cursor.close()
            db.close()
        }
}