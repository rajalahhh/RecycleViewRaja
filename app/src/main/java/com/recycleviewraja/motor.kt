package com.recycleviewraja

import android.os.Parcel
import android.os.Parcelable

data class motor(val foto: Int, val nama: String?, val deskripsi: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nama)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<motor> {
        override fun createFromParcel(parcel: Parcel): motor {
            return motor(parcel)
        }

        override fun newArray(size: Int): Array<motor?> {
            return arrayOfNulls(size)
        }
    }
}
