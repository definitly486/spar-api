package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new iobyxmoadg();

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray createFromParcel(Parcel parcel) {
            int i13 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i13);
            int[] iArr = new int[i13];
            int[] iArr2 = new int[i13];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i14 = 0; i14 < i13; i14++) {
                parcelableSparseIntArray.put(iArr[i14], iArr2[i14]);
            }
            return parcelableSparseIntArray;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray[] newArray(int i13) {
            return new ParcelableSparseIntArray[i13];
        }
    }

    public ParcelableSparseIntArray(int i13) {
        super(i13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i14 = 0; i14 < size(); i14++) {
            iArr[i14] = keyAt(i14);
            iArr2[i14] = valueAt(i14);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
