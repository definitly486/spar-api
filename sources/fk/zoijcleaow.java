package fk;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements bk.zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object lqeggnwhkg(ek.ppxfxbqfkf ppxfxbqfkfVar) {
        return ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar, iobyxmoadg(), 1, bk.lqeggnwhkg.iobyxmoadg(this, ppxfxbqfkfVar, ppxfxbqfkfVar.vdvldrhtss(iobyxmoadg(), 0)), null, 8, null);
    }

    public abstract ah.wkgbmnqykc btonecajqb();

    public bk.agtfadlqog dxjokdxxww(ek.gxszxtbevo encoder, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return encoder.iobyxmoadg().eablkybsjg(btonecajqb(), value);
    }

    public bk.iobyxmoadg nufgyqmvbu(ek.ppxfxbqfkf decoder, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return decoder.iobyxmoadg().wkgbmnqykc(btonecajqb(), str);
    }

    @Override // bk.agtfadlqog
    public final void wkgbmnqykc(ek.gxszxtbevo encoder, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        bk.agtfadlqog agtfadlqogVarZoijcleaow = bk.lqeggnwhkg.zoijcleaow(this, encoder, value);
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
        wkgbmnqykcVarPpxfxbqfkf.istkbnxepw(iobyxmoadg(), 0, agtfadlqogVarZoijcleaow.iobyxmoadg().nufgyqmvbu());
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg2 = iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(agtfadlqogVarZoijcleaow, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        wkgbmnqykcVarPpxfxbqfkf.lqeggnwhkg(gxszxtbevoVarIobyxmoadg2, 1, agtfadlqogVarZoijcleaow, value);
        wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVarIobyxmoadg);
    }

    @Override // bk.iobyxmoadg
    public final Object zoijcleaow(ek.eablkybsjg decoder) {
        Object objPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
            objPpxfxbqfkf = lqeggnwhkg(ppxfxbqfkfVarPpxfxbqfkf);
        } else {
            objPpxfxbqfkf = null;
            while (true) {
                int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(iobyxmoadg());
                if (iYadqdtsiqt == -1) {
                    if (objPpxfxbqfkf != null) {
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objPpxfxbqfkf, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) hkdspvbjdzVar.f60015zdlpuopuiu)).toString());
                }
                if (iYadqdtsiqt == 0) {
                    hkdspvbjdzVar.f60015zdlpuopuiu = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(iobyxmoadg(), iYadqdtsiqt);
                } else {
                    if (iYadqdtsiqt != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) hkdspvbjdzVar.f60015zdlpuopuiu;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb3.append(str);
                        sb3.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb3.append(iYadqdtsiqt);
                        throw new SerializationException(sb3.toString());
                    }
                    Object obj = hkdspvbjdzVar.f60015zdlpuopuiu;
                    if (obj == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    hkdspvbjdzVar.f60015zdlpuopuiu = obj;
                    objPpxfxbqfkf = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, iobyxmoadg(), iYadqdtsiqt, bk.lqeggnwhkg.iobyxmoadg(this, ppxfxbqfkfVarPpxfxbqfkf, (String) obj), null, 8, null);
                }
            }
        }
        ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVarIobyxmoadg);
        return objPpxfxbqfkf;
    }
}
