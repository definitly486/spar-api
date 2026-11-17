package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class rf0 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f58325iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final r0 f58326zoijcleaow;

    public rf0(gl mode, r0 preparedListOfCards) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(preparedListOfCards, "preparedListOfCards");
        this.f58325iobyxmoadg = mode;
        this.f58326zoijcleaow = preparedListOfCards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf0)) {
            return false;
        }
        rf0 rf0Var = (rf0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58325iobyxmoadg, rf0Var.f58325iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58326zoijcleaow, rf0Var.f58326zoijcleaow);
    }

    public final int hashCode() {
        return this.f58326zoijcleaow.hashCode() + (this.f58325iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "OrderScreenSelectCard(mode=" + this.f58325iobyxmoadg + ", preparedListOfCards=" + this.f58326zoijcleaow + ")";
    }
}
