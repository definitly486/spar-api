package ib1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f42335cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final g01.iobyxmoadg f42336iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f42337jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f42338yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42339zdlpuopuiu;

    public ppxfxbqfkf(String itemId, int i13, int i14, g01.iobyxmoadg type, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f42339zdlpuopuiu = itemId;
        this.f42338yggfygwlhe = i13;
        this.f42337jyumaefscl = i14;
        this.f42336iwizpuwonk = type;
        this.f42335cqumvgiudr = z13;
    }

    public final g01.iobyxmoadg eablkybsjg() {
        return this.f42336iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f42339zdlpuopuiu, ppxfxbqfkfVar.f42339zdlpuopuiu) && this.f42338yggfygwlhe == ppxfxbqfkfVar.f42338yggfygwlhe && this.f42337jyumaefscl == ppxfxbqfkfVar.f42337jyumaefscl && this.f42336iwizpuwonk == ppxfxbqfkfVar.f42336iwizpuwonk && this.f42335cqumvgiudr == ppxfxbqfkfVar.f42335cqumvgiudr;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f42339zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f42339zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f42338yggfygwlhe)) * 31) + Integer.hashCode(this.f42337jyumaefscl)) * 31) + this.f42336iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f42335cqumvgiudr);
    }

    public final int iobyxmoadg() {
        return this.f42338yggfygwlhe;
    }

    public final boolean lqeggnwhkg() {
        return this.f42335cqumvgiudr;
    }

    public String toString() {
        return "QuestionItemUiModel(itemId=" + this.f42339zdlpuopuiu + ", answer=" + this.f42338yggfygwlhe + ", question=" + this.f42337jyumaefscl + ", type=" + this.f42336iwizpuwonk + ", isExpanded=" + this.f42335cqumvgiudr + ")";
    }

    public final int wkgbmnqykc() {
        return this.f42337jyumaefscl;
    }
}
