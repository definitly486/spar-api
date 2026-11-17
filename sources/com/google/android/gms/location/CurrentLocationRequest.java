package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
@SafeParcelable.Reserved({8})
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzg;

    @SafeParcelable.Field(getter = "getImpersonation", id = 9)
    private final ClientIdentity zzh;

    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private final boolean zze;
        private final int zzf;
        private final WorkSource zzg;
        private final ClientIdentity zzh;

        public Builder() {
            this.zza = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
        }

        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, new WorkSource(this.zzg), this.zzh);
        }

        public Builder setDurationMillis(long j13) {
            Preconditions.checkArgument(j13 > 0, "durationMillis must be greater than 0");
            this.zzd = j13;
            return this;
        }

        public Builder setGranularity(int i13) {
            zzq.zza(i13);
            this.zzb = i13;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j13) {
            Preconditions.checkArgument(j13 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j13;
            return this;
        }

        public Builder setPriority(int i13) {
            zzan.zza(i13);
            this.zzc = i13;
            return this;
        }

        public Builder(CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zza();
            this.zzf = currentLocationRequest.zzb();
            this.zzg = new WorkSource(currentLocationRequest.zzc());
            this.zzh = currentLocationRequest.zzd();
        }
    }

    @SafeParcelable.Constructor
    CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j13, @SafeParcelable.Param(id = 2) int i13, @SafeParcelable.Param(id = 3) int i14, @SafeParcelable.Param(id = 4) long j14, @SafeParcelable.Param(id = 5) boolean z13, @SafeParcelable.Param(id = 7) int i15, @SafeParcelable.Param(id = 6) WorkSource workSource, @SafeParcelable.Param(id = 9) ClientIdentity clientIdentity) {
        this.zza = j13;
        this.zzb = i13;
        this.zzc = i14;
        this.zzd = j14;
        this.zze = z13;
        this.zzf = i15;
        this.zzg = workSource;
        this.zzh = clientIdentity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && Objects.equal(this.zzg, currentLocationRequest.zzg) && Objects.equal(this.zzh, currentLocationRequest.zzh);
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CurrentLocationRequest[");
        sb3.append(zzan.zzb(this.zzc));
        if (this.zza != Long.MAX_VALUE) {
            sb3.append(", maxAge=");
            zzeo.zzc(this.zza, sb3);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sb3.append(", duration=");
            sb3.append(this.zzd);
            sb3.append("ms");
        }
        if (this.zzb != 0) {
            sb3.append(", ");
            sb3.append(zzq.zzb(this.zzb));
        }
        if (this.zze) {
            sb3.append(", bypass");
        }
        if (this.zzf != 0) {
            sb3.append(", ");
            sb3.append(zzar.zzb(this.zzf));
        }
        if (!WorkSourceUtil.isEmpty(this.zzg)) {
            sb3.append(", workSource=");
            sb3.append(this.zzg);
        }
        if (this.zzh != null) {
            sb3.append(", impersonation=");
            sb3.append(this.zzh);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzg, i13, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i13, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final WorkSource zzc() {
        return this.zzg;
    }

    public final ClientIdentity zzd() {
        return this.zzh;
    }
}
