package com.example.UTSAZHAR

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClubActivity (
    val imgclub: Int,
    val namaclub: String,
    val anggotaclub : String,
    val didirikan: String,
    val deskclub: String
) : Parcelable