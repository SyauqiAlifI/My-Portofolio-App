package com.aplikasi.myportofolio

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Projects(
    val title: String,
    val desc: String,
    val image: Int
) : Parcelable
