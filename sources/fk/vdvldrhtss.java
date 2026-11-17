package fk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vdvldrhtss extends iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f34244iobyxmoadg;

    public /* synthetic */ vdvldrhtss(bk.zoijcleaow zoijcleaowVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar);
    }

    @Override // fk.iobyxmoadg
    protected final void draadjrbmk(ek.ppxfxbqfkf decoder, Object obj, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        if (i14 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i15 = 0; i15 < i14; i15++) {
            wflxmlrfwp(decoder, i13 + i15, obj, false);
        }
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public abstract dk.gxszxtbevo iobyxmoadg();

    protected abstract void kcexrzcfyt(Object obj, int i13, Object obj2);

    @Override // fk.iobyxmoadg
    protected void wflxmlrfwp(ek.ppxfxbqfkf decoder, int i13, Object obj, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        kcexrzcfyt(obj, i13, ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(decoder, iobyxmoadg(), i13, this.f34244iobyxmoadg, null, 8, null));
    }

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        int iBtonecajqb = btonecajqb(obj);
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.wkgbmnqykc wkgbmnqykcVarIozdgvuglv = encoder.iozdgvuglv(gxszxtbevoVarIobyxmoadg, iBtonecajqb);
        Iterator itDxjokdxxww = dxjokdxxww(obj);
        for (int i13 = 0; i13 < iBtonecajqb; i13++) {
            wkgbmnqykcVarIozdgvuglv.lqeggnwhkg(iobyxmoadg(), i13, this.f34244iobyxmoadg, itDxjokdxxww.next());
        }
        wkgbmnqykcVarIozdgvuglv.zoijcleaow(gxszxtbevoVarIobyxmoadg);
    }

    private vdvldrhtss(bk.zoijcleaow zoijcleaowVar) {
        super(null);
        this.f34244iobyxmoadg = zoijcleaowVar;
    }
}
