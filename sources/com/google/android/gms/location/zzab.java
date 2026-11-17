package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z13 = false;
        zzal[] zzalVarArr = null;
        long j13 = 0;
        int i13 = 1;
        int i14 = 1;
        int i15 = 1000;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    zzalVarArr = (zzal[]) SafeParcelReader.createTypedArray(parcel, header, zzal.CREATOR);
                    break;
                case 6:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationAvailability(i15, i13, i14, j13, zzalVarArr, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new LocationAvailability[i13];
    }
}
