package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class jrbgnlbqoe implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final jrbgnlbqoe f34185iobyxmoadg = new jrbgnlbqoe();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34186zoijcleaow = wwaezpbzkn.iobyxmoadg("kotlin.UByte", ck.iobyxmoadg.zynmafqrjb(kotlin.jvm.internal.eablkybsjg.f60012iobyxmoadg));

    private jrbgnlbqoe() {
    }

    public byte gxszxtbevo(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return gg.esjtqupxsv.zoijcleaow(decoder.istkbnxepw(iobyxmoadg()).lmojexxdyd());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34186zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, byte b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.agtfadlqog(iobyxmoadg()).nufgyqmvbu(b13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((gg.esjtqupxsv) obj).gxszxtbevo());
    }

    @Override // bk.iobyxmoadg
    public /* bridge */ /* synthetic */ Object zoijcleaow(ek.eablkybsjg eablkybsjgVar) {
        return gg.esjtqupxsv.iobyxmoadg(gxszxtbevo(eablkybsjgVar));
    }
}
