package fk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements bk.zoijcleaow {
    public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public static /* synthetic */ void agtfadlqog(iobyxmoadg iobyxmoadgVar, ek.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj, boolean z13, int i14, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i14 & 8) != 0) {
            z13 = true;
        }
        iobyxmoadgVar.wflxmlrfwp(ppxfxbqfkfVar, i13, obj, z13);
    }

    private final int ojitshcjhn(ek.ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        int iGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(iobyxmoadg());
        nufgyqmvbu(obj, iGxszxtbevo);
        return iGxszxtbevo;
    }

    protected abstract int btonecajqb(Object obj);

    protected abstract void draadjrbmk(ek.ppxfxbqfkf ppxfxbqfkfVar, Object obj, int i13, int i14);

    protected abstract Iterator dxjokdxxww(Object obj);

    public final Object gtknphoqwx(ek.eablkybsjg decoder, Object obj) {
        Object objGxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        if (obj == null || (objGxszxtbevo = rgvfuqvkyq(obj)) == null) {
            objGxszxtbevo = gxszxtbevo();
        }
        int iLqeggnwhkg = lqeggnwhkg(objGxszxtbevo);
        ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(iobyxmoadg());
        if (!ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
            while (true) {
                int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(iobyxmoadg());
                if (iYadqdtsiqt == -1) {
                    break;
                }
                agtfadlqog(this, ppxfxbqfkfVarPpxfxbqfkf, iLqeggnwhkg + iYadqdtsiqt, objGxszxtbevo, false, 8, null);
            }
        } else {
            draadjrbmk(ppxfxbqfkfVarPpxfxbqfkf, objGxszxtbevo, iLqeggnwhkg, ojitshcjhn(ppxfxbqfkfVarPpxfxbqfkf, objGxszxtbevo));
        }
        ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(iobyxmoadg());
        return vdvldrhtss(objGxszxtbevo);
    }

    protected abstract Object gxszxtbevo();

    protected abstract int lqeggnwhkg(Object obj);

    protected abstract void nufgyqmvbu(Object obj, int i13);

    protected abstract Object rgvfuqvkyq(Object obj);

    protected abstract Object vdvldrhtss(Object obj);

    protected abstract void wflxmlrfwp(ek.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj, boolean z13);

    @Override // bk.iobyxmoadg
    public Object zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return gtknphoqwx(decoder, null);
    }

    private iobyxmoadg() {
    }
}
