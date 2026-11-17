package uj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113686zdlpuopuiu = AtomicReferenceFieldUpdater.newUpdater(zoijcleaow.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113685yggfygwlhe = AtomicReferenceFieldUpdater.newUpdater(zoijcleaow.class, Object.class, "_prev$volatile");

    public zoijcleaow(zoijcleaow zoijcleaowVar) {
        this._prev$volatile = zoijcleaowVar;
    }

    private final zoijcleaow eablkybsjg() {
        zoijcleaow zoijcleaowVarGxszxtbevo;
        zoijcleaow zoijcleaowVarGxszxtbevo2 = gxszxtbevo();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVarGxszxtbevo2);
        while (zoijcleaowVarGxszxtbevo2.gtknphoqwx() && (zoijcleaowVarGxszxtbevo = zoijcleaowVarGxszxtbevo2.gxszxtbevo()) != null) {
            zoijcleaowVarGxszxtbevo2 = zoijcleaowVarGxszxtbevo;
        }
        return zoijcleaowVarGxszxtbevo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lqeggnwhkg() {
        return f113686zdlpuopuiu.get(this);
    }

    private final zoijcleaow wkgbmnqykc() {
        zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu();
        while (zoijcleaowVarNufgyqmvbu != null && zoijcleaowVarNufgyqmvbu.gtknphoqwx()) {
            zoijcleaowVarNufgyqmvbu = (zoijcleaow) f113685yggfygwlhe.get(zoijcleaowVarNufgyqmvbu);
        }
        return zoijcleaowVarNufgyqmvbu;
    }

    public final void agtfadlqog() {
        Object obj;
        if (draadjrbmk()) {
            return;
        }
        while (true) {
            zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
            zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113685yggfygwlhe;
            do {
                obj = atomicReferenceFieldUpdater.get(zoijcleaowVarEablkybsjg);
            } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, zoijcleaowVarEablkybsjg, obj, ((zoijcleaow) obj) == null ? null : zoijcleaowVarWkgbmnqykc));
            if (zoijcleaowVarWkgbmnqykc != null) {
                f113686zdlpuopuiu.set(zoijcleaowVarWkgbmnqykc, zoijcleaowVarEablkybsjg);
            }
            if (!zoijcleaowVarEablkybsjg.gtknphoqwx() || zoijcleaowVarEablkybsjg.draadjrbmk()) {
                if (zoijcleaowVarWkgbmnqykc == null || !zoijcleaowVarWkgbmnqykc.gtknphoqwx()) {
                    return;
                }
            }
        }
    }

    public final boolean draadjrbmk() {
        return gxszxtbevo() == null;
    }

    public abstract boolean gtknphoqwx();

    public final zoijcleaow gxszxtbevo() {
        Object objLqeggnwhkg = lqeggnwhkg();
        if (objLqeggnwhkg == iobyxmoadg.f113647iobyxmoadg) {
            return null;
        }
        return (zoijcleaow) objLqeggnwhkg;
    }

    public final zoijcleaow nufgyqmvbu() {
        return (zoijcleaow) f113685yggfygwlhe.get(this);
    }

    public final boolean ojitshcjhn(zoijcleaow zoijcleaowVar) {
        return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113686zdlpuopuiu, this, null, zoijcleaowVar);
    }

    public final boolean wflxmlrfwp() {
        return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113686zdlpuopuiu, this, null, iobyxmoadg.f113647iobyxmoadg);
    }

    public final void zoijcleaow() {
        f113685yggfygwlhe.set(this, null);
    }
}
