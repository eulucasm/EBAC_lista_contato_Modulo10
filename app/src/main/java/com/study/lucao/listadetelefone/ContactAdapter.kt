package com.study.lucao.listadetelefone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.lucao.listadetelefone.databinding.ItemListBinding

class ContactAdapter(
    val contactListMock: MutableList<ContactInfo>
) : RecyclerView.Adapter<ContactAdapter.ContactItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactItemViewHolder {
        return ContactItemViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ContactItemViewHolder, position: Int) {
        val item = contactListMock[position]

        holder.nome.text = item.name
        holder.telefone.text = item.phone
    }

    override fun getItemCount(): Int {
        return contactListMock.size
    }

    class ContactItemViewHolder(binding: ItemListBinding): RecyclerView.ViewHolder(binding.root){
        var viewRoot = binding.root
        val nome = binding.nome
        val telefone = binding.telefone
    }

}