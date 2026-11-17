package fk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tbqsvytpvh extends vdvldrhtss {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f34237zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbqsvytpvh(bk.zoijcleaow primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(primitiveSerializer, "primitiveSerializer");
        this.f34237zoijcleaow = new nuxfzjnpeb(primitiveSerializer.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.vdvldrhtss
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public final void kcexrzcfyt(zeieaojujs zeieaojujsVar, int i13, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zeieaojujsVar, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // fk.iobyxmoadg
    protected final Iterator dxjokdxxww(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public final Object vdvldrhtss(zeieaojujs zeieaojujsVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zeieaojujsVar, "<this>");
        return zeieaojujsVar.iobyxmoadg();
    }

    @Override // fk.vdvldrhtss, bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public final dk.gxszxtbevo iobyxmoadg() {
        return this.f34237zoijcleaow;
    }

    protected abstract Object iwizpuwonk();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public final void nufgyqmvbu(zeieaojujs zeieaojujsVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zeieaojujsVar, "<this>");
        zeieaojujsVar.zoijcleaow(i13);
    }

    protected abstract void lereixgezr(ek.wkgbmnqykc wkgbmnqykcVar, Object obj, int i13);

    @Override // fk.vdvldrhtss, bk.agtfadlqog
    public final void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        int iBtonecajqb = btonecajqb(obj);
        dk.gxszxtbevo gxszxtbevoVar = this.f34237zoijcleaow;
        ek.wkgbmnqykc wkgbmnqykcVarIozdgvuglv = encoder.iozdgvuglv(gxszxtbevoVar, iBtonecajqb);
        lereixgezr(wkgbmnqykcVarIozdgvuglv, obj, iBtonecajqb);
        wkgbmnqykcVarIozdgvuglv.zoijcleaow(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public final int lqeggnwhkg(zeieaojujs zeieaojujsVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zeieaojujsVar, "<this>");
        return zeieaojujsVar.wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public final zeieaojujs gxszxtbevo() {
        return (zeieaojujs) rgvfuqvkyq(iwizpuwonk());
    }

    @Override // fk.iobyxmoadg, bk.iobyxmoadg
    public final Object zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return gtknphoqwx(decoder, null);
    }
}
