package ru.myspar.proloyalty.scango.impl.screens.cart.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f100772dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f100773eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iobyxmoadg f100774gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f100775iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f100776lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f100777nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f100778ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f100779wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f100780zoijcleaow;

    public enum iobyxmoadg {
        FILL,
        EMPTY;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f100781iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public wkgbmnqykc(boolean z13, String totalPriceInt, String totalPriceFractional, boolean z14, List content, iobyxmoadg cartState, boolean z15, long j13, String startText) {
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(cartState, "cartState");
        zdlpuopuiu.btonecajqb(startText, "startText");
        this.f100775iobyxmoadg = z13;
        this.f100780zoijcleaow = totalPriceInt;
        this.f100778ppxfxbqfkf = totalPriceFractional;
        this.f100779wkgbmnqykc = z14;
        this.f100773eablkybsjg = content;
        this.f100774gxszxtbevo = cartState;
        this.f100776lqeggnwhkg = z15;
        this.f100777nufgyqmvbu = j13;
        this.f100772dxjokdxxww = startText;
    }

    public final boolean dxjokdxxww() {
        return this.f100776lqeggnwhkg;
    }

    public final String eablkybsjg() {
        return this.f100778ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f100775iobyxmoadg == wkgbmnqykcVar.f100775iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f100780zoijcleaow, wkgbmnqykcVar.f100780zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100778ppxfxbqfkf, wkgbmnqykcVar.f100778ppxfxbqfkf) && this.f100779wkgbmnqykc == wkgbmnqykcVar.f100779wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f100773eablkybsjg, wkgbmnqykcVar.f100773eablkybsjg) && this.f100774gxszxtbevo == wkgbmnqykcVar.f100774gxszxtbevo && this.f100776lqeggnwhkg == wkgbmnqykcVar.f100776lqeggnwhkg && this.f100777nufgyqmvbu == wkgbmnqykcVar.f100777nufgyqmvbu && zdlpuopuiu.eablkybsjg(this.f100772dxjokdxxww, wkgbmnqykcVar.f100772dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f100780zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f100775iobyxmoadg) * 31) + this.f100780zoijcleaow.hashCode()) * 31) + this.f100778ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f100779wkgbmnqykc)) * 31) + this.f100773eablkybsjg.hashCode()) * 31) + this.f100774gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f100776lqeggnwhkg)) * 31) + Long.hashCode(this.f100777nufgyqmvbu)) * 31) + this.f100772dxjokdxxww.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f100774gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f100779wkgbmnqykc;
    }

    public final boolean nufgyqmvbu() {
        return this.f100775iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f100772dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f100775iobyxmoadg + ", totalPriceInt=" + this.f100780zoijcleaow + ", totalPriceFractional=" + this.f100778ppxfxbqfkf + ", isCheckoutBtnEnabled=" + this.f100779wkgbmnqykc + ", content=" + this.f100773eablkybsjg + ", cartState=" + this.f100774gxszxtbevo + ", isReturnProductFlatEnabled=" + this.f100776lqeggnwhkg + ", timerValue=" + this.f100777nufgyqmvbu + ", startText=" + this.f100772dxjokdxxww + ")";
    }

    public final long wkgbmnqykc() {
        return this.f100777nufgyqmvbu;
    }

    public final List zoijcleaow() {
        return this.f100773eablkybsjg;
    }
}
