package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.berita,"Health Consultation","Berita Kesehatan","Berita Covid-19 saat ini sudah menurun, angka yang berdampak Covid-19 juga sudah semakin menurun."))

        data?.add(DataModel(R.drawable.penyakit,"Health Consultation","Jenis Penyakit", "Batuk, Pilek, Kanker, Diabetes, Covid-19, Lambung, Asma, Tifus, Paru-Paru Basah, Kencing Manis, Stroke, Anemia."))

        data?.add(DataModel(R.drawable.layanan,"Health Consultation","Layanan Konsultasi", "Layanan konsultasi ini dapat di konsultasikan melalui aplikasi ini, dengan menyampaikan keluhan anda di layanan konsultasi."))

        data?.add(DataModel(R.drawable.rsi,"Health Consultation","Info Rumah Sakit", "Informasi Rumah Sakit dapat di kunjungi dibeberapa rumah sakit di daerah anda, seperti : RS.Kardinah, RS.Mitra Keluarga, RS.Mitra Siaga, RSI PKU Muhammadiyah Singkil, RSI Harapan Anda."))

        data?.add(DataModel(R.drawable.obat,"Health Consultation","Info Obat", "Informasi obat yang tersedia : Cefixime, Antalgin, Parasetamol, Amoxilin, Sandimun, Komik, Antasida, Tb 4 Merah, Trmadol, Amitriprilyn 25, Neuprobion Putih."))

        data?.add(DataModel(R.drawable.gawat,"Health Consultation","Info Gawat Darurat", "Informasi Gawat Darurat dapat anda peroleh dengan No.Telp : 0883850083"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

    private fun DataModel(gambar: Int, lokasi: String, nama: String) {

    }
}