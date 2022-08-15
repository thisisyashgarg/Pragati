package com.code.pragati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

class ProblemStatementActivity : AppCompatActivity() {

    private lateinit var govt: CardView
    private lateinit var private: CardView
    private lateinit var getStartedBtn: Button

    //For UI Effects...
    private lateinit var llGovt: LinearLayout
    private lateinit var llPrivate: LinearLayout
    private lateinit var ivGovt: ImageView
    private lateinit var ivPrivate: ImageView
    private lateinit var tvGovt: TextView
    private lateinit var tvPrivate: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem_statement)

        govt = findViewById(R.id.cardGovt)
        private = findViewById(R.id.cardPrivate)
        getStartedBtn = findViewById(R.id.btnGetStartedPS)

        llGovt = findViewById(R.id.llGovt)
        llPrivate = findViewById(R.id.llPrivate)
        ivGovt = findViewById(R.id.ivGovt)
        ivPrivate = findViewById(R.id.ivPrivate)
        tvGovt = findViewById(R.id.tvGovt)
        tvPrivate = findViewById(R.id.tvPrivate)

        govt.setOnClickListener {
            llGovt.setBackgroundColor(resources.getColor(R.color.primary))
            ivGovt.setImageResource(R.drawable.ic_org_clicked)
            tvGovt.setTextColor(resources.getColor(R.color.white))
        }
        private.setOnClickListener {
            llPrivate.setBackgroundColor(resources.getColor(R.color.primary))
            ivPrivate.setImageResource(R.drawable.ic_building_clicked)
            tvPrivate.setTextColor(resources.getColor(R.color.white))
        }
        
    }
}