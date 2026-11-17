package uj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pj.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class agtfadlqog {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113629zdlpuopuiu = AtomicReferenceFieldUpdater.newUpdater(agtfadlqog.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113628yggfygwlhe = AtomicReferenceFieldUpdater.newUpdater(agtfadlqog.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f113627jyumaefscl = AtomicReferenceFieldUpdater.newUpdater(agtfadlqog.class, Object.class, "_removedRef$volatile");

    private final void btonecajqb(agtfadlqog agtfadlqogVar) {
        agtfadlqog agtfadlqogVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f113628yggfygwlhe;
        do {
            agtfadlqogVar2 = (agtfadlqog) atomicReferenceFieldUpdater.get(agtfadlqogVar);
            if (gtknphoqwx() != agtfadlqogVar) {
                return;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113628yggfygwlhe, agtfadlqogVar, agtfadlqogVar2, this));
        if (vdvldrhtss()) {
            agtfadlqogVar.nufgyqmvbu();
        }
    }

    private final agtfadlqog dxjokdxxww(agtfadlqog agtfadlqogVar) {
        while (agtfadlqogVar.vdvldrhtss()) {
            agtfadlqogVar = (agtfadlqog) f113628yggfygwlhe.get(agtfadlqogVar);
        }
        return agtfadlqogVar;
    }

    private final agtfadlqog nufgyqmvbu() {
        Object obj;
        while (true) {
            agtfadlqog agtfadlqogVar = (agtfadlqog) f113628yggfygwlhe.get(this);
            agtfadlqog agtfadlqogVar2 = agtfadlqogVar;
            while (true) {
                agtfadlqog agtfadlqogVar3 = null;
                while (true) {
                    obj = f113629zdlpuopuiu.get(agtfadlqogVar2);
                    if (obj == this) {
                        if (agtfadlqogVar != agtfadlqogVar2 && !androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113628yggfygwlhe, this, agtfadlqogVar, agtfadlqogVar2)) {
                            break;
                        }
                        return agtfadlqogVar2;
                    }
                    if (vdvldrhtss()) {
                        return null;
                    }
                    if (!(obj instanceof iwizpuwonk)) {
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        agtfadlqogVar3 = agtfadlqogVar2;
                        agtfadlqogVar2 = (agtfadlqog) obj;
                    } else {
                        if (agtfadlqogVar3 != null) {
                            break;
                        }
                        agtfadlqogVar2 = (agtfadlqog) f113628yggfygwlhe.get(agtfadlqogVar2);
                    }
                }
                if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113629zdlpuopuiu, agtfadlqogVar3, agtfadlqogVar2, ((iwizpuwonk) obj).f113649iobyxmoadg)) {
                    break;
                }
                agtfadlqogVar2 = agtfadlqogVar3;
            }
        }
    }

    private final iwizpuwonk zdlpuopuiu() {
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) f113627jyumaefscl.get(this);
        if (iwizpuwonkVar != null) {
            return iwizpuwonkVar;
        }
        iwizpuwonk iwizpuwonkVar2 = new iwizpuwonk(this);
        f113627jyumaefscl.set(this, iwizpuwonkVar2);
        return iwizpuwonkVar2;
    }

    public final agtfadlqog draadjrbmk() {
        agtfadlqog agtfadlqogVar;
        Object objGtknphoqwx = gtknphoqwx();
        iwizpuwonk iwizpuwonkVar = objGtknphoqwx instanceof iwizpuwonk ? (iwizpuwonk) objGtknphoqwx : null;
        if (iwizpuwonkVar != null && (agtfadlqogVar = iwizpuwonkVar.f113649iobyxmoadg) != null) {
            return agtfadlqogVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objGtknphoqwx, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (agtfadlqog) objGtknphoqwx;
    }

    public final boolean eablkybsjg(agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        f113628yggfygwlhe.set(agtfadlqogVar, this);
        f113629zdlpuopuiu.set(agtfadlqogVar, agtfadlqogVar2);
        if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113629zdlpuopuiu, this, agtfadlqogVar2, agtfadlqogVar)) {
            return false;
        }
        agtfadlqogVar.btonecajqb(agtfadlqogVar2);
        return true;
    }

    public final Object gtknphoqwx() {
        return f113629zdlpuopuiu.get(this);
    }

    public final boolean gxszxtbevo(agtfadlqog agtfadlqogVar) {
        f113628yggfygwlhe.set(agtfadlqogVar, this);
        f113629zdlpuopuiu.set(agtfadlqogVar, this);
        while (gtknphoqwx() == this) {
            if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113629zdlpuopuiu, this, this, agtfadlqogVar)) {
                agtfadlqogVar.btonecajqb(this);
                return true;
            }
        }
        return false;
    }

    public final agtfadlqog kcexrzcfyt() {
        Object objGtknphoqwx;
        agtfadlqog agtfadlqogVar;
        do {
            objGtknphoqwx = gtknphoqwx();
            if (objGtknphoqwx instanceof iwizpuwonk) {
                return ((iwizpuwonk) objGtknphoqwx).f113649iobyxmoadg;
            }
            if (objGtknphoqwx == this) {
                return (agtfadlqog) objGtknphoqwx;
            }
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objGtknphoqwx, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            agtfadlqogVar = (agtfadlqog) objGtknphoqwx;
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f113629zdlpuopuiu, this, objGtknphoqwx, agtfadlqogVar.zdlpuopuiu()));
        agtfadlqogVar.nufgyqmvbu();
        return null;
    }

    public final void lqeggnwhkg(int i13) {
        wkgbmnqykc(new draadjrbmk(i13), i13);
    }

    public boolean oxmwwwfdhm() {
        return kcexrzcfyt() == null;
    }

    public String toString() {
        return new kotlin.jvm.internal.istkbnxepw(this) { // from class: uj.agtfadlqog.iobyxmoadg
            @Override // ah.draadjrbmk
            public Object get() {
                return kegysxyocb.iobyxmoadg(this.receiver);
            }
        } + '@' + kegysxyocb.zoijcleaow(this);
    }

    public boolean vdvldrhtss() {
        return gtknphoqwx() instanceof iwizpuwonk;
    }

    public final agtfadlqog wflxmlrfwp() {
        agtfadlqog agtfadlqogVarNufgyqmvbu = nufgyqmvbu();
        return agtfadlqogVarNufgyqmvbu == null ? dxjokdxxww((agtfadlqog) f113628yggfygwlhe.get(this)) : agtfadlqogVarNufgyqmvbu;
    }

    public final boolean wkgbmnqykc(agtfadlqog agtfadlqogVar, int i13) {
        agtfadlqog agtfadlqogVarWflxmlrfwp;
        do {
            agtfadlqogVarWflxmlrfwp = wflxmlrfwp();
            if (agtfadlqogVarWflxmlrfwp instanceof draadjrbmk) {
                return (((draadjrbmk) agtfadlqogVarWflxmlrfwp).f113641iwizpuwonk & i13) == 0 && agtfadlqogVarWflxmlrfwp.wkgbmnqykc(agtfadlqogVar, i13);
            }
        } while (!agtfadlqogVarWflxmlrfwp.eablkybsjg(agtfadlqogVar, this));
        return true;
    }
}
