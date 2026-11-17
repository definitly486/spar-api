package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 extends qa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f56386iobyxmoadg;

    public e7(boolean z13) {
        this.f56386iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7) && this.f56386iobyxmoadg == ((e7) obj).f56386iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f56386iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "IsEnabledByBank(value=" + this.f56386iobyxmoadg + ")";
    }
}
