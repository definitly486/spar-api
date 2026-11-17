package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class qe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final vu f58180iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final vu f58181ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final vu f58182wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f58183zoijcleaow;

    public qe(vu amount, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        this.f58180iobyxmoadg = amount;
        this.f58183zoijcleaow = j13;
        this.f58181ppxfxbqfkf = null;
        this.f58182wkgbmnqykc = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58180iobyxmoadg, qeVar.f58180iobyxmoadg) && this.f58183zoijcleaow == qeVar.f58183zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58181ppxfxbqfkf, qeVar.f58181ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58182wkgbmnqykc, qeVar.f58182wkgbmnqykc);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f58183zoijcleaow) + (this.f58180iobyxmoadg.hashCode() * 31)) * 31;
        vu vuVar = this.f58181ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (vuVar == null ? 0 : vuVar.hashCode())) * 31;
        vu vuVar2 = this.f58182wkgbmnqykc;
        return iHashCode2 + (vuVar2 != null ? vuVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentAmountItem(amount=" + this.f58180iobyxmoadg + ", longAmount=" + this.f58183zoijcleaow + ", oldAmount=" + this.f58181ppxfxbqfkf + ", details=" + this.f58182wkgbmnqykc + ")";
    }

    public qe(vu amount, long j13, vu vuVar, vu vuVar2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        this.f58180iobyxmoadg = amount;
        this.f58183zoijcleaow = j13;
        this.f58181ppxfxbqfkf = vuVar;
        this.f58182wkgbmnqykc = vuVar2;
    }
}
