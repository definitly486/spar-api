package kk;

import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* JADX INFO: loaded from: classes3.dex */
public final class kn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ButtonBnpl f57330eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57331iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Boolean f57332ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final boolean f57333wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Long f57334zoijcleaow;

    public kn(String str, Long l13, Boolean bool, ButtonBnpl buttonBnpl, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        l13 = (i13 & 2) != 0 ? null : l13;
        bool = (i13 & 4) != 0 ? null : bool;
        boolean z13 = (i13 & 8) != 0;
        buttonBnpl = (i13 & 16) != 0 ? null : buttonBnpl;
        this.f57331iobyxmoadg = str;
        this.f57334zoijcleaow = l13;
        this.f57332ppxfxbqfkf = bool;
        this.f57333wkgbmnqykc = z13;
        this.f57330eablkybsjg = buttonBnpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57331iobyxmoadg, knVar.f57331iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57334zoijcleaow, knVar.f57334zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57332ppxfxbqfkf, knVar.f57332ppxfxbqfkf) && this.f57333wkgbmnqykc == knVar.f57333wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57330eablkybsjg, knVar.f57330eablkybsjg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        String str = this.f57331iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f57334zoijcleaow;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.f57332ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z13 = this.f57333wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode3 + r13) * 31;
        ButtonBnpl buttonBnpl = this.f57330eablkybsjg;
        return i13 + (buttonBnpl != null ? buttonBnpl.hashCode() : 0);
    }

    public final String toString() {
        return "BnplButtonData(numOfPayments=" + this.f57331iobyxmoadg + ", payment=" + this.f57334zoijcleaow + ", isButtonEnable=" + this.f57332ppxfxbqfkf + ", isButtonVisible=" + this.f57333wkgbmnqykc + ", bnplButton=" + this.f57330eablkybsjg + ")";
    }
}
