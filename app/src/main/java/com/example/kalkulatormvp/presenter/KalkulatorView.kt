package com.example.kalkulatormvp.presenter

import com.example.kalkulatormvp.model.Hasil

//TODO 6 untuk membuat interface agar hasil dari model sampai ke view
interface KalkulatorView {

    fun bindHasil(hasil:Hasil)
    fun isEmpty()
}