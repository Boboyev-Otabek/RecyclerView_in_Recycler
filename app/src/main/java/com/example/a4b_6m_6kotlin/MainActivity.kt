package com.example.a4b_6m_6kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4b_6m_6kotlin.adapter.AdapterMember
import com.example.a4b_6m_6kotlin.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView ()
    }

    fun initView() {
        recyclerview = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)



        var member: List<Member> = MemberAdd()
        refreshAdapter(member)
    }

    fun refreshAdapter(member: List<Member>) {

        var adapter = AdapterMember(member)
        recyclerview.adapter = adapter
    }

    fun MemberAdd(): List<Member> {

        var member = ArrayList<Member>()

        for (i in 0..20 step 1) {
            member.add(Member("Otabek " + i, "Boboyev " + i))
        }
        return member
    }
}