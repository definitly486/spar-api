package jpowsppfya;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public class rgvfuqvkyq implements jpowsppfya, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final List f52005cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final AtomicBoolean f52006cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final float[] f52007esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f52008istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Handler f52009iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Executor f52010jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final float[] f52011lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final Map f52012pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final HandlerThread f52013yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zdlpuopuiu f52014zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f52015zynmafqrjb;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static ojitshcjhn.iobyxmoadg f52016iobyxmoadg = new ojitshcjhn.iobyxmoadg() { // from class: jpowsppfya.ojitshcjhn
            @Override // ojitshcjhn.iobyxmoadg
            public final Object apply(Object obj) {
                return new rgvfuqvkyq((lereixgezr.iwizpuwonk) obj);
            }
        };

        public static jpowsppfya iobyxmoadg(lereixgezr.iwizpuwonk iwizpuwonkVar) {
            return (jpowsppfya) f52016iobyxmoadg.apply(iwizpuwonkVar);
        }
    }

    static abstract class zoijcleaow {
        abstract androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadg();

        abstract int ppxfxbqfkf();

        abstract int zoijcleaow();
    }

    rgvfuqvkyq(lereixgezr.iwizpuwonk iwizpuwonkVar) {
        this(iwizpuwonkVar, Collections.emptyMap());
    }

    private void agtfadlqog(Runnable runnable) {
        ojitshcjhn(runnable, new Runnable() { // from class: jpowsppfya.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                rgvfuqvkyq.kcexrzcfyt();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr(tbqsvytpvh tbqsvytpvhVar, SurfaceTexture surfaceTexture, Surface surface, tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar) {
        tbqsvytpvhVar.gtknphoqwx();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f52015zynmafqrjb--;
        wflxmlrfwp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void esjtqupxsv(final tbqsvytpvh tbqsvytpvhVar) {
        this.f52015zynmafqrjb++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f52014zdlpuopuiu.lqeggnwhkg());
        surfaceTexture.setDefaultBufferSize(tbqsvytpvhVar.ojitshcjhn().getWidth(), tbqsvytpvhVar.ojitshcjhn().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        tbqsvytpvhVar.istkbnxepw(this.f52010jyumaefscl, new tbqsvytpvh.dxjokdxxww() { // from class: jpowsppfya.draadjrbmk
            @Override // lereixgezr.tbqsvytpvh.dxjokdxxww
            public final void iobyxmoadg(tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar) {
                this.f51947iobyxmoadg.iwizpuwonk(tbqsvytpvhVar, nufgyqmvbuVar);
            }
        });
        tbqsvytpvhVar.zynmafqrjb(surface, this.f52010jyumaefscl, new u1.iobyxmoadg() { // from class: jpowsppfya.wflxmlrfwp
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f52018iobyxmoadg.cqumvgiudr(tbqsvytpvhVar, surfaceTexture, surface, (tbqsvytpvh.lqeggnwhkg) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f52009iwizpuwonk);
    }

    private void istkbnxepw(gg.iwizpuwonk iwizpuwonkVar) {
        if (this.f52005cdpycssgdh.isEmpty()) {
            return;
        }
        if (iwizpuwonkVar == null) {
            rgvfuqvkyq(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f52005cdpycssgdh.iterator();
                int iPpxfxbqfkf = -1;
                int iZoijcleaow = -1;
                Bitmap bitmapVdvldrhtss = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    zoijcleaow zoijcleaowVar = (zoijcleaow) it.next();
                    if (iPpxfxbqfkf != zoijcleaowVar.ppxfxbqfkf() || bitmapVdvldrhtss == null) {
                        iPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                        if (bitmapVdvldrhtss != null) {
                            bitmapVdvldrhtss.recycle();
                        }
                        bitmapVdvldrhtss = vdvldrhtss((Size) iwizpuwonkVar.dxjokdxxww(), (float[]) iwizpuwonkVar.btonecajqb(), iPpxfxbqfkf);
                        iZoijcleaow = -1;
                    }
                    if (iZoijcleaow != zoijcleaowVar.zoijcleaow()) {
                        byteArrayOutputStream.reset();
                        iZoijcleaow = zoijcleaowVar.zoijcleaow();
                        bitmapVdvldrhtss.compress(Bitmap.CompressFormat.JPEG, iZoijcleaow, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) iwizpuwonkVar.nufgyqmvbu();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.vdvldrhtss(surface, byteArray);
                    zoijcleaowVar.iobyxmoadg().ppxfxbqfkf(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e13) {
            rgvfuqvkyq(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk(tbqsvytpvh tbqsvytpvhVar, tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar) {
        cllcsxoeiz.wkgbmnqykc.eablkybsjg eablkybsjgVar = cllcsxoeiz.wkgbmnqykc.eablkybsjg.DEFAULT;
        if (tbqsvytpvhVar.agtfadlqog().wkgbmnqykc() && nufgyqmvbuVar.eablkybsjg()) {
            eablkybsjgVar = cllcsxoeiz.wkgbmnqykc.eablkybsjg.YUV;
        }
        this.f52014zdlpuopuiu.ojitshcjhn(eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jyumaefscl(lereixgezr.iwizpuwonk iwizpuwonkVar, Map map, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) throws Throwable {
        try {
            this.f52014zdlpuopuiu.nufgyqmvbu(iwizpuwonkVar, map);
            iobyxmoadgVar.ppxfxbqfkf(null);
        } catch (RuntimeException e13) {
            iobyxmoadgVar.gxszxtbevo(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kcexrzcfyt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lereixgezr(ydmasvzmpa ydmasvzmpaVar, ydmasvzmpa.zoijcleaow zoijcleaowVar) {
        ydmasvzmpaVar.close();
        Surface surface = (Surface) this.f52012pmvmpeiblj.remove(ydmasvzmpaVar);
        if (surface != null) {
            this.f52014zdlpuopuiu.oxmwwwfdhm(surface);
        }
    }

    private void ojitshcjhn(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f52010jyumaefscl.execute(new Runnable() { // from class: jpowsppfya.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51953zdlpuopuiu.zdlpuopuiu(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e13) {
            sopmlzcsov.wflxmlrfwp("DefaultSurfaceProcessor", "Unable to executor runnable", e13);
            runnable2.run();
        }
    }

    private void oxmwwwfdhm(final lereixgezr.iwizpuwonk iwizpuwonkVar, final Map map) {
        try {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: jpowsppfya.ppxfxbqfkf
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f52002iobyxmoadg.yggfygwlhe(iwizpuwonkVar, map, iobyxmoadgVar);
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
    public /* synthetic */ void pmvmpeiblj(final ydmasvzmpa ydmasvzmpaVar) {
        Surface surfaceDvvnrvtcbc = ydmasvzmpaVar.dvvnrvtcbc(this.f52010jyumaefscl, new u1.iobyxmoadg() { // from class: jpowsppfya.gtknphoqwx
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f51955iobyxmoadg.lereixgezr(ydmasvzmpaVar, (ydmasvzmpa.zoijcleaow) obj);
            }
        });
        this.f52014zdlpuopuiu.btonecajqb(surfaceDvvnrvtcbc);
        this.f52012pmvmpeiblj.put(ydmasvzmpaVar, surfaceDvvnrvtcbc);
    }

    private void rgvfuqvkyq(Throwable th2) {
        Iterator it = this.f52005cdpycssgdh.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).iobyxmoadg().gxszxtbevo(th2);
        }
        this.f52005cdpycssgdh.clear();
    }

    private Bitmap vdvldrhtss(Size size, float[] fArr, int i13) {
        float[] fArr2 = (float[]) fArr.clone();
        cdpycssgdh.wflxmlrfwp.ppxfxbqfkf(fArr2, i13, 0.5f, 0.5f);
        cdpycssgdh.wflxmlrfwp.wkgbmnqykc(fArr2, 0.5f);
        return this.f52014zdlpuopuiu.rgvfuqvkyq(cdpycssgdh.vdvldrhtss.ojitshcjhn(size, i13), fArr2);
    }

    private void wflxmlrfwp() {
        if (this.f52008istkbnxepw && this.f52015zynmafqrjb == 0) {
            Iterator it = this.f52012pmvmpeiblj.keySet().iterator();
            while (it.hasNext()) {
                ((ydmasvzmpa) it.next()).close();
            }
            Iterator it2 = this.f52005cdpycssgdh.iterator();
            while (it2.hasNext()) {
                ((zoijcleaow) it2.next()).iobyxmoadg().gxszxtbevo(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f52012pmvmpeiblj.clear();
            this.f52014zdlpuopuiu.gtknphoqwx();
            this.f52013yggfygwlhe.quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object yggfygwlhe(final lereixgezr.iwizpuwonk iwizpuwonkVar, final Map map, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        agtfadlqog(new Runnable() { // from class: jpowsppfya.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f51942zdlpuopuiu.jyumaefscl(iwizpuwonkVar, map, iobyxmoadgVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(Runnable runnable, Runnable runnable2) {
        if (this.f52008istkbnxepw) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zynmafqrjb() {
        this.f52008istkbnxepw = true;
        wflxmlrfwp();
    }

    @Override // lereixgezr.sflfametgt
    public void iobyxmoadg(final tbqsvytpvh tbqsvytpvhVar) {
        if (this.f52006cqumvgiudr.get()) {
            tbqsvytpvhVar.yadqdtsiqt();
            return;
        }
        Runnable runnable = new Runnable() { // from class: jpowsppfya.nufgyqmvbu
            @Override // java.lang.Runnable
            public final void run() {
                this.f51994zdlpuopuiu.esjtqupxsv(tbqsvytpvhVar);
            }
        };
        Objects.requireNonNull(tbqsvytpvhVar);
        ojitshcjhn(runnable, new dxjokdxxww(tbqsvytpvhVar));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f52006cqumvgiudr.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f52007esjtqupxsv);
        gg.iwizpuwonk iwizpuwonkVar = null;
        for (Map.Entry entry : this.f52012pmvmpeiblj.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            ydmasvzmpa ydmasvzmpaVar = (ydmasvzmpa) entry.getKey();
            ydmasvzmpaVar.h(this.f52011lereixgezr, this.f52007esjtqupxsv);
            if (ydmasvzmpaVar.getFormat() == 34) {
                try {
                    this.f52014zdlpuopuiu.agtfadlqog(surfaceTexture.getTimestamp(), this.f52011lereixgezr, surface);
                } catch (RuntimeException e13) {
                    sopmlzcsov.wkgbmnqykc("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e13);
                }
            } else {
                u1.nufgyqmvbu.dxjokdxxww(ydmasvzmpaVar.getFormat() == 256, "Unsupported format: " + ydmasvzmpaVar.getFormat());
                u1.nufgyqmvbu.dxjokdxxww(iwizpuwonkVar == null, "Only one JPEG output is supported.");
                iwizpuwonkVar = new gg.iwizpuwonk(surface, ydmasvzmpaVar.getSize(), (float[]) this.f52011lereixgezr.clone());
            }
        }
        try {
            istkbnxepw(iwizpuwonkVar);
        } catch (RuntimeException e14) {
            rgvfuqvkyq(e14);
        }
    }

    @Override // jpowsppfya.jpowsppfya
    public void release() {
        if (this.f52006cqumvgiudr.getAndSet(true)) {
            return;
        }
        agtfadlqog(new Runnable() { // from class: jpowsppfya.btonecajqb
            @Override // java.lang.Runnable
            public final void run() {
                this.f51943zdlpuopuiu.zynmafqrjb();
            }
        });
    }

    @Override // lereixgezr.sflfametgt
    public void zoijcleaow(final ydmasvzmpa ydmasvzmpaVar) {
        if (this.f52006cqumvgiudr.get()) {
            ydmasvzmpaVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: jpowsppfya.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f51958zdlpuopuiu.pmvmpeiblj(ydmasvzmpaVar);
            }
        };
        Objects.requireNonNull(ydmasvzmpaVar);
        ojitshcjhn(runnable, new lqeggnwhkg(ydmasvzmpaVar));
    }

    rgvfuqvkyq(lereixgezr.iwizpuwonk iwizpuwonkVar, Map map) {
        this.f52006cqumvgiudr = new AtomicBoolean(false);
        this.f52007esjtqupxsv = new float[16];
        this.f52011lereixgezr = new float[16];
        this.f52012pmvmpeiblj = new LinkedHashMap();
        this.f52015zynmafqrjb = 0;
        this.f52008istkbnxepw = false;
        this.f52005cdpycssgdh = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f52013yggfygwlhe = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f52009iwizpuwonk = handler;
        this.f52010jyumaefscl = yadqdtsiqt.iobyxmoadg.eablkybsjg(handler);
        this.f52014zdlpuopuiu = new zdlpuopuiu();
        try {
            oxmwwwfdhm(iwizpuwonkVar, map);
        } catch (RuntimeException e13) {
            release();
            throw e13;
        }
    }
}
