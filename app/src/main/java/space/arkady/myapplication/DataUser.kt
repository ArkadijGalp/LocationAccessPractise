package space.arkady.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Intervals(val interval: Int, val fastestInterval: Int, val maxWaitTime: Int): Parcelable
