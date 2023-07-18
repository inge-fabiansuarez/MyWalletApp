package com.fabiansuarez.mywallet.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "transfer",
    foreignKeys = [
        ForeignKey(
            entity = Account::class,
            parentColumns = ["idAccount"],
            childColumns = ["Account_origin"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Account::class,
            parentColumns = ["idAccount"],
            childColumns = ["Account_destination"],
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
data class Transfer(
    @PrimaryKey(autoGenerate = true)
    val idtransfer: Int,
    @ColumnInfo(name = "Account_origin")
    val account_origin: Int,
    @ColumnInfo(name = "Account_destination")
    val account_destination: Int,
    @ColumnInfo(name = "categoryFather_category_id")
    val categoryFather_category_id: Int,
    val value: Double,
    val description: String,
    val date: String,
    val state: String
)
