package gk;

import kotlin.jvm.internal.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lmojexxdyd f37717iobyxmoadg = new lmojexxdyd();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f37718zoijcleaow = dk.wflxmlrfwp.nufgyqmvbu("kotlinx.serialization.json.JsonPrimitive", dk.eablkybsjg.dxjokdxxww.f29077iobyxmoadg, new dk.gxszxtbevo[0], null, 8, null);

    private lmojexxdyd() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public iozdgvuglv zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        btonecajqb btonecajqbVarLqeggnwhkg = kcexrzcfyt.wkgbmnqykc(decoder).lqeggnwhkg();
        if (btonecajqbVarLqeggnwhkg instanceof iozdgvuglv) {
            return (iozdgvuglv) btonecajqbVarLqeggnwhkg;
        }
        throw hk.oxmwwwfdhm.eablkybsjg(-1, "Unexpected JSON element, expected JsonPrimitive, had " + cllcsxoeiz.zoijcleaow(btonecajqbVarLqeggnwhkg.getClass()), btonecajqbVarLqeggnwhkg.toString());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f37718zoijcleaow;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, iozdgvuglv value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kcexrzcfyt.nufgyqmvbu(encoder);
        if (value instanceof pmvmpeiblj) {
            encoder.rgvfuqvkyq(zynmafqrjb.f37755iobyxmoadg, pmvmpeiblj.INSTANCE);
        } else {
            encoder.rgvfuqvkyq(cqumvgiudr.f37688iobyxmoadg, (iwizpuwonk) value);
        }
    }
}
