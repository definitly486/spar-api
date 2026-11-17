package gh;

import gg.cqumvgiudr;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import jh.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ageimvtcrz;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final HashMap f37230eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final HashMap f37231gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final kcexrzcfyt f37232iobyxmoadg = new kcexrzcfyt();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Set f37233lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Set f37234ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final HashMap f37235wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f37236zoijcleaow;

    static {
        oxmwwwfdhm[] oxmwwwfdhmVarArrValues = oxmwwwfdhm.values();
        ArrayList arrayList = new ArrayList(oxmwwwfdhmVarArrValues.length);
        for (oxmwwwfdhm oxmwwwfdhmVar : oxmwwwfdhmVarArrValues) {
            arrayList.add(oxmwwwfdhmVar.nufgyqmvbu());
        }
        f37236zoijcleaow = jyumaefscl.r(arrayList);
        vdvldrhtss[] vdvldrhtssVarArrValues = vdvldrhtss.values();
        ArrayList arrayList2 = new ArrayList(vdvldrhtssVarArrValues.length);
        for (vdvldrhtss vdvldrhtssVar : vdvldrhtssVarArrValues) {
            arrayList2.add(vdvldrhtssVar.wkgbmnqykc());
        }
        f37234ppxfxbqfkf = jyumaefscl.r(arrayList2);
        f37235wkgbmnqykc = new HashMap();
        f37230eablkybsjg = new HashMap();
        f37231gxszxtbevo = tzroggbefp.gtknphoqwx(cqumvgiudr.iobyxmoadg(vdvldrhtss.f37379jyumaefscl, ii.gxszxtbevo.gxszxtbevo("ubyteArrayOf")), cqumvgiudr.iobyxmoadg(vdvldrhtss.f37378iwizpuwonk, ii.gxszxtbevo.gxszxtbevo("ushortArrayOf")), cqumvgiudr.iobyxmoadg(vdvldrhtss.f37376cqumvgiudr, ii.gxszxtbevo.gxszxtbevo("uintArrayOf")), cqumvgiudr.iobyxmoadg(vdvldrhtss.f37377esjtqupxsv, ii.gxszxtbevo.gxszxtbevo("ulongArrayOf")));
        oxmwwwfdhm[] oxmwwwfdhmVarArrValues2 = oxmwwwfdhm.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (oxmwwwfdhm oxmwwwfdhmVar2 : oxmwwwfdhmVarArrValues2) {
            linkedHashSet.add(oxmwwwfdhmVar2.wkgbmnqykc().nufgyqmvbu());
        }
        f37233lqeggnwhkg = linkedHashSet;
        for (oxmwwwfdhm oxmwwwfdhmVar3 : oxmwwwfdhm.values()) {
            f37235wkgbmnqykc.put(oxmwwwfdhmVar3.wkgbmnqykc(), oxmwwwfdhmVar3.lqeggnwhkg());
            f37230eablkybsjg.put(oxmwwwfdhmVar3.lqeggnwhkg(), oxmwwwfdhmVar3.wkgbmnqykc());
        }
    }

    private kcexrzcfyt() {
    }

    public static final boolean wkgbmnqykc(kegysxyocb type) {
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc;
        zdlpuopuiu.btonecajqb(type, "type");
        if (ageimvtcrz.iwizpuwonk(type) || (nufgyqmvbuVarWkgbmnqykc = type.grlcpdaxtj().ylkuphrtab()) == null) {
            return false;
        }
        return f37232iobyxmoadg.ppxfxbqfkf(nufgyqmvbuVarWkgbmnqykc);
    }

    public final ii.zoijcleaow iobyxmoadg(ii.zoijcleaow arrayClassId) {
        zdlpuopuiu.btonecajqb(arrayClassId, "arrayClassId");
        return (ii.zoijcleaow) f37235wkgbmnqykc.get(arrayClassId);
    }

    public final boolean ppxfxbqfkf(jh.wflxmlrfwp descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = descriptor.zoijcleaow();
        return (wflxmlrfwpVarZoijcleaow instanceof hkdspvbjdz) && zdlpuopuiu.eablkybsjg(((hkdspvbjdz) wflxmlrfwpVarZoijcleaow).gxszxtbevo(), ojitshcjhn.f37261pmvmpeiblj) && f37236zoijcleaow.contains(descriptor.getName());
    }

    public final boolean zoijcleaow(ii.gxszxtbevo name) {
        zdlpuopuiu.btonecajqb(name, "name");
        return f37233lqeggnwhkg.contains(name);
    }
}
