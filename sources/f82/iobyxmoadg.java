package f82;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C0727iobyxmoadg f33180iobyxmoadg = C0727iobyxmoadg.f33181iobyxmoadg;

    /* JADX INFO: renamed from: f82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0727iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C0727iobyxmoadg f33181iobyxmoadg = new C0727iobyxmoadg();

        /* JADX INFO: renamed from: f82.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0728iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final long f33182zoijcleaow = 7000;

            C0728iobyxmoadg() {
            }

            @Override // f82.iobyxmoadg
            public long iobyxmoadg() {
                return this.f33182zoijcleaow;
            }
        }

        /* JADX INFO: renamed from: f82.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ v2.esjtqupxsv f33183ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final long f33184zoijcleaow;

            zoijcleaow(v2.esjtqupxsv esjtqupxsvVar) {
                this.f33183ppxfxbqfkf = esjtqupxsvVar;
                this.f33184zoijcleaow = zg.gtknphoqwx.ojitshcjhn(esjtqupxsvVar.iobyxmoadg(), 0L, 60000L);
            }

            @Override // f82.iobyxmoadg
            public long iobyxmoadg() {
                return this.f33184zoijcleaow;
            }

            @Override // f82.iobyxmoadg
            public void start() {
                this.f33183ppxfxbqfkf.play();
            }

            @Override // f82.iobyxmoadg
            public void stop() {
                this.f33183ppxfxbqfkf.pause();
            }

            @Override // f82.iobyxmoadg
            public void zoijcleaow() {
                this.f33183ppxfxbqfkf.vipkmwdibw();
            }
        }

        private C0727iobyxmoadg() {
        }

        public final iobyxmoadg iobyxmoadg() {
            return new C0728iobyxmoadg();
        }

        public final iobyxmoadg zoijcleaow(v2.esjtqupxsv player) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
            return new zoijcleaow(player);
        }
    }

    long iobyxmoadg();

    default void start() {
    }

    default void stop() {
    }

    default void zoijcleaow() {
    }
}
