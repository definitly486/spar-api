package gk;

import kotlin.jvm.internal.cllcsxoeiz;
import mj.hcddaimhww;

/* JADX INFO: loaded from: classes3.dex */
final class cqumvgiudr implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cqumvgiudr f37688iobyxmoadg = new cqumvgiudr();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f37689zoijcleaow = dk.wflxmlrfwp.ppxfxbqfkf("kotlinx.serialization.json.JsonLiteral", dk.eablkybsjg.dxjokdxxww.f29077iobyxmoadg);

    private cqumvgiudr() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public iwizpuwonk zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        btonecajqb btonecajqbVarLqeggnwhkg = kcexrzcfyt.wkgbmnqykc(decoder).lqeggnwhkg();
        if (btonecajqbVarLqeggnwhkg instanceof iwizpuwonk) {
            return (iwizpuwonk) btonecajqbVarLqeggnwhkg;
        }
        throw hk.oxmwwwfdhm.eablkybsjg(-1, "Unexpected JSON element, expected JsonLiteral, had " + cllcsxoeiz.zoijcleaow(btonecajqbVarLqeggnwhkg.getClass()), btonecajqbVarLqeggnwhkg.toString());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f37689zoijcleaow;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, iwizpuwonk value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kcexrzcfyt.nufgyqmvbu(encoder);
        if (value.ppxfxbqfkf()) {
            encoder.lmojexxdyd(value.iobyxmoadg());
            return;
        }
        if (value.zoijcleaow() != null) {
            encoder.agtfadlqog(value.zoijcleaow()).lmojexxdyd(value.iobyxmoadg());
            return;
        }
        Long lKcexrzcfyt = mj.kcexrzcfyt.kcexrzcfyt(value.iobyxmoadg());
        if (lKcexrzcfyt != null) {
            encoder.kcexrzcfyt(lKcexrzcfyt.longValue());
            return;
        }
        gg.istkbnxepw istkbnxepwVarNufgyqmvbu = hcddaimhww.nufgyqmvbu(value.iobyxmoadg());
        if (istkbnxepwVarNufgyqmvbu != null) {
            encoder.agtfadlqog(ck.iobyxmoadg.cqumvgiudr(gg.istkbnxepw.f37109yggfygwlhe).iobyxmoadg()).kcexrzcfyt(istkbnxepwVarNufgyqmvbu.lqeggnwhkg());
            return;
        }
        Double dAgtfadlqog = mj.kcexrzcfyt.agtfadlqog(value.iobyxmoadg());
        if (dAgtfadlqog != null) {
            encoder.gxszxtbevo(dAgtfadlqog.doubleValue());
            return;
        }
        Boolean boolO = mj.kcexrzcfyt.o(value.iobyxmoadg());
        if (boolO != null) {
            encoder.esjtqupxsv(boolO.booleanValue());
        } else {
            encoder.lmojexxdyd(value.iobyxmoadg());
        }
    }
}
