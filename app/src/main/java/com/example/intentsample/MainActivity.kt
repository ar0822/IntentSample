package com.example.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)

        val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

        var menu = mutableMapOf("name" to "から揚げ定食", "price" to "880円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの焼き魚定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

        menu = mutableMapOf("name" to "あいの定食", "price" to "")
        menuList.add(menu)

    }
}