package q4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface oxmwwwfdhm {

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f77831iobyxmoadg = new C1740iobyxmoadg();

        /* JADX INFO: renamed from: q4.oxmwwwfdhm$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C1740iobyxmoadg implements iobyxmoadg {
            C1740iobyxmoadg() {
            }

            @Override // q4.oxmwwwfdhm.iobyxmoadg
            public boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
                return false;
            }

            @Override // q4.oxmwwwfdhm.iobyxmoadg
            public oxmwwwfdhm ppxfxbqfkf(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // q4.oxmwwwfdhm.iobyxmoadg
            public int zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
                return 1;
            }
        }

        boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

        oxmwwwfdhm ppxfxbqfkf(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

        int zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar);
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow f77832ppxfxbqfkf = new zoijcleaow(-9223372036854775807L, false);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f77833iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f77834zoijcleaow;

        private zoijcleaow(long j13, boolean z13) {
            this.f77833iobyxmoadg = j13;
            this.f77834zoijcleaow = z13;
        }

        public static zoijcleaow ppxfxbqfkf(long j13) {
            return new zoijcleaow(j13, true);
        }

        public static zoijcleaow zoijcleaow() {
            return f77832ppxfxbqfkf;
        }
    }

    default gtknphoqwx iobyxmoadg(byte[] bArr, int i13, int i14) {
        final com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
        zoijcleaow zoijcleaowVar = zoijcleaow.f77832ppxfxbqfkf;
        Objects.requireNonNull(iobyxmoadgVarKcexrzcfyt);
        ppxfxbqfkf(bArr, i13, i14, zoijcleaowVar, new y2.wflxmlrfwp() { // from class: q4.vdvldrhtss
            @Override // y2.wflxmlrfwp
            public final void accept(Object obj) {
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg((eablkybsjg) obj);
            }
        });
        return new lqeggnwhkg(iobyxmoadgVarKcexrzcfyt.gtknphoqwx());
    }

    void ppxfxbqfkf(byte[] bArr, int i13, int i14, zoijcleaow zoijcleaowVar, y2.wflxmlrfwp wflxmlrfwpVar);

    int wkgbmnqykc();

    default void zoijcleaow() {
    }
}
