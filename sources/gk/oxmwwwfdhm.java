package gk;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class oxmwwwfdhm implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final oxmwwwfdhm f37737iobyxmoadg = new oxmwwwfdhm();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f37738zoijcleaow = dk.wflxmlrfwp.lqeggnwhkg("kotlinx.serialization.json.JsonElement", dk.wkgbmnqykc.zoijcleaow.f29103iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: gk.draadjrbmk
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return oxmwwwfdhm.draadjrbmk((dk.iobyxmoadg) obj);
        }
    });

    private oxmwwwfdhm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo agtfadlqog() {
        return zynmafqrjb.f37755iobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(dk.iobyxmoadg buildSerialDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "JsonPrimitive", kcexrzcfyt.gxszxtbevo(new tg.iobyxmoadg() { // from class: gk.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return oxmwwwfdhm.wflxmlrfwp();
            }
        }), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "JsonNull", kcexrzcfyt.gxszxtbevo(new tg.iobyxmoadg() { // from class: gk.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return oxmwwwfdhm.agtfadlqog();
            }
        }), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "JsonLiteral", kcexrzcfyt.gxszxtbevo(new tg.iobyxmoadg() { // from class: gk.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return oxmwwwfdhm.ojitshcjhn();
            }
        }), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "JsonObject", kcexrzcfyt.gxszxtbevo(new tg.iobyxmoadg() { // from class: gk.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return oxmwwwfdhm.rgvfuqvkyq();
            }
        }), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "JsonArray", kcexrzcfyt.gxszxtbevo(new tg.iobyxmoadg() { // from class: gk.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return oxmwwwfdhm.vdvldrhtss();
            }
        }), null, false, 12, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo ojitshcjhn() {
        return cqumvgiudr.f37688iobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo rgvfuqvkyq() {
        return yadqdtsiqt.f37746iobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo vdvldrhtss() {
        return wkgbmnqykc.f37741iobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo wflxmlrfwp() {
        return lmojexxdyd.f37717iobyxmoadg.iobyxmoadg();
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f37738zoijcleaow;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, btonecajqb value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kcexrzcfyt.nufgyqmvbu(encoder);
        if (value instanceof iozdgvuglv) {
            encoder.rgvfuqvkyq(lmojexxdyd.f37717iobyxmoadg, value);
        } else if (value instanceof cdpycssgdh) {
            encoder.rgvfuqvkyq(yadqdtsiqt.f37746iobyxmoadg, value);
        } else {
            if (!(value instanceof ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.rgvfuqvkyq(wkgbmnqykc.f37741iobyxmoadg, value);
        }
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public btonecajqb zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return kcexrzcfyt.wkgbmnqykc(decoder).lqeggnwhkg();
    }
}
