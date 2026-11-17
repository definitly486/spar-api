package l9;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f61913iobyxmoadg;

    public gtknphoqwx(vdvldrhtss screen) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        this.f61913iobyxmoadg = screen;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f61913iobyxmoadg, ((gtknphoqwx) obj).f61913iobyxmoadg);
    }

    public int hashCode() {
        return this.f61913iobyxmoadg.hashCode();
    }

    public final vdvldrhtss iobyxmoadg() {
        return this.f61913iobyxmoadg;
    }

    public String toString() {
        return "Replace(screen=" + this.f61913iobyxmoadg + ')';
    }
}
