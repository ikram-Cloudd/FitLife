package com.example.fityou

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fiTransf=findViewById<FrameLayout>(R.id.cv1fit)
        fiTransf.setOnClickListener {
            val intentToFitPage = Intent(this, fitPage::class.java)
            startActivity(intentToFitPage)
        }

            val dieTransf=findViewById<FrameLayout>(R.id.cv2diet)
            dieTransf.setOnClickListener {
                val intentdieTransf = Intent(this, dietPage::class.java)
                startActivity(intentdieTransf)
            }


        val leaderTxt=findViewById<TextView>(R.id.leader)
        leaderTxt.setOnClickListener {
            val intentdieTransf = Intent(this, leaderBoard::class.java)
            startActivity(intentdieTransf)
        }


        val leaderSvg=findViewById<ImageView>(R.id.imageView4)
        leaderSvg.setOnClickListener {
            val intentleaderSvg = Intent(this, leaderBoard::class.java)
            startActivity(intentleaderSvg)
        }



        val weekylReportTxt=findViewById<TextView>(R.id.report)
        weekylReportTxt.setOnClickListener {
            val intentWeekylReportTxt = Intent(this, weeklyReport::class.java)
            startActivity(intentWeekylReportTxt)
        }


        val weekylReportSvg=findViewById<ImageView>(R.id.reportsvg)
        weekylReportSvg.setOnClickListener {
            val intentWeekylReportSvg = Intent(this, weeklyReport::class.java)
            startActivity(intentWeekylReportSvg)
        }


    }
}