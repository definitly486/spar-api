package v2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public interface esjtqupxsv {

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final int f115342btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final int f115343dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final Object f115344eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f115345gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Object f115346iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final long f115347lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final long f115348nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f115349ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final kcexrzcfyt f115350wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f115351zoijcleaow;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        static final String f115337gtknphoqwx = stevsuqkhv.uawqvzlxes(0);

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private static final String f115336draadjrbmk = stevsuqkhv.uawqvzlxes(1);

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        static final String f115341wflxmlrfwp = stevsuqkhv.uawqvzlxes(2);

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        static final String f115335agtfadlqog = stevsuqkhv.uawqvzlxes(3);

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        static final String f115338ojitshcjhn = stevsuqkhv.uawqvzlxes(4);

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private static final String f115339rgvfuqvkyq = stevsuqkhv.uawqvzlxes(5);

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private static final String f115340vdvldrhtss = stevsuqkhv.uawqvzlxes(6);

        public eablkybsjg(Object obj, int i13, kcexrzcfyt kcexrzcfytVar, Object obj2, int i14, long j13, long j14, int i15, int i16) {
            this.f115346iobyxmoadg = obj;
            this.f115351zoijcleaow = i13;
            this.f115349ppxfxbqfkf = i13;
            this.f115350wkgbmnqykc = kcexrzcfytVar;
            this.f115344eablkybsjg = obj2;
            this.f115345gxszxtbevo = i14;
            this.f115347lqeggnwhkg = j13;
            this.f115348nufgyqmvbu = j14;
            this.f115343dxjokdxxww = i15;
            this.f115342btonecajqb = i16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || eablkybsjg.class != obj.getClass()) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return iobyxmoadg(eablkybsjgVar) && Objects.equals(this.f115346iobyxmoadg, eablkybsjgVar.f115346iobyxmoadg) && Objects.equals(this.f115344eablkybsjg, eablkybsjgVar.f115344eablkybsjg);
        }

        public int hashCode() {
            return Objects.hash(this.f115346iobyxmoadg, Integer.valueOf(this.f115349ppxfxbqfkf), this.f115350wkgbmnqykc, this.f115344eablkybsjg, Integer.valueOf(this.f115345gxszxtbevo), Long.valueOf(this.f115347lqeggnwhkg), Long.valueOf(this.f115348nufgyqmvbu), Integer.valueOf(this.f115343dxjokdxxww), Integer.valueOf(this.f115342btonecajqb));
        }

        public boolean iobyxmoadg(eablkybsjg eablkybsjgVar) {
            return this.f115349ppxfxbqfkf == eablkybsjgVar.f115349ppxfxbqfkf && this.f115345gxszxtbevo == eablkybsjgVar.f115345gxszxtbevo && this.f115347lqeggnwhkg == eablkybsjgVar.f115347lqeggnwhkg && this.f115348nufgyqmvbu == eablkybsjgVar.f115348nufgyqmvbu && this.f115343dxjokdxxww == eablkybsjgVar.f115343dxjokdxxww && this.f115342btonecajqb == eablkybsjgVar.f115342btonecajqb && Objects.equals(this.f115350wkgbmnqykc, eablkybsjgVar.f115350wkgbmnqykc);
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rgvfuqvkyq f115352iobyxmoadg;

        public ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f115352iobyxmoadg = rgvfuqvkyqVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ppxfxbqfkf) {
                return this.f115352iobyxmoadg.equals(((ppxfxbqfkf) obj).f115352iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f115352iobyxmoadg.hashCode();
        }

        public boolean iobyxmoadg(int i13) {
            return this.f115352iobyxmoadg.iobyxmoadg(i13);
        }

        public boolean zoijcleaow(int... iArr) {
            return this.f115352iobyxmoadg.zoijcleaow(iArr);
        }
    }

    public interface wkgbmnqykc {
        default void bfopjjpdmp(boolean z13) {
        }

        default void cllcsxoeiz() {
        }

        default void czzsidtyhn(int i13) {
        }

        default void draadjrbmk(x2.zoijcleaow zoijcleaowVar) {
        }

        default void hcddaimhww(int i13, boolean z13) {
        }

        default void iozdgvuglv(int i13) {
        }

        default void jhduphickx(wflxmlrfwp wflxmlrfwpVar) {
        }

        default void jlmebxxoox(zoijcleaow zoijcleaowVar) {
        }

        default void jpowsppfya(yggfygwlhe yggfygwlheVar) {
        }

        default void kegysxyocb(kcexrzcfyt kcexrzcfytVar, int i13) {
        }

        default void metgxyhuhe(boolean z13, int i13) {
        }

        default void ntlheqmsrt(PlaybackException playbackException) {
        }

        default void nufgyqmvbu(cqumvgiudr cqumvgiudrVar) {
        }

        default void oipsdeybqn(esjtqupxsv esjtqupxsvVar, ppxfxbqfkf ppxfxbqfkfVar) {
        }

        default void okpsazkaxt(boolean z13) {
        }

        default void pmvmpeiblj(int i13) {
        }

        default void rlfsiqarku(eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2, int i13) {
        }

        default void ulzqkzuiru(int i13, int i14) {
        }

        default void uwvvkdfqfp(PlaybackException playbackException) {
        }

        default void vipkmwdibw(int i13) {
        }

        default void wflxmlrfwp(List list) {
        }

        default void wkgbmnqykc(boolean z13) {
        }

        default void wwaezpbzkn(lmojexxdyd lmojexxdydVar) {
        }

        default void wypolnanlu(wwaezpbzkn wwaezpbzknVar) {
        }

        default void yadqdtsiqt(int i13) {
        }

        default void ydmasvzmpa(boolean z13, int i13) {
        }

        default void yfnezrywwk(cdpycssgdh cdpycssgdhVar, int i13) {
        }

        default void yggfygwlhe(jyumaefscl jyumaefsclVar) {
        }

        default void ylkuphrtab(boolean z13) {
        }

        default void zoijcleaow(jpowsppfya jpowsppfyaVar) {
        }

        default void zynmafqrjb(boolean z13) {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rgvfuqvkyq f115355iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f115354zoijcleaow = new iobyxmoadg().eablkybsjg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final String f115353ppxfxbqfkf = stevsuqkhv.uawqvzlxes(0);

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private static final int[] f115356zoijcleaow = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final rgvfuqvkyq.zoijcleaow f115357iobyxmoadg = new rgvfuqvkyq.zoijcleaow();

            public zoijcleaow eablkybsjg() {
                return new zoijcleaow(this.f115357iobyxmoadg.eablkybsjg());
            }

            public iobyxmoadg iobyxmoadg(int i13) {
                this.f115357iobyxmoadg.iobyxmoadg(i13);
                return this;
            }

            public iobyxmoadg ppxfxbqfkf(int... iArr) {
                this.f115357iobyxmoadg.ppxfxbqfkf(iArr);
                return this;
            }

            public iobyxmoadg wkgbmnqykc(int i13, boolean z13) {
                this.f115357iobyxmoadg.wkgbmnqykc(i13, z13);
                return this;
            }

            public iobyxmoadg zoijcleaow(zoijcleaow zoijcleaowVar) {
                this.f115357iobyxmoadg.zoijcleaow(zoijcleaowVar.f115355iobyxmoadg);
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zoijcleaow) {
                return this.f115355iobyxmoadg.equals(((zoijcleaow) obj).f115355iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f115355iobyxmoadg.hashCode();
        }

        public boolean zoijcleaow(int i13) {
            return this.f115355iobyxmoadg.iobyxmoadg(i13);
        }

        private zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f115355iobyxmoadg = rgvfuqvkyqVar;
        }
    }

    void agtfadlqog(kcexrzcfyt kcexrzcfytVar);

    void btonecajqb(SurfaceView surfaceView);

    zoijcleaow cdpycssgdh();

    int cllcsxoeiz();

    lmojexxdyd cqumvgiudr();

    boolean crxdokpmqz();

    PlaybackException draadjrbmk();

    void dsvhmnatus(long j13);

    void dxjokdxxww(List list, boolean z13);

    void eablkybsjg(cqumvgiudr cqumvgiudrVar);

    void esjtqupxsv();

    void gtknphoqwx();

    void gxszxtbevo();

    void hcddaimhww(TextureView textureView);

    boolean hkdspvbjdz();

    long ikoacuggdj();

    long iobyxmoadg();

    boolean iozdgvuglv();

    void istkbnxepw(int i13, long j13);

    Looper iwizpuwonk();

    yggfygwlhe jhduphickx();

    long jlmebxxoox();

    jpowsppfya jpowsppfya();

    cdpycssgdh jyumaefscl();

    boolean jztzpxfvev();

    boolean kcexrzcfyt(int i13);

    boolean kegysxyocb();

    void lereixgezr(TextureView textureView);

    void lmojexxdyd(boolean z13);

    cqumvgiudr lqeggnwhkg();

    int mbcevpiqjq();

    void ntlheqmsrt(int i13);

    boolean nufgyqmvbu();

    wwaezpbzkn ojitshcjhn();

    long okpsazkaxt();

    int oxmwwwfdhm();

    void pause();

    int pkzmftpjix();

    void play();

    void pmvmpeiblj(wkgbmnqykc wkgbmnqykcVar);

    boolean ppxfxbqfkf();

    void release();

    boolean rgvfuqvkyq();

    void ribwqtqdhb();

    int sopmlzcsov();

    long stevsuqkhv();

    int tzroggbefp();

    void ulzqkzuiru(SurfaceView surfaceView);

    x2.zoijcleaow vdvldrhtss();

    void vipkmwdibw();

    void wflxmlrfwp(boolean z13);

    long wkgbmnqykc();

    long wwaezpbzkn();

    long wypolnanlu();

    void yadqdtsiqt(lmojexxdyd lmojexxdydVar);

    int yggfygwlhe();

    long ylkuphrtab();

    boolean zdlpuopuiu();

    void zoijcleaow();

    void zynmafqrjb(wkgbmnqykc wkgbmnqykcVar);
}
