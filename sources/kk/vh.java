package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f59021iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ms f59022zoijcleaow;

    public vh(ms amount, ms msVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        this.f59021iobyxmoadg = amount;
        this.f59022zoijcleaow = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59021iobyxmoadg, vhVar.f59021iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59022zoijcleaow, vhVar.f59022zoijcleaow);
    }

    public final int hashCode() {
        int iHashCode = this.f59021iobyxmoadg.hashCode() * 31;
        ms msVar = this.f59022zoijcleaow;
        return iHashCode + (msVar == null ? 0 : msVar.hashCode());
    }

    public final String toString() {
        return "OrderAmountState(amount=" + this.f59021iobyxmoadg + ", oldAmount=" + this.f59022zoijcleaow + ")";
    }
}
