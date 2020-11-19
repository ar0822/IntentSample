package com.example.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)

        val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

        var menu = mutableMapOf("name" to "から揚げ定食", "price" to "880円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの焼き魚定食", "price" to "1200円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのステーキ定食", "price" to "1800円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの唐揚げ定食", "price" to "700円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのマーボー定食", "price" to "750円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのラーメン定食", "price" to "800円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの野菜炒め定食", "price" to "600円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの焼肉定食", "price" to "900円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのフォワグラ定食", "price" to "30000円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのトリュフ定食", "price" to "29000円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの和風きのこ定食", "price" to "300円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのカレー定食", "price" to "900円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいのスペシャル定食", "price" to "1000000円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの日替わり定食", "price" to "500円")
        menuList.add(menu)

        val from = arrayOf("name","price")

        val to = intArrayOf(android.R.id.text1, android.R.id.text2)

        val adapter = SimpleAdapter(applicationContext, menuList, android.R.layout.simple_expandable_list_item_2, from, to)

        lvMenu.adapter = adapter

    }
}