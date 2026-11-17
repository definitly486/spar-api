package ru.myspar.scango.impl.screens.cart.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f103429dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f103430eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iobyxmoadg f103431gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f103432iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f103433lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f103434nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f103435ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f103436wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f103437zoijcleaow;

    public enum iobyxmoadg {
        FILL,
        EMPTY;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f103438iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public wkgbmnqykc(boolean z13, String totalPriceInt, String totalPriceFractional, boolean z14, List content, iobyxmoadg cartState, boolean z15, long j13, String startText) {
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(cartState, "cartState");
        zdlpuopuiu.btonecajqb(startText, "startText");
        this.f103432iobyxmoadg = z13;
        this.f103437zoijcleaow = totalPriceInt;
        this.f103435ppxfxbqfkf = totalPriceFractional;
        this.f103436wkgbmnqykc = z14;
        this.f103430eablkybsjg = content;
        this.f103431gxszxtbevo = cartState;
        this.f103433lqeggnwhkg = z15;
        this.f103434nufgyqmvbu = j13;
        this.f103429dxjokdxxww = startText;
    }

    public final boolean dxjokdxxww() {
        return this.f103433lqeggnwhkg;
    }

    public final String eablkybsjg() {
        return this.f103435ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f103432iobyxmoadg == wkgbmnqykcVar.f103432iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f103437zoijcleaow, wkgbmnqykcVar.f103437zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f103435ppxfxbqfkf, wkgbmnqykcVar.f103435ppxfxbqfkf) && this.f103436wkgbmnqykc == wkgbmnqykcVar.f103436wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f103430eablkybsjg, wkgbmnqykcVar.f103430eablkybsjg) && this.f103431gxszxtbevo == wkgbmnqykcVar.f103431gxszxtbevo && this.f103433lqeggnwhkg == wkgbmnqykcVar.f103433lqeggnwhkg && this.f103434nufgyqmvbu == wkgbmnqykcVar.f103434nufgyqmvbu && zdlpuopuiu.eablkybsjg(this.f103429dxjokdxxww, wkgbmnqykcVar.f103429dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f103437zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f103432iobyxmoadg) * 31) + this.f103437zoijcleaow.hashCode()) * 31) + this.f103435ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f103436wkgbmnqykc)) * 31) + this.f103430eablkybsjg.hashCode()) * 31) + this.f103431gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f103433lqeggnwhkg)) * 31) + Long.hashCode(this.f103434nufgyqmvbu)) * 31) + this.f103429dxjokdxxww.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f103431gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f103436wkgbmnqykc;
    }

    public final boolean nufgyqmvbu() {
        return this.f103432iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f103429dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f103432iobyxmoadg + ", totalPriceInt=" + this.f103437zoijcleaow + ", totalPriceFractional=" + this.f103435ppxfxbqfkf + ", isCheckoutBtnEnabled=" + this.f103436wkgbmnqykc + ", content=" + this.f103430eablkybsjg + ", cartState=" + this.f103431gxszxtbevo + ", isReturnProductFlatEnabled=" + this.f103433lqeggnwhkg + ", timerValue=" + this.f103434nufgyqmvbu + ", startText=" + this.f103429dxjokdxxww + ")";
    }

    public final long wkgbmnqykc() {
        return this.f103434nufgyqmvbu;
    }

    public final List zoijcleaow() {
        return this.f103430eablkybsjg;
    }
}
