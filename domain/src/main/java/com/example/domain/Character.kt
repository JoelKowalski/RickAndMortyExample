package com.example.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "character")
class Character {


    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0

    @ColumnInfo(name = "name")
    @SerializedName("name")
    var name: String = ""

    @ColumnInfo(name = "status")
    @SerializedName("status")
    var status: String = ""

    @ColumnInfo(name = "species")
    @SerializedName("species")
    var species: String = ""

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    var gender: String = ""

    @ColumnInfo(name = "image")
    @SerializedName("image")
    var image: String = ""

}