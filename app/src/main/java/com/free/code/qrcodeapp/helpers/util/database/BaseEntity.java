package com.free.code.qrcodeapp.helpers.util.database;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import com.free.code.qrcodeapp.helpers.constant.ColumnNames;

public abstract class BaseEntity implements Parcelable {
    /**
     * Fields
     */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ColumnNames.ID)
    @NonNull
    public long mId;

    /**
     * Getter and setter methods of the model
     */
    public long getId() {
        return mId;
    }
}
