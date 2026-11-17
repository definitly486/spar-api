package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58490iobyxmoadg;

    public s1(String str) {
        this.f58490iobyxmoadg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58490iobyxmoadg, ((s1) obj).f58490iobyxmoadg);
    }

    public final int hashCode() {
        String str = this.f58490iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "EmptyPaymentAccountError(message=" + this.f58490iobyxmoadg + ")";
    }
}
