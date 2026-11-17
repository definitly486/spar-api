package gk;

import hk.hcddaimhww;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk extends iozdgvuglv {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f37713jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final dk.gxszxtbevo f37714yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f37715zdlpuopuiu;

    public /* synthetic */ iwizpuwonk(Object obj, boolean z13, dk.gxszxtbevo gxszxtbevoVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(obj, z13, (i13 & 4) != 0 ? null : gxszxtbevoVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iwizpuwonk.class != obj.getClass()) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return ppxfxbqfkf() == iwizpuwonkVar.ppxfxbqfkf() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), iwizpuwonkVar.iobyxmoadg());
    }

    public int hashCode() {
        return (Boolean.hashCode(ppxfxbqfkf()) * 31) + iobyxmoadg().hashCode();
    }

    @Override // gk.iozdgvuglv
    public String iobyxmoadg() {
        return this.f37713jyumaefscl;
    }

    public boolean ppxfxbqfkf() {
        return this.f37715zdlpuopuiu;
    }

    @Override // gk.iozdgvuglv
    public String toString() {
        if (!ppxfxbqfkf()) {
            return iobyxmoadg();
        }
        StringBuilder sb3 = new StringBuilder();
        hcddaimhww.ppxfxbqfkf(sb3, iobyxmoadg());
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final dk.gxszxtbevo zoijcleaow() {
        return this.f37714yggfygwlhe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwizpuwonk(Object body, boolean z13, dk.gxszxtbevo gxszxtbevoVar) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
        this.f37715zdlpuopuiu = z13;
        this.f37714yggfygwlhe = gxszxtbevoVar;
        this.f37713jyumaefscl = body.toString();
        if (gxszxtbevoVar != null && !gxszxtbevoVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
