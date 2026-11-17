package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yggfygwlhe f34253iobyxmoadg = new yggfygwlhe();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34254zoijcleaow = new roivzttewh("kotlin.Double", dk.eablkybsjg.wkgbmnqykc.f29084iobyxmoadg);

    private yggfygwlhe() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Double zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Double.valueOf(decoder.iwizpuwonk());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34254zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, double d13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.gxszxtbevo(d13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Number) obj).doubleValue());
    }
}
