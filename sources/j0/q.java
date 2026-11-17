package j0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50308iobyxmoadg;

    public q(String str) {
        this.f50308iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50308iobyxmoadg, ((q) obj).f50308iobyxmoadg);
    }

    public int hashCode() {
        return this.f50308iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50308iobyxmoadg;
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f50308iobyxmoadg + ')';
    }
}
