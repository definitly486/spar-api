package gk;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zynmafqrjb f37755iobyxmoadg = new zynmafqrjb();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f37756zoijcleaow = dk.wflxmlrfwp.nufgyqmvbu("kotlinx.serialization.json.JsonNull", dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg, new dk.gxszxtbevo[0], null, 8, null);

    private zynmafqrjb() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        kcexrzcfyt.lqeggnwhkg(decoder);
        if (decoder.cdpycssgdh()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.gtknphoqwx();
        return pmvmpeiblj.INSTANCE;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f37756zoijcleaow;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, pmvmpeiblj value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kcexrzcfyt.nufgyqmvbu(encoder);
        encoder.jyumaefscl();
    }
}
