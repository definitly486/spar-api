package istkbnxepw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mbcevpiqjq implements sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final androidx.lifecycle.pmvmpeiblj f49373iobyxmoadg = new androidx.lifecycle.pmvmpeiblj();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f49374zoijcleaow = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg implements androidx.lifecycle.zynmafqrjb {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final Executor f49375jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final sopmlzcsov.iobyxmoadg f49376yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final AtomicBoolean f49377zdlpuopuiu = new AtomicBoolean(true);

        iobyxmoadg(Executor executor, sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
            this.f49375jyumaefscl = executor;
            this.f49376yggfygwlhe = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc(zoijcleaow zoijcleaowVar) {
            if (this.f49377zdlpuopuiu.get()) {
                if (zoijcleaowVar.iobyxmoadg()) {
                    this.f49376yggfygwlhe.wkgbmnqykc(zoijcleaowVar.wkgbmnqykc());
                } else {
                    u1.nufgyqmvbu.gxszxtbevo(zoijcleaowVar.ppxfxbqfkf());
                    this.f49376yggfygwlhe.ppxfxbqfkf(zoijcleaowVar.ppxfxbqfkf());
                }
            }
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(final zoijcleaow zoijcleaowVar) {
            this.f49375jyumaefscl.execute(new Runnable() { // from class: istkbnxepw.tzroggbefp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49427zdlpuopuiu.wkgbmnqykc(zoijcleaowVar);
                }
            });
        }

        void ppxfxbqfkf() {
            this.f49377zdlpuopuiu.set(false);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f49378iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Throwable f49379zoijcleaow;

        private zoijcleaow(Object obj, Throwable th2) {
            this.f49378iobyxmoadg = obj;
            this.f49379zoijcleaow = th2;
        }

        static zoijcleaow zoijcleaow(Object obj) {
            return new zoijcleaow(obj, null);
        }

        public boolean iobyxmoadg() {
            return this.f49379zoijcleaow == null;
        }

        public Throwable ppxfxbqfkf() {
            return this.f49379zoijcleaow;
        }

        public String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[Result: <");
            if (iobyxmoadg()) {
                str = "Value: " + this.f49378iobyxmoadg;
            } else {
                str = "Error: " + this.f49379zoijcleaow;
            }
            sb3.append(str);
            sb3.append(">]");
            return sb3.toString();
        }

        public Object wkgbmnqykc() {
            if (iobyxmoadg()) {
                return this.f49378iobyxmoadg;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        if (iobyxmoadgVar != null) {
            this.f49373iobyxmoadg.agtfadlqog(iobyxmoadgVar);
        }
        this.f49373iobyxmoadg.btonecajqb(iobyxmoadgVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        this.f49373iobyxmoadg.agtfadlqog(iobyxmoadgVar);
    }

    @Override // istkbnxepw.sopmlzcsov
    public void iobyxmoadg(sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f49374zoijcleaow) {
            try {
                final iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f49374zoijcleaow.remove(iobyxmoadgVar);
                if (iobyxmoadgVar2 != null) {
                    iobyxmoadgVar2.ppxfxbqfkf();
                    yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: istkbnxepw.stevsuqkhv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49425zdlpuopuiu.gxszxtbevo(iobyxmoadgVar2);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void lqeggnwhkg(Object obj) {
        this.f49373iobyxmoadg.wflxmlrfwp(zoijcleaow.zoijcleaow(obj));
    }

    @Override // istkbnxepw.sopmlzcsov
    public void zoijcleaow(Executor executor, sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f49374zoijcleaow) {
            try {
                final iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f49374zoijcleaow.get(iobyxmoadgVar);
                if (iobyxmoadgVar2 != null) {
                    iobyxmoadgVar2.ppxfxbqfkf();
                }
                final iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(executor, iobyxmoadgVar);
                this.f49374zoijcleaow.put(iobyxmoadgVar, iobyxmoadgVar3);
                yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: istkbnxepw.kegysxyocb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49362zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, iobyxmoadgVar3);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
