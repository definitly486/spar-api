package r62;

import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f81851iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final f40.zoijcleaow f81852jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f81853yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f81854zdlpuopuiu;

    public iobyxmoadg(String image, boolean z13, f40.zoijcleaow navlink, String reference) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f81854zdlpuopuiu = image;
        this.f81853yggfygwlhe = z13;
        this.f81852jyumaefscl = navlink;
        this.f81851iwizpuwonk = reference;
    }

    public final f40.zoijcleaow eablkybsjg() {
        return this.f81852jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f81854zdlpuopuiu, iobyxmoadgVar.f81854zdlpuopuiu) && this.f81853yggfygwlhe == iobyxmoadgVar.f81853yggfygwlhe && this.f81852jyumaefscl == iobyxmoadgVar.f81852jyumaefscl && zdlpuopuiu.eablkybsjg(this.f81851iwizpuwonk, iobyxmoadgVar.f81851iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f81854zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f81854zdlpuopuiu.hashCode() * 31) + Boolean.hashCode(this.f81853yggfygwlhe)) * 31) + this.f81852jyumaefscl.hashCode()) * 31) + this.f81851iwizpuwonk.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f81853yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f81851iwizpuwonk;
    }

    public String toString() {
        return "SquareCardUiModel(image=" + this.f81854zdlpuopuiu + ", hasShadow=" + this.f81853yggfygwlhe + ", navlink=" + this.f81852jyumaefscl + ", reference=" + this.f81851iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f81854zdlpuopuiu;
    }
}
