package nf;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f69924iobyxmoadg;

    public gxszxtbevo(String id2) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f69924iobyxmoadg = id2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f69924iobyxmoadg, ((gxszxtbevo) obj).f69924iobyxmoadg);
    }

    public int hashCode() {
        return this.f69924iobyxmoadg.hashCode();
    }

    public String toString() {
        return "DividerModule(id=" + this.f69924iobyxmoadg + ")";
    }

    public /* synthetic */ gxszxtbevo(String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str);
    }
}
