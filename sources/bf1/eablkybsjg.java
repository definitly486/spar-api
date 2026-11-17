package bf1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16051iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16052ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16053zoijcleaow;

    public eablkybsjg(String information, String bonusesValue, String bonusesFormated) {
        zdlpuopuiu.btonecajqb(information, "information");
        zdlpuopuiu.btonecajqb(bonusesValue, "bonusesValue");
        zdlpuopuiu.btonecajqb(bonusesFormated, "bonusesFormated");
        this.f16051iobyxmoadg = information;
        this.f16053zoijcleaow = bonusesValue;
        this.f16052ppxfxbqfkf = bonusesFormated;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f16051iobyxmoadg, eablkybsjgVar.f16051iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16053zoijcleaow, eablkybsjgVar.f16053zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16052ppxfxbqfkf, eablkybsjgVar.f16052ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f16051iobyxmoadg.hashCode() * 31) + this.f16053zoijcleaow.hashCode()) * 31) + this.f16052ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f16052ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f16051iobyxmoadg;
    }

    public String toString() {
        return "UserBalanceUiModel(information=" + this.f16051iobyxmoadg + ", bonusesValue=" + this.f16053zoijcleaow + ", bonusesFormated=" + this.f16052ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f16053zoijcleaow;
    }
}
