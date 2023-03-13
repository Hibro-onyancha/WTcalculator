package com.example.calcwt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VisibleActivityInfo
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import androidx.fragment.app.Fragment
import com.example.calcwt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //onclick events of basic btn
        binding.btnBasic.setOnClickListener {
            replaceFragment(basic_fragment())
            binding.txtBmi.visibility = INVISIBLE
            binding.txtCode.visibility = INVISIBLE
            binding.txtScie.visibility = INVISIBLE
            binding.txtHistory.visibility = INVISIBLE
            binding.txtBasic.visibility = VISIBLE
        }
        //onclick events of bmi btn

        binding.btnBmi.setOnClickListener {
            replaceFragment(bmiFragment())
            binding.txtBmi.visibility = VISIBLE
            binding.txtCode.visibility = INVISIBLE
            binding.txtScie.visibility = INVISIBLE
            binding.txtHistory.visibility = INVISIBLE
            binding.txtBasic.visibility = INVISIBLE

        }
        //onclick events of scie btn

        binding.btnScie.setOnClickListener {
            replaceFragment(scie_fragment())

            //BTN SCIENCE VISIBILITY
            binding.txtBmi.visibility = INVISIBLE
            binding.txtCode.visibility = INVISIBLE
            binding.txtScie.visibility = VISIBLE
            binding.txtHistory.visibility = INVISIBLE
            binding.txtBasic.visibility = INVISIBLE


        }
        //onclick events of code btn

        binding.btnCode.setOnClickListener {
            replaceFragment(code_fragmeent())
            //BTN CODE VISIBILITY
            binding.txtBmi.visibility = INVISIBLE
            binding.txtCode.visibility = VISIBLE
            binding.txtScie.visibility = INVISIBLE
            binding.txtHistory.visibility = INVISIBLE
            binding.txtBasic.visibility = INVISIBLE


        }
        //onclick events of history btn

        binding.btnHistory.setOnClickListener {
            replaceFragment(history_fragment())

            //BTN HISTORY TXT VISIBILITY
            binding.txtBmi.visibility = INVISIBLE
            binding.txtCode.visibility = INVISIBLE
            binding.txtScie.visibility = INVISIBLE
            binding.txtHistory.visibility = VISIBLE
            binding.txtBasic.visibility = INVISIBLE

        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container_view_tag,fragment)
        fragmentTransaction.commit()
    }
}