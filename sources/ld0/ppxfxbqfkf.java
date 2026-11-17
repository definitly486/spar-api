package ld0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f62138cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q10.iobyxmoadg f62139iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f62140jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f62141yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f62142zdlpuopuiu;

    public ppxfxbqfkf(String itemId, int i13, int i14, q10.iobyxmoadg type, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f62142zdlpuopuiu = itemId;
        this.f62141yggfygwlhe = i13;
        this.f62140jyumaefscl = i14;
        this.f62139iwizpuwonk = type;
        this.f62138cqumvgiudr = z13;
    }

    public final q10.iobyxmoadg eablkybsjg() {
        return this.f62139iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f62142zdlpuopuiu, ppxfxbqfkfVar.f62142zdlpuopuiu) && this.f62141yggfygwlhe == ppxfxbqfkfVar.f62141yggfygwlhe && this.f62140jyumaefscl == ppxfxbqfkfVar.f62140jyumaefscl && this.f62139iwizpuwonk == ppxfxbqfkfVar.f62139iwizpuwonk && this.f62138cqumvgiudr == ppxfxbqfkfVar.f62138cqumvgiudr;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f62142zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f62142zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f62141yggfygwlhe)) * 31) + Integer.hashCode(this.f62140jyumaefscl)) * 31) + this.f62139iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f62138cqumvgiudr);
    }

    public final int iobyxmoadg() {
        return this.f62141yggfygwlhe;
    }

    public final boolean lqeggnwhkg() {
        return this.f62138cqumvgiudr;
    }

    public String toString() {
        return "QuestionItemUiModel(itemId=" + this.f62142zdlpuopuiu + ", answer=" + this.f62141yggfygwlhe + ", question=" + this.f62140jyumaefscl + ", type=" + this.f62139iwizpuwonk + ", isExpanded=" + this.f62138cqumvgiudr + ")";
    }

    public final int wkgbmnqykc() {
        return this.f62140jyumaefscl;
    }
}
