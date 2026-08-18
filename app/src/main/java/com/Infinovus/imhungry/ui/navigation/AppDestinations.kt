package com.Infinovus.imhungry.ui.navigation

import androidx.annotation.DrawableRes
import com.Infinovus.imhungry.R

enum class AppDestinations(
    val label: String,
    @DrawableRes val icon: Int,
) {
    HOME("Home", R.drawable.ic_home),
    FAVORITES("Favorites", R.drawable.ic_favorite),
    PROFILE("Profile", R.drawable.ic_account_box),
}