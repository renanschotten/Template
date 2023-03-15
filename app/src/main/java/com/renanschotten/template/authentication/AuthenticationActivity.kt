package com.renanschotten.template.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.renanschotten.template.R
import com.renanschotten.template.authentication.signin.SignInFragment

class AuthenticationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignInFragment.newInstance())
                .commitNow()
        }
    }
}