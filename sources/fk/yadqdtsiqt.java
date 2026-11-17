package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class yadqdtsiqt implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yadqdtsiqt f34250iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34251zoijcleaow = new roivzttewh("kotlin.Float", dk.eablkybsjg.C0576eablkybsjg.f29078iobyxmoadg);

    private yadqdtsiqt() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Float zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Float.valueOf(decoder.jyumaefscl());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34251zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, float f13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.lereixgezr(f13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Number) obj).floatValue());
    }
}
