package androidx.media3.exoplayer.audio;

import android.os.Handler;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Handler f10205iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final eablkybsjg f10206zoijcleaow;

        public iobyxmoadg(Handler handler, eablkybsjg eablkybsjgVar) {
            this.f10205iobyxmoadg = eablkybsjgVar != null ? (Handler) y2.iobyxmoadg.eablkybsjg(handler) : null;
            this.f10206zoijcleaow = eablkybsjgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cdpycssgdh(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).rgvfuqvkyq(iobyxmoadgVar, ppxfxbqfkfVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cqumvgiudr(AudioSink.iobyxmoadg iobyxmoadgVar) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).iobyxmoadg(iobyxmoadgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void esjtqupxsv(AudioSink.iobyxmoadg iobyxmoadgVar) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).ppxfxbqfkf(iobyxmoadgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void iozdgvuglv(boolean z13) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).wkgbmnqykc(z13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void istkbnxepw(f3.zoijcleaow zoijcleaowVar) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).dxjokdxxww(zoijcleaowVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void iwizpuwonk(Exception exc) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).eablkybsjg(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jyumaefscl(Exception exc) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).iwizpuwonk(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lereixgezr(String str, long j13, long j14) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).gtknphoqwx(str, j13, j14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lmojexxdyd(int i13, long j13, long j14) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).esjtqupxsv(i13, j13, j14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void pmvmpeiblj(String str) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).btonecajqb(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void yadqdtsiqt(long j13) {
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).agtfadlqog(j13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zynmafqrjb(f3.zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.ppxfxbqfkf();
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10206zoijcleaow)).vdvldrhtss(zoijcleaowVar);
        }

        public void agtfadlqog(final Exception exc) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.agtfadlqog
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39228zdlpuopuiu.iwizpuwonk(exc);
                    }
                });
            }
        }

        public void kcexrzcfyt(final f3.zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.ppxfxbqfkf();
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.rgvfuqvkyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39272zdlpuopuiu.zynmafqrjb(zoijcleaowVar);
                    }
                });
            }
        }

        public void ojitshcjhn(final AudioSink.iobyxmoadg iobyxmoadgVar) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.btonecajqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39230zdlpuopuiu.cqumvgiudr(iobyxmoadgVar);
                    }
                });
            }
        }

        public void oxmwwwfdhm(final String str) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.draadjrbmk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39232zdlpuopuiu.pmvmpeiblj(str);
                    }
                });
            }
        }

        public void pkzmftpjix(final int i13, final long j13, final long j14) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.oxmwwwfdhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39255zdlpuopuiu.lmojexxdyd(i13, j13, j14);
                    }
                });
            }
        }

        public void rgvfuqvkyq(final AudioSink.iobyxmoadg iobyxmoadgVar) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.kcexrzcfyt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39245zdlpuopuiu.esjtqupxsv(iobyxmoadgVar);
                    }
                });
            }
        }

        public void vdvldrhtss(final String str, final long j13, final long j14) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.gtknphoqwx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39242zdlpuopuiu.lereixgezr(str, j13, j14);
                    }
                });
            }
        }

        public void wflxmlrfwp(final Exception exc) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.nufgyqmvbu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39248zdlpuopuiu.jyumaefscl(exc);
                    }
                });
            }
        }

        public void wwaezpbzkn(final long j13) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.vdvldrhtss
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39274zdlpuopuiu.yadqdtsiqt(j13);
                    }
                });
            }
        }

        public void yggfygwlhe(final androidx.media3.common.iobyxmoadg iobyxmoadgVar, final f3.ppxfxbqfkf ppxfxbqfkfVar) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.ojitshcjhn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39251zdlpuopuiu.cdpycssgdh(iobyxmoadgVar, ppxfxbqfkfVar);
                    }
                });
            }
        }

        public void ylkuphrtab(final boolean z13) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.dxjokdxxww
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39234zdlpuopuiu.iozdgvuglv(z13);
                    }
                });
            }
        }

        public void zdlpuopuiu(final f3.zoijcleaow zoijcleaowVar) {
            Handler handler = this.f10205iobyxmoadg;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h3.wflxmlrfwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39276zdlpuopuiu.istkbnxepw(zoijcleaowVar);
                    }
                });
            }
        }
    }

    void agtfadlqog(long j13);

    void btonecajqb(String str);

    void dxjokdxxww(f3.zoijcleaow zoijcleaowVar);

    void eablkybsjg(Exception exc);

    void esjtqupxsv(int i13, long j13, long j14);

    void gtknphoqwx(String str, long j13, long j14);

    void iobyxmoadg(AudioSink.iobyxmoadg iobyxmoadgVar);

    void iwizpuwonk(Exception exc);

    void ppxfxbqfkf(AudioSink.iobyxmoadg iobyxmoadgVar);

    void rgvfuqvkyq(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar);

    void vdvldrhtss(f3.zoijcleaow zoijcleaowVar);

    void wkgbmnqykc(boolean z13);
}
