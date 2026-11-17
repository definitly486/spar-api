package pn0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f77014dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f77015eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f77016gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f77017iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f77018lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f77019nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f77020ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f77021wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f77022zoijcleaow;

    public wflxmlrfwp(String phoneNumber, String smsCode, boolean z13, boolean z14, boolean z15, String smsRepeatRequestHintText, boolean z16, int i13, int i14) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(smsRepeatRequestHintText, "smsRepeatRequestHintText");
        this.f77017iobyxmoadg = phoneNumber;
        this.f77022zoijcleaow = smsCode;
        this.f77020ppxfxbqfkf = z13;
        this.f77021wkgbmnqykc = z14;
        this.f77015eablkybsjg = z15;
        this.f77016gxszxtbevo = smsRepeatRequestHintText;
        this.f77018lqeggnwhkg = z16;
        this.f77019nufgyqmvbu = i13;
        this.f77014dxjokdxxww = i14;
    }

    public final boolean dxjokdxxww() {
        return this.f77018lqeggnwhkg;
    }

    public final boolean eablkybsjg() {
        return this.f77021wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f77017iobyxmoadg, wflxmlrfwpVar.f77017iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77022zoijcleaow, wflxmlrfwpVar.f77022zoijcleaow) && this.f77020ppxfxbqfkf == wflxmlrfwpVar.f77020ppxfxbqfkf && this.f77021wkgbmnqykc == wflxmlrfwpVar.f77021wkgbmnqykc && this.f77015eablkybsjg == wflxmlrfwpVar.f77015eablkybsjg && zdlpuopuiu.eablkybsjg(this.f77016gxszxtbevo, wflxmlrfwpVar.f77016gxszxtbevo) && this.f77018lqeggnwhkg == wflxmlrfwpVar.f77018lqeggnwhkg && this.f77019nufgyqmvbu == wflxmlrfwpVar.f77019nufgyqmvbu && this.f77014dxjokdxxww == wflxmlrfwpVar.f77014dxjokdxxww;
    }

    public final boolean gxszxtbevo() {
        return this.f77020ppxfxbqfkf;
    }

    public int hashCode() {
        return (((((((((((((((this.f77017iobyxmoadg.hashCode() * 31) + this.f77022zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f77020ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f77021wkgbmnqykc)) * 31) + Boolean.hashCode(this.f77015eablkybsjg)) * 31) + this.f77016gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f77018lqeggnwhkg)) * 31) + Integer.hashCode(this.f77019nufgyqmvbu)) * 31) + Integer.hashCode(this.f77014dxjokdxxww);
    }

    public final int iobyxmoadg() {
        return this.f77019nufgyqmvbu;
    }

    public final boolean lqeggnwhkg() {
        return this.f77015eablkybsjg;
    }

    public final String nufgyqmvbu() {
        return this.f77016gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f77017iobyxmoadg;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f77017iobyxmoadg + ", smsCode=" + this.f77022zoijcleaow + ", smsFieldIsVisible=" + this.f77020ppxfxbqfkf + ", smsErrorIsVisible=" + this.f77021wkgbmnqykc + ", smsRepeatHintIsVisible=" + this.f77015eablkybsjg + ", smsRepeatRequestHintText=" + this.f77016gxszxtbevo + ", smsRepeatRequestIsVisible=" + this.f77018lqeggnwhkg + ", buttonTitleRes=" + this.f77019nufgyqmvbu + ", hintRes=" + this.f77014dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f77022zoijcleaow;
    }

    public final int zoijcleaow() {
        return this.f77014dxjokdxxww;
    }
}
