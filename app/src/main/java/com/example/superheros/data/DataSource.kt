package com.example.superheros.data

import com.example.superheros.R
import com.example.superheros.model.Hero

object DataSource {
    val heroes = listOf(
    Hero(
        nameRes = R.string.hero1,
        descriptionRes = R.string.description1,
        imageRes = R.drawable.android_superhero1,
        vulRes = R.string.vuln1
    ),
    Hero(
        nameRes = R.string.hero2,
        descriptionRes = R.string.description2,
        imageRes = R.drawable.android_superhero2,
        vulRes = R.string.vuln2,
    ),
    Hero(
        nameRes = R.string.hero3,
        descriptionRes = R.string.description3,
        imageRes = R.drawable.android_superhero3,
        vulRes = R.string.vuln1,
    ),
    Hero(
        nameRes = R.string.hero4,
        descriptionRes = R.string.description4,
        imageRes = R.drawable.android_superhero4,
        vulRes = R.string.vuln1
    ),
    Hero(
        nameRes = R.string.hero5,
        descriptionRes = R.string.description5,
        imageRes = R.drawable.android_superhero5,
        vulRes = R.string.vuln1,
    ),
    Hero(
        nameRes = R.string.hero6,
        descriptionRes = R.string.description6,
        imageRes = R.drawable.android_superhero6,
        vulRes = R.string.vuln1,
    )
)
}

