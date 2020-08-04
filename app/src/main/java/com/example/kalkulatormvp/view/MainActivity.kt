package com.example.kalkulatormvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kalkulatormvp.R
import com.example.kalkulatormvp.model.Hasil
import com.example.kalkulatormvp.presenter.KalkulatorPresenter
import com.example.kalkulatormvp.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), KalkulatorView {

    //TODO 10 deklasrasi presenter
    private var presenter:KalkulatorPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 11 inisialisasi presenter
        presenter = KalkulatorPresenter(this)

        //TODO 1 event clik dan mengambil nilai input user

        bttnTambah.setOnClickListener {
            var a = edtAngka1.text.toString()
            var b = edtAngka2.text.toString()

            //TODO 12 eksekusi presenter tambah
            presenter?.tambah(a, b)
        }

        bttnKurang.setOnClickListener {
            var a = edtAngka1.text.toString()
            var b = edtAngka2.text.toString()

            presenter?.kurang(a,b)
        }

        bttnKali.setOnClickListener {
            var a = edtAngka1.text.toString()
            var b = edtAngka2.text.toString()

            presenter?.kali(a, b)
        }

        bttnBagi.setOnClickListener {
            var a = edtAngka1.text.toString()
            var b = edtAngka2.text.toString()

            presenter?.bagi(a,b)
        }
    }

    //TODO 13 eksekusi hasil presnter tambah
    override fun bindHasil(hasil: Hasil) {
        txtHasil.text = hasil.total.toString()
    }

    override fun isEmpty() {
        Toast.makeText(this,"tidak boleh ada yang kosong",Toast.LENGTH_LONG).show()
    }
}
