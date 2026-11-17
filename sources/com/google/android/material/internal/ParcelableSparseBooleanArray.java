package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new iobyxmoadg();

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
            int i13 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i13);
            int[] iArr = new int[i13];
            boolean[] zArr = new boolean[i13];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i14 = 0; i14 < i13; i14++) {
                parcelableSparseBooleanArray.put(iArr[i14], zArr[i14]);
            }
            return parcelableSparseBooleanArray;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray[] newArray(int i13) {
            return new ParcelableSparseBooleanArray[i13];
        }
    }

    public ParcelableSparseBooleanArray(int i13) {
        super(i13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i14 = 0; i14 < size(); i14++) {
            iArr[i14] = keyAt(i14);
            zArr[i14] = valueAt(i14);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
