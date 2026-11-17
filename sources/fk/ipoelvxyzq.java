package fk;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ipoelvxyzq implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f34153iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bk.zoijcleaow f34154ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dk.gxszxtbevo f34155wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bk.zoijcleaow f34156zoijcleaow;

    public ipoelvxyzq(bk.zoijcleaow aSerializer, bk.zoijcleaow bSerializer, bk.zoijcleaow cSerializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(aSerializer, "aSerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bSerializer, "bSerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cSerializer, "cSerializer");
        this.f34153iobyxmoadg = aSerializer;
        this.f34156zoijcleaow = bSerializer;
        this.f34154ppxfxbqfkf = cSerializer;
        this.f34155wkgbmnqykc = dk.wflxmlrfwp.wkgbmnqykc("kotlin.Triple", new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: fk.fyldjkxazc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ipoelvxyzq.dxjokdxxww(this.f34138zdlpuopuiu, (dk.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(ipoelvxyzq ipoelvxyzqVar, dk.iobyxmoadg buildClassSerialDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildClassSerialDescriptor, "first", ipoelvxyzqVar.f34153iobyxmoadg.iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildClassSerialDescriptor, "second", ipoelvxyzqVar.f34156zoijcleaow.iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildClassSerialDescriptor, "third", ipoelvxyzqVar.f34154ppxfxbqfkf.iobyxmoadg(), null, false, 12, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final gg.iwizpuwonk lqeggnwhkg(ek.ppxfxbqfkf ppxfxbqfkfVar) {
        Object objPpxfxbqfkf = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 0, this.f34153iobyxmoadg, null, 8, null);
        Object objPpxfxbqfkf2 = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 1, this.f34156zoijcleaow, null, 8, null);
        Object objPpxfxbqfkf3 = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 2, this.f34154ppxfxbqfkf, null, 8, null);
        ppxfxbqfkfVar.zoijcleaow(iobyxmoadg());
        return new gg.iwizpuwonk(objPpxfxbqfkf, objPpxfxbqfkf2, objPpxfxbqfkf3);
    }

    private final gg.iwizpuwonk nufgyqmvbu(ek.ppxfxbqfkf ppxfxbqfkfVar) {
        Object objPpxfxbqfkf = grlcpdaxtj.f34139iobyxmoadg;
        Object objPpxfxbqfkf2 = grlcpdaxtj.f34139iobyxmoadg;
        Object objPpxfxbqfkf3 = grlcpdaxtj.f34139iobyxmoadg;
        while (true) {
            int iYadqdtsiqt = ppxfxbqfkfVar.yadqdtsiqt(iobyxmoadg());
            if (iYadqdtsiqt == -1) {
                ppxfxbqfkfVar.zoijcleaow(iobyxmoadg());
                if (objPpxfxbqfkf == grlcpdaxtj.f34139iobyxmoadg) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objPpxfxbqfkf2 == grlcpdaxtj.f34139iobyxmoadg) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objPpxfxbqfkf3 != grlcpdaxtj.f34139iobyxmoadg) {
                    return new gg.iwizpuwonk(objPpxfxbqfkf, objPpxfxbqfkf2, objPpxfxbqfkf3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iYadqdtsiqt == 0) {
                objPpxfxbqfkf = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 0, this.f34153iobyxmoadg, null, 8, null);
            } else if (iYadqdtsiqt == 1) {
                objPpxfxbqfkf2 = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 1, this.f34156zoijcleaow, null, 8, null);
            } else {
                if (iYadqdtsiqt != 2) {
                    throw new SerializationException("Unexpected index " + iYadqdtsiqt);
                }
                objPpxfxbqfkf3 = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 2, this.f34154ppxfxbqfkf, null, 8, null);
            }
        }
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public gg.iwizpuwonk zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(iobyxmoadg());
        return ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt() ? lqeggnwhkg(ppxfxbqfkfVarPpxfxbqfkf) : nufgyqmvbu(ppxfxbqfkfVarPpxfxbqfkf);
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, gg.iwizpuwonk value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(iobyxmoadg());
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(iobyxmoadg(), 0, this.f34153iobyxmoadg, value.nufgyqmvbu());
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(iobyxmoadg(), 1, this.f34156zoijcleaow, value.dxjokdxxww());
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(iobyxmoadg(), 2, this.f34154ppxfxbqfkf, value.btonecajqb());
        wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(iobyxmoadg());
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34155wkgbmnqykc;
    }
}
