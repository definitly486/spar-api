package j8;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f50838iobyxmoadg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(dxjokdxxww size) {
        super(null);
        zdlpuopuiu.btonecajqb(size, "size");
        this.f50838iobyxmoadg = size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f50838iobyxmoadg, ((eablkybsjg) obj).f50838iobyxmoadg);
    }

    public int hashCode() {
        return this.f50838iobyxmoadg.hashCode();
    }

    public final dxjokdxxww iobyxmoadg() {
        return this.f50838iobyxmoadg;
    }

    public String toString() {
        return "ImmediateGlideSize(size=" + this.f50838iobyxmoadg + ')';
    }
}
