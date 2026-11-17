package hk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cllcsxoeiz {
    public static final dk.gxszxtbevo iobyxmoadg(dk.gxszxtbevo gxszxtbevoVar, ik.zoijcleaow module) {
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.agtfadlqog.iobyxmoadg.f29057iobyxmoadg)) {
            return gxszxtbevoVar.isInline() ? iobyxmoadg(gxszxtbevoVar.lqeggnwhkg(0), module) : gxszxtbevoVar;
        }
        dk.gxszxtbevo gxszxtbevoVarZoijcleaow = dk.zoijcleaow.zoijcleaow(module, gxszxtbevoVar);
        return (gxszxtbevoVarZoijcleaow == null || (gxszxtbevoVarIobyxmoadg = iobyxmoadg(gxszxtbevoVarZoijcleaow, module)) == null) ? gxszxtbevoVar : gxszxtbevoVarIobyxmoadg;
    }

    public static final hkdspvbjdz zoijcleaow(gk.zoijcleaow zoijcleaowVar, dk.gxszxtbevo desc) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        dk.agtfadlqog kind = desc.getKind();
        if (kind instanceof dk.wkgbmnqykc) {
            return hkdspvbjdz.POLY_OBJ;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.zoijcleaow.f29098iobyxmoadg)) {
            return hkdspvbjdz.LIST;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.ppxfxbqfkf.f29096iobyxmoadg)) {
            return hkdspvbjdz.OBJ;
        }
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg(desc.lqeggnwhkg(0), zoijcleaowVar.iobyxmoadg());
        dk.agtfadlqog kind2 = gxszxtbevoVarIobyxmoadg.getKind();
        if ((kind2 instanceof dk.eablkybsjg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind2, dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg)) {
            return hkdspvbjdz.MAP;
        }
        if (zoijcleaowVar.eablkybsjg().ppxfxbqfkf()) {
            return hkdspvbjdz.LIST;
        }
        throw oxmwwwfdhm.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
    }
}
