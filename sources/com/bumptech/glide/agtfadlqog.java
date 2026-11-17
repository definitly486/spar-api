package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z8.kcexrzcfyt;
import z8.rgvfuqvkyq;
import z8.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog implements ComponentCallbacks2, z8.draadjrbmk {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final c9.gxszxtbevo f20598iozdgvuglv = (c9.gxszxtbevo) c9.gxszxtbevo.iyctptxqzt(Bitmap.class).tzroggbefp();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final c9.gxszxtbevo f20599lmojexxdyd = (c9.gxszxtbevo) c9.gxszxtbevo.iyctptxqzt(x8.ppxfxbqfkf.class).tzroggbefp();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final c9.gxszxtbevo f20600wwaezpbzkn = (c9.gxszxtbevo) ((c9.gxszxtbevo) c9.gxszxtbevo.weqkydbzbr(n8.iobyxmoadg.f69348ppxfxbqfkf).jhduphickx(btonecajqb.LOW)).yfnezrywwk(true);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f20601cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final rgvfuqvkyq f20602cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final kcexrzcfyt f20603esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private c9.gxszxtbevo f20604istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final vdvldrhtss f20605iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final z8.btonecajqb f20606jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Runnable f20607lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final z8.zoijcleaow f20608pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f20609yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final Context f20610yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final com.bumptech.glide.zoijcleaow f20611zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final CopyOnWriteArrayList f20612zynmafqrjb;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            agtfadlqog agtfadlqogVar = agtfadlqog.this;
            agtfadlqogVar.f20606jyumaefscl.iobyxmoadg(agtfadlqogVar);
        }
    }

    private class zoijcleaow implements z8.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f20614iobyxmoadg;

        zoijcleaow(vdvldrhtss vdvldrhtssVar) {
            this.f20614iobyxmoadg = vdvldrhtssVar;
        }

        @Override // z8.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(boolean z13) {
            if (z13) {
                synchronized (agtfadlqog.this) {
                    this.f20614iobyxmoadg.eablkybsjg();
                }
            }
        }
    }

    public agtfadlqog(com.bumptech.glide.zoijcleaow zoijcleaowVar, z8.btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar, Context context) {
        this(zoijcleaowVar, btonecajqbVar, rgvfuqvkyqVar, new vdvldrhtss(), zoijcleaowVar.lqeggnwhkg(), context);
    }

    private void pmvmpeiblj(d9.dxjokdxxww dxjokdxxwwVar) {
        boolean zLereixgezr = lereixgezr(dxjokdxxwwVar);
        c9.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        if (zLereixgezr || this.f20611zdlpuopuiu.rgvfuqvkyq(dxjokdxxwwVar) || ppxfxbqfkfVarIobyxmoadg == null) {
            return;
        }
        dxjokdxxwwVar.zoijcleaow(null);
        ppxfxbqfkfVarIobyxmoadg.clear();
    }

    private synchronized void wflxmlrfwp() {
        try {
            Iterator it = this.f20603esjtqupxsv.eablkybsjg().iterator();
            while (it.hasNext()) {
                draadjrbmk((d9.dxjokdxxww) it.next());
            }
            this.f20603esjtqupxsv.wkgbmnqykc();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    List agtfadlqog() {
        return this.f20612zynmafqrjb;
    }

    protected synchronized void cqumvgiudr(c9.gxszxtbevo gxszxtbevoVar) {
        this.f20604istkbnxepw = (c9.gxszxtbevo) ((c9.gxszxtbevo) gxszxtbevoVar.clone()).zoijcleaow();
    }

    public void draadjrbmk(d9.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar == null) {
            return;
        }
        pmvmpeiblj(dxjokdxxwwVar);
    }

    public wflxmlrfwp eablkybsjg() {
        return wkgbmnqykc(Bitmap.class).iobyxmoadg(f20598iozdgvuglv);
    }

    synchronized void esjtqupxsv(d9.dxjokdxxww dxjokdxxwwVar, c9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20603esjtqupxsv.gtknphoqwx(dxjokdxxwwVar);
        this.f20605iwizpuwonk.lqeggnwhkg(ppxfxbqfkfVar);
    }

    public wflxmlrfwp gtknphoqwx() {
        return wkgbmnqykc(Drawable.class);
    }

    public synchronized void iwizpuwonk() {
        this.f20605iwizpuwonk.gxszxtbevo();
    }

    public synchronized void jyumaefscl() {
        this.f20605iwizpuwonk.wkgbmnqykc();
    }

    public wflxmlrfwp kcexrzcfyt(String str) {
        return gtknphoqwx().grlcpdaxtj(str);
    }

    synchronized boolean lereixgezr(d9.dxjokdxxww dxjokdxxwwVar) {
        c9.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        if (ppxfxbqfkfVarIobyxmoadg == null) {
            return true;
        }
        if (!this.f20605iwizpuwonk.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg)) {
            return false;
        }
        this.f20603esjtqupxsv.draadjrbmk(dxjokdxxwwVar);
        dxjokdxxwwVar.zoijcleaow(null);
        return true;
    }

    synchronized c9.gxszxtbevo ojitshcjhn() {
        return this.f20604istkbnxepw;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // z8.draadjrbmk
    public synchronized void onDestroy() {
        this.f20603esjtqupxsv.onDestroy();
        wflxmlrfwp();
        this.f20605iwizpuwonk.zoijcleaow();
        this.f20606jyumaefscl.zoijcleaow(this);
        this.f20606jyumaefscl.zoijcleaow(this.f20608pmvmpeiblj);
        g9.draadjrbmk.jyumaefscl(this.f20607lereixgezr);
        this.f20611zdlpuopuiu.kcexrzcfyt(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // z8.draadjrbmk
    public synchronized void onStart() {
        iwizpuwonk();
        this.f20603esjtqupxsv.onStart();
    }

    @Override // z8.draadjrbmk
    public synchronized void onStop() {
        try {
            this.f20603esjtqupxsv.onStop();
            if (this.f20609yadqdtsiqt) {
                wflxmlrfwp();
            } else {
                jyumaefscl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        if (i13 == 60 && this.f20601cdpycssgdh) {
            yggfygwlhe();
        }
    }

    public wflxmlrfwp oxmwwwfdhm(Object obj) {
        return gtknphoqwx().ipoelvxyzq(obj);
    }

    ojitshcjhn rgvfuqvkyq(Class cls) {
        return this.f20611zdlpuopuiu.dxjokdxxww().eablkybsjg(cls);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f20605iwizpuwonk + ", treeNode=" + this.f20602cqumvgiudr + "}";
    }

    public wflxmlrfwp vdvldrhtss(Integer num) {
        return gtknphoqwx().fyldjkxazc(num);
    }

    public wflxmlrfwp wkgbmnqykc(Class cls) {
        return new wflxmlrfwp(this.f20611zdlpuopuiu, this, cls, this.f20610yggfygwlhe);
    }

    public synchronized void yggfygwlhe() {
        zdlpuopuiu();
        Iterator it = this.f20602cqumvgiudr.iobyxmoadg().iterator();
        while (it.hasNext()) {
            ((agtfadlqog) it.next()).zdlpuopuiu();
        }
    }

    public synchronized void zdlpuopuiu() {
        this.f20605iwizpuwonk.ppxfxbqfkf();
    }

    agtfadlqog(com.bumptech.glide.zoijcleaow zoijcleaowVar, z8.btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar, vdvldrhtss vdvldrhtssVar, z8.ppxfxbqfkf ppxfxbqfkfVar, Context context) {
        this.f20603esjtqupxsv = new kcexrzcfyt();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f20607lereixgezr = iobyxmoadgVar;
        this.f20611zdlpuopuiu = zoijcleaowVar;
        this.f20606jyumaefscl = btonecajqbVar;
        this.f20602cqumvgiudr = rgvfuqvkyqVar;
        this.f20605iwizpuwonk = vdvldrhtssVar;
        this.f20610yggfygwlhe = context;
        z8.zoijcleaow zoijcleaowVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(context.getApplicationContext(), new zoijcleaow(vdvldrhtssVar));
        this.f20608pmvmpeiblj = zoijcleaowVarIobyxmoadg;
        zoijcleaowVar.ojitshcjhn(this);
        if (g9.draadjrbmk.vdvldrhtss()) {
            g9.draadjrbmk.yggfygwlhe(iobyxmoadgVar);
        } else {
            btonecajqbVar.iobyxmoadg(this);
        }
        btonecajqbVar.iobyxmoadg(zoijcleaowVarIobyxmoadg);
        this.f20612zynmafqrjb = new CopyOnWriteArrayList(zoijcleaowVar.dxjokdxxww().ppxfxbqfkf());
        cqumvgiudr(zoijcleaowVar.dxjokdxxww().wkgbmnqykc());
    }
}
