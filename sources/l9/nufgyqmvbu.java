package l9;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f61919iobyxmoadg;

    public nufgyqmvbu(vdvldrhtss screen) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        this.f61919iobyxmoadg = screen;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f61919iobyxmoadg, ((nufgyqmvbu) obj).f61919iobyxmoadg);
    }

    public int hashCode() {
        return this.f61919iobyxmoadg.hashCode();
    }

    public final vdvldrhtss iobyxmoadg() {
        return this.f61919iobyxmoadg;
    }

    public String toString() {
        return "Forward(screen=" + this.f61919iobyxmoadg + ')';
    }
}
