package g3;

import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final long f36118btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final long f36119dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final long f36120eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final v2.cdpycssgdh f36121gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f36122iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f36123lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f36124nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f36125ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f36126wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final v2.cdpycssgdh f36127zoijcleaow;

        public iobyxmoadg(long j13, v2.cdpycssgdh cdpycssgdhVar, int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j14, v2.cdpycssgdh cdpycssgdhVar2, int i14, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2, long j15, long j16) {
            this.f36122iobyxmoadg = j13;
            this.f36127zoijcleaow = cdpycssgdhVar;
            this.f36125ppxfxbqfkf = i13;
            this.f36126wkgbmnqykc = zoijcleaowVar;
            this.f36120eablkybsjg = j14;
            this.f36121gxszxtbevo = cdpycssgdhVar2;
            this.f36123lqeggnwhkg = i14;
            this.f36124nufgyqmvbu = zoijcleaowVar2;
            this.f36119dxjokdxxww = j15;
            this.f36118btonecajqb = j16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f36122iobyxmoadg == iobyxmoadgVar.f36122iobyxmoadg && this.f36125ppxfxbqfkf == iobyxmoadgVar.f36125ppxfxbqfkf && this.f36120eablkybsjg == iobyxmoadgVar.f36120eablkybsjg && this.f36123lqeggnwhkg == iobyxmoadgVar.f36123lqeggnwhkg && this.f36119dxjokdxxww == iobyxmoadgVar.f36119dxjokdxxww && this.f36118btonecajqb == iobyxmoadgVar.f36118btonecajqb && Objects.equals(this.f36127zoijcleaow, iobyxmoadgVar.f36127zoijcleaow) && Objects.equals(this.f36126wkgbmnqykc, iobyxmoadgVar.f36126wkgbmnqykc) && Objects.equals(this.f36121gxszxtbevo, iobyxmoadgVar.f36121gxszxtbevo) && Objects.equals(this.f36124nufgyqmvbu, iobyxmoadgVar.f36124nufgyqmvbu);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f36122iobyxmoadg), this.f36127zoijcleaow, Integer.valueOf(this.f36125ppxfxbqfkf), this.f36126wkgbmnqykc, Long.valueOf(this.f36120eablkybsjg), this.f36121gxszxtbevo, Integer.valueOf(this.f36123lqeggnwhkg), this.f36124nufgyqmvbu, Long.valueOf(this.f36119dxjokdxxww), Long.valueOf(this.f36118btonecajqb));
        }
    }

    /* JADX INFO: renamed from: g3.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0813zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v2.rgvfuqvkyq f36128iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SparseArray f36129zoijcleaow;

        public C0813zoijcleaow(v2.rgvfuqvkyq rgvfuqvkyqVar, SparseArray sparseArray) {
            this.f36128iobyxmoadg = rgvfuqvkyqVar;
            SparseArray sparseArray2 = new SparseArray(rgvfuqvkyqVar.wkgbmnqykc());
            for (int i13 = 0; i13 < rgvfuqvkyqVar.wkgbmnqykc(); i13++) {
                int iPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf(i13);
                sparseArray2.append(iPpxfxbqfkf, (iobyxmoadg) y2.iobyxmoadg.eablkybsjg((iobyxmoadg) sparseArray.get(iPpxfxbqfkf)));
            }
            this.f36129zoijcleaow = sparseArray2;
        }

        public boolean iobyxmoadg(int i13) {
            return this.f36128iobyxmoadg.iobyxmoadg(i13);
        }

        public iobyxmoadg ppxfxbqfkf(int i13) {
            return (iobyxmoadg) y2.iobyxmoadg.eablkybsjg((iobyxmoadg) this.f36129zoijcleaow.get(i13));
        }

        public int wkgbmnqykc() {
            return this.f36128iobyxmoadg.wkgbmnqykc();
        }

        public int zoijcleaow(int i13) {
            return this.f36128iobyxmoadg.ppxfxbqfkf(i13);
        }
    }

    void agtfadlqog(iobyxmoadg iobyxmoadgVar, v2.jpowsppfya jpowsppfyaVar);

    void bfopjjpdmp(iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13);

    default void btonecajqb(iobyxmoadg iobyxmoadgVar, Exception exc) {
    }

    default void cdpycssgdh(iobyxmoadg iobyxmoadgVar) {
    }

    default void cllcsxoeiz(iobyxmoadg iobyxmoadgVar, Exception exc) {
    }

    default void cqumvgiudr(iobyxmoadg iobyxmoadgVar, String str, long j13, long j14) {
    }

    void crxdokpmqz(iobyxmoadg iobyxmoadgVar, int i13, long j13, long j14);

    default void czzsidtyhn(iobyxmoadg iobyxmoadgVar, int i13, int i14, boolean z13) {
    }

    default void draadjrbmk(iobyxmoadg iobyxmoadgVar, int i13, long j13) {
    }

    default void dsvhmnatus(iobyxmoadg iobyxmoadgVar, long j13, int i13) {
    }

    default void dxjokdxxww(iobyxmoadg iobyxmoadgVar, List list) {
    }

    default void eablkybsjg(iobyxmoadg iobyxmoadgVar, long j13) {
    }

    void esjtqupxsv(iobyxmoadg iobyxmoadgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, int i13);

    default void gtknphoqwx(iobyxmoadg iobyxmoadgVar, v2.jyumaefscl jyumaefsclVar) {
    }

    default void gxszxtbevo(iobyxmoadg iobyxmoadgVar, int i13, boolean z13) {
    }

    default void hcddaimhww(iobyxmoadg iobyxmoadgVar, boolean z13) {
    }

    default void hkdspvbjdz(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void ikoacuggdj(iobyxmoadg iobyxmoadgVar, f3.zoijcleaow zoijcleaowVar) {
    }

    default void iobyxmoadg(iobyxmoadg iobyxmoadgVar, x2.zoijcleaow zoijcleaowVar) {
    }

    default void iozdgvuglv(iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2, f3.ppxfxbqfkf ppxfxbqfkfVar) {
    }

    default void istkbnxepw(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void iwizpuwonk(iobyxmoadg iobyxmoadgVar, f3.zoijcleaow zoijcleaowVar) {
    }

    default void iyctptxqzt(iobyxmoadg iobyxmoadgVar, Object obj, long j13) {
    }

    default void jhduphickx(iobyxmoadg iobyxmoadgVar, String str) {
    }

    default void jlmebxxoox(iobyxmoadg iobyxmoadgVar, boolean z13, int i13) {
    }

    default void jpowsppfya(iobyxmoadg iobyxmoadgVar, AudioSink.iobyxmoadg iobyxmoadgVar2) {
    }

    default void jyumaefscl(iobyxmoadg iobyxmoadgVar, boolean z13) {
    }

    default void jztzpxfvev(iobyxmoadg iobyxmoadgVar) {
    }

    default void kcexrzcfyt(iobyxmoadg iobyxmoadgVar, v2.kcexrzcfyt kcexrzcfytVar, int i13) {
    }

    default void kegysxyocb(iobyxmoadg iobyxmoadgVar, v2.wwaezpbzkn wwaezpbzknVar) {
    }

    default void lmojexxdyd(iobyxmoadg iobyxmoadgVar) {
    }

    default void lqeggnwhkg(iobyxmoadg iobyxmoadgVar, boolean z13) {
    }

    default void lrnfpwlwnk(iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2, f3.ppxfxbqfkf ppxfxbqfkfVar) {
    }

    default void mbcevpiqjq(iobyxmoadg iobyxmoadgVar, int i13, int i14, int i15, float f13) {
    }

    default void metgxyhuhe(iobyxmoadg iobyxmoadgVar, f3.zoijcleaow zoijcleaowVar) {
    }

    default void ntlheqmsrt(iobyxmoadg iobyxmoadgVar, AudioSink.iobyxmoadg iobyxmoadgVar2) {
    }

    default void nufgyqmvbu(iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
    }

    default void nuxfzjnpeb(iobyxmoadg iobyxmoadgVar, v2.esjtqupxsv.zoijcleaow zoijcleaowVar) {
    }

    default void oipsdeybqn(iobyxmoadg iobyxmoadgVar, v2.yggfygwlhe yggfygwlheVar) {
    }

    default void ojitshcjhn(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void okpsazkaxt(iobyxmoadg iobyxmoadgVar, String str, long j13) {
    }

    default void opjhrmiecq(iobyxmoadg iobyxmoadgVar) {
    }

    default void oxmwwwfdhm(iobyxmoadg iobyxmoadgVar, int i13, long j13, long j14) {
    }

    default void pmvmpeiblj(iobyxmoadg iobyxmoadgVar, PlaybackException playbackException) {
    }

    default void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
    }

    default void rgvfuqvkyq(iobyxmoadg iobyxmoadgVar, String str, long j13) {
    }

    default void ribwqtqdhb(iobyxmoadg iobyxmoadgVar, boolean z13, int i13) {
    }

    default void sflfametgt(iobyxmoadg iobyxmoadgVar, v2.wflxmlrfwp wflxmlrfwpVar) {
    }

    default void sopmlzcsov(iobyxmoadg iobyxmoadgVar, String str) {
    }

    default void stevsuqkhv(iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i13) {
    }

    default void tzroggbefp(iobyxmoadg iobyxmoadgVar, v2.cqumvgiudr cqumvgiudrVar) {
    }

    void ulzqkzuiru(v2.esjtqupxsv esjtqupxsvVar, C0813zoijcleaow c0813zoijcleaow);

    void uwvvkdfqfp(iobyxmoadg iobyxmoadgVar, PlaybackException playbackException);

    default void vdvldrhtss(iobyxmoadg iobyxmoadgVar, Exception exc) {
    }

    default void vipkmwdibw(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void weqkydbzbr(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, long j13, long j14) {
    }

    void wwaezpbzkn(iobyxmoadg iobyxmoadgVar, f3.zoijcleaow zoijcleaowVar);

    void wypolnanlu(iobyxmoadg iobyxmoadgVar, m3.btonecajqb btonecajqbVar);

    default void xrmfcynszj(iobyxmoadg iobyxmoadgVar) {
    }

    default void yadqdtsiqt(iobyxmoadg iobyxmoadgVar, int i13, int i14) {
    }

    default void ydmasvzmpa(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void yfnezrywwk(iobyxmoadg iobyxmoadgVar, v2.lmojexxdyd lmojexxdydVar) {
    }

    default void yggfygwlhe(iobyxmoadg iobyxmoadgVar) {
    }

    default void ylkuphrtab(iobyxmoadg iobyxmoadgVar, boolean z13) {
    }

    default void zdlpuopuiu(iobyxmoadg iobyxmoadgVar, boolean z13) {
    }

    default void zeieaojujs(iobyxmoadg iobyxmoadgVar) {
    }

    default void zfvoamnweg(iobyxmoadg iobyxmoadgVar, int i13) {
    }

    default void zoijcleaow(iobyxmoadg iobyxmoadgVar, Exception exc) {
    }

    default void zynmafqrjb(iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
    }
}
