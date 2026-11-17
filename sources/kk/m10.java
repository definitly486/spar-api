package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class m10 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final boolean f57570eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f57571iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f57572ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Long f57573wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Integer f57574zoijcleaow;

    public m10(int i13, Integer num, int i14, Long l13, int i15) {
        num = (i15 & 2) != 0 ? null : num;
        i14 = (i15 & 4) != 0 ? R.color.spay_text_color_grey : i14;
        l13 = (i15 & 8) != 0 ? null : l13;
        boolean z13 = (i15 & 16) == 0;
        this.f57571iobyxmoadg = i13;
        this.f57574zoijcleaow = num;
        this.f57572ppxfxbqfkf = i14;
        this.f57573wkgbmnqykc = l13;
        this.f57570eablkybsjg = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m10)) {
            return false;
        }
        m10 m10Var = (m10) obj;
        return this.f57571iobyxmoadg == m10Var.f57571iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57574zoijcleaow, m10Var.f57574zoijcleaow) && this.f57572ppxfxbqfkf == m10Var.f57572ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57573wkgbmnqykc, m10Var.f57573wkgbmnqykc) && this.f57570eablkybsjg == m10Var.f57570eablkybsjg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57571iobyxmoadg) * 31;
        Integer num = this.f57574zoijcleaow;
        int iHashCode2 = (Integer.hashCode(this.f57572ppxfxbqfkf) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Long l13 = this.f57573wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31;
        boolean z13 = this.f57570eablkybsjg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode3 + r13;
    }

    public final String toString() {
        return "ResendCodeStatusBtn(textRes=" + this.f57571iobyxmoadg + ", pluralsRes=" + this.f57574zoijcleaow + ", textColorRes=" + this.f57572ppxfxbqfkf + ", timerTick=" + this.f57573wkgbmnqykc + ", isClickable=" + this.f57570eablkybsjg + ")";
    }
}
