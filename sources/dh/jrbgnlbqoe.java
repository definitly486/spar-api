package dh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jrbgnlbqoe {
    private static final boolean eablkybsjg(fyldjkxazc.iobyxmoadg iobyxmoadgVar) {
        return !zi.ageimvtcrz.draadjrbmk(iobyxmoadgVar.iobyxmoadg().sopmlzcsov().getType());
    }

    public static final Object gxszxtbevo(fyldjkxazc.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return iobyxmoadgVar.iobyxmoadg().jhduphickx();
    }

    private static final boolean lqeggnwhkg(jh.crxdokpmqz crxdokpmqzVar) {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = crxdokpmqzVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
        if (!li.dxjokdxxww.cqumvgiudr(wflxmlrfwpVarZoijcleaow)) {
            return false;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = wflxmlrfwpVarZoijcleaow.zoijcleaow();
        return !(li.dxjokdxxww.istkbnxepw(wflxmlrfwpVarZoijcleaow2) || li.dxjokdxxww.zdlpuopuiu(wflxmlrfwpVarZoijcleaow2)) || ((crxdokpmqzVar instanceof xi.cllcsxoeiz) && hi.dxjokdxxww.gxszxtbevo(((xi.cllcsxoeiz) crxdokpmqzVar).okpsazkaxt()));
    }

    private static final eh.dxjokdxxww ppxfxbqfkf(fyldjkxazc.iobyxmoadg iobyxmoadgVar, boolean z13, Field field) {
        eh.dxjokdxxww iobyxmoadgVar2;
        if (lqeggnwhkg(iobyxmoadgVar.iobyxmoadg().sopmlzcsov()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z13) {
                iobyxmoadgVar2 = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.lqeggnwhkg.iobyxmoadg(field, eablkybsjg(iobyxmoadgVar), gxszxtbevo(iobyxmoadgVar)) : new eh.dxjokdxxww.lqeggnwhkg.ppxfxbqfkf(field, eablkybsjg(iobyxmoadgVar));
            } else {
                if (!iobyxmoadgVar.ntlheqmsrt()) {
                    return new eh.dxjokdxxww.gxszxtbevo.ppxfxbqfkf(field);
                }
                iobyxmoadgVar2 = new eh.dxjokdxxww.gxszxtbevo.iobyxmoadg(field, gxszxtbevo(iobyxmoadgVar));
            }
        } else if (wkgbmnqykc(iobyxmoadgVar)) {
            if (z13) {
                return iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.gxszxtbevo.zoijcleaow(field) : new eh.dxjokdxxww.gxszxtbevo.wkgbmnqykc(field);
            }
            iobyxmoadgVar2 = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.lqeggnwhkg.zoijcleaow(field, eablkybsjg(iobyxmoadgVar)) : new eh.dxjokdxxww.lqeggnwhkg.wkgbmnqykc(field, eablkybsjg(iobyxmoadgVar));
        } else {
            if (z13) {
                return new eh.dxjokdxxww.gxszxtbevo.eablkybsjg(field);
            }
            iobyxmoadgVar2 = new eh.dxjokdxxww.lqeggnwhkg.eablkybsjg(field, eablkybsjg(iobyxmoadgVar));
        }
        return iobyxmoadgVar2;
    }

    private static final boolean wkgbmnqykc(fyldjkxazc.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.iobyxmoadg().sopmlzcsov().getAnnotations().wizcaqwiak(n.btonecajqb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static final eh.nufgyqmvbu zoijcleaow(fyldjkxazc.iobyxmoadg iobyxmoadgVar, boolean z13) {
        agtfadlqog.eablkybsjg eablkybsjgVarPpxfxbqfkf;
        Method methodPpxfxbqfkf;
        eh.nufgyqmvbu iobyxmoadgVar2;
        gi.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarLmojexxdyd;
        eh.nufgyqmvbu ppxfxbqfkfVar;
        Method methodWflxmlrfwp;
        if (ikoacuggdj.f28234zdlpuopuiu.iobyxmoadg().ojitshcjhn(iobyxmoadgVar.iobyxmoadg().metgxyhuhe())) {
            return eh.draadjrbmk.f31304iobyxmoadg;
        }
        rgvfuqvkyq rgvfuqvkyqVarGxszxtbevo = j.f28254iobyxmoadg.gxszxtbevo(iobyxmoadgVar.iobyxmoadg().sopmlzcsov());
        if (rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.ppxfxbqfkf) {
            rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar2 = (rgvfuqvkyq.ppxfxbqfkf) rgvfuqvkyqVarGxszxtbevo;
            gi.iobyxmoadg.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = ppxfxbqfkfVar2.gxszxtbevo();
            if (z13) {
                if (wkgbmnqykcVarGxszxtbevo.hcddaimhww()) {
                    ppxfxbqfkfVarLmojexxdyd = wkgbmnqykcVarGxszxtbevo.yadqdtsiqt();
                } else {
                    ppxfxbqfkfVarLmojexxdyd = null;
                }
            } else if (wkgbmnqykcVarGxszxtbevo.jpowsppfya()) {
                ppxfxbqfkfVarLmojexxdyd = wkgbmnqykcVarGxszxtbevo.lmojexxdyd();
            } else {
                ppxfxbqfkfVarLmojexxdyd = null;
            }
            Method methodPmvmpeiblj = ppxfxbqfkfVarLmojexxdyd != null ? iobyxmoadgVar.iobyxmoadg().wypolnanlu().pmvmpeiblj(ppxfxbqfkfVar2.wkgbmnqykc().getString(ppxfxbqfkfVarLmojexxdyd.pmvmpeiblj()), ppxfxbqfkfVar2.wkgbmnqykc().getString(ppxfxbqfkfVarLmojexxdyd.lereixgezr())) : null;
            if (methodPmvmpeiblj != null) {
                if (!Modifier.isStatic(methodPmvmpeiblj.getModifiers())) {
                    ppxfxbqfkfVar = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.iobyxmoadg(methodPmvmpeiblj, gxszxtbevo(iobyxmoadgVar)) : new eh.dxjokdxxww.nufgyqmvbu.eablkybsjg(methodPmvmpeiblj);
                } else if (wkgbmnqykc(iobyxmoadgVar)) {
                    ppxfxbqfkfVar = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.zoijcleaow(methodPmvmpeiblj) : new eh.dxjokdxxww.nufgyqmvbu.gxszxtbevo(methodPmvmpeiblj);
                } else {
                    ppxfxbqfkfVar = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.ppxfxbqfkf(methodPmvmpeiblj, gxszxtbevo(iobyxmoadgVar)) : new eh.dxjokdxxww.nufgyqmvbu.lqeggnwhkg(methodPmvmpeiblj);
                }
                iobyxmoadgVar2 = ppxfxbqfkfVar;
            } else if (li.gtknphoqwx.eablkybsjg(iobyxmoadgVar.iobyxmoadg().sopmlzcsov()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg().sopmlzcsov().getVisibility(), jh.zdlpuopuiu.f51365wkgbmnqykc)) {
                Class clsKcexrzcfyt = eh.ojitshcjhn.kcexrzcfyt(iobyxmoadgVar.iobyxmoadg().sopmlzcsov().zoijcleaow());
                if (clsKcexrzcfyt == null || (methodWflxmlrfwp = eh.ojitshcjhn.wflxmlrfwp(clsKcexrzcfyt, iobyxmoadgVar.iobyxmoadg().sopmlzcsov())) == null) {
                    throw new c("Underlying property of inline class " + iobyxmoadgVar.iobyxmoadg() + " should have a field");
                }
                iobyxmoadgVar2 = iobyxmoadgVar.ntlheqmsrt() ? new eh.gtknphoqwx.iobyxmoadg(methodWflxmlrfwp, gxszxtbevo(iobyxmoadgVar)) : new eh.gtknphoqwx.zoijcleaow(methodWflxmlrfwp);
            } else {
                Field fieldXrmfcynszj = iobyxmoadgVar.iobyxmoadg().xrmfcynszj();
                if (fieldXrmfcynszj == null) {
                    throw new c("No accessors or field is found for property " + iobyxmoadgVar.iobyxmoadg());
                }
                iobyxmoadgVar2 = ppxfxbqfkf(iobyxmoadgVar, z13, fieldXrmfcynszj);
            }
        } else if (rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.iobyxmoadg) {
            iobyxmoadgVar2 = ppxfxbqfkf(iobyxmoadgVar, z13, ((rgvfuqvkyq.iobyxmoadg) rgvfuqvkyqVarGxszxtbevo).zoijcleaow());
        } else {
            if (!(rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.zoijcleaow)) {
                if (!(rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.wkgbmnqykc)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z13) {
                    eablkybsjgVarPpxfxbqfkf = ((rgvfuqvkyq.wkgbmnqykc) rgvfuqvkyqVarGxszxtbevo).zoijcleaow();
                } else {
                    eablkybsjgVarPpxfxbqfkf = ((rgvfuqvkyq.wkgbmnqykc) rgvfuqvkyqVarGxszxtbevo).ppxfxbqfkf();
                    if (eablkybsjgVarPpxfxbqfkf == null) {
                        throw new c("No setter found for property " + iobyxmoadgVar.iobyxmoadg());
                    }
                }
                Method methodPmvmpeiblj2 = iobyxmoadgVar.iobyxmoadg().wypolnanlu().pmvmpeiblj(eablkybsjgVarPpxfxbqfkf.ppxfxbqfkf(), eablkybsjgVarPpxfxbqfkf.zoijcleaow());
                if (methodPmvmpeiblj2 != null) {
                    Modifier.isStatic(methodPmvmpeiblj2.getModifiers());
                    return iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.iobyxmoadg(methodPmvmpeiblj2, gxszxtbevo(iobyxmoadgVar)) : new eh.dxjokdxxww.nufgyqmvbu.eablkybsjg(methodPmvmpeiblj2);
                }
                throw new c("No accessor found for property " + iobyxmoadgVar.iobyxmoadg());
            }
            if (z13) {
                methodPpxfxbqfkf = ((rgvfuqvkyq.zoijcleaow) rgvfuqvkyqVarGxszxtbevo).zoijcleaow();
            } else {
                rgvfuqvkyq.zoijcleaow zoijcleaowVar = (rgvfuqvkyq.zoijcleaow) rgvfuqvkyqVarGxszxtbevo;
                methodPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                if (methodPpxfxbqfkf == null) {
                    throw new c("No source found for setter of Java method property: " + zoijcleaowVar.zoijcleaow());
                }
            }
            iobyxmoadgVar2 = iobyxmoadgVar.ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.iobyxmoadg(methodPpxfxbqfkf, gxszxtbevo(iobyxmoadgVar)) : new eh.dxjokdxxww.nufgyqmvbu.eablkybsjg(methodPpxfxbqfkf);
        }
        return eh.ojitshcjhn.btonecajqb(iobyxmoadgVar2, iobyxmoadgVar.sopmlzcsov(), false, 2, null);
    }
}
