package lj;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class gtknphoqwx extends draadjrbmk implements Iterator, lg.gxszxtbevo, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private lg.gxszxtbevo f62652iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Iterator f62653jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f62654yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f62655zdlpuopuiu;

    private final Object eablkybsjg() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable wkgbmnqykc() {
        int i13 = this.f62655zdlpuopuiu;
        if (i13 == 4) {
            return new NoSuchElementException();
        }
        if (i13 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f62655zdlpuopuiu);
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return lg.gtknphoqwx.f62507zdlpuopuiu;
    }

    public final void gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
        this.f62652iwizpuwonk = gxszxtbevoVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i13 = this.f62655zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2 || i13 == 3) {
                        return true;
                    }
                    if (i13 == 4) {
                        return false;
                    }
                    throw wkgbmnqykc();
                }
                Iterator it = this.f62653jyumaefscl;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(it);
                if (it.hasNext()) {
                    this.f62655zdlpuopuiu = 2;
                    return true;
                }
                this.f62653jyumaefscl = null;
            }
            this.f62655zdlpuopuiu = 5;
            lg.gxszxtbevo gxszxtbevoVar = this.f62652iwizpuwonk;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
            this.f62652iwizpuwonk = null;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    @Override // lj.draadjrbmk
    public Object iobyxmoadg(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        this.f62654yggfygwlhe = obj;
        this.f62655zdlpuopuiu = 3;
        this.f62652iwizpuwonk = gxszxtbevoVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        if (objGxszxtbevo == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i13 = this.f62655zdlpuopuiu;
        if (i13 == 0 || i13 == 1) {
            return eablkybsjg();
        }
        if (i13 == 2) {
            this.f62655zdlpuopuiu = 1;
            Iterator it = this.f62653jyumaefscl;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(it);
            return it.next();
        }
        if (i13 != 3) {
            throw wkgbmnqykc();
        }
        this.f62655zdlpuopuiu = 0;
        Object obj = this.f62654yggfygwlhe;
        this.f62654yggfygwlhe = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        gg.zdlpuopuiu.zoijcleaow(obj);
        this.f62655zdlpuopuiu = 4;
    }

    @Override // lj.draadjrbmk
    public Object zoijcleaow(Iterator it, lg.gxszxtbevo gxszxtbevoVar) {
        if (!it.hasNext()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        this.f62653jyumaefscl = it;
        this.f62655zdlpuopuiu = 2;
        this.f62652iwizpuwonk = gxszxtbevoVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        if (objGxszxtbevo == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }
}
