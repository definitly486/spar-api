package fk;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hkdspvbjdz implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f34144iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bk.zoijcleaow f34145zoijcleaow;

    public /* synthetic */ hkdspvbjdz(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, zoijcleaowVar2);
    }

    protected abstract Object btonecajqb(Object obj, Object obj2);

    protected final bk.zoijcleaow dxjokdxxww() {
        return this.f34145zoijcleaow;
    }

    protected abstract Object gxszxtbevo(Object obj);

    protected final bk.zoijcleaow lqeggnwhkg() {
        return this.f34144iobyxmoadg;
    }

    protected abstract Object nufgyqmvbu(Object obj);

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(iobyxmoadg());
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(iobyxmoadg(), 0, this.f34144iobyxmoadg, gxszxtbevo(obj));
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(iobyxmoadg(), 1, this.f34145zoijcleaow, nufgyqmvbu(obj));
        wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(iobyxmoadg());
    }

    @Override // bk.iobyxmoadg
    public Object zoijcleaow(ek.eablkybsjg decoder) {
        Object objBtonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
        if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
            objBtonecajqb = btonecajqb(ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, iobyxmoadg(), 0, lqeggnwhkg(), null, 8, null), ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, iobyxmoadg(), 1, dxjokdxxww(), null, 8, null));
        } else {
            Object objPpxfxbqfkf = grlcpdaxtj.f34139iobyxmoadg;
            Object objPpxfxbqfkf2 = grlcpdaxtj.f34139iobyxmoadg;
            while (true) {
                int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(iobyxmoadg());
                if (iYadqdtsiqt == -1) {
                    if (objPpxfxbqfkf == grlcpdaxtj.f34139iobyxmoadg) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objPpxfxbqfkf2 == grlcpdaxtj.f34139iobyxmoadg) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objBtonecajqb = btonecajqb(objPpxfxbqfkf, objPpxfxbqfkf2);
                    break;
                }
                if (iYadqdtsiqt == 0) {
                    objPpxfxbqfkf = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, iobyxmoadg(), 0, lqeggnwhkg(), null, 8, null);
                } else {
                    if (iYadqdtsiqt != 1) {
                        throw new SerializationException("Invalid index: " + iYadqdtsiqt);
                    }
                    objPpxfxbqfkf2 = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, iobyxmoadg(), 1, dxjokdxxww(), null, 8, null);
                }
            }
        }
        ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVarIobyxmoadg);
        return objBtonecajqb;
    }

    private hkdspvbjdz(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2) {
        this.f34144iobyxmoadg = zoijcleaowVar;
        this.f34145zoijcleaow = zoijcleaowVar2;
    }
}
