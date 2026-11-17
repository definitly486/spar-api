package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class lxfrhoxuzk implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lxfrhoxuzk f34203iobyxmoadg = new lxfrhoxuzk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34204zoijcleaow = new roivzttewh("kotlin.Short", dk.eablkybsjg.nufgyqmvbu.f29082iobyxmoadg);

    private lxfrhoxuzk() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Short zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Short.valueOf(decoder.yggfygwlhe());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34204zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, short s13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.cqumvgiudr(s13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Number) obj).shortValue());
    }
}
