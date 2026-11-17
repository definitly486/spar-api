package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 14, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = CommonUrlParts.Values.FALSE_INTEGER, getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = CommonUrlParts.Values.FALSE_INTEGER, getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzl;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzm;

    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final ClientIdentity zzn;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j13) {
        return j13 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j13);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && Objects.equal(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.zze;
        long j14 = jElapsedRealtime + j13;
        if (((jElapsedRealtime ^ j14) & (j13 ^ j14)) < 0) {
            return Long.MAX_VALUE;
        }
        return j14;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm);
    }

    public boolean isBatched() {
        long j13 = this.zzd;
        return j13 > 0 && (j13 >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j13) {
        Preconditions.checkArgument(j13 > 0, "durationMillis must be greater than 0");
        this.zze = j13;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j13) {
        this.zze = Math.max(1L, j13 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j13) {
        Preconditions.checkArgument(j13 >= 0, "illegal fastest interval: %d", Long.valueOf(j13));
        this.zzc = j13;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j13) {
        Preconditions.checkArgument(j13 >= 0, "intervalMillis must be greater than or equal to 0");
        long j14 = this.zzc;
        long j15 = this.zzb;
        if (j14 == j15 / 6) {
            this.zzc = j13 / 6;
        }
        if (this.zzi == j15) {
            this.zzi = j13;
        }
        this.zzb = j13;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j13) {
        Preconditions.checkArgument(j13 >= 0, "illegal max wait time: %d", Long.valueOf(j13));
        this.zzd = j13;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i13) {
        if (i13 > 0) {
            this.zzf = i13;
            return this;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 20);
        sb3.append("invalid numUpdates: ");
        sb3.append(i13);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Deprecated
    public LocationRequest setPriority(int i13) {
        zzan.zza(i13);
        this.zza = i13;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f13) {
        if (f13 >= 0.0f) {
            this.zzg = f13;
            return this;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(f13).length() + 22);
        sb3.append("invalid displacement: ");
        sb3.append(f13);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z13) {
        this.zzh = z13;
        return this;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Request[");
        if (isPassive()) {
            sb3.append(zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sb3.append(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
                zzeo.zzc(this.zzd, sb3);
            }
        } else {
            sb3.append("@");
            if (isBatched()) {
                zzeo.zzc(this.zzb, sb3);
                sb3.append(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
                zzeo.zzc(this.zzd, sb3);
            } else {
                zzeo.zzc(this.zzb, sb3);
            }
            sb3.append(" ");
            sb3.append(zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb3.append(", minUpdateInterval=");
            sb3.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            sb3.append(", minUpdateDistance=");
            sb3.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            sb3.append(", maxUpdateAge=");
            sb3.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb3.append(", duration=");
            zzeo.zzc(this.zze, sb3);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb3.append(", maxUpdates=");
            sb3.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb3.append(", ");
            sb3.append(zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sb3.append(", ");
            sb3.append(zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sb3.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sb3.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzm)) {
            sb3.append(", ");
            sb3.append(this.zzm);
        }
        if (this.zzn != null) {
            sb3.append(", impersonation=");
            sb3.append(this.zzn);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzl);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i13, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i13, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final ClientIdentity zzd() {
        return this.zzn;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;
        private WorkSource zzm;
        private ClientIdentity zzn;

        public Builder(int i13, long j13) {
            this(j13);
            setPriority(i13);
        }

        public LocationRequest build() {
            int i13 = this.zza;
            long j13 = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j13;
            } else if (i13 != 105) {
                jMin = Math.min(jMin, j13);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j14 = this.zze;
            int i14 = this.zzf;
            float f13 = this.zzg;
            boolean z13 = this.zzh;
            long j15 = this.zzi;
            return new LocationRequest(i13, j13, jMin, jMax, Long.MAX_VALUE, j14, i14, f13, z13, j15 == -1 ? this.zzb : j15, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        public Builder setDurationMillis(long j13) {
            Preconditions.checkArgument(j13 > 0, "durationMillis must be greater than 0");
            this.zze = j13;
            return this;
        }

        public Builder setGranularity(int i13) {
            zzq.zza(i13);
            this.zzj = i13;
            return this;
        }

        public Builder setIntervalMillis(long j13) {
            Preconditions.checkArgument(j13 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j13;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j13) {
            boolean z13 = true;
            if (j13 != -1 && j13 < 0) {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j13;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j13) {
            Preconditions.checkArgument(j13 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j13;
            return this;
        }

        public Builder setMaxUpdates(int i13) {
            Preconditions.checkArgument(i13 > 0, "maxUpdates must be greater than 0");
            this.zzf = i13;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f13) {
            Preconditions.checkArgument(f13 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f13;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j13) {
            boolean z13 = true;
            if (j13 != -1 && j13 < 0) {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j13;
            return this;
        }

        public Builder setPriority(int i13) {
            zzan.zza(i13);
            this.zza = i13;
            return this;
        }

        public Builder setWaitForAccurateLocation(boolean z13) {
            this.zzh = z13;
            return this;
        }

        public final Builder zza(int i13) {
            zzar.zza(i13);
            this.zzk = i13;
            return this;
        }

        public final Builder zzb(boolean z13) {
            this.zzl = z13;
            return this;
        }

        public final Builder zzc(WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder(long j13) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j13);
        }

        public Builder(LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int iZza = locationRequest.zza();
            zzar.zza(iZza);
            this.zzk = iZza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            ClientIdentity clientIdentityZzd = locationRequest.zzd();
            boolean z13 = true;
            if (clientIdentityZzd != null && clientIdentityZzd.zza()) {
                z13 = false;
            }
            Preconditions.checkArgument(z13);
            this.zzn = clientIdentityZzd;
        }
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i13, @SafeParcelable.Param(id = 2) long j13, @SafeParcelable.Param(id = 3) long j14, @SafeParcelable.Param(id = 8) long j15, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j16, @SafeParcelable.Param(id = 10) long j17, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) float f13, @SafeParcelable.Param(id = 9) boolean z13, @SafeParcelable.Param(id = 11) long j18, @SafeParcelable.Param(id = 12) int i15, @SafeParcelable.Param(id = 13) int i16, @SafeParcelable.Param(id = 15) boolean z14, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) ClientIdentity clientIdentity) {
        long j19;
        this.zza = i13;
        if (i13 == 105) {
            this.zzb = Long.MAX_VALUE;
            j19 = j13;
        } else {
            j19 = j13;
            this.zzb = j19;
        }
        this.zzc = j14;
        this.zzd = j15;
        this.zze = j16 == Long.MAX_VALUE ? j17 : Math.min(Math.max(1L, j16 - SystemClock.elapsedRealtime()), j17);
        this.zzf = i14;
        this.zzg = f13;
        this.zzh = z13;
        this.zzi = j18 != -1 ? j18 : j19;
        this.zzj = i15;
        this.zzk = i16;
        this.zzl = z14;
        this.zzm = workSource;
        this.zzn = clientIdentity;
    }
}
