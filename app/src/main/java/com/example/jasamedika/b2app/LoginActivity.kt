package com.example.jasamedika.b2app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import android.content.Intent
import android.content.SharedPreferences
import android.widget.EditText
import android.support.v4.app.NavUtils
import android.view.MenuItem


class LoginActivity : AppCompatActivity() {
    var ed1: EditText? = null
    var ed2:EditText? = null
    var ed3:EditText? = null
    val MyPREFERENCES = "MyPrefs"
    val Name = "nameKey"
    val Phone = "phoneKey"
    val Email = "emailKey"
    var sharedpreferences: SharedPreferences? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val defaultEmail: String = "iqbal"
        val defaultPassword: String = "123456"

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.getItemId()) {
                // This is the up button
                android.R.id.home -> {
                    NavUtils.navigateUpFromSameTask(this)
                    // overridePendingTransition(R.animator.anim_left, R.animator.anim_right);
                    return true
                }
                else -> return super.onOptionsItemSelected(item)
            }
        }


        btnLogin.setOnClickListener{
            val isEmailValid: Boolean = defaultEmail == txtEmail.text.toString()
            val isPasswordValid: Boolean = defaultPassword == txtPassword.text.toString()
            val isAuthValid = isEmailValid && isPasswordValid

            var message: String = if (isAuthValid) "Success" else "Failed"
            Toast.makeText(this@LoginActivity,"Login $message", Toast.LENGTH_LONG)
                    .show()
            if (isAuthValid)
                startActivity(Intent(this,MenuUtamaActivity ::class.java))
        }

        btnRegister.setOnClickListener{
            startActivity(Intent(this, Registrasi::class.java))
        }


    }
}
