package st0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f108552lqeggnwhkg = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f108553eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f108554gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f108555iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f108556ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f108557wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f108558zoijcleaow;

    public wkgbmnqykc(String price, String priceDecimal, String priceWithoutDiscount, boolean z13, String errorMessage, boolean z14) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        zdlpuopuiu.btonecajqb(priceWithoutDiscount, "priceWithoutDiscount");
        zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
        this.f108555iobyxmoadg = price;
        this.f108558zoijcleaow = priceDecimal;
        this.f108556ppxfxbqfkf = priceWithoutDiscount;
        this.f108557wkgbmnqykc = z13;
        this.f108553eablkybsjg = errorMessage;
        this.f108554gxszxtbevo = z14;
    }

    public final String eablkybsjg() {
        return this.f108556ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f108555iobyxmoadg, wkgbmnqykcVar.f108555iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f108558zoijcleaow, wkgbmnqykcVar.f108558zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f108556ppxfxbqfkf, wkgbmnqykcVar.f108556ppxfxbqfkf) && this.f108557wkgbmnqykc == wkgbmnqykcVar.f108557wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f108553eablkybsjg, wkgbmnqykcVar.f108553eablkybsjg) && this.f108554gxszxtbevo == wkgbmnqykcVar.f108554gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f108557wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f108555iobyxmoadg.hashCode() * 31) + this.f108558zoijcleaow.hashCode()) * 31) + this.f108556ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f108557wkgbmnqykc)) * 31) + this.f108553eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f108554gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f108553eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f108555iobyxmoadg;
    }

    public String toString() {
        return "TotalPriceComponentUiModel(price=" + this.f108555iobyxmoadg + ", priceDecimal=" + this.f108558zoijcleaow + ", priceWithoutDiscount=" + this.f108556ppxfxbqfkf + ", isButtonEnabled=" + this.f108557wkgbmnqykc + ", errorMessage=" + this.f108553eablkybsjg + ", orderButtonProgressVisible=" + this.f108554gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f108558zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f108554gxszxtbevo;
    }
}
