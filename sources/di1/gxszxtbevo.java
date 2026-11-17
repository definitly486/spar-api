package di1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f29001eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f29002gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29003iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f29004lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f29005nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f29006ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f29007wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29008zoijcleaow;

    public gxszxtbevo(String productSetName, String productsCountText, String totalPrice, String totalPriceFractional, String oldTotalPrice, String productSetCountText, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(productSetName, "productSetName");
        zdlpuopuiu.btonecajqb(productsCountText, "productsCountText");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(oldTotalPrice, "oldTotalPrice");
        zdlpuopuiu.btonecajqb(productSetCountText, "productSetCountText");
        this.f29003iobyxmoadg = productSetName;
        this.f29008zoijcleaow = productsCountText;
        this.f29006ppxfxbqfkf = totalPrice;
        this.f29007wkgbmnqykc = totalPriceFractional;
        this.f29001eablkybsjg = oldTotalPrice;
        this.f29002gxszxtbevo = productSetCountText;
        this.f29004lqeggnwhkg = z13;
        this.f29005nufgyqmvbu = z14;
    }

    public final String eablkybsjg() {
        return this.f29006ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f29003iobyxmoadg, gxszxtbevoVar.f29003iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29008zoijcleaow, gxszxtbevoVar.f29008zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29006ppxfxbqfkf, gxszxtbevoVar.f29006ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29007wkgbmnqykc, gxszxtbevoVar.f29007wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29001eablkybsjg, gxszxtbevoVar.f29001eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f29002gxszxtbevo, gxszxtbevoVar.f29002gxszxtbevo) && this.f29004lqeggnwhkg == gxszxtbevoVar.f29004lqeggnwhkg && this.f29005nufgyqmvbu == gxszxtbevoVar.f29005nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f29007wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((this.f29003iobyxmoadg.hashCode() * 31) + this.f29008zoijcleaow.hashCode()) * 31) + this.f29006ppxfxbqfkf.hashCode()) * 31) + this.f29007wkgbmnqykc.hashCode()) * 31) + this.f29001eablkybsjg.hashCode()) * 31) + this.f29002gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f29004lqeggnwhkg)) * 31) + Boolean.hashCode(this.f29005nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f29001eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f29004lqeggnwhkg;
    }

    public final boolean nufgyqmvbu() {
        return this.f29005nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f29003iobyxmoadg;
    }

    public String toString() {
        return "Model(productSetName=" + this.f29003iobyxmoadg + ", productsCountText=" + this.f29008zoijcleaow + ", totalPrice=" + this.f29006ppxfxbqfkf + ", totalPriceFractional=" + this.f29007wkgbmnqykc + ", oldTotalPrice=" + this.f29001eablkybsjg + ", productSetCountText=" + this.f29002gxszxtbevo + ", isBtnDecrementEnabled=" + this.f29004lqeggnwhkg + ", isBtnIncrementEnabled=" + this.f29005nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f29008zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f29002gxszxtbevo;
    }
}
