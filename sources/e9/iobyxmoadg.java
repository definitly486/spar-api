package e9;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f30965iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zoijcleaow f30966ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f30967zoijcleaow;

    /* JADX INFO: renamed from: e9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C0651iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f30968iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f30969zoijcleaow;

        public C0651iobyxmoadg() {
            this(300);
        }

        public iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg(this.f30968iobyxmoadg, this.f30969zoijcleaow);
        }

        public C0651iobyxmoadg(int i13) {
            this.f30968iobyxmoadg = i13;
        }
    }

    protected iobyxmoadg(int i13, boolean z13) {
        this.f30965iobyxmoadg = i13;
        this.f30967zoijcleaow = z13;
    }

    private wkgbmnqykc zoijcleaow() {
        if (this.f30966ppxfxbqfkf == null) {
            this.f30966ppxfxbqfkf = new zoijcleaow(this.f30965iobyxmoadg, this.f30967zoijcleaow);
        }
        return this.f30966ppxfxbqfkf;
    }

    @Override // e9.eablkybsjg
    public wkgbmnqykc iobyxmoadg(l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return iobyxmoadgVar == l8.iobyxmoadg.MEMORY_CACHE ? ppxfxbqfkf.zoijcleaow() : zoijcleaow();
    }
}
