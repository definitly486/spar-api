package istkbnxepw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class sflfametgt implements sopmlzcsov {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicReference f49415zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f49412iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f49413ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f49414wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f49410eablkybsjg = new HashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CopyOnWriteArraySet f49411gxszxtbevo = new CopyOnWriteArraySet();

    static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        static iobyxmoadg zoijcleaow(Throwable th2) {
            return new eablkybsjg(th2);
        }

        public abstract Throwable iobyxmoadg();
    }

    private static final class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final Object f49416pmvmpeiblj = new Object();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final AtomicReference f49419iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final sopmlzcsov.iobyxmoadg f49422yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Executor f49423zdlpuopuiu;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final AtomicBoolean f49420jyumaefscl = new AtomicBoolean(true);

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private Object f49417cqumvgiudr = f49416pmvmpeiblj;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f49418esjtqupxsv = -1;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private boolean f49421lereixgezr = false;

        zoijcleaow(AtomicReference atomicReference, Executor executor, sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
            this.f49419iwizpuwonk = atomicReference;
            this.f49423zdlpuopuiu = executor;
            this.f49422yggfygwlhe = iobyxmoadgVar;
        }

        void iobyxmoadg() {
            this.f49420jyumaefscl.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f49420jyumaefscl.get()) {
                        this.f49421lereixgezr = false;
                        return;
                    }
                    Object obj = this.f49419iwizpuwonk.get();
                    int i13 = this.f49418esjtqupxsv;
                    while (true) {
                        if (!Objects.equals(this.f49417cqumvgiudr, obj)) {
                            this.f49417cqumvgiudr = obj;
                            if (obj instanceof iobyxmoadg) {
                                this.f49422yggfygwlhe.ppxfxbqfkf(((iobyxmoadg) obj).iobyxmoadg());
                            } else {
                                this.f49422yggfygwlhe.wkgbmnqykc(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i13 == this.f49418esjtqupxsv || !this.f49420jyumaefscl.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f49419iwizpuwonk.get();
                                    i13 = this.f49418esjtqupxsv;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f49421lereixgezr = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        void zoijcleaow(int i13) {
            synchronized (this) {
                try {
                    if (this.f49420jyumaefscl.get()) {
                        if (i13 <= this.f49418esjtqupxsv) {
                            return;
                        }
                        this.f49418esjtqupxsv = i13;
                        if (this.f49421lereixgezr) {
                            return;
                        }
                        this.f49421lereixgezr = true;
                        try {
                            this.f49423zdlpuopuiu.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f49421lereixgezr = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    sflfametgt(Object obj, boolean z13) {
        if (!z13) {
            this.f49415zoijcleaow = new AtomicReference(obj);
        } else {
            u1.nufgyqmvbu.zoijcleaow(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f49415zoijcleaow = new AtomicReference(iobyxmoadg.zoijcleaow((Throwable) obj));
        }
    }

    private void gxszxtbevo(Object obj) {
        Iterator it;
        int i13;
        synchronized (this.f49412iobyxmoadg) {
            try {
                if (Objects.equals(this.f49415zoijcleaow.getAndSet(obj), obj)) {
                    return;
                }
                int i14 = this.f49413ppxfxbqfkf + 1;
                this.f49413ppxfxbqfkf = i14;
                if (this.f49414wkgbmnqykc) {
                    return;
                }
                this.f49414wkgbmnqykc = true;
                Iterator it2 = this.f49411gxszxtbevo.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((zoijcleaow) it2.next()).zoijcleaow(i14);
                    } else {
                        synchronized (this.f49412iobyxmoadg) {
                            try {
                                if (this.f49413ppxfxbqfkf == i14) {
                                    this.f49414wkgbmnqykc = false;
                                    return;
                                } else {
                                    it = this.f49411gxszxtbevo.iterator();
                                    i13 = this.f49413ppxfxbqfkf;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        it2 = it;
                        i14 = i13;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void wkgbmnqykc(sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f49410eablkybsjg.remove(iobyxmoadgVar);
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg();
            this.f49411gxszxtbevo.remove(zoijcleaowVar);
        }
    }

    void eablkybsjg(Object obj) {
        gxszxtbevo(obj);
    }

    @Override // istkbnxepw.sopmlzcsov
    public void iobyxmoadg(sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f49412iobyxmoadg) {
            wkgbmnqykc(iobyxmoadgVar);
        }
    }

    public com.google.common.util.concurrent.wkgbmnqykc ppxfxbqfkf() {
        Object obj = this.f49415zoijcleaow.get();
        return obj instanceof iobyxmoadg ? iozdgvuglv.gtknphoqwx.btonecajqb(((iobyxmoadg) obj).iobyxmoadg()) : iozdgvuglv.gtknphoqwx.draadjrbmk(obj);
    }

    @Override // istkbnxepw.sopmlzcsov
    public void zoijcleaow(Executor executor, sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar;
        synchronized (this.f49412iobyxmoadg) {
            wkgbmnqykc(iobyxmoadgVar);
            zoijcleaowVar = new zoijcleaow(this.f49415zoijcleaow, executor, iobyxmoadgVar);
            this.f49410eablkybsjg.put(iobyxmoadgVar, zoijcleaowVar);
            this.f49411gxszxtbevo.add(zoijcleaowVar);
        }
        zoijcleaowVar.zoijcleaow(0);
    }
}
