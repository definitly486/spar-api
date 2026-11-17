package bi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    public static final pmvmpeiblj iobyxmoadg(di.agtfadlqog proto, fi.ppxfxbqfkf nameResolver, fi.lqeggnwhkg typeTable, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo propertySignature = gi.iobyxmoadg.f37419wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(propertySignature, "propertySignature");
        gi.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (gi.iobyxmoadg.wkgbmnqykc) fi.eablkybsjg.iobyxmoadg(proto, propertySignature);
        if (wkgbmnqykcVar == null) {
            return null;
        }
        if (z13) {
            hi.wkgbmnqykc.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = hi.dxjokdxxww.f40413iobyxmoadg.ppxfxbqfkf(proto, nameResolver, typeTable, z15);
            if (iobyxmoadgVarPpxfxbqfkf == null) {
                return null;
            }
            return pmvmpeiblj.f16327zoijcleaow.zoijcleaow(iobyxmoadgVarPpxfxbqfkf);
        }
        if (!z14 || !wkgbmnqykcVar.hkdspvbjdz()) {
            return null;
        }
        pmvmpeiblj.iobyxmoadg iobyxmoadgVar = pmvmpeiblj.f16327zoijcleaow;
        gi.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarWwaezpbzkn = wkgbmnqykcVar.wwaezpbzkn();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarWwaezpbzkn, "getSyntheticMethod(...)");
        return iobyxmoadgVar.ppxfxbqfkf(nameResolver, ppxfxbqfkfVarWwaezpbzkn);
    }

    public static /* synthetic */ pmvmpeiblj zoijcleaow(di.agtfadlqog agtfadlqogVar, fi.ppxfxbqfkf ppxfxbqfkfVar, fi.lqeggnwhkg lqeggnwhkgVar, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        boolean z16 = (i13 & 8) != 0 ? false : z13;
        boolean z17 = (i13 & 16) != 0 ? false : z14;
        if ((i13 & 32) != 0) {
            z15 = true;
        }
        return iobyxmoadg(agtfadlqogVar, ppxfxbqfkfVar, lqeggnwhkgVar, z16, z17, z15);
    }
}
