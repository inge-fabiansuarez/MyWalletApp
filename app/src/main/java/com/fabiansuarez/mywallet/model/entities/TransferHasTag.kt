package com.fabiansuarez.mywallet.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "transfer_has_tag",
    primaryKeys = ["transfer_idtransfer", "tag_idtag"],
    foreignKeys = [
        ForeignKey(
            entity = Transfer::class,
            parentColumns = ["idtransfer"],
            childColumns = ["transfer_idtransfer"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Tag::class,
            parentColumns = ["idtag"],
            childColumns = ["tag_idtag"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        )
    ]
)
data class TransferHasTag(
    @ColumnInfo(name = "transfer_idtransfer")
    val transfer_idtransfer: Int,
    @ColumnInfo(name = "tag_idtag")
    val tag_idtag: Int
)