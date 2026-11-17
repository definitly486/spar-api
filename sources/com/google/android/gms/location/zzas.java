package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 1) int i13, @SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) int i15, @SafeParcelable.Param(id = 4) int i16) {
        Preconditions.checkState(i13 >= 0 && i13 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i14 >= 0 && i14 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i15 >= 0 && i15 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i16 >= 0 && i16 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i13 + i14) + i15) + i16 > 0, "Parameters can't be all 0.");
        this.zza = i13;
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.zza == zzasVar.zza && this.zzb == zzasVar.zzb && this.zzc == zzasVar.zzc && this.zzd == zzasVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i13 = this.zza;
        int length = String.valueOf(i13).length();
        int i14 = this.zzb;
        int length2 = String.valueOf(i14).length();
        int i15 = this.zzc;
        int length3 = String.valueOf(i15).length();
        int i16 = this.zzd;
        StringBuilder sb3 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i16).length() + 1);
        sb3.append("UserPreferredSleepWindow [startHour=");
        sb3.append(i13);
        sb3.append(", startMinute=");
        sb3.append(i14);
        sb3.append(", endHour=");
        sb3.append(i15);
        sb3.append(", endMinute=");
        sb3.append(i16);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Preconditions.checkNotNull(parcel);
        int i14 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i14);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
