package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final rgvfuqvkyq f34222iobyxmoadg = new rgvfuqvkyq();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34223zoijcleaow = new roivzttewh("kotlin.Char", dk.eablkybsjg.ppxfxbqfkf.f29083iobyxmoadg);

    private rgvfuqvkyq() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Character zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Character.valueOf(decoder.esjtqupxsv());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34223zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, char c13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.pmvmpeiblj(c13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Character) obj).charValue());
    }
}
