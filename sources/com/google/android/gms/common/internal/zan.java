package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        long j13 = 0;
        long j14 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MethodInvocation(i14, i15, i16, j13, j14, strCreateString, strCreateString2, i17, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new MethodInvocation[i13];
    }
}
