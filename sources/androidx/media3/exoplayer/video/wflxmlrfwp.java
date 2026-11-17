package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import v2.jpowsppfya;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public interface wflxmlrfwp {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Handler f11593iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wflxmlrfwp f11594zoijcleaow;

        public iobyxmoadg(Handler handler, wflxmlrfwp wflxmlrfwpVar) {
            this.f11593iobyxmoadg = wflxmlrfwpVar != null ? (Handler) y2.iobyxmoadg.eablkybsjg(handler) : null;
            this.f11594zoijcleaow = wflxmlrfwpVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cqumvgiudr(long j13, int i13) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).lereixgezr(j13, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void esjtqupxsv(Exception exc) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).ojitshcjhn(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void iwizpuwonk(Object obj, long j13) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).jyumaefscl(obj, j13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jyumaefscl(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).oxmwwwfdhm(iobyxmoadgVar, ppxfxbqfkfVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void kcexrzcfyt(f3.zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.ppxfxbqfkf();
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).cqumvgiudr(zoijcleaowVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lereixgezr(jpowsppfya jpowsppfyaVar) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).zoijcleaow(jpowsppfyaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void oxmwwwfdhm(String str) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).gxszxtbevo(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void vdvldrhtss(String str, long j13, long j14) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).lqeggnwhkg(str, j13, j14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void yggfygwlhe(f3.zoijcleaow zoijcleaowVar) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).kcexrzcfyt(zoijcleaowVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zdlpuopuiu(int i13, long j13) {
            ((wflxmlrfwp) stevsuqkhv.nufgyqmvbu(this.f11594zoijcleaow)).zdlpuopuiu(i13, j13);
        }

        public void agtfadlqog(final int i13, final long j13) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.ojitshcjhn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81559zdlpuopuiu.zdlpuopuiu(i13, j13);
                    }
                });
            }
        }

        public void cdpycssgdh(final jpowsppfya jpowsppfyaVar) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.gtknphoqwx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81540zdlpuopuiu.lereixgezr(jpowsppfyaVar);
                    }
                });
            }
        }

        public void draadjrbmk(final String str) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.agtfadlqog
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81490zdlpuopuiu.oxmwwwfdhm(str);
                    }
                });
            }
        }

        public void gtknphoqwx(final String str, final long j13, final long j14) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.btonecajqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81494zdlpuopuiu.vdvldrhtss(str, j13, j14);
                    }
                });
            }
        }

        public void istkbnxepw(final Exception exc) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.wflxmlrfwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81570zdlpuopuiu.esjtqupxsv(exc);
                    }
                });
            }
        }

        public void ojitshcjhn(final f3.zoijcleaow zoijcleaowVar) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.vdvldrhtss
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81568zdlpuopuiu.yggfygwlhe(zoijcleaowVar);
                    }
                });
            }
        }

        public void pmvmpeiblj(final Object obj) {
            if (this.f11593iobyxmoadg != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f11593iobyxmoadg.post(new Runnable() { // from class: r3.draadjrbmk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81497zdlpuopuiu.iwizpuwonk(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void rgvfuqvkyq(final androidx.media3.common.iobyxmoadg iobyxmoadgVar, final f3.ppxfxbqfkf ppxfxbqfkfVar) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.oxmwwwfdhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81562zdlpuopuiu.jyumaefscl(iobyxmoadgVar, ppxfxbqfkfVar);
                    }
                });
            }
        }

        public void wflxmlrfwp(final f3.zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.ppxfxbqfkf();
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.kcexrzcfyt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81556zdlpuopuiu.kcexrzcfyt(zoijcleaowVar);
                    }
                });
            }
        }

        public void zynmafqrjb(final long j13, final int i13) {
            Handler handler = this.f11593iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r3.rgvfuqvkyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81566zdlpuopuiu.cqumvgiudr(j13, i13);
                    }
                });
            }
        }
    }

    void cqumvgiudr(f3.zoijcleaow zoijcleaowVar);

    void gxszxtbevo(String str);

    void jyumaefscl(Object obj, long j13);

    void kcexrzcfyt(f3.zoijcleaow zoijcleaowVar);

    void lereixgezr(long j13, int i13);

    void lqeggnwhkg(String str, long j13, long j14);

    void ojitshcjhn(Exception exc);

    void oxmwwwfdhm(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar);

    void zdlpuopuiu(int i13, long j13);

    void zoijcleaow(jpowsppfya jpowsppfyaVar);
}
