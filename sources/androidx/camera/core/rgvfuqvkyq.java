package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import istkbnxepw.cllcsxoeiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import lereixgezr.dsvhmnatus;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class rgvfuqvkyq implements cllcsxoeiz, eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final LongSparseArray f3956btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f3957draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final LongSparseArray f3958dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f3959eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f3960gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cllcsxoeiz f3961gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f3962iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    cllcsxoeiz.iobyxmoadg f3963lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Executor f3964nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f3965ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final List f3966wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private cllcsxoeiz.iobyxmoadg f3967wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private istkbnxepw.nufgyqmvbu f3968zoijcleaow;

    class iobyxmoadg extends istkbnxepw.nufgyqmvbu {
        iobyxmoadg() {
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            super.zoijcleaow(i13, ojitshcjhnVar);
            rgvfuqvkyq.this.zdlpuopuiu(ojitshcjhnVar);
        }
    }

    public rgvfuqvkyq(int i13, int i14, int i15, int i16) {
        this(gtknphoqwx(i13, i14, i15, i16));
    }

    private void draadjrbmk(agtfadlqog agtfadlqogVar) {
        synchronized (this.f3962iobyxmoadg) {
            try {
                int iIndexOf = this.f3957draadjrbmk.indexOf(agtfadlqogVar);
                if (iIndexOf >= 0) {
                    this.f3957draadjrbmk.remove(iIndexOf);
                    int i13 = this.f3960gtknphoqwx;
                    if (iIndexOf <= i13) {
                        this.f3960gtknphoqwx = i13 - 1;
                    }
                }
                this.f3966wflxmlrfwp.remove(agtfadlqogVar);
                if (this.f3965ppxfxbqfkf > 0) {
                    ojitshcjhn(this.f3961gxszxtbevo);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static cllcsxoeiz gtknphoqwx(int i13, int i14, int i15, int i16) {
        return new wkgbmnqykc(ImageReader.newInstance(i13, i14, i15, i16));
    }

    private void kcexrzcfyt() {
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3956btonecajqb.size() != 0 && this.f3958dxjokdxxww.size() != 0) {
                    long jKeyAt = this.f3956btonecajqb.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f3958dxjokdxxww.keyAt(0);
                    u1.nufgyqmvbu.iobyxmoadg(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f3956btonecajqb.size() - 1; size >= 0; size--) {
                            if (this.f3956btonecajqb.keyAt(size) < jKeyAt2) {
                                ((agtfadlqog) this.f3956btonecajqb.valueAt(size)).close();
                                this.f3956btonecajqb.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f3958dxjokdxxww.size() - 1; size2 >= 0; size2--) {
                            if (this.f3958dxjokdxxww.keyAt(size2) < jKeyAt) {
                                this.f3958dxjokdxxww.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void oxmwwwfdhm() {
        synchronized (this.f3962iobyxmoadg) {
            try {
                for (int size = this.f3958dxjokdxxww.size() - 1; size >= 0; size--) {
                    dsvhmnatus dsvhmnatusVar = (dsvhmnatus) this.f3958dxjokdxxww.valueAt(size);
                    long timestamp = dsvhmnatusVar.getTimestamp();
                    agtfadlqog agtfadlqogVar = (agtfadlqog) this.f3956btonecajqb.get(timestamp);
                    if (agtfadlqogVar != null) {
                        this.f3956btonecajqb.remove(timestamp);
                        this.f3958dxjokdxxww.removeAt(size);
                        wflxmlrfwp(new oxmwwwfdhm(agtfadlqogVar, dsvhmnatusVar));
                    }
                }
                kcexrzcfyt();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rgvfuqvkyq(cllcsxoeiz.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(cllcsxoeiz cllcsxoeizVar) {
        synchronized (this.f3962iobyxmoadg) {
            this.f3965ppxfxbqfkf++;
        }
        ojitshcjhn(cllcsxoeizVar);
    }

    private void wflxmlrfwp(oxmwwwfdhm oxmwwwfdhmVar) {
        final cllcsxoeiz.iobyxmoadg iobyxmoadgVar;
        Executor executor;
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3957draadjrbmk.size() < gxszxtbevo()) {
                    oxmwwwfdhmVar.iobyxmoadg(this);
                    this.f3957draadjrbmk.add(oxmwwwfdhmVar);
                    iobyxmoadgVar = this.f3963lqeggnwhkg;
                    executor = this.f3964nufgyqmvbu;
                } else {
                    sopmlzcsov.iobyxmoadg("TAG", "Maximum image number reached.");
                    oxmwwwfdhmVar.close();
                    iobyxmoadgVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: lereixgezr.jlmebxxoox
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62297zdlpuopuiu.rgvfuqvkyq(iobyxmoadgVar);
                    }
                });
            } else {
                iobyxmoadgVar.iobyxmoadg(this);
            }
        }
    }

    public istkbnxepw.nufgyqmvbu agtfadlqog() {
        return this.f3968zoijcleaow;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void close() {
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3959eablkybsjg) {
                    return;
                }
                Iterator it = new ArrayList(this.f3957draadjrbmk).iterator();
                while (it.hasNext()) {
                    ((agtfadlqog) it.next()).close();
                }
                this.f3957draadjrbmk.clear();
                this.f3961gxszxtbevo.close();
                this.f3959eablkybsjg = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void eablkybsjg() {
        synchronized (this.f3962iobyxmoadg) {
            this.f3961gxszxtbevo.eablkybsjg();
            this.f3963lqeggnwhkg = null;
            this.f3964nufgyqmvbu = null;
            this.f3965ppxfxbqfkf = 0;
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getHeight() {
        int height;
        synchronized (this.f3962iobyxmoadg) {
            height = this.f3961gxszxtbevo.getHeight();
        }
        return height;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getWidth() {
        int width;
        synchronized (this.f3962iobyxmoadg) {
            width = this.f3961gxszxtbevo.getWidth();
        }
        return width;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int gxszxtbevo() {
        int iGxszxtbevo;
        synchronized (this.f3962iobyxmoadg) {
            iGxszxtbevo = this.f3961gxszxtbevo.gxszxtbevo();
        }
        return iGxszxtbevo;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public Surface iobyxmoadg() {
        Surface surfaceIobyxmoadg;
        synchronized (this.f3962iobyxmoadg) {
            surfaceIobyxmoadg = this.f3961gxszxtbevo.iobyxmoadg();
        }
        return surfaceIobyxmoadg;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void lqeggnwhkg(cllcsxoeiz.iobyxmoadg iobyxmoadgVar, Executor executor) {
        synchronized (this.f3962iobyxmoadg) {
            this.f3963lqeggnwhkg = (cllcsxoeiz.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar);
            this.f3964nufgyqmvbu = (Executor) u1.nufgyqmvbu.gxszxtbevo(executor);
            this.f3961gxszxtbevo.lqeggnwhkg(this.f3967wkgbmnqykc, executor);
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog nufgyqmvbu() {
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3957draadjrbmk.isEmpty()) {
                    return null;
                }
                if (this.f3960gtknphoqwx >= this.f3957draadjrbmk.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f3957draadjrbmk;
                int i13 = this.f3960gtknphoqwx;
                this.f3960gtknphoqwx = i13 + 1;
                agtfadlqog agtfadlqogVar = (agtfadlqog) list.get(i13);
                this.f3966wflxmlrfwp.add(agtfadlqogVar);
                return agtfadlqogVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void ojitshcjhn(cllcsxoeiz cllcsxoeizVar) {
        agtfadlqog agtfadlqogVarNufgyqmvbu;
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3959eablkybsjg) {
                    return;
                }
                int size = this.f3956btonecajqb.size() + this.f3957draadjrbmk.size();
                if (size >= cllcsxoeizVar.gxszxtbevo()) {
                    sopmlzcsov.iobyxmoadg("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        agtfadlqogVarNufgyqmvbu = cllcsxoeizVar.nufgyqmvbu();
                        if (agtfadlqogVarNufgyqmvbu != null) {
                            this.f3965ppxfxbqfkf--;
                            size++;
                            this.f3956btonecajqb.put(agtfadlqogVarNufgyqmvbu.K().getTimestamp(), agtfadlqogVarNufgyqmvbu);
                            oxmwwwfdhm();
                        }
                    } catch (IllegalStateException e13) {
                        sopmlzcsov.zoijcleaow("MetadataImageReader", "Failed to acquire next image.", e13);
                        agtfadlqogVarNufgyqmvbu = null;
                    }
                    if (agtfadlqogVarNufgyqmvbu == null || this.f3965ppxfxbqfkf <= 0) {
                        break;
                    }
                } while (size < cllcsxoeizVar.gxszxtbevo());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog ppxfxbqfkf() {
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3957draadjrbmk.isEmpty()) {
                    return null;
                }
                if (this.f3960gtknphoqwx >= this.f3957draadjrbmk.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < this.f3957draadjrbmk.size() - 1; i13++) {
                    if (!this.f3966wflxmlrfwp.contains(this.f3957draadjrbmk.get(i13))) {
                        arrayList.add((agtfadlqog) this.f3957draadjrbmk.get(i13));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((agtfadlqog) it.next()).close();
                }
                int size = this.f3957draadjrbmk.size();
                List list = this.f3957draadjrbmk;
                this.f3960gtknphoqwx = size;
                agtfadlqog agtfadlqogVar = (agtfadlqog) list.get(size - 1);
                this.f3966wflxmlrfwp.add(agtfadlqogVar);
                return agtfadlqogVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int wkgbmnqykc() {
        int iWkgbmnqykc;
        synchronized (this.f3962iobyxmoadg) {
            iWkgbmnqykc = this.f3961gxszxtbevo.wkgbmnqykc();
        }
        return iWkgbmnqykc;
    }

    void zdlpuopuiu(istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        synchronized (this.f3962iobyxmoadg) {
            try {
                if (this.f3959eablkybsjg) {
                    return;
                }
                this.f3958dxjokdxxww.put(ojitshcjhnVar.getTimestamp(), new lmojexxdyd.zoijcleaow(ojitshcjhnVar));
                oxmwwwfdhm();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
    public void zoijcleaow(agtfadlqog agtfadlqogVar) {
        synchronized (this.f3962iobyxmoadg) {
            draadjrbmk(agtfadlqogVar);
        }
    }

    rgvfuqvkyq(cllcsxoeiz cllcsxoeizVar) {
        this.f3962iobyxmoadg = new Object();
        this.f3968zoijcleaow = new iobyxmoadg();
        this.f3965ppxfxbqfkf = 0;
        this.f3967wkgbmnqykc = new cllcsxoeiz.iobyxmoadg() { // from class: lereixgezr.crxdokpmqz
            @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
            public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar2) {
                this.f62251iobyxmoadg.vdvldrhtss(cllcsxoeizVar2);
            }
        };
        this.f3959eablkybsjg = false;
        this.f3958dxjokdxxww = new LongSparseArray();
        this.f3956btonecajqb = new LongSparseArray();
        this.f3966wflxmlrfwp = new ArrayList();
        this.f3961gxszxtbevo = cllcsxoeizVar;
        this.f3960gtknphoqwx = 0;
        this.f3957draadjrbmk = new ArrayList(gxszxtbevo());
    }
}
