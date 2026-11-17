package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class mu extends qv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f57696iobyxmoadg;

    public mu(boolean z13) {
        this.f57696iobyxmoadg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu) && this.f57696iobyxmoadg == ((mu) obj).f57696iobyxmoadg;
    }

    public final int hashCode() {
        boolean z13 = this.f57696iobyxmoadg;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "UpdateCheckBoxAgreementStatus(isChecked=" + this.f57696iobyxmoadg + ")";
    }
}
