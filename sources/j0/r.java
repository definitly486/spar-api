package j0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50309iobyxmoadg;

    public r(String str) {
        super(null);
        this.f50309iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50309iobyxmoadg, ((r) obj).f50309iobyxmoadg);
    }

    public int hashCode() {
        return this.f50309iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50309iobyxmoadg;
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f50309iobyxmoadg + ')';
    }
}
