package h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends jztzpxfvev {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f38890ppxfxbqfkf;

    public /* synthetic */ f(long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && oipsdeybqn.ojitshcjhn(this.f38890ppxfxbqfkf, ((f) obj).f38890ppxfxbqfkf);
    }

    public int hashCode() {
        return oipsdeybqn.yggfygwlhe(this.f38890ppxfxbqfkf);
    }

    @Override // h.jztzpxfvev
    public void iobyxmoadg(long j13, ipoelvxyzq ipoelvxyzqVar, float f13) {
        long jWflxmlrfwp;
        ipoelvxyzqVar.eablkybsjg(1.0f);
        if (f13 == 1.0f) {
            jWflxmlrfwp = this.f38890ppxfxbqfkf;
        } else {
            long j14 = this.f38890ppxfxbqfkf;
            jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(j14, oipsdeybqn.rgvfuqvkyq(j14) * f13, 0.0f, 0.0f, 0.0f, 14, null);
        }
        ipoelvxyzqVar.wflxmlrfwp(jWflxmlrfwp);
        if (ipoelvxyzqVar.kcexrzcfyt() != null) {
            ipoelvxyzqVar.oxmwwwfdhm(null);
        }
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) oipsdeybqn.jyumaefscl(this.f38890ppxfxbqfkf)) + ')';
    }

    public final long zoijcleaow() {
        return this.f38890ppxfxbqfkf;
    }

    private f(long j13) {
        super(null);
        this.f38890ppxfxbqfkf = j13;
    }
}
