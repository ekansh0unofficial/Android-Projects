package com.example.a30day.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Day (
    @StringRes val headline : Int,
    @StringRes val body     : Int,
    @StringRes val qoute    : Int,
    @StringRes val writer   : Int,
    @DrawableRes val image  : Int
)
