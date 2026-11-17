package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f58110iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ms f58111zoijcleaow;

    public ppxfxbqfkf(ms amount, ms msVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        this.f58110iobyxmoadg = amount;
        this.f58111zoijcleaow = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58110iobyxmoadg, ppxfxbqfkfVar.f58110iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58111zoijcleaow, ppxfxbqfkfVar.f58111zoijcleaow);
    }

    public final int hashCode() {
        return this.f58111zoijcleaow.hashCode() + (this.f58110iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "BnplPaymentItem(amount=" + this.f58110iobyxmoadg + ", details=" + this.f58111zoijcleaow + ")";
    }
}
