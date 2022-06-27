package com.example.morefit.ui.activity

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.morefit.R
import com.example.morefit.databinding.ActivityMainBinding
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback
import com.google.android.material.transition.platform.MaterialSharedAxis

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val exit = MaterialSharedAxis(MaterialSharedAxis.Z, true).apply {
            addTarget(android.R.id.content)
        }
        window.exitTransition = exit
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController: NavController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}