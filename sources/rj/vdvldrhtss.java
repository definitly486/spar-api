package rj;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public class vdvldrhtss extends eablkybsjg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final int f82923iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final iobyxmoadg f82924lmojexxdyd;

    public vdvldrhtss(int i13, iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        super(i13, draadjrbmkVar);
        this.f82923iozdgvuglv = i13;
        this.f82924lmojexxdyd = iobyxmoadgVar;
        if (iobyxmoadgVar == iobyxmoadg.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + cllcsxoeiz.zoijcleaow(eablkybsjg.class).jyumaefscl() + " instead").toString());
        }
        if (i13 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i13 + " was specified").toString());
    }

    private final Object A(Object obj, boolean z13) {
        tg.draadjrbmk draadjrbmkVar;
        UndeliveredElementException undeliveredElementExceptionPpxfxbqfkf;
        Object objEablkybsjg = super.eablkybsjg(obj);
        if (gtknphoqwx.dxjokdxxww(objEablkybsjg) || gtknphoqwx.nufgyqmvbu(objEablkybsjg)) {
            return objEablkybsjg;
        }
        if (!z13 || (draadjrbmkVar = this.f82862yggfygwlhe) == null || (undeliveredElementExceptionPpxfxbqfkf = uj.jyumaefscl.ppxfxbqfkf(draadjrbmkVar, obj, null, 2, null)) == null) {
            return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
        }
        throw undeliveredElementExceptionPpxfxbqfkf;
    }

    private final Object B(Object obj, boolean z13) {
        return this.f82924lmojexxdyd == iobyxmoadg.DROP_LATEST ? A(obj, z13) : p(obj);
    }

    static /* synthetic */ Object z(vdvldrhtss vdvldrhtssVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionPpxfxbqfkf;
        Object objB = vdvldrhtssVar.B(obj, true);
        if (!(objB instanceof gtknphoqwx.iobyxmoadg)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gtknphoqwx.eablkybsjg(objB);
        tg.draadjrbmk draadjrbmkVar = vdvldrhtssVar.f82862yggfygwlhe;
        if (draadjrbmkVar == null || (undeliveredElementExceptionPpxfxbqfkf = uj.jyumaefscl.ppxfxbqfkf(draadjrbmkVar, obj, null, 2, null)) == null) {
            throw vdvldrhtssVar.sflfametgt();
        }
        gg.lqeggnwhkg.iobyxmoadg(undeliveredElementExceptionPpxfxbqfkf, vdvldrhtssVar.sflfametgt());
        throw undeliveredElementExceptionPpxfxbqfkf;
    }

    @Override // rj.eablkybsjg, rj.iwizpuwonk
    public Object eablkybsjg(Object obj) {
        return B(obj, false);
    }

    @Override // rj.eablkybsjg, rj.iwizpuwonk
    public Object gxszxtbevo(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return z(this, obj, gxszxtbevoVar);
    }

    @Override // rj.eablkybsjg
    protected boolean iwxlajgraz() {
        return this.f82924lmojexxdyd == iobyxmoadg.DROP_OLDEST;
    }
}
