package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f19037iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f19038zoijcleaow;

    public yadqdtsiqt(long j13, long j14) {
        this.f19037iobyxmoadg = j13;
        this.f19038zoijcleaow = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yadqdtsiqt)) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        return this.f19037iobyxmoadg == yadqdtsiqtVar.f19037iobyxmoadg && this.f19038zoijcleaow == yadqdtsiqtVar.f19038zoijcleaow;
    }

    public int hashCode() {
        return (Long.hashCode(this.f19037iobyxmoadg) * 31) + Long.hashCode(this.f19038zoijcleaow);
    }

    public final long iobyxmoadg() {
        return this.f19037iobyxmoadg;
    }

    public String toString() {
        return "SpecialBannerEvropolisRefs(secondsBeforeEnd=" + this.f19037iobyxmoadg + ", secondsBeforeRedeemEnd=" + this.f19038zoijcleaow + ")";
    }

    public final long zoijcleaow() {
        return this.f19038zoijcleaow;
    }
}
