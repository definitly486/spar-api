package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i13 = -1;
        int i14 = 0;
        short s13 = 0;
        int i15 = 0;
        long j13 = 0;
        float f13 = 0.0f;
        double d13 = 0.0d;
        double d14 = 0.0d;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s13 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d13 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d14 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i15 = SafeParcelReader.readInt(parcel, header);
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
        return new zzek(strCreateString, i14, s13, d13, d14, f13, j13, i15, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new zzek[i13];
    }
}
