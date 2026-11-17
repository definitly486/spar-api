package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean z13 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z14 = false;
        long j13 = -1;
        float f13 = 0.0f;
        int i15 = Integer.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        long j15 = Long.MAX_VALUE;
        long j16 = 0;
        long j17 = 600000;
        long j18 = 3600000;
        int i16 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j18 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j17 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) SafeParcelReader.createParcelable(parcel, header, ClientIdentity.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i16, j18, j17, j16, j14, j15, i15, f13, z13, j13, i13, i14, z14, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new LocationRequest[i13];
    }
}
