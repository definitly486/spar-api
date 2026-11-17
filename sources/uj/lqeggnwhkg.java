package uj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pj.c;
import pj.czzsidtyhn;
import pj.kegysxyocb;
import pj.ribwqtqdhb;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends ribwqtqdhb implements kotlin.coroutines.jvm.internal.eablkybsjg, lg.gxszxtbevo {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113653pmvmpeiblj = AtomicReferenceFieldUpdater.newUpdater(lqeggnwhkg.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final lg.gxszxtbevo f113654cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public Object f113655esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final pj.pkzmftpjix f113656iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final Object f113657lereixgezr;

    public lqeggnwhkg(pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(-1);
        this.f113656iwizpuwonk = pkzmftpjixVar;
        this.f113654cqumvgiudr = gxszxtbevoVar;
        this.f113655esjtqupxsv = nufgyqmvbu.f113658iobyxmoadg;
        this.f113657lereixgezr = pkzmftpjix.lqeggnwhkg(getContext());
    }

    private final pj.rgvfuqvkyq gtknphoqwx() {
        Object obj = f113653pmvmpeiblj.get(this);
        if (obj instanceof pj.rgvfuqvkyq) {
            return (pj.rgvfuqvkyq) obj;
        }
        return null;
    }

    public final void btonecajqb(lg.btonecajqb btonecajqbVar, Object obj) {
        this.f113655esjtqupxsv = obj;
        this.f76767jyumaefscl = 1;
        this.f113656iwizpuwonk.ntlheqmsrt(btonecajqbVar, this);
    }

    public final pj.rgvfuqvkyq dxjokdxxww() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113653pmvmpeiblj;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f113653pmvmpeiblj.set(this, nufgyqmvbu.f113659zoijcleaow);
                return null;
            }
            if (obj instanceof pj.rgvfuqvkyq) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113653pmvmpeiblj, this, obj, nufgyqmvbu.f113659zoijcleaow)) {
                    return (pj.rgvfuqvkyq) obj;
                }
            } else if (obj != nufgyqmvbu.f113659zoijcleaow && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        lg.gxszxtbevo gxszxtbevoVar = this.f113654cqumvgiudr;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return this.f113654cqumvgiudr.getContext();
    }

    @Override // pj.ribwqtqdhb
    public Object lqeggnwhkg() {
        Object obj = this.f113655esjtqupxsv;
        this.f113655esjtqupxsv = nufgyqmvbu.f113658iobyxmoadg;
        return obj;
    }

    public final void nufgyqmvbu() {
        while (f113653pmvmpeiblj.get(this) == nufgyqmvbu.f113659zoijcleaow) {
        }
    }

    public final boolean ojitshcjhn(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113653pmvmpeiblj;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            istkbnxepw istkbnxepwVar = nufgyqmvbu.f113659zoijcleaow;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, istkbnxepwVar)) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113653pmvmpeiblj, this, istkbnxepwVar, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113653pmvmpeiblj, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        Object objZoijcleaow = pj.cdpycssgdh.zoijcleaow(obj);
        if (this.f113656iwizpuwonk.ulzqkzuiru(getContext())) {
            this.f113655esjtqupxsv = objZoijcleaow;
            this.f76767jyumaefscl = 0;
            this.f113656iwizpuwonk.dsvhmnatus(getContext(), this);
            return;
        }
        czzsidtyhn czzsidtyhnVarZoijcleaow = c.f76674iobyxmoadg.zoijcleaow();
        if (czzsidtyhnVarZoijcleaow.weqkydbzbr()) {
            this.f113655esjtqupxsv = objZoijcleaow;
            this.f76767jyumaefscl = 0;
            czzsidtyhnVarZoijcleaow.yfnezrywwk(this);
            return;
        }
        czzsidtyhnVarZoijcleaow.opjhrmiecq(true);
        try {
            lg.btonecajqb context = getContext();
            Object objDxjokdxxww = pkzmftpjix.dxjokdxxww(context, this.f113657lereixgezr);
            try {
                this.f113654cqumvgiudr.resumeWith(obj);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                while (czzsidtyhnVarZoijcleaow.uawqvzlxes()) {
                }
            } catch (Throwable th2) {
                pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                gxszxtbevo(th3);
            } finally {
                czzsidtyhnVarZoijcleaow.xrmfcynszj(true);
            }
        }
    }

    public final void rgvfuqvkyq() {
        nufgyqmvbu();
        pj.rgvfuqvkyq rgvfuqvkyqVarGtknphoqwx = gtknphoqwx();
        if (rgvfuqvkyqVarGtknphoqwx != null) {
            rgvfuqvkyqVarGtknphoqwx.ojitshcjhn();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f113656iwizpuwonk + ", " + kegysxyocb.ppxfxbqfkf(this.f113654cqumvgiudr) + ']';
    }

    public final Throwable vdvldrhtss(pj.agtfadlqog agtfadlqogVar) {
        istkbnxepw istkbnxepwVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113653pmvmpeiblj;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            istkbnxepwVar = nufgyqmvbu.f113659zoijcleaow;
            if (obj != istkbnxepwVar) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113653pmvmpeiblj, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113653pmvmpeiblj, this, istkbnxepwVar, agtfadlqogVar));
        return null;
    }

    public final boolean wflxmlrfwp() {
        return f113653pmvmpeiblj.get(this) != null;
    }

    @Override // pj.ribwqtqdhb
    public lg.gxszxtbevo zoijcleaow() {
        return this;
    }
}
