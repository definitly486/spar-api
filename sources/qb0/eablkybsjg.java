package qb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final z02.zoijcleaow f78385iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f78386zoijcleaow;

    public eablkybsjg(z02.zoijcleaow reviewRating, int i13) {
        zdlpuopuiu.btonecajqb(reviewRating, "reviewRating");
        this.f78385iobyxmoadg = reviewRating;
        this.f78386zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f78385iobyxmoadg == eablkybsjgVar.f78385iobyxmoadg && this.f78386zoijcleaow == eablkybsjgVar.f78386zoijcleaow;
    }

    public int hashCode() {
        return (this.f78385iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f78386zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f78386zoijcleaow;
    }

    public String toString() {
        return "ReviewRatingUiModel(reviewRating=" + this.f78385iobyxmoadg + ", progressValue=" + this.f78386zoijcleaow + ")";
    }

    public final z02.zoijcleaow zoijcleaow() {
        return this.f78385iobyxmoadg;
    }
}
