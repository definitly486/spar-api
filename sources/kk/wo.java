package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wo extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f59185iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final r0 f59186zoijcleaow;

    public wo(gl mode, r0 listOfCards) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listOfCards, "listOfCards");
        this.f59185iobyxmoadg = mode;
        this.f59186zoijcleaow = listOfCards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59185iobyxmoadg, woVar.f59185iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59186zoijcleaow, woVar.f59186zoijcleaow);
    }

    public final int hashCode() {
        return this.f59186zoijcleaow.hashCode() + (this.f59185iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSelectCardScreenEvent(mode=" + this.f59185iobyxmoadg + ", listOfCards=" + this.f59186zoijcleaow + ")";
    }
}
