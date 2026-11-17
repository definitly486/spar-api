package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class yp implements ia0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f59471iobyxmoadg;

    public yp(boolean z13) {
        this.f59471iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp) && this.f59471iobyxmoadg == ((yp) obj).f59471iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f59471iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "IsResultViewEnabledByMerchant(resultViewNeeded=" + this.f59471iobyxmoadg + ")";
    }
}
