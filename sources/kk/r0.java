package kk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ArrayList f58255iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f58256zoijcleaow;

    public r0(ArrayList cardsList, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardsList, "cardsList");
        this.f58255iobyxmoadg = cardsList;
        this.f58256zoijcleaow = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58255iobyxmoadg, r0Var.f58255iobyxmoadg) && this.f58256zoijcleaow == r0Var.f58256zoijcleaow;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58256zoijcleaow) + (this.f58255iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "CardsListData(cardsList=" + this.f58255iobyxmoadg + ", selectedCardPosition=" + this.f58256zoijcleaow + ")";
    }
}
