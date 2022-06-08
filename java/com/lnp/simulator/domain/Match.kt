package com.lnp.simulator.domain


import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
) : Parcelable