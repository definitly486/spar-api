package c9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.btonecajqb;
import com.bumptech.glide.load.engine.GlideException;
import g9.draadjrbmk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements ppxfxbqfkf, d9.nufgyqmvbu, lqeggnwhkg {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final boolean f19285yadqdtsiqt = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final btonecajqb f19286agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Class f19287btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private RuntimeException f19288cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Drawable f19289cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f19290draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Object f19291dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg f19292eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Drawable f19293esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final c9.iobyxmoadg f19294gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wkgbmnqykc f19295gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f19296iobyxmoadg;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f19297istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private iobyxmoadg f19298iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.btonecajqb f19299jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private n8.ppxfxbqfkf f19300kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Drawable f19301lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Context f19302lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final com.bumptech.glide.wkgbmnqykc f19303nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final d9.dxjokdxxww f19304ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Executor f19305oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f19306pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h9.ppxfxbqfkf f19307ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final List f19308rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final e9.eablkybsjg f19309vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f19310wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f19311wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f19312yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private com.bumptech.glide.load.engine.btonecajqb.wkgbmnqykc f19313zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19314zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f19315zynmafqrjb;

    private enum iobyxmoadg {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private nufgyqmvbu(Context context, com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2, Class cls, c9.iobyxmoadg iobyxmoadgVar, int i13, int i14, btonecajqb btonecajqbVar, d9.dxjokdxxww dxjokdxxwwVar, eablkybsjg eablkybsjgVar, List list, wkgbmnqykc wkgbmnqykcVar2, com.bumptech.glide.load.engine.btonecajqb btonecajqbVar2, e9.eablkybsjg eablkybsjgVar2, Executor executor) {
        this.f19314zoijcleaow = f19285yadqdtsiqt ? String.valueOf(super.hashCode()) : null;
        this.f19307ppxfxbqfkf = h9.ppxfxbqfkf.iobyxmoadg();
        this.f19311wkgbmnqykc = obj;
        this.f19302lqeggnwhkg = context;
        this.f19303nufgyqmvbu = wkgbmnqykcVar;
        this.f19291dxjokdxxww = obj2;
        this.f19287btonecajqb = cls;
        this.f19294gtknphoqwx = iobyxmoadgVar;
        this.f19290draadjrbmk = i13;
        this.f19310wflxmlrfwp = i14;
        this.f19286agtfadlqog = btonecajqbVar;
        this.f19304ojitshcjhn = dxjokdxxwwVar;
        this.f19292eablkybsjg = eablkybsjgVar;
        this.f19308rgvfuqvkyq = list;
        this.f19295gxszxtbevo = wkgbmnqykcVar2;
        this.f19299jyumaefscl = btonecajqbVar2;
        this.f19309vdvldrhtss = eablkybsjgVar2;
        this.f19305oxmwwwfdhm = executor;
        this.f19298iwizpuwonk = iobyxmoadg.PENDING;
        if (this.f19288cdpycssgdh == null && wkgbmnqykcVar.lqeggnwhkg().iobyxmoadg(com.bumptech.glide.ppxfxbqfkf.C0387ppxfxbqfkf.class)) {
            this.f19288cdpycssgdh = new RuntimeException("Glide request origin trace");
        }
    }

    private void agtfadlqog() {
        dxjokdxxww();
        this.f19307ppxfxbqfkf.ppxfxbqfkf();
        this.f19304ojitshcjhn.ppxfxbqfkf(this);
        com.bumptech.glide.load.engine.btonecajqb.wkgbmnqykc wkgbmnqykcVar = this.f19313zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg();
            this.f19313zdlpuopuiu = null;
        }
    }

    private void cqumvgiudr() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(this);
        }
    }

    private boolean draadjrbmk() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.dxjokdxxww(this);
    }

    private void dxjokdxxww() {
        if (this.f19297istkbnxepw) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public static nufgyqmvbu esjtqupxsv(Context context, com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2, Class cls, c9.iobyxmoadg iobyxmoadgVar, int i13, int i14, btonecajqb btonecajqbVar, d9.dxjokdxxww dxjokdxxwwVar, eablkybsjg eablkybsjgVar, List list, wkgbmnqykc wkgbmnqykcVar2, com.bumptech.glide.load.engine.btonecajqb btonecajqbVar2, e9.eablkybsjg eablkybsjgVar2, Executor executor) {
        return new nufgyqmvbu(context, wkgbmnqykcVar, obj, obj2, cls, iobyxmoadgVar, i13, i14, btonecajqbVar, dxjokdxxwwVar, eablkybsjgVar, list, wkgbmnqykcVar2, btonecajqbVar2, eablkybsjgVar2, executor);
    }

    private boolean gtknphoqwx() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.gxszxtbevo(this);
    }

    private void iwizpuwonk() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.ppxfxbqfkf(this);
        }
    }

    private static int jyumaefscl(int i13, float f13) {
        return i13 == Integer.MIN_VALUE ? i13 : Math.round(f13 * i13);
    }

    private boolean kcexrzcfyt() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        return wkgbmnqykcVar == null || !wkgbmnqykcVar.getRoot().zoijcleaow();
    }

    private void lereixgezr(GlideException glideException, int i13) {
        boolean zWkgbmnqykc;
        this.f19307ppxfxbqfkf.ppxfxbqfkf();
        synchronized (this.f19311wkgbmnqykc) {
            try {
                glideException.vdvldrhtss(this.f19288cdpycssgdh);
                int iNufgyqmvbu = this.f19303nufgyqmvbu.nufgyqmvbu();
                if (iNufgyqmvbu <= i13) {
                    Log.w("Glide", "Load failed for [" + this.f19291dxjokdxxww + "] with dimensions [" + this.f19306pmvmpeiblj + "x" + this.f19315zynmafqrjb + "]", glideException);
                    if (iNufgyqmvbu <= 4) {
                        glideException.draadjrbmk("Glide");
                    }
                }
                this.f19313zdlpuopuiu = null;
                this.f19298iwizpuwonk = iobyxmoadg.FAILED;
                iwizpuwonk();
                boolean z13 = true;
                this.f19297istkbnxepw = true;
                try {
                    List list = this.f19308rgvfuqvkyq;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zWkgbmnqykc = false;
                        while (it.hasNext()) {
                            zWkgbmnqykc |= ((eablkybsjg) it.next()).wkgbmnqykc(glideException, this.f19291dxjokdxxww, this.f19304ojitshcjhn, kcexrzcfyt());
                        }
                    } else {
                        zWkgbmnqykc = false;
                    }
                    eablkybsjg eablkybsjgVar = this.f19292eablkybsjg;
                    if (eablkybsjgVar == null || !eablkybsjgVar.wkgbmnqykc(glideException, this.f19291dxjokdxxww, this.f19304ojitshcjhn, kcexrzcfyt())) {
                        z13 = false;
                    }
                    if (!(zWkgbmnqykc | z13)) {
                        zynmafqrjb();
                    }
                    this.f19297istkbnxepw = false;
                    h9.zoijcleaow.gxszxtbevo("GlideRequest", this.f19296iobyxmoadg);
                } catch (Throwable th2) {
                    this.f19297istkbnxepw = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void ojitshcjhn(Object obj) {
        List<eablkybsjg> list = this.f19308rgvfuqvkyq;
        if (list == null) {
            return;
        }
        for (eablkybsjg eablkybsjgVar : list) {
        }
    }

    private Drawable oxmwwwfdhm() {
        if (this.f19293esjtqupxsv == null) {
            Drawable drawableJyumaefscl = this.f19294gtknphoqwx.jyumaefscl();
            this.f19293esjtqupxsv = drawableJyumaefscl;
            if (drawableJyumaefscl == null && this.f19294gtknphoqwx.iwizpuwonk() > 0) {
                this.f19293esjtqupxsv = zdlpuopuiu(this.f19294gtknphoqwx.iwizpuwonk());
            }
        }
        return this.f19293esjtqupxsv;
    }

    private void pmvmpeiblj(n8.ppxfxbqfkf ppxfxbqfkfVar, Object obj, l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        boolean zEablkybsjg;
        boolean zKcexrzcfyt = kcexrzcfyt();
        this.f19298iwizpuwonk = iobyxmoadg.COMPLETE;
        this.f19300kcexrzcfyt = ppxfxbqfkfVar;
        if (this.f19303nufgyqmvbu.nufgyqmvbu() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + iobyxmoadgVar + " for " + this.f19291dxjokdxxww + " with size [" + this.f19306pmvmpeiblj + "x" + this.f19315zynmafqrjb + "] in " + g9.lqeggnwhkg.iobyxmoadg(this.f19312yggfygwlhe) + " ms");
        }
        cqumvgiudr();
        boolean z14 = true;
        this.f19297istkbnxepw = true;
        try {
            List list = this.f19308rgvfuqvkyq;
            if (list != null) {
                Iterator it = list.iterator();
                zEablkybsjg = false;
                while (it.hasNext()) {
                    zEablkybsjg |= ((eablkybsjg) it.next()).eablkybsjg(obj, this.f19291dxjokdxxww, this.f19304ojitshcjhn, iobyxmoadgVar, zKcexrzcfyt);
                }
            } else {
                zEablkybsjg = false;
            }
            eablkybsjg eablkybsjgVar = this.f19292eablkybsjg;
            if (eablkybsjgVar == null || !eablkybsjgVar.eablkybsjg(obj, this.f19291dxjokdxxww, this.f19304ojitshcjhn, iobyxmoadgVar, zKcexrzcfyt)) {
                z14 = false;
            }
            if (!(z14 | zEablkybsjg)) {
                this.f19304ojitshcjhn.nufgyqmvbu(obj, this.f19309vdvldrhtss.iobyxmoadg(iobyxmoadgVar, zKcexrzcfyt));
            }
            this.f19297istkbnxepw = false;
            h9.zoijcleaow.gxszxtbevo("GlideRequest", this.f19296iobyxmoadg);
        } catch (Throwable th2) {
            this.f19297istkbnxepw = false;
            throw th2;
        }
    }

    private Drawable rgvfuqvkyq() {
        if (this.f19289cqumvgiudr == null) {
            Drawable drawableOjitshcjhn = this.f19294gtknphoqwx.ojitshcjhn();
            this.f19289cqumvgiudr = drawableOjitshcjhn;
            if (drawableOjitshcjhn == null && this.f19294gtknphoqwx.agtfadlqog() > 0) {
                this.f19289cqumvgiudr = zdlpuopuiu(this.f19294gtknphoqwx.agtfadlqog());
            }
        }
        return this.f19289cqumvgiudr;
    }

    private Drawable vdvldrhtss() {
        if (this.f19301lereixgezr == null) {
            Drawable drawableRgvfuqvkyq = this.f19294gtknphoqwx.rgvfuqvkyq();
            this.f19301lereixgezr = drawableRgvfuqvkyq;
            if (drawableRgvfuqvkyq == null && this.f19294gtknphoqwx.vdvldrhtss() > 0) {
                this.f19301lereixgezr = zdlpuopuiu(this.f19294gtknphoqwx.vdvldrhtss());
            }
        }
        return this.f19301lereixgezr;
    }

    private boolean wflxmlrfwp() {
        wkgbmnqykc wkgbmnqykcVar = this.f19295gxszxtbevo;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.wkgbmnqykc(this);
    }

    private void yggfygwlhe(String str) {
        Log.v("GlideRequest", str + " this: " + this.f19314zoijcleaow);
    }

    private Drawable zdlpuopuiu(int i13) {
        return v8.dxjokdxxww.iobyxmoadg(this.f19302lqeggnwhkg, i13, this.f19294gtknphoqwx.zynmafqrjb() != null ? this.f19294gtknphoqwx.zynmafqrjb() : this.f19302lqeggnwhkg.getTheme());
    }

    private void zynmafqrjb() {
        if (draadjrbmk()) {
            Drawable drawableVdvldrhtss = this.f19291dxjokdxxww == null ? vdvldrhtss() : null;
            if (drawableVdvldrhtss == null) {
                drawableVdvldrhtss = rgvfuqvkyq();
            }
            if (drawableVdvldrhtss == null) {
                drawableVdvldrhtss = oxmwwwfdhm();
            }
            this.f19304ojitshcjhn.dxjokdxxww(drawableVdvldrhtss);
        }
    }

    @Override // c9.ppxfxbqfkf
    public void btonecajqb() {
        synchronized (this.f19311wkgbmnqykc) {
            try {
                dxjokdxxww();
                this.f19307ppxfxbqfkf.ppxfxbqfkf();
                this.f19312yggfygwlhe = g9.lqeggnwhkg.zoijcleaow();
                Object obj = this.f19291dxjokdxxww;
                if (obj == null) {
                    if (draadjrbmk.zdlpuopuiu(this.f19290draadjrbmk, this.f19310wflxmlrfwp)) {
                        this.f19306pmvmpeiblj = this.f19290draadjrbmk;
                        this.f19315zynmafqrjb = this.f19310wflxmlrfwp;
                    }
                    lereixgezr(new GlideException("Received null model"), vdvldrhtss() == null ? 5 : 3);
                    return;
                }
                iobyxmoadg iobyxmoadgVar = this.f19298iwizpuwonk;
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.RUNNING;
                if (iobyxmoadgVar == iobyxmoadgVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (iobyxmoadgVar == iobyxmoadg.COMPLETE) {
                    wkgbmnqykc(this.f19300kcexrzcfyt, l8.iobyxmoadg.MEMORY_CACHE, false);
                    return;
                }
                ojitshcjhn(obj);
                this.f19296iobyxmoadg = h9.zoijcleaow.zoijcleaow("GlideRequest");
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.WAITING_FOR_SIZE;
                this.f19298iwizpuwonk = iobyxmoadgVar3;
                if (draadjrbmk.zdlpuopuiu(this.f19290draadjrbmk, this.f19310wflxmlrfwp)) {
                    gxszxtbevo(this.f19290draadjrbmk, this.f19310wflxmlrfwp);
                } else {
                    this.f19304ojitshcjhn.btonecajqb(this);
                }
                iobyxmoadg iobyxmoadgVar4 = this.f19298iwizpuwonk;
                if ((iobyxmoadgVar4 == iobyxmoadgVar2 || iobyxmoadgVar4 == iobyxmoadgVar3) && draadjrbmk()) {
                    this.f19304ojitshcjhn.gxszxtbevo(oxmwwwfdhm());
                }
                if (f19285yadqdtsiqt) {
                    yggfygwlhe("finished run method in " + g9.lqeggnwhkg.iobyxmoadg(this.f19312yggfygwlhe));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public void clear() {
        synchronized (this.f19311wkgbmnqykc) {
            try {
                dxjokdxxww();
                this.f19307ppxfxbqfkf.ppxfxbqfkf();
                iobyxmoadg iobyxmoadgVar = this.f19298iwizpuwonk;
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.CLEARED;
                if (iobyxmoadgVar == iobyxmoadgVar2) {
                    return;
                }
                agtfadlqog();
                n8.ppxfxbqfkf ppxfxbqfkfVar = this.f19300kcexrzcfyt;
                if (ppxfxbqfkfVar != null) {
                    this.f19300kcexrzcfyt = null;
                } else {
                    ppxfxbqfkfVar = null;
                }
                if (gtknphoqwx()) {
                    this.f19304ojitshcjhn.lqeggnwhkg(oxmwwwfdhm());
                }
                h9.zoijcleaow.gxszxtbevo("GlideRequest", this.f19296iobyxmoadg);
                this.f19298iwizpuwonk = iobyxmoadgVar2;
                if (ppxfxbqfkfVar != null) {
                    this.f19299jyumaefscl.gtknphoqwx(ppxfxbqfkfVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public boolean eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
        int i13;
        int i14;
        Object obj;
        Class cls;
        c9.iobyxmoadg iobyxmoadgVar;
        btonecajqb btonecajqbVar;
        int size;
        int i15;
        int i16;
        Object obj2;
        Class cls2;
        c9.iobyxmoadg iobyxmoadgVar2;
        btonecajqb btonecajqbVar2;
        int size2;
        if (!(ppxfxbqfkfVar instanceof nufgyqmvbu)) {
            return false;
        }
        synchronized (this.f19311wkgbmnqykc) {
            try {
                i13 = this.f19290draadjrbmk;
                i14 = this.f19310wflxmlrfwp;
                obj = this.f19291dxjokdxxww;
                cls = this.f19287btonecajqb;
                iobyxmoadgVar = this.f19294gtknphoqwx;
                btonecajqbVar = this.f19286agtfadlqog;
                List list = this.f19308rgvfuqvkyq;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) ppxfxbqfkfVar;
        synchronized (nufgyqmvbuVar.f19311wkgbmnqykc) {
            try {
                i15 = nufgyqmvbuVar.f19290draadjrbmk;
                i16 = nufgyqmvbuVar.f19310wflxmlrfwp;
                obj2 = nufgyqmvbuVar.f19291dxjokdxxww;
                cls2 = nufgyqmvbuVar.f19287btonecajqb;
                iobyxmoadgVar2 = nufgyqmvbuVar.f19294gtknphoqwx;
                btonecajqbVar2 = nufgyqmvbuVar.f19286agtfadlqog;
                List list2 = nufgyqmvbuVar.f19308rgvfuqvkyq;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i13 == i15 && i14 == i16 && draadjrbmk.ppxfxbqfkf(obj, obj2) && cls.equals(cls2) && draadjrbmk.zoijcleaow(iobyxmoadgVar, iobyxmoadgVar2) && btonecajqbVar == btonecajqbVar2 && size == size2;
    }

    @Override // d9.nufgyqmvbu
    public void gxszxtbevo(int i13, int i14) throws Throwable {
        Object obj;
        this.f19307ppxfxbqfkf.ppxfxbqfkf();
        Object obj2 = this.f19311wkgbmnqykc;
        synchronized (obj2) {
            try {
                try {
                    boolean z13 = f19285yadqdtsiqt;
                    if (z13) {
                        yggfygwlhe("Got onSizeReady in " + g9.lqeggnwhkg.iobyxmoadg(this.f19312yggfygwlhe));
                    }
                    if (this.f19298iwizpuwonk == iobyxmoadg.WAITING_FOR_SIZE) {
                        iobyxmoadg iobyxmoadgVar = iobyxmoadg.RUNNING;
                        this.f19298iwizpuwonk = iobyxmoadgVar;
                        float fPmvmpeiblj = this.f19294gtknphoqwx.pmvmpeiblj();
                        this.f19306pmvmpeiblj = jyumaefscl(i13, fPmvmpeiblj);
                        this.f19315zynmafqrjb = jyumaefscl(i14, fPmvmpeiblj);
                        if (z13) {
                            yggfygwlhe("finished setup for calling load in " + g9.lqeggnwhkg.iobyxmoadg(this.f19312yggfygwlhe));
                        }
                        obj = obj2;
                        try {
                            this.f19313zdlpuopuiu = this.f19299jyumaefscl.gxszxtbevo(this.f19303nufgyqmvbu, this.f19291dxjokdxxww, this.f19294gtknphoqwx.lereixgezr(), this.f19306pmvmpeiblj, this.f19315zynmafqrjb, this.f19294gtknphoqwx.esjtqupxsv(), this.f19287btonecajqb, this.f19286agtfadlqog, this.f19294gtknphoqwx.wflxmlrfwp(), this.f19294gtknphoqwx.istkbnxepw(), this.f19294gtknphoqwx.dsvhmnatus(), this.f19294gtknphoqwx.hcddaimhww(), this.f19294gtknphoqwx.kcexrzcfyt(), this.f19294gtknphoqwx.ylkuphrtab(), this.f19294gtknphoqwx.yadqdtsiqt(), this.f19294gtknphoqwx.cdpycssgdh(), this.f19294gtknphoqwx.oxmwwwfdhm(), this, this.f19305oxmwwwfdhm);
                            if (this.f19298iwizpuwonk != iobyxmoadgVar) {
                                this.f19313zdlpuopuiu = null;
                            }
                            if (z13) {
                                yggfygwlhe("finished onSizeReady in " + g9.lqeggnwhkg.iobyxmoadg(this.f19312yggfygwlhe));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public boolean iobyxmoadg() {
        boolean z13;
        synchronized (this.f19311wkgbmnqykc) {
            z13 = this.f19298iwizpuwonk == iobyxmoadg.COMPLETE;
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean isRunning() {
        boolean z13;
        synchronized (this.f19311wkgbmnqykc) {
            try {
                iobyxmoadg iobyxmoadgVar = this.f19298iwizpuwonk;
                z13 = iobyxmoadgVar == iobyxmoadg.RUNNING || iobyxmoadgVar == iobyxmoadg.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.lqeggnwhkg
    public Object lqeggnwhkg() {
        this.f19307ppxfxbqfkf.ppxfxbqfkf();
        return this.f19311wkgbmnqykc;
    }

    @Override // c9.ppxfxbqfkf
    public boolean nufgyqmvbu() {
        boolean z13;
        synchronized (this.f19311wkgbmnqykc) {
            z13 = this.f19298iwizpuwonk == iobyxmoadg.CLEARED;
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public void pause() {
        synchronized (this.f19311wkgbmnqykc) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.lqeggnwhkg
    public void ppxfxbqfkf(GlideException glideException) {
        lereixgezr(glideException, 5);
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f19311wkgbmnqykc) {
            obj = this.f19291dxjokdxxww;
            cls = this.f19287btonecajqb;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // c9.lqeggnwhkg
    public void wkgbmnqykc(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        this.f19307ppxfxbqfkf.ppxfxbqfkf();
        n8.ppxfxbqfkf ppxfxbqfkfVar2 = null;
        try {
            synchronized (this.f19311wkgbmnqykc) {
                try {
                    this.f19313zdlpuopuiu = null;
                    if (ppxfxbqfkfVar == null) {
                        ppxfxbqfkf(new GlideException("Expected to receive a Resource<R> with an object of " + this.f19287btonecajqb + " inside, but instead got null."));
                        return;
                    }
                    Object obj = ppxfxbqfkfVar.get();
                    try {
                        if (obj != null && this.f19287btonecajqb.isAssignableFrom(obj.getClass())) {
                            if (wflxmlrfwp()) {
                                pmvmpeiblj(ppxfxbqfkfVar, obj, iobyxmoadgVar, z13);
                                return;
                            }
                            this.f19300kcexrzcfyt = null;
                            this.f19298iwizpuwonk = iobyxmoadg.COMPLETE;
                            h9.zoijcleaow.gxszxtbevo("GlideRequest", this.f19296iobyxmoadg);
                            this.f19299jyumaefscl.gtknphoqwx(ppxfxbqfkfVar);
                            return;
                        }
                        this.f19300kcexrzcfyt = null;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Expected to receive an object of ");
                        sb3.append(this.f19287btonecajqb);
                        sb3.append(" but instead got ");
                        sb3.append(obj != null ? obj.getClass() : "");
                        sb3.append("{");
                        sb3.append(obj);
                        sb3.append("} inside Resource{");
                        sb3.append(ppxfxbqfkfVar);
                        sb3.append("}.");
                        sb3.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        ppxfxbqfkf(new GlideException(sb3.toString()));
                        this.f19299jyumaefscl.gtknphoqwx(ppxfxbqfkfVar);
                    } catch (Throwable th2) {
                        ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (ppxfxbqfkfVar2 != null) {
                this.f19299jyumaefscl.gtknphoqwx(ppxfxbqfkfVar2);
            }
            throw th4;
        }
    }

    @Override // c9.ppxfxbqfkf
    public boolean zoijcleaow() {
        boolean z13;
        synchronized (this.f19311wkgbmnqykc) {
            z13 = this.f19298iwizpuwonk == iobyxmoadg.COMPLETE;
        }
        return z13;
    }
}
