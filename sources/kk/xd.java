package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class xd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f59297iobyxmoadg;

    public xd(boolean z13) {
        this.f59297iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd) && this.f59297iobyxmoadg == ((xd) obj).f59297iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f59297iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "BnplGraphSection(isCurrentPayment=" + this.f59297iobyxmoadg + ")";
    }
}
