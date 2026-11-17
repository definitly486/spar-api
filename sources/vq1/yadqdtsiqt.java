package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f117957iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f117958zoijcleaow;

    public yadqdtsiqt(long j13, long j14) {
        this.f117957iobyxmoadg = j13;
        this.f117958zoijcleaow = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yadqdtsiqt)) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        return this.f117957iobyxmoadg == yadqdtsiqtVar.f117957iobyxmoadg && this.f117958zoijcleaow == yadqdtsiqtVar.f117958zoijcleaow;
    }

    public int hashCode() {
        return (Long.hashCode(this.f117957iobyxmoadg) * 31) + Long.hashCode(this.f117958zoijcleaow);
    }

    public final long iobyxmoadg() {
        return this.f117957iobyxmoadg;
    }

    public String toString() {
        return "SpecialBannerEvropolisRefs(secondsBeforeEnd=" + this.f117957iobyxmoadg + ", secondsBeforeRedeemEnd=" + this.f117958zoijcleaow + ")";
    }

    public final long zoijcleaow() {
        return this.f117958zoijcleaow;
    }
}
