package l9;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f61925iobyxmoadg;

    public zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        this.f61925iobyxmoadg = vdvldrhtssVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61925iobyxmoadg, ((zoijcleaow) obj).f61925iobyxmoadg);
    }

    public int hashCode() {
        vdvldrhtss vdvldrhtssVar = this.f61925iobyxmoadg;
        if (vdvldrhtssVar == null) {
            return 0;
        }
        return vdvldrhtssVar.hashCode();
    }

    public final vdvldrhtss iobyxmoadg() {
        return this.f61925iobyxmoadg;
    }

    public String toString() {
        return "BackTo(screen=" + this.f61925iobyxmoadg + ')';
    }
}
