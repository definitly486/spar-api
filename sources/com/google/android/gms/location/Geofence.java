package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.identity.zzek;

/* JADX INFO: loaded from: classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 3;
        private long zzc = -1;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            if (this.zza == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i13 = this.zzb;
            if (i13 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i13 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.zzc == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.zzh >= 0) {
                return new zzek(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public Builder setCircularRegion(double d13, double d14, float f13) {
            boolean z13 = d13 >= -90.0d && d13 <= 90.0d;
            StringBuilder sb3 = new StringBuilder(String.valueOf(d13).length() + 18);
            sb3.append("Invalid latitude: ");
            sb3.append(d13);
            Preconditions.checkArgument(z13, sb3.toString());
            boolean z14 = d14 >= -180.0d && d14 <= 180.0d;
            StringBuilder sb4 = new StringBuilder(String.valueOf(d14).length() + 19);
            sb4.append("Invalid longitude: ");
            sb4.append(d14);
            Preconditions.checkArgument(z14, sb4.toString());
            boolean z15 = f13 > 0.0f;
            StringBuilder sb5 = new StringBuilder(String.valueOf(f13).length() + 16);
            sb5.append("Invalid radius: ");
            sb5.append(f13);
            Preconditions.checkArgument(z15, sb5.toString());
            this.zzd = (short) 1;
            this.zze = d13;
            this.zzf = d14;
            this.zzg = f13;
            return this;
        }

        public Builder setExpirationDuration(long j13) {
            if (j13 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j13;
            }
            return this;
        }

        public Builder setLoiteringDelay(int i13) {
            this.zzi = i13;
            return this;
        }

        public Builder setNotificationResponsiveness(int i13) {
            this.zzh = i13;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(@TransitionTypes int i13) {
            this.zzb = i13;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
