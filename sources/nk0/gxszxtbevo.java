package nk0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f70260eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f70261gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f70262iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f70263lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f70264nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f70265ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f70266wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f70267zoijcleaow;

    public gxszxtbevo(String productSetName, String productsCountText, String totalPrice, String totalPriceFractional, String oldTotalPrice, String productSetCountText, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(productSetName, "productSetName");
        zdlpuopuiu.btonecajqb(productsCountText, "productsCountText");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(oldTotalPrice, "oldTotalPrice");
        zdlpuopuiu.btonecajqb(productSetCountText, "productSetCountText");
        this.f70262iobyxmoadg = productSetName;
        this.f70267zoijcleaow = productsCountText;
        this.f70265ppxfxbqfkf = totalPrice;
        this.f70266wkgbmnqykc = totalPriceFractional;
        this.f70260eablkybsjg = oldTotalPrice;
        this.f70261gxszxtbevo = productSetCountText;
        this.f70263lqeggnwhkg = z13;
        this.f70264nufgyqmvbu = z14;
    }

    public final String eablkybsjg() {
        return this.f70265ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f70262iobyxmoadg, gxszxtbevoVar.f70262iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70267zoijcleaow, gxszxtbevoVar.f70267zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70265ppxfxbqfkf, gxszxtbevoVar.f70265ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f70266wkgbmnqykc, gxszxtbevoVar.f70266wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f70260eablkybsjg, gxszxtbevoVar.f70260eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f70261gxszxtbevo, gxszxtbevoVar.f70261gxszxtbevo) && this.f70263lqeggnwhkg == gxszxtbevoVar.f70263lqeggnwhkg && this.f70264nufgyqmvbu == gxszxtbevoVar.f70264nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f70266wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((this.f70262iobyxmoadg.hashCode() * 31) + this.f70267zoijcleaow.hashCode()) * 31) + this.f70265ppxfxbqfkf.hashCode()) * 31) + this.f70266wkgbmnqykc.hashCode()) * 31) + this.f70260eablkybsjg.hashCode()) * 31) + this.f70261gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f70263lqeggnwhkg)) * 31) + Boolean.hashCode(this.f70264nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f70260eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f70263lqeggnwhkg;
    }

    public final boolean nufgyqmvbu() {
        return this.f70264nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f70262iobyxmoadg;
    }

    public String toString() {
        return "Model(productSetName=" + this.f70262iobyxmoadg + ", productsCountText=" + this.f70267zoijcleaow + ", totalPrice=" + this.f70265ppxfxbqfkf + ", totalPriceFractional=" + this.f70266wkgbmnqykc + ", oldTotalPrice=" + this.f70260eablkybsjg + ", productSetCountText=" + this.f70261gxszxtbevo + ", isBtnDecrementEnabled=" + this.f70263lqeggnwhkg + ", isBtnIncrementEnabled=" + this.f70264nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f70267zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f70261gxszxtbevo;
    }
}
