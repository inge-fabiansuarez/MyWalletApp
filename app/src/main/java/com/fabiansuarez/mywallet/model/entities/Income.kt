package com.fabiansuarez.mywallet.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "income",
    foreignKeys = [
        ForeignKey(
            entity = Account::class,
            parentColumns = ["idAccount"],
            childColumns = ["Account_idAccount"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Category::class,
            parentColumns = ["category_id"],
            childColumns = ["categoryFather_category_id"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        )
    ]
)
data class Income(
    @PrimaryKey(autoGenerate = true)
    val idincome: Int,
    @ColumnInfo(name = "Account_idAccount")
    val account_idAccount: Int,
    val value: String,
    val description: String,
    val date: String,
    val state: String,
    @ColumnInfo(name = "categoryFather_category_id")
    val categoryFather_category_id: Int
)