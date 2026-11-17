package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i15 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 7:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 9:
                    clientIdentity = (ClientIdentity) SafeParcelReader.createParcelable(parcel, header, ClientIdentity.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CurrentLocationRequest(j13, i13, i15, j14, z13, i14, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new CurrentLocationRequest[i13];
    }
}
