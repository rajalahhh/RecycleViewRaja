package com.recycleviewraja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<motor>(
            motor(
                R.drawable.motor1,
                "R15 (V3) 2017",
                " Yamaha R15 yang berasal dari pabrikan Garpu Tala yang dikenal dengan performa mesinnya yang garang pun disambut baik dengan laris manisnya motor ini di pasaran, apalagi harga Yamaha R15 terbilang menarik dengan penampilannya nan sporty."
            ),
            motor(
                R.drawable.motor2,
                "Beat (125cc) 2014",
                "Honda Vario 150 merupakan skutik Honda pertama yang mengusung mesin 150cc di Indonesia. Awal kemunculannya di awal tahun 2015 sempat menyita perhatian publik meski secara fisik wujudnya sama dengan Vario 125."

            ),
            motor(
                R.drawable.motor3,
                "Vario (150cc) 2015",
                "Honda Vario 150 merupakan skutik Honda pertama yang mengusung mesin 150cc di Indonesia. Awal kemunculannya di awal tahun 2015 sempat menyita perhatian publik meski secara fisik wujudnya sama dengan Vario 125"
            ),

            motor(
                R.drawable.motor11,
                "Scoopy (110cc) 2021",
                "Scoopy menawarkan desain motor yang trendy dan klasik. Motor ini cocok digunakan untuk berbagai kalangan."
            ),
            motor(
                R.drawable.motor5,
                "Aerox (155cc) 2021",
                "All New Aerox 155 Connected juga mengadopsi speedometer digital dengan desain baru yang lebih enak dipandang dan menarik, serta handle belakang yang terintegrasi untuk memudahkan pemilik mengatur posisi motor saat mesin dalam kondisi mati (mengatur posisi parkir). Terdapat Handle Bar Switch Control yang berfungsi memudahkan anda memilih tampikan informasi dan pengaturan pada speedometer (tombol pengatur berada di handle sebelah kiri) serta Hazard Lamp sebagai tanda ketika pengendara dalam kondisi darurat."
            ),
            motor(
                R.drawable.motor6,
                "Klx (150cc) 2021",
                "Kawasaki KLX 150 2021 tidak banyak berubah dibandingkan model tahun sebelumnya. Motor trail ini merupakan generasi penerus dari KLX150S. Dari segi fitur dan teknologi, Kawasaki KLX 150 2021 juga bisa dibilang cukup sederhana."
            )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_motor)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }
    }
}
