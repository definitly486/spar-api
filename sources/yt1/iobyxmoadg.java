package yt1;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C3224iobyxmoadg f126484iobyxmoadg = C3224iobyxmoadg.f126485iobyxmoadg;

    /* JADX INFO: renamed from: yt1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3224iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C3224iobyxmoadg f126485iobyxmoadg = new C3224iobyxmoadg();

        /* JADX INFO: renamed from: yt1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3225iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final long f126486zoijcleaow = 7000;

            C3225iobyxmoadg() {
            }

            @Override // yt1.iobyxmoadg
            public long iobyxmoadg() {
                return this.f126486zoijcleaow;
            }
        }

        /* JADX INFO: renamed from: yt1.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ v2.esjtqupxsv f126487ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final long f126488zoijcleaow;

            zoijcleaow(v2.esjtqupxsv esjtqupxsvVar) {
                this.f126487ppxfxbqfkf = esjtqupxsvVar;
                this.f126488zoijcleaow = zg.gtknphoqwx.ojitshcjhn(esjtqupxsvVar.iobyxmoadg(), 0L, 60000L);
            }

            @Override // yt1.iobyxmoadg
            public long iobyxmoadg() {
                return this.f126488zoijcleaow;
            }

            @Override // yt1.iobyxmoadg
            public void start() {
                this.f126487ppxfxbqfkf.play();
            }

            @Override // yt1.iobyxmoadg
            public void stop() {
                this.f126487ppxfxbqfkf.pause();
            }

            @Override // yt1.iobyxmoadg
            public void zoijcleaow() {
                this.f126487ppxfxbqfkf.vipkmwdibw();
            }
        }

        private C3224iobyxmoadg() {
        }

        public final iobyxmoadg iobyxmoadg() {
            return new C3225iobyxmoadg();
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
