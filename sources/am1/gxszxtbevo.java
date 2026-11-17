package am1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f2253iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f2254jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f2255yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(String code, boolean z13, String reason) {
        super(code, null);
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(reason, "reason");
        this.f2255yggfygwlhe = code;
        this.f2254jyumaefscl = z13;
        this.f2253iwizpuwonk = reason;
    }

    public final boolean eablkybsjg() {
        return this.f2254jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f2255yggfygwlhe, gxszxtbevoVar.f2255yggfygwlhe) && this.f2254jyumaefscl == gxszxtbevoVar.f2254jyumaefscl && zdlpuopuiu.eablkybsjg(this.f2253iwizpuwonk, gxszxtbevoVar.f2253iwizpuwonk);
    }

    public int hashCode() {
        return (((this.f2255yggfygwlhe.hashCode() * 31) + Boolean.hashCode(this.f2254jyumaefscl)) * 31) + this.f2253iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f2255yggfygwlhe;
    }

    public String toString() {
        return "ReasonItemUiModel(code=" + this.f2255yggfygwlhe + ", isChecked=" + this.f2254jyumaefscl + ", reason=" + this.f2253iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f2253iwizpuwonk;
    }
}
