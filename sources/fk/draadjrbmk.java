package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final draadjrbmk f34122iobyxmoadg = new draadjrbmk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34123zoijcleaow = new roivzttewh("kotlin.Byte", dk.eablkybsjg.zoijcleaow.f29085iobyxmoadg);

    private draadjrbmk() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Byte zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Byte.valueOf(decoder.lmojexxdyd());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34123zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, byte b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.nufgyqmvbu(b13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Number) obj).byteValue());
    }
}
