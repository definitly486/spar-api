package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class j9 extends qa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f57168iobyxmoadg;

    public j9(boolean z13) {
        this.f57168iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9) && this.f57168iobyxmoadg == ((j9) obj).f57168iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f57168iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "IsEnabledByUser(value=" + this.f57168iobyxmoadg + ")";
    }
}
