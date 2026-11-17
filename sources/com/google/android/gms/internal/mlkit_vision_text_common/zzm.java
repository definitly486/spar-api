package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        int i15 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        float f13 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzrVarArr = (zzr[]) SafeParcelReader.createTypedArray(parcel, header, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) SafeParcelReader.createParcelable(parcel, header, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) SafeParcelReader.createParcelable(parcel, header, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) SafeParcelReader.createParcelable(parcel, header, zzf.CREATOR);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strCreateString, f13, strCreateString2, i13, z13, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new zzl[i13];
    }
}
