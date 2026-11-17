package o9;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Integer f72344iobyxmoadg;

    zoijcleaow(Integer num) {
        this.f72344iobyxmoadg = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        Integer num = this.f72344iobyxmoadg;
        Integer numIobyxmoadg = ((lqeggnwhkg) obj).iobyxmoadg();
        if (num == null) {
            return numIobyxmoadg == null;
        }
        return num.equals(numIobyxmoadg);
    }

    public int hashCode() {
        Integer num = this.f72344iobyxmoadg;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    @Override // o9.lqeggnwhkg
    public Integer iobyxmoadg() {
        return this.f72344iobyxmoadg;
    }

    public String toString() {
        return "ProductData{productId=" + this.f72344iobyxmoadg + "}";
    }
}
