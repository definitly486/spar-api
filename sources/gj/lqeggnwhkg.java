package gj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f37560iobyxmoadg;

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f37561zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(false, null);
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f37562zoijcleaow = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(true, null);
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37563zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String error) {
            super(false, null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f37563zoijcleaow = error;
        }
    }

    public /* synthetic */ lqeggnwhkg(boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(z13);
    }

    public final boolean iobyxmoadg() {
        return this.f37560iobyxmoadg;
    }

    private lqeggnwhkg(boolean z13) {
        this.f37560iobyxmoadg = z13;
    }
}
