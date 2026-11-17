package hp;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f40843eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f40844gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40845iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f40846lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40847ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f40848wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f40849zoijcleaow;

    public dxjokdxxww(String phoneNumber, tzroggbefp smsCode, boolean z13, String errorText, String timerValue, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(errorText, "errorText");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        this.f40845iobyxmoadg = phoneNumber;
        this.f40849zoijcleaow = smsCode;
        this.f40847ppxfxbqfkf = z13;
        this.f40848wkgbmnqykc = errorText;
        this.f40843eablkybsjg = timerValue;
        this.f40844gxszxtbevo = z14;
        this.f40846lqeggnwhkg = z15;
    }

    public final String eablkybsjg() {
        return this.f40843eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f40845iobyxmoadg, dxjokdxxwwVar.f40845iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40849zoijcleaow, dxjokdxxwwVar.f40849zoijcleaow) && this.f40847ppxfxbqfkf == dxjokdxxwwVar.f40847ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f40848wkgbmnqykc, dxjokdxxwwVar.f40848wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f40843eablkybsjg, dxjokdxxwwVar.f40843eablkybsjg) && this.f40844gxszxtbevo == dxjokdxxwwVar.f40844gxszxtbevo && this.f40846lqeggnwhkg == dxjokdxxwwVar.f40846lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f40847ppxfxbqfkf;
    }

    public int hashCode() {
        return (((((((((((this.f40845iobyxmoadg.hashCode() * 31) + this.f40849zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f40847ppxfxbqfkf)) * 31) + this.f40848wkgbmnqykc.hashCode()) * 31) + this.f40843eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f40844gxszxtbevo)) * 31) + Boolean.hashCode(this.f40846lqeggnwhkg);
    }

    public final boolean iobyxmoadg() {
        return this.f40844gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f40846lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f40845iobyxmoadg;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f40845iobyxmoadg + ", smsCode=" + this.f40849zoijcleaow + ", isError=" + this.f40847ppxfxbqfkf + ", errorText=" + this.f40848wkgbmnqykc + ", timerValue=" + this.f40843eablkybsjg + ", continueBtnIsEnabled=" + this.f40844gxszxtbevo + ", isLoading=" + this.f40846lqeggnwhkg + ")";
    }

    public final tzroggbefp wkgbmnqykc() {
        return this.f40849zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f40848wkgbmnqykc;
    }
}
