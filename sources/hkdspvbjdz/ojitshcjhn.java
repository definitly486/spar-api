package hkdspvbjdz;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import jpowsppfya.jpowsppfya;
import lereixgezr.iwizpuwonk;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;
import lereixgezr.ulzqkzuiru;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn implements jpowsppfya, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f40678cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f40679esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private SurfaceTexture f40680istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Handler f40681iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Executor f40682jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final AtomicBoolean f40683lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final Map f40684pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final HandlerThread f40685yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f40686zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private SurfaceTexture f40687zynmafqrjb;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static tg.vdvldrhtss f40688iobyxmoadg = new tg.vdvldrhtss() { // from class: hkdspvbjdz.agtfadlqog
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new ojitshcjhn((iwizpuwonk) obj, (ulzqkzuiru) obj2, (ulzqkzuiru) obj3);
            }
        };

        public static jpowsppfya iobyxmoadg(iwizpuwonk iwizpuwonkVar, ulzqkzuiru ulzqkzuiruVar, ulzqkzuiru ulzqkzuiruVar2) {
            return (jpowsppfya) f40688iobyxmoadg.invoke(iwizpuwonkVar, ulzqkzuiruVar, ulzqkzuiruVar2);
        }
    }

    ojitshcjhn(iwizpuwonk iwizpuwonkVar, ulzqkzuiru ulzqkzuiruVar, ulzqkzuiru ulzqkzuiruVar2) {
        this(iwizpuwonkVar, Collections.emptyMap(), ulzqkzuiruVar, ulzqkzuiruVar2);
    }

    private void agtfadlqog(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f40682jyumaefscl.execute(new Runnable() { // from class: hkdspvbjdz.gtknphoqwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40668zdlpuopuiu.vdvldrhtss(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e13) {
            sopmlzcsov.wflxmlrfwp("DualSurfaceProcessor", "Unable to executor runnable", e13);
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr() {
        this.f40679esjtqupxsv = true;
        draadjrbmk();
    }

    private void draadjrbmk() {
        if (this.f40679esjtqupxsv && this.f40678cqumvgiudr == 0) {
            Iterator it = this.f40684pmvmpeiblj.keySet().iterator();
            while (it.hasNext()) {
                ((ydmasvzmpa) it.next()).close();
            }
            this.f40684pmvmpeiblj.clear();
            this.f40686zdlpuopuiu.gtknphoqwx();
            this.f40685yggfygwlhe.quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk(final ydmasvzmpa ydmasvzmpaVar) {
        Surface surfaceDvvnrvtcbc = ydmasvzmpaVar.dvvnrvtcbc(this.f40682jyumaefscl, new u1.iobyxmoadg() { // from class: hkdspvbjdz.btonecajqb
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f40659iobyxmoadg.jyumaefscl(ydmasvzmpaVar, (ydmasvzmpa.zoijcleaow) obj);
            }
        });
        this.f40686zdlpuopuiu.btonecajqb(surfaceDvvnrvtcbc);
        this.f40684pmvmpeiblj.put(ydmasvzmpaVar, surfaceDvvnrvtcbc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jyumaefscl(ydmasvzmpa ydmasvzmpaVar, ydmasvzmpa.zoijcleaow zoijcleaowVar) {
        ydmasvzmpaVar.close();
        Surface surface = (Surface) this.f40684pmvmpeiblj.remove(ydmasvzmpaVar);
        if (surface != null) {
            this.f40686zdlpuopuiu.oxmwwwfdhm(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object kcexrzcfyt(final iwizpuwonk iwizpuwonkVar, final Map map, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        wflxmlrfwp(new Runnable() { // from class: hkdspvbjdz.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f40664zdlpuopuiu.oxmwwwfdhm(iwizpuwonkVar, map, iobyxmoadgVar);
            }
        });
        return "Init GlRenderer";
    }

    private void ojitshcjhn(final iwizpuwonk iwizpuwonkVar, final Map map) {
        try {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: hkdspvbjdz.lqeggnwhkg
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f40673iobyxmoadg.kcexrzcfyt(iwizpuwonkVar, map, iobyxmoadgVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e13) {
            e = e13;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oxmwwwfdhm(iwizpuwonk iwizpuwonkVar, Map map, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) throws Throwable {
        try {
            this.f40686zdlpuopuiu.nufgyqmvbu(iwizpuwonkVar, map);
            iobyxmoadgVar.ppxfxbqfkf(null);
        } catch (RuntimeException e13) {
            iobyxmoadgVar.gxszxtbevo(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void rgvfuqvkyq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(Runnable runnable, Runnable runnable2) {
        if (this.f40679esjtqupxsv) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void wflxmlrfwp(Runnable runnable) {
        agtfadlqog(runnable, new Runnable() { // from class: hkdspvbjdz.draadjrbmk
            @Override // java.lang.Runnable
            public final void run() {
                ojitshcjhn.rgvfuqvkyq();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yggfygwlhe(tbqsvytpvh tbqsvytpvhVar) {
        this.f40678cqumvgiudr++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f40686zdlpuopuiu.zdlpuopuiu(tbqsvytpvhVar.oxmwwwfdhm()));
        surfaceTexture.setDefaultBufferSize(tbqsvytpvhVar.ojitshcjhn().getWidth(), tbqsvytpvhVar.ojitshcjhn().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        tbqsvytpvhVar.zynmafqrjb(surface, this.f40682jyumaefscl, new u1.iobyxmoadg() { // from class: hkdspvbjdz.wflxmlrfwp
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f40707iobyxmoadg.zdlpuopuiu(surfaceTexture, surface, (tbqsvytpvh.lqeggnwhkg) obj);
            }
        });
        if (tbqsvytpvhVar.oxmwwwfdhm()) {
            this.f40687zynmafqrjb = surfaceTexture;
        } else {
            this.f40680istkbnxepw = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f40681iwizpuwonk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(SurfaceTexture surfaceTexture, Surface surface, tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f40678cqumvgiudr--;
        draadjrbmk();
    }

    @Override // lereixgezr.sflfametgt
    public void iobyxmoadg(final tbqsvytpvh tbqsvytpvhVar) {
        if (this.f40683lereixgezr.get()) {
            tbqsvytpvhVar.yadqdtsiqt();
            return;
        }
        Runnable runnable = new Runnable() { // from class: hkdspvbjdz.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f40670zdlpuopuiu.yggfygwlhe(tbqsvytpvhVar);
            }
        };
        Objects.requireNonNull(tbqsvytpvhVar);
        agtfadlqog(runnable, new jpowsppfya.dxjokdxxww(tbqsvytpvhVar));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f40683lereixgezr.get() || (surfaceTexture2 = this.f40687zynmafqrjb) == null || this.f40680istkbnxepw == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f40680istkbnxepw.updateTexImage();
        for (Map.Entry entry : this.f40684pmvmpeiblj.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            ydmasvzmpa ydmasvzmpaVar = (ydmasvzmpa) entry.getKey();
            if (ydmasvzmpaVar.getFormat() == 34) {
                try {
                    this.f40686zdlpuopuiu.jyumaefscl(surfaceTexture.getTimestamp(), surface, ydmasvzmpaVar, this.f40687zynmafqrjb, this.f40680istkbnxepw);
                } catch (RuntimeException e13) {
                    sopmlzcsov.wkgbmnqykc("DualSurfaceProcessor", "Failed to render with OpenGL.", e13);
                }
            }
        }
    }

    @Override // jpowsppfya.jpowsppfya
    public void release() {
        if (this.f40683lereixgezr.getAndSet(true)) {
            return;
        }
        wflxmlrfwp(new Runnable() { // from class: hkdspvbjdz.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f40665zdlpuopuiu.cqumvgiudr();
            }
        });
    }

    @Override // lereixgezr.sflfametgt
    public void zoijcleaow(final ydmasvzmpa ydmasvzmpaVar) {
        if (this.f40683lereixgezr.get()) {
            ydmasvzmpaVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: hkdspvbjdz.nufgyqmvbu
            @Override // java.lang.Runnable
            public final void run() {
                this.f40677zdlpuopuiu.iwizpuwonk(ydmasvzmpaVar);
            }
        };
        Objects.requireNonNull(ydmasvzmpaVar);
        agtfadlqog(runnable, new jpowsppfya.lqeggnwhkg(ydmasvzmpaVar));
    }

    ojitshcjhn(iwizpuwonk iwizpuwonkVar, Map map, ulzqkzuiru ulzqkzuiruVar, ulzqkzuiru ulzqkzuiruVar2) {
        this.f40678cqumvgiudr = 0;
        this.f40679esjtqupxsv = false;
        this.f40683lereixgezr = new AtomicBoolean(false);
        this.f40684pmvmpeiblj = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f40685yggfygwlhe = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f40681iwizpuwonk = handler;
        this.f40682jyumaefscl = yadqdtsiqt.iobyxmoadg.eablkybsjg(handler);
        this.f40686zdlpuopuiu = new ppxfxbqfkf(ulzqkzuiruVar, ulzqkzuiruVar2);
        try {
            ojitshcjhn(iwizpuwonkVar, map);
        } catch (RuntimeException e13) {
            release();
            throw e13;
        }
    }
}
