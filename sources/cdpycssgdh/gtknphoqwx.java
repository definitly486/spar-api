package cdpycssgdh;

import com.google.android.gms.location.DeviceOrientationRequest;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f19692iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f19693zoijcleaow;

    gtknphoqwx(long j13, long j14) {
        this.f19692iobyxmoadg = j13;
        this.f19693zoijcleaow = j14;
    }

    long iobyxmoadg() {
        return this.f19693zoijcleaow;
    }

    public String toString() {
        return this.f19692iobyxmoadg + CardDateFormatTextWatcher.DIVIDER_CHARACTER + this.f19693zoijcleaow;
    }

    long zoijcleaow() {
        return this.f19692iobyxmoadg;
    }

    gtknphoqwx(double d13) {
        this((long) (d13 * 10000.0d), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }
}
