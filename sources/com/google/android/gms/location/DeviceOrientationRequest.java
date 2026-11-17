package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzer;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
@SafeParcelable.Reserved({1, 3, 4, 5})
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;

    @SafeParcelable.Field(getter = "getSamplingPeriodMicros", id = 2)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "isVelocityEnabled", id = 6)
    private final boolean zzb;

    public static final class Builder {
        private long zza;
        private final boolean zzb;

        public Builder(long j13) {
            this.zzb = false;
            setSamplingPeriodMicros(j13);
        }

        public DeviceOrientationRequest build() {
            return new DeviceOrientationRequest(this.zza, this.zzb);
        }

        public Builder setSamplingPeriodMicros(long j13) {
            boolean z13 = false;
            if (j13 >= 0 && j13 < Long.MAX_VALUE) {
                z13 = true;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j13).length() + 102);
            sb3.append("Invalid interval: ");
            sb3.append(j13);
            sb3.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            zzer.zzb(z13, sb3.toString());
            this.zza = j13;
            return this;
        }

        public Builder(DeviceOrientationRequest deviceOrientationRequest) {
            this.zza = deviceOrientationRequest.zza();
            this.zzb = deviceOrientationRequest.zzb();
        }
    }

    @SafeParcelable.Constructor
    DeviceOrientationRequest(@SafeParcelable.Param(id = 2) long j13, @SafeParcelable.Param(id = 6) boolean z13) {
        this.zza = j13;
        this.zzb = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.zza == deviceOrientationRequest.zza && this.zzb == deviceOrientationRequest.zzb;
    }

    public long getSamplingPeriodMicros() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    public String toString() {
        long j13 = this.zza;
        int length = String.valueOf(j13).length();
        String str = true != this.zzb ? "" : ", withVelocity";
        StringBuilder sb3 = new StringBuilder(length + 46 + str.length() + 1);
        sb3.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb3.append(j13);
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getSamplingPeriodMicros());
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    final /* synthetic */ boolean zzb() {
        return this.zzb;
    }
}
