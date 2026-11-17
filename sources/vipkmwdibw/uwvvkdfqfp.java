package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
final class uwvvkdfqfp implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f117314iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f117315zoijcleaow;

    public uwvvkdfqfp(gtknphoqwx gtknphoqwxVar, long j13) {
        this.f117314iobyxmoadg = gtknphoqwxVar;
        this.f117315zoijcleaow = j13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uwvvkdfqfp)) {
            return false;
        }
        uwvvkdfqfp uwvvkdfqfpVar = (uwvvkdfqfp) obj;
        return uwvvkdfqfpVar.f117315zoijcleaow == this.f117315zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uwvvkdfqfpVar.f117314iobyxmoadg, this.f117314iobyxmoadg);
    }

    public int hashCode() {
        return (this.f117314iobyxmoadg.hashCode() * 31) + Long.hashCode(this.f117315zoijcleaow);
    }

    @Override // vipkmwdibw.gtknphoqwx
    public q iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        return new yfnezrywwk(this.f117314iobyxmoadg.iobyxmoadg(ezmngbhpjkVar), this.f117315zoijcleaow);
    }
}
