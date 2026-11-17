package pd;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f76404iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f76405zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f76406iobyxmoadg = 60;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f76407zoijcleaow = com.google.firebase.remoteconfig.internal.wflxmlrfwp.f24800btonecajqb;

        public zoijcleaow eablkybsjg(long j13) {
            if (j13 >= 0) {
                this.f76407zoijcleaow = j13;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j13 + " is an invalid argument");
        }

        public gtknphoqwx ppxfxbqfkf() {
            return new gtknphoqwx(this);
        }

        public zoijcleaow wkgbmnqykc(long j13) {
            if (j13 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j13)));
            }
            this.f76406iobyxmoadg = j13;
            return this;
        }
    }

    public long iobyxmoadg() {
        return this.f76404iobyxmoadg;
    }

    public long zoijcleaow() {
        return this.f76405zoijcleaow;
    }

    private gtknphoqwx(zoijcleaow zoijcleaowVar) {
        this.f76404iobyxmoadg = zoijcleaowVar.f76406iobyxmoadg;
        this.f76405zoijcleaow = zoijcleaowVar.f76407zoijcleaow;
    }
}
