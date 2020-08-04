package com.example.kalkulatormvp.presenter

import com.example.kalkulatormvp.model.Hasil

//TODO 7 construct interfece untuk di eksekusi
class KalkulatorPresenter(var kkView: KalkulatorView) {

    //TODO 2 Fungsi Tambah
    fun tambah(a:String,b:String)
    {
        if(a.isNotEmpty() && b.isNotEmpty())
        {
            //TODO 3 convert string to int
            var Cvta = a.toInt()
            var Cvtb = b.toInt()

            //TODO 4 proses penjumlahan
            var jumlah = Cvta.plus(Cvtb)

            //TODO 5 meletekkan hasil penjumlahan ke model
            var hasilJumlah = Hasil()
            hasilJumlah.total = jumlah


            //TODO 8 meletekkan model ke interface
            kkView.bindHasil(hasilJumlah)
        }
        else
        {
            kkView.isEmpty()
        }

    }

    fun kurang(a:String,b:String)
    {
        if(a.isNotEmpty() && b.isNotEmpty())
        {
            var Cvta = a.toInt()
            var Cvtb = b.toInt()

            var kurang = Cvta.minus(Cvtb)

            var hasilKurang=Hasil()
            hasilKurang.total = kurang

            kkView.bindHasil(hasilKurang)
        }
        else
        {
            kkView.isEmpty()
        }
    }

    fun kali(a:String,b:String)
    {
        if(a.isNotEmpty() && b.isNotEmpty())
        {
            var Cvta = a.toInt()
            var Cvtb = b.toInt()

            var kali = Cvta.times(Cvtb)

            var hasilKali = Hasil()
            hasilKali.total = kali

            kkView.bindHasil(hasilKali)
        }
        else
        {
            kkView.isEmpty()
        }
    }

    fun bagi(a:String,b:String)
    {
        if(a.isNotEmpty() && b.isNotEmpty())
        {
            var Cvta = a.toInt()
            var Cvtb = b.toInt()

            var bagi = Cvta.div(Cvtb)

            var hasilBagi = Hasil()
            hasilBagi.total = bagi

            kkView.bindHasil(hasilBagi)
        }
        else
        {
            kkView.isEmpty()
        }
    }
}