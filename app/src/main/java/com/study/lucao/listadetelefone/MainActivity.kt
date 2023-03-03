package com.study.lucao.listadetelefone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.study.lucao.listadetelefone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val contactList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listContact = binding.recyclerViewList

        mockDataContact()

        listContact.layoutManager = LinearLayoutManager(this)
        listContact.adapter = ContactAdapter(contactList)
    }

    private fun mockDataContact() {
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
        contactList.add(ContactInfo("Lucas","19999999999"))
    }
}