package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58982iobyxmoadg;

    public vb(String str) {
        this.f58982iobyxmoadg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58982iobyxmoadg, ((vb) obj).f58982iobyxmoadg);
    }

    public final int hashCode() {
        String str = this.f58982iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ClientData(bankLogo=" + this.f58982iobyxmoadg + ")";
    }
}
