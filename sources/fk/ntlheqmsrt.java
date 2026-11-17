package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class ntlheqmsrt implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ntlheqmsrt f34209iobyxmoadg = new ntlheqmsrt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34210zoijcleaow = new roivzttewh("kotlin.Long", dk.eablkybsjg.lqeggnwhkg.f29081iobyxmoadg);

    private ntlheqmsrt() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Long zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return Long.valueOf(decoder.agtfadlqog());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34210zoijcleaow;
    }

    public void lqeggnwhkg(ek.gxszxtbevo encoder, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        encoder.kcexrzcfyt(j13);
    }

    @Override // bk.agtfadlqog
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ek.gxszxtbevo gxszxtbevoVar, Object obj) {
        lqeggnwhkg(gxszxtbevoVar, ((Number) obj).longValue());
    }
}
