package p91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qm1.zoijcleaow f76219iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f76220zoijcleaow;

    public eablkybsjg(qm1.zoijcleaow reviewRating, int i13) {
        zdlpuopuiu.btonecajqb(reviewRating, "reviewRating");
        this.f76219iobyxmoadg = reviewRating;
        this.f76220zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f76219iobyxmoadg == eablkybsjgVar.f76219iobyxmoadg && this.f76220zoijcleaow == eablkybsjgVar.f76220zoijcleaow;
    }

    public int hashCode() {
        return (this.f76219iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f76220zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f76220zoijcleaow;
    }

    public String toString() {
        return "ReviewRatingUiModel(reviewRating=" + this.f76219iobyxmoadg + ", progressValue=" + this.f76220zoijcleaow + ")";
    }

    public final qm1.zoijcleaow zoijcleaow() {
        return this.f76219iobyxmoadg;
    }
}
