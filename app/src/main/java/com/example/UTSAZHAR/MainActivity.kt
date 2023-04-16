package com.example.UTSAZHAR

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<ClubActivity>(
            ClubActivity(
                R.drawable.film10,
                namaclub=  "Bayer 04 Leverkusen",
                anggotaclub = "Jumlah Anggota,\n 30.000",
                didirikan = "Tahun Dibentuk, \n 1 Juli 1904",
                deskclub = "Deskripsi:, \n Bayer 04 Leverkusen adalah klub sepak bola profesional asal Jerman yang berbasis di Leverkusen di negara bagian Nordrhein-Westfalen. Klub ini didirikan pada tahun 1904 oleh karyawan perusahaan farmasi Jerman, Bayer AG, yang bermarkas di Leverkusen dan nama klub diambil dari nama perusahaan tersebut Klub ini awalnya didirikan oleh karyawan dari perusahaan kimia Bayer AG, yang masih menjadi pemilik mayoritas klub hingga saat ini. Bayer Leverkusen memiliki sejarah yang cukup sukses di level domestik dan internasional, meskipun belum berhasil memenangkan gelar Liga Champions Eropa.\n" +
                        "\n" +
                        "Prestasi terbesar Bayer Leverkusen adalah menjadi runner-up Liga Champions Eropa pada musim 2001-2002, ketika mereka kalah dari Real Madrid di final. Selain itu, klub ini juga pernah meraih tiga kali juara Piala Jerman, lima kali juara Piala UEFA/Eropa League, dan satu kali juara Superpiala Jerman.\n" +
                        "\n" +
                        "Bayer Leverkusen juga dikenal sebagai salah satu klub yang rajin mempromosikan dan mengembangkan talenta muda, seperti Michael Ballack, Toni Kroos, dan Kai Havertz yang semuanya pernah bermain untuk klub ini sebelum pindah ke klub besar lainnya di Eropa."
            ),
            ClubActivity(
                R.drawable.film2,
                namaclub =  "Eintracht Frankfurt",
                anggotaclub ="Jumlah Anggota,\n 120.000" ,
                didirikan= "Tahun Dibentuk, \n 8 Maret 1899",
                deskclub = "Deskripsi:, \n Eintracht Frankfurt adalah klub sepak bola Jerman yang didirikan pada tahun 1899. Mereka telah memenangkan tiga gelar Bundesliga, empat Piala Jerman, satu Piala UEFA, dan satu Piala Intertoto UEFA. Prestasi terbesar mereka adalah memenangkan Piala UEFA pada tahun 1980. Eintracht Frankfurt juga dikenal sebagai salah satu klub paling sukses dalam kompetisi Eropa. Mereka memiliki rivalitas dengan beberapa klub Jerman, termasuk Kickers Offenbach. Eintracht Frankfurt telah meraih beberapa prestasi selama sejarahnya, termasuk meraih gelar juara Bundesliga pada musim 1958/1959, tiga kali juara Piala Jerman, dan empat kali juara Piala UEFA/Eropa League. Klub ini juga pernah menjadi runner-up Liga Champions Eropa pada musim 1959/1960.\n" +
                        "\n" +
                        "Selain itu, Eintracht Frankfurt memiliki basis penggemar yang sangat besar dan fanatik yang dikenal sebagai \"Ultras\". Mereka sering membuat tifo dan dukungan yang spektakuler di stadion dan di luar lapangan, dan menjadi salah satu kelompok suporter paling terkenal dan dihormati di Jerman.\n" +
                        "\n" +
                        "Beberapa pemain terkenal yang pernah bermain untuk Eintracht Frankfurt antara lain Jürgen Grabowski, Karl-Heinz Körbel, Lajos Détári, dan Alexander Meier. Klub ini juga dikenal karena menerapkan filosofi sepak bola menyerang dan menarik bagi para penggemar, yang sering membuat pertandingan mereka menjadi sangat menarik dan penuh aksi."
            ),
            ClubActivity(
                R.drawable.film3,
                namaclub =  "Hertha Bsc",
                anggotaclub = "Jumlah Anggota,\n 44.211",
                didirikan="Tahun Dibentuk, \n 25 Juli 1892",
                deskclub= "Deskripsi:, \n sepak bola profesional Jerman yang berbasis di Berlin. Klub ini didirikan pada tahun 1892 dan terkenal dengan nama Hertha Berlin atau hanya Hertha Hertha BSC memiliki sejarah yang panjang dan beragam. Klub ini telah meraih beberapa prestasi, termasuk menjadi juara Piala Jerman pada tahun 2002 dan meraih posisi keempat di Bundesliga pada musim 2008/2009. Namun, klub ini juga pernah mengalami masa-masa sulit, termasuk terdegradasi dari Bundesliga pada musim 2009/2010 dan 2011/2012.\n" +
                        "\n" +
                        "Hertha BSC memiliki basis penggemar yang cukup besar dan loyal, yang dikenal sebagai \"Herthaner\". Mereka sering membuat dukungan yang luar biasa di stadion dan di luar lapangan, dan menjadi salah satu kelompok suporter paling bersemangat di Jerman.\n" +
                        "\n" +
                        "Beberapa pemain terkenal yang pernah bermain untuk Hertha BSC antara lain Marcelinho, Michael Preetz, dan Pal Dardai. Klub ini juga dikenal karena sering mencetak pemain muda berkualitas, yang kemudian menjadi pemain bintang di klub-klub besar Eropa.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            ClubActivity(
                R.drawable.film4,
                namaclub =  "FC Koln",
                anggotaclub = "Jumlah Anggota,\n 127.376",
                didirikan = "Tahun Dibentuk, \n 13 February 1948",
                deskclub = "Deskripsi:, \n klub sepak bola profesional Jerman yang berbasis di Hoffenheim, sebuah desa di Sinsheim, Baden-Württemberg. Klub ini didirikan pada tahun 1899 sebagai klub senam dan kemudian menjadi klub sepak bola modern pada tahun 1945 FC Köln memiliki sejarah yang kaya dan beragam, termasuk meraih tiga kali juara Bundesliga, empat kali juara Piala Jerman, dan menjadi runner-up Piala UEFA pada musim 1985/1986. Namun, klub ini juga pernah mengalami masa-masa sulit, termasuk terdegradasi dari Bundesliga pada musim 2017/2018.\n" +
                        "\n" +
                        "FC Köln memiliki basis penggemar yang sangat fanatik dan loyal, yang dikenal sebagai \"Effzeh\". Mereka sering membuat dukungan yang luar biasa di stadion dan di luar lapangan, dan menjadi salah satu kelompok suporter paling terkenal dan dihormati di Jerman.\n" +
                        "\n" +
                        "Beberapa pemain terkenal yang pernah bermain untuk FC Köln antara lain Wolfgang Overath, Pierre Littbarski, Lukas Podolski, dan Anthony Modeste. Klub ini juga dikenal karena sering mencetak pemain muda berkualitas, yang kemudian menjadi pemain bintang di klub-klub besar Eropa.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            ClubActivity(
                R.drawable.film5,
                namaclub =  "FSV Mainz 05",
                anggotaclub = "Jumlah Anggota,\n 14.000",
                didirikan = "Tahun Dibentuk, \n 16 Mar 1905",
                deskclub = "Deskripsi:, \n klub sepak bola profesional Jerman yang berbasis di Cologne, North Rhine-Westphalia. Klub ini didirikan pada tahun 1948 sebagai hasil penggabungan dari klub Kölner Ballspiel-Club 1901 dan SpVgg Sülz 07 FSV Mainz 05 memiliki sejarah yang relatif pendek dibandingkan dengan klub-klub lain di Bundesliga, namun mereka telah berhasil membangun diri mereka menjadi kekuatan sepak bola di Jerman. Klub ini telah meraih beberapa prestasi, termasuk finis ke-5 di Bundesliga pada musim 2010/2011 dan mencapai perempat final Piala Jerman pada musim 2018/2019.\n" +
                        "\n" +
                        "FSV Mainz 05 memiliki basis penggemar yang relatif kecil namun fanatik, yang dikenal sebagai \"Karnevalsverein\" (Klub Karnaval). Mereka sering membuat dukungan yang kuat di stadion dan di luar lapangan, dan menjadi salah satu kelompok suporter yang paling vokal di Jerman.\n" +
                        "\n" +
                        "Beberapa pemain terkenal yang pernah bermain untuk FSV Mainz 05 antara lain Jürgen Klopp, Andre Schürrle, dan Shinji Okazaki. Klub ini juga dikenal karena sering mencetak pemain muda berkualitas, yang kemudian menjadi pemain bintang di klub-klub besar Eropa.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            ClubActivity(
                R.drawable.film6,
                namaclub=  "Borussia Mönchengladbach",
                anggotaclub = " Jumlah Anggota,\n 98.000",
                didirikan=" Tahun Dibentuk, \n 1 Agustus 1900",
                deskclub = "Deskripsi:, \n klub sepak bola profesional Jerman yang berbasis di Mönchengladbach, North Rhine-Westphalia,Klub ini didirikan pada tanggal 1 Agustus 1900 dan namanya berasal dari bentuk Latin dari Prusia, yang merupakan nama populer untuk klub-klub Jerman di bekas Kerajaan Prusia Borussia Mönchengladbach memiliki sejarah yang kaya, termasuk meraih lima kali gelar Bundesliga, tiga kali Piala DFB, dan satu kali Piala UEFA. Klub ini dikenal dengan sebutan \"Die Fohlen\" (Kuda Muda) karena keberhasilannya dalam mengembangkan pemain muda yang berkualitas. Selain itu, Borussia Mönchengladbach juga dikenal dengan gaya bermain menyerang yang menarik dan menghibur.\n" +
                        "\n" +
                        "Borussia Mönchengladbach memiliki basis penggemar yang besar dan setia, yang dikenal sebagai \"Fohlenelf\" (The Foals Eleven). Mereka sering membuat dukungan yang luar biasa di stadion dan di luar lapangan, dan menjadi salah satu kelompok suporter yang paling vokal di Jerman.\n" +
                        "\n" +
                        "Beberapa pemain terkenal yang pernah bermain untuk Borussia Mönchengladbach antara lain Berti Vogts, Günter Netzer, Stefan Effenberg, dan Marco Reus. Klub ini juga dikenal karena sering mencetak pemain muda berkualitas, yang kemudian menjadi pemain bintang di klub-klub besar Eropa."
            ),
            ClubActivity(
                R.drawable.film7,
                namaclub = "RB Leipzig",
                anggotaclub="Jumlah Anggota,\n 750",
                didirikan = "Tahun Dibentuk, \n 19 Mei 2009",
                deskclub = " Deskripsi:, \n klub sepak bola Jerman yang berbasis di Leipzig. Klub ini didirikan pada tahun 2009 sebagai RasenBallsport Leipzig dan bermain di liga teratas Jerman, Bundesliga.Sebelumnya, Leipzig telah memiliki sejarah sepak bola yang panjang, termasuk tim VfB Leipzig yang menjadi juara nasional pada tahun 1903 dan 1906. Namun, pada tahun 2009, Red Bull GmbH membeli klub SSV Markranstädt dan mengubah namanya menjadi RasenBallsport Leipzig.\n" +
                        "\n"
            ),
            ClubActivity(
                R.drawable.film8,
                namaclub=  "FC Schalke 04",
                anggotaclub = "Jumlah Anggota,\n 168.163",
                didirikan = " Tahun Dibentuk, \n 4 Mei 1904",
                deskclub = "Deskripsi:, \n FC Schalke 04 didirikan pada tahun 1904 dan telah memenangkan tujuh gelar juara Bundesliga dan lima Piala DFB. Klaus Fischer dan Olaf Thon adalah pemain legendaris yang telah membela klub ini. Schalke memainkan pertandingan kandangnya di Veltins-Arena yang dapat menampung hingga 62.000 penonton. Pada musim 2020/2021, klub ini terdegradasi ke divisi dua Bundesliga untuk pertama kalinya dalam 30 tahun.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            ClubActivity(
                R.drawable.film9,
                namaclub =  "VfB Stuttgart",
                anggotaclub = "Jumlah Anggota,\n 76.700",
                didirikan = "Tahun Dibentuk, \n 9 September 1893",
                deskclub = "Deskripsi:, \n VfB Stuttgart didirikan pada tahun 1893 dan telah memenangkan lima gelar juara Bundesliga dan tiga Piala DFB. Klub ini juga terkenal dengan akademinya yang menghasilkan pemain seperti Sami Khedira dan Timo Werner. Mercedes-Benz Arena adalah stadion kandang VfB Stuttgart yang dapat menampung hingga 60.000 penonton. Meskipun mengalami masa-masa sulit, VfB Stuttgart selalu berhasil pulih dan menjadi kekuatan yang signifikan dalam sepak bola Jerman."
            ),
            ClubActivity(
                R.drawable.film10,
                namaclub =  "FC Union Berlin",
                anggotaclub = "Jumlah Anggota,\n 49.152",
                didirikan = "Tahun Dibentuk, \n 20 jan 1966",
                deskclub = "Deskripsi:, \n FC Union Berlin didirikan pada tahun 1966, tetapi sejarah klub ini dimulai pada tahun 1906 dengan klub pendahulunya, SC Olympia 06 Oberschöneweide. Setelah penggabungan dengan klub lain dan kebangkrutan pada tahun 2004, klub ini dipulihkan oleh para pendukungnya dan berhasil promosi ke Bundesliga pada musim 2019/2020. FC Union Berlin dikenal karena pendukung yang fanatik dan militan serta stadion kandang mereka, Stadion An der Alten Försterei, yang kapasitasnya sekitar 22.000 penonton."
            ),
            ClubActivity(
                R.drawable.film12,
                namaclub =  "SV Werder Bremen",
                anggotaclub = "Jumlah Anggota,\n 42.407",
                didirikan = "Tahun Dibentuk, \n 4 February 1899",
                deskclub = "Deskripsi:, \n SV Werder Bremen didirikan pada tahun 1899 dan memiliki prestasi yang kaya termasuk empat gelar juara Bundesliga dan enam gelar Piala DFB. Klub ini juga dikenal karena akademinya yang sukses dalam menghasilkan pemain berbakat. Stadion kandang mereka adalah Weserstadion dengan kapasitas sekitar 42.000 penonton."
            ),
            ClubActivity(
                R.drawable.film13,
                namaclub =  "VfL Wolfsburg",
                anggotaclub = "Jumlah Anggota,\n 21.500",
                didirikan = "Tahun Dibentuk, \n 12 September 1945",
                deskclub = "Deskripsi:, \n VfL Wolfsburg didirikan pada tahun 1945 oleh Volkswagen. Klub ini memenangkan gelar Bundesliga pada musim 2008/2009 dan Piala Jerman pada musim 2014/2015, serta mencapai perempat final Liga Champions UEFA pada musim yang sama. Di luar lapangan, VfL Wolfsburg terlibat dalam kegiatan amal dan sosial, serta memiliki tim sepak bola wanita profesional dan stadion modern, Volkswagen Arena."
            ),
            ClubActivity(
                R.drawable.film14,
                namaclub =  "FC Augsburg",
                anggotaclub = "Jumlah Anggota,\n 22.167",
                didirikan = "Tahun Dibentuk, \n 8 Agustus 1907",
                deskclub = "Deskripsi:, \n FC Augsburg didirikan pada tahun 1907 sebagai BC Augsburg dan berganti nama menjadi FC Augsburg pada tahun 1969 setelah bergabung dengan TSV Schwaben Augsburg. Klub ini berhasil promosi ke Bundesliga pada musim 2011/2012 dan mempertahankan posisinya di sana. Selain sepak bola, klub ini juga memiliki cabang olahraga lain dan memiliki pendukung setia serta stadion dengan kapasitas sekitar 30.000 penonton."
            ),
            ClubActivity(
                R.drawable.film15,
                namaclub =  "VfL Bochum",
                anggotaclub = "Jumlah Anggota,\n 22.123",
                didirikan ="Tahun Dibentuk, \n 26 July 1848",
                deskclub = "Deskripsi:, \n VfL Bochum didirikan pada tahun 1848 dan menjadi klub sepak bola pada tahun 1911. Klub ini telah beberapa kali terdegradasi dan promosi kembali ke Bundesliga selama beberapa dekade. Meskipun tidak memiliki banyak gelar, VfL Bochum dikenal karena pendukung yang setia dan atmosfer luar biasa di stadion. Klub ini juga memiliki akademi sepak bola yang sukses dan telah melahirkan banyak pemain terkenal."
            ),
            ClubActivity(
                R.drawable.film16,
                namaclub =  "Borussia Dortmund",
                anggotaclub = "Jumlah Anggota,\n 168.163",
                didirikan = "Tahun Dibentuk, \n 19 Desember 1909",
                deskclub = "Deskprisi:, \n" +
                        "\n" +
                        "Borussia Dortmund adalah klub sepak bola Jerman yang didirikan pada tahun 1909. Setelah mengalami penurunan prestasi pada tahun 1970-an dan 1980-an, klub ini berhasil bangkit kembali pada dekade 1990-an dan memenangkan tiga gelar Bundesliga berturut-turut serta Liga Champions UEFA pada tahun 1997. Borussia Dortmund juga memenangkan gelar Bundesliga pada musim 2010/2011 dan 2011/2012 serta mencapai final Liga Champions UEFA pada tahun 2013. Klub ini dikenal memiliki basis pendukung yang besar dan fanatik serta stadion Signal Iduna Park yang legendaris."
            ),
            ClubActivity(
                R.drawable.film17,
                namaclub =  "SC Freiburg",
                anggotaclub = "Jumlah Anggota,\n 50.000",
                didirikan = "Tahun Dibentuk, \n 30 Mei 1904",
                deskclub = "Deskprisi:, \n SC Freiburg adalah klub sepak bola Jerman yang berbasis di kota Freiburg im Breisgau, Baden-Württemberg. Klub ini didirikan pada tahun 1904 dan menjadi klub profesional pada tahun 1978.\n" +
                        "\n" +
                        "Pada awalnya, SC Freiburg bermain di liga regional dan tidak memiliki banyak kesuksesan. Namun, klub ini mulai menunjukkan kemajuan pada tahun 1990-an dan berhasil promosi ke Bundesliga pada musim 1993/1994.\n" +
                        "\n" +
                        "Di Bundesliga, SC Freiburg mengalami beberapa musim yang sulit dan terdegradasi ke divisi dua pada tahun 1997. Namun, klub ini berhasil kembali promosi ke Bundesliga pada tahun 2003 dan bertahan di sana selama beberapa musim.\n" +
                        "\n" +
                        "Pada musim 2016/2017, SC Freiburg berhasil finis di posisi ketujuh di Bundesliga, yang merupakan pencapaian terbaik klub ini dalam beberapa dekade. SC Freiburg juga terkenal karena memiliki akademi sepak bola yang sukses dan telah melahirkan banyak pemain sepak bola terkenal, seperti Matthias Ginter dan Maximilian Philipp."
            ),
            ClubActivity(
                R.drawable.film18,
                namaclub =  "Bayern Munchen",
                anggotaclub = "Jumlah Anggota,\n 300.000",
                didirikan = "Tahun Dibentuk, \n 27 February 1900",
                deskclub = "Deskprisi:, \n Bayern Munchen adalah klub sepak bola yang berbasis di Munich, Jerman. Klub ini didirikan pada tahun 1900 dan menjadi salah satu klub terbesar di dunia dengan sejarah yang kaya akan prestasi.\n" +
                        "\n" +
                        "Pada awalnya, Bayern Munchen hanya klub kecil yang bermain di liga lokal. Namun, setelah Perang Dunia II, klub ini mulai menunjukkan kekuatannya dan berhasil memenangkan gelar nasional pertamanya pada tahun 1932.\n" +
                        "\n" +
                        "Pada tahun 1970-an, Bayern Munchen mencapai puncak kejayaannya dengan meraih tiga gelar Liga Champions UEFA berturut-turut pada musim 1973/1974, 1974/1975, dan 1975/1976, yang disebut sebagai \"treble Eropa\". Selain itu, klub ini juga berhasil memenangkan delapan gelar Bundesliga pada dekade tersebut."
            )



        )
         val recyclerView = findViewById<RecyclerView>(R.id.rv_club)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ClubAdapter(this,animeList){
            val intent = Intent (this, DetailClubActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}