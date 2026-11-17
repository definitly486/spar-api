package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class el {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f56435iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final rt f56436zoijcleaow;

    public el(ms amount, rt merchantName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantName, "merchantName");
        this.f56435iobyxmoadg = amount;
        this.f56436zoijcleaow = merchantName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56435iobyxmoadg, elVar.f56435iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56436zoijcleaow, elVar.f56436zoijcleaow);
    }

    public final int hashCode() {
        return this.f56436zoijcleaow.hashCode() + (this.f56435iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "OrderData(amount=" + this.f56435iobyxmoadg + ", merchantName=" + this.f56436zoijcleaow + ")";
    }
}
