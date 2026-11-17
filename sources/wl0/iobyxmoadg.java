package wl0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f120190eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f120191gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f120192iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120193ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f120194wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f120195zoijcleaow;

    public iobyxmoadg(int i13, tzroggbefp fieldValue, boolean z13, String errorText, int i14, boolean z14) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        zdlpuopuiu.btonecajqb(errorText, "errorText");
        this.f120192iobyxmoadg = i13;
        this.f120195zoijcleaow = fieldValue;
        this.f120193ppxfxbqfkf = z13;
        this.f120194wkgbmnqykc = errorText;
        this.f120190eablkybsjg = i14;
        this.f120191gxszxtbevo = z14;
    }

    public final boolean eablkybsjg() {
        return this.f120193ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f120192iobyxmoadg == iobyxmoadgVar.f120192iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f120195zoijcleaow, iobyxmoadgVar.f120195zoijcleaow) && this.f120193ppxfxbqfkf == iobyxmoadgVar.f120193ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f120194wkgbmnqykc, iobyxmoadgVar.f120194wkgbmnqykc) && this.f120190eablkybsjg == iobyxmoadgVar.f120190eablkybsjg && this.f120191gxszxtbevo == iobyxmoadgVar.f120191gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f120191gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f120192iobyxmoadg) * 31) + this.f120195zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f120193ppxfxbqfkf)) * 31) + this.f120194wkgbmnqykc.hashCode()) * 31) + Integer.hashCode(this.f120190eablkybsjg)) * 31) + Boolean.hashCode(this.f120191gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f120194wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f120192iobyxmoadg;
    }

    public String toString() {
        return "AddressDetailInputUiModel(labelRes=" + this.f120192iobyxmoadg + ", fieldValue=" + this.f120195zoijcleaow + ", isEnabled=" + this.f120193ppxfxbqfkf + ", errorText=" + this.f120194wkgbmnqykc + ", maxLength=" + this.f120190eablkybsjg + ", isOnlyDigits=" + this.f120191gxszxtbevo + ")";
    }

    public final int wkgbmnqykc() {
        return this.f120190eablkybsjg;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f120195zoijcleaow;
    }
}
