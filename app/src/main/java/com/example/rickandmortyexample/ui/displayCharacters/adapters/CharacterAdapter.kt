package com.example.rickandmortyexample.ui.displayCharacters.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.Character
import com.example.rickandmortyexample.R
import com.example.rickandmortyexample.ui.displayCharacters.extension.bindImageUrl
import com.example.rickandmortyexample.ui.displayCharacters.extension.lazyOn

class CharacterAdapter
    : RecyclerView.Adapter<CharacterViewHolder>(), RAdapter<Character> {

    override val list = mutableListOf<Character>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CharacterViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val conversation: Character = list[position]
        holder.bind(conversation)
    }

    override fun getItemCount(): Int = list.size

    override fun updateContent(list: List<Character>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}

class CharacterViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(
    inflater.inflate(R.layout.character_item_list, parent, false)
) {
    private val mName: TextView by R.id.name lazyOn itemView
    private val mImage: ImageView by R.id.icon lazyOn itemView


    fun bind(character: Character) {
        with(character) {
            mName.text = name
            mImage.bindImageUrl(
                url = image,
                placeholder = R.drawable.ic_camera_alt_black,
                errorPlaceholder = R.drawable.ic_broken_image_black
            )
        }
    }
}