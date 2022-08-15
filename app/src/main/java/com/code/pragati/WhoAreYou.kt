package com.code.pragati

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class WhoAreYou : AppCompatActivity() {

    private lateinit var invest: CardView
    private lateinit var startupPitch: CardView
    private lateinit var explore: CardView
    private lateinit var uploadProblemStatement: CardView
    private lateinit var continueBtn: Button

    //For UI Effects...
    private lateinit var llRupees: LinearLayout
    private lateinit var llVideo: LinearLayout
    private lateinit var llSearch: LinearLayout
    private lateinit var llNote: LinearLayout
    private lateinit var ivRupees: ImageView
    private lateinit var ivVideo: ImageView
    private lateinit var ivSearch: ImageView
    private lateinit var ivNote: ImageView
    private lateinit var tvRupees: TextView
    private lateinit var tvVideo: TextView
    private lateinit var tvSearch: TextView
    private lateinit var tvNote: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_who_are_you)

        invest = findViewById(R.id.cardInvest)
        startupPitch = findViewById(R.id.cardStartupPitch)
        explore = findViewById(R.id.cardExplore)
        uploadProblemStatement = findViewById(R.id.cardUploadProblemStatement)
        continueBtn = findViewById(R.id.btnContinueWhoAreYou)

        llRupees = findViewById(R.id.llRupees)
        llVideo = findViewById(R.id.llVideo)
        llSearch = findViewById(R.id.llSearch)
        llNote = findViewById(R.id.llNote)
        ivRupees = findViewById(R.id.ivRupees)
        ivVideo = findViewById(R.id.ivVideo)
        ivSearch = findViewById(R.id.ivSearch)
        ivNote = findViewById(R.id.ivNote)
        tvRupees = findViewById(R.id.tvRupees)
        tvVideo = findViewById(R.id.tvVideo)
        tvSearch = findViewById(R.id.tvSearch)
        tvNote = findViewById(R.id.tvNote)


        continueBtn.alpha = 0.5f

        invest.setOnClickListener {
            if (!invest.isSelected) {
                llRupees.setBackgroundColor(resources.getColor(R.color.primary))
                ivRupees.setImageResource(R.drawable.ic_rupees_clicked)
                tvRupees.setTextColor(resources.getColor(R.color.white))
                invest.isSelected = true
            } else {
                llRupees.setBackgroundColor(resources.getColor(R.color.white))
                ivRupees.setImageResource(R.drawable.ic_rupees)
                tvRupees.setTextColor(resources.getColor(R.color.black))
                invest.isSelected = false
            }
            continueBtn.isClickable = getClickability()
            if (getClickability()) continueBtn.alpha = 1f else continueBtn.alpha = 0.5f
        }
        startupPitch.setOnClickListener {
            if (!startupPitch.isSelected) {
                llVideo.setBackgroundColor(resources.getColor(R.color.primary))
                ivVideo.setImageResource(R.drawable.ic_video_clicked)
                tvVideo.setTextColor(resources.getColor(R.color.white))
                startupPitch.isSelected = true
            } else {
                llVideo.setBackgroundColor(resources.getColor(R.color.white))
                ivVideo.setImageResource(R.drawable.ic_video)
                tvVideo.setTextColor(resources.getColor(R.color.black))
                startupPitch.isSelected = false
            }
            continueBtn.isClickable = getClickability()
            if (getClickability()) continueBtn.alpha = 1f else continueBtn.alpha = 0.5f
        }
        explore.setOnClickListener {
            if (!explore.isSelected) {
                llSearch.setBackgroundColor(resources.getColor(R.color.primary))
                ivSearch.setImageResource(R.drawable.ic_search_clicked)
                tvSearch.setTextColor(resources.getColor(R.color.white))
                explore.isSelected = true
            } else {
                llSearch.setBackgroundColor(resources.getColor(R.color.white))
                ivSearch.setImageResource(R.drawable.ic_search)
                tvSearch.setTextColor(resources.getColor(R.color.black))
                explore.isSelected = false
            }
            continueBtn.isClickable = getClickability()
            if (getClickability()) continueBtn.alpha = 1f else continueBtn.alpha = 0.5f
        }
        uploadProblemStatement.setOnClickListener {
            if (!uploadProblemStatement.isSelected) {
                llNote.setBackgroundColor(resources.getColor(R.color.primary))
                ivNote.setImageResource(R.drawable.ic_note_clicked)
                tvNote.setTextColor(resources.getColor(R.color.white))
                uploadProblemStatement.isSelected = true
            } else {
                llNote.setBackgroundColor(resources.getColor(R.color.white))
                ivNote.setImageResource(R.drawable.ic_note)
                tvNote.setTextColor(resources.getColor(R.color.black))
                uploadProblemStatement.isSelected = false
            }
            continueBtn.isClickable = getClickability()
            if (getClickability()) continueBtn.alpha = 1f else continueBtn.alpha = 0.5f
        }

        continueBtn.setOnClickListener {
            //TODO
        }

    }

    private fun getClickability(): Boolean {
        return invest.isSelected || startupPitch.isSelected ||
                uploadProblemStatement.isSelected || explore.isSelected
    }
}