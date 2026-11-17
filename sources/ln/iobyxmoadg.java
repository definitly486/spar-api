package ln;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f63655eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f63656gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f63657iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f63658ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63659wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f63660zoijcleaow;

    public iobyxmoadg(int i13, tzroggbefp fieldValue, boolean z13, String errorText, int i14, boolean z14) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        zdlpuopuiu.btonecajqb(errorText, "errorText");
        this.f63657iobyxmoadg = i13;
        this.f63660zoijcleaow = fieldValue;
        this.f63658ppxfxbqfkf = z13;
        this.f63659wkgbmnqykc = errorText;
        this.f63655eablkybsjg = i14;
        this.f63656gxszxtbevo = z14;
    }

    public final boolean eablkybsjg() {
        return this.f63658ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f63657iobyxmoadg == iobyxmoadgVar.f63657iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f63660zoijcleaow, iobyxmoadgVar.f63660zoijcleaow) && this.f63658ppxfxbqfkf == iobyxmoadgVar.f63658ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f63659wkgbmnqykc, iobyxmoadgVar.f63659wkgbmnqykc) && this.f63655eablkybsjg == iobyxmoadgVar.f63655eablkybsjg && this.f63656gxszxtbevo == iobyxmoadgVar.f63656gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f63656gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f63657iobyxmoadg) * 31) + this.f63660zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f63658ppxfxbqfkf)) * 31) + this.f63659wkgbmnqykc.hashCode()) * 31) + Integer.hashCode(this.f63655eablkybsjg)) * 31) + Boolean.hashCode(this.f63656gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f63659wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f63657iobyxmoadg;
    }

    public String toString() {
        return "AddressDetailInputUiModel(labelRes=" + this.f63657iobyxmoadg + ", fieldValue=" + this.f63660zoijcleaow + ", isEnabled=" + this.f63658ppxfxbqfkf + ", errorText=" + this.f63659wkgbmnqykc + ", maxLength=" + this.f63655eablkybsjg + ", isOnlyDigits=" + this.f63656gxszxtbevo + ")";
    }

    public final int wkgbmnqykc() {
        return this.f63655eablkybsjg;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f63660zoijcleaow;
    }
}
