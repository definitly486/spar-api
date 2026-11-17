package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g8 extends qa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f56666iobyxmoadg;

    public g8(boolean z13) {
        this.f56666iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8) && this.f56666iobyxmoadg == ((g8) obj).f56666iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f56666iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "IsEnabledByMerchant(value=" + this.f56666iobyxmoadg + ")";
    }
}
