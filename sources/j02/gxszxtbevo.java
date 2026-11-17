package j02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f50442iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f50443jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50444yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(String code, boolean z13, String reason) {
        super(code, null);
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(reason, "reason");
        this.f50444yggfygwlhe = code;
        this.f50443jyumaefscl = z13;
        this.f50442iwizpuwonk = reason;
    }

    public final boolean eablkybsjg() {
        return this.f50443jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f50444yggfygwlhe, gxszxtbevoVar.f50444yggfygwlhe) && this.f50443jyumaefscl == gxszxtbevoVar.f50443jyumaefscl && zdlpuopuiu.eablkybsjg(this.f50442iwizpuwonk, gxszxtbevoVar.f50442iwizpuwonk);
    }

    public int hashCode() {
        return (((this.f50444yggfygwlhe.hashCode() * 31) + Boolean.hashCode(this.f50443jyumaefscl)) * 31) + this.f50442iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50444yggfygwlhe;
    }

    public String toString() {
        return "ReasonItemUiModel(code=" + this.f50444yggfygwlhe + ", isChecked=" + this.f50443jyumaefscl + ", reason=" + this.f50442iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50442iwizpuwonk;
    }
}
