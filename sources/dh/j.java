package dh;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final j f28254iobyxmoadg = new j();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ii.zoijcleaow f28255zoijcleaow = ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf("java.lang.Void"));

    private j() {
    }

    private final String eablkybsjg(jh.zoijcleaow zoijcleaowVar) {
        String strEablkybsjg = sh.tzroggbefp.eablkybsjg(zoijcleaowVar);
        if (strEablkybsjg != null) {
            return strEablkybsjg;
        }
        if (zoijcleaowVar instanceof jh.jlmebxxoox) {
            String strZoijcleaow = pi.eablkybsjg.iwizpuwonk(zoijcleaowVar).getName().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            return sh.wwaezpbzkn.zoijcleaow(strZoijcleaow);
        }
        if (zoijcleaowVar instanceof jh.ribwqtqdhb) {
            String strZoijcleaow2 = pi.eablkybsjg.iwizpuwonk(zoijcleaowVar).getName().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
            return sh.wwaezpbzkn.eablkybsjg(strZoijcleaow2);
        }
        String strZoijcleaow3 = zoijcleaowVar.getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow3, "asString(...)");
        return strZoijcleaow3;
    }

    private final gh.draadjrbmk iobyxmoadg(Class cls) {
        if (cls.isPrimitive()) {
            return qi.eablkybsjg.lqeggnwhkg(cls.getSimpleName()).btonecajqb();
        }
        return null;
    }

    private final agtfadlqog.eablkybsjg wkgbmnqykc(jh.lereixgezr lereixgezrVar) {
        return new agtfadlqog.eablkybsjg(new hi.wkgbmnqykc.zoijcleaow(eablkybsjg(lereixgezrVar), bi.istkbnxepw.ppxfxbqfkf(lereixgezrVar, false, false, 1, null)));
    }

    private final boolean zoijcleaow(jh.lereixgezr lereixgezrVar) {
        if (li.nufgyqmvbu.rgvfuqvkyq(lereixgezrVar) || li.nufgyqmvbu.vdvldrhtss(lereixgezrVar)) {
            return true;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lereixgezrVar.getName(), ih.iobyxmoadg.f44240eablkybsjg.iobyxmoadg()) && lereixgezrVar.dxjokdxxww().isEmpty();
    }

    public final rgvfuqvkyq gxszxtbevo(jh.crxdokpmqz possiblyOverriddenProperty) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        jh.crxdokpmqz crxdokpmqzVarIobyxmoadg = ((jh.crxdokpmqz) li.dxjokdxxww.jpowsppfya(possiblyOverriddenProperty)).iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(crxdokpmqzVarIobyxmoadg, "getOriginal(...)");
        if (crxdokpmqzVarIobyxmoadg instanceof xi.cllcsxoeiz) {
            xi.cllcsxoeiz cllcsxoeizVar = (xi.cllcsxoeiz) crxdokpmqzVarIobyxmoadg;
            di.agtfadlqog agtfadlqogVarI = cllcsxoeizVar.okpsazkaxt();
            kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo propertySignature = gi.iobyxmoadg.f37419wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(propertySignature, "propertySignature");
            gi.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (gi.iobyxmoadg.wkgbmnqykc) fi.eablkybsjg.iobyxmoadg(agtfadlqogVarI, propertySignature);
            if (wkgbmnqykcVar != null) {
                return new rgvfuqvkyq.ppxfxbqfkf(crxdokpmqzVarIobyxmoadg, agtfadlqogVarI, wkgbmnqykcVar, cllcsxoeizVar.ylkuphrtab(), cllcsxoeizVar.yadqdtsiqt());
            }
        } else if (crxdokpmqzVarIobyxmoadg instanceof uh.gxszxtbevo) {
            uh.gxszxtbevo gxszxtbevoVar = (uh.gxszxtbevo) crxdokpmqzVarIobyxmoadg;
            jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
            yh.iobyxmoadg iobyxmoadgVar = xrmfcynszjVarLqeggnwhkg instanceof yh.iobyxmoadg ? (yh.iobyxmoadg) xrmfcynszjVarLqeggnwhkg : null;
            zh.draadjrbmk draadjrbmkVarPpxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.ppxfxbqfkf() : null;
            if (draadjrbmkVarPpxfxbqfkf instanceof ph.iwizpuwonk) {
                return new rgvfuqvkyq.iobyxmoadg(((ph.iwizpuwonk) draadjrbmkVarPpxfxbqfkf).kegysxyocb());
            }
            if (draadjrbmkVarPpxfxbqfkf instanceof ph.lereixgezr) {
                Method methodKegysxyocb = ((ph.lereixgezr) draadjrbmkVarPpxfxbqfkf).kegysxyocb();
                jh.ribwqtqdhb ribwqtqdhbVarNufgyqmvbu = gxszxtbevoVar.nufgyqmvbu();
                jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg2 = ribwqtqdhbVarNufgyqmvbu != null ? ribwqtqdhbVarNufgyqmvbu.lqeggnwhkg() : null;
                yh.iobyxmoadg iobyxmoadgVar2 = xrmfcynszjVarLqeggnwhkg2 instanceof yh.iobyxmoadg ? (yh.iobyxmoadg) xrmfcynszjVarLqeggnwhkg2 : null;
                zh.draadjrbmk draadjrbmkVarPpxfxbqfkf2 = iobyxmoadgVar2 != null ? iobyxmoadgVar2.ppxfxbqfkf() : null;
                ph.lereixgezr lereixgezrVar = draadjrbmkVarPpxfxbqfkf2 instanceof ph.lereixgezr ? (ph.lereixgezr) draadjrbmkVarPpxfxbqfkf2 : null;
                return new rgvfuqvkyq.zoijcleaow(methodKegysxyocb, lereixgezrVar != null ? lereixgezrVar.kegysxyocb() : null);
            }
            throw new c("Incorrect resolution sequence for Java field " + crxdokpmqzVarIobyxmoadg + " (source = " + draadjrbmkVarPpxfxbqfkf + ')');
        }
        jh.jlmebxxoox jlmebxxooxVarWkgbmnqykc = crxdokpmqzVarIobyxmoadg.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jlmebxxooxVarWkgbmnqykc);
        agtfadlqog.eablkybsjg eablkybsjgVarWkgbmnqykc = wkgbmnqykc(jlmebxxooxVarWkgbmnqykc);
        jh.ribwqtqdhb ribwqtqdhbVarNufgyqmvbu2 = crxdokpmqzVarIobyxmoadg.nufgyqmvbu();
        return new rgvfuqvkyq.wkgbmnqykc(eablkybsjgVarWkgbmnqykc, ribwqtqdhbVarNufgyqmvbu2 != null ? wkgbmnqykc(ribwqtqdhbVarNufgyqmvbu2) : null);
    }

    public final agtfadlqog lqeggnwhkg(jh.lereixgezr possiblySubstitutedFunction) {
        Method methodKegysxyocb;
        hi.wkgbmnqykc.zoijcleaow zoijcleaowVarZoijcleaow;
        hi.wkgbmnqykc.zoijcleaow zoijcleaowVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        jh.lereixgezr lereixgezrVarIobyxmoadg = ((jh.lereixgezr) li.dxjokdxxww.jpowsppfya(possiblySubstitutedFunction)).iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lereixgezrVarIobyxmoadg, "getOriginal(...)");
        if (!(lereixgezrVarIobyxmoadg instanceof xi.zoijcleaow)) {
            if (lereixgezrVarIobyxmoadg instanceof uh.eablkybsjg) {
                jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg = ((uh.eablkybsjg) lereixgezrVarIobyxmoadg).lqeggnwhkg();
                yh.iobyxmoadg iobyxmoadgVar = xrmfcynszjVarLqeggnwhkg instanceof yh.iobyxmoadg ? (yh.iobyxmoadg) xrmfcynszjVarLqeggnwhkg : null;
                zh.draadjrbmk draadjrbmkVarPpxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.ppxfxbqfkf() : null;
                ph.lereixgezr lereixgezrVar = draadjrbmkVarPpxfxbqfkf instanceof ph.lereixgezr ? (ph.lereixgezr) draadjrbmkVarPpxfxbqfkf : null;
                if (lereixgezrVar != null && (methodKegysxyocb = lereixgezrVar.kegysxyocb()) != null) {
                    return new agtfadlqog.ppxfxbqfkf(methodKegysxyocb);
                }
                throw new c("Incorrect resolution sequence for Java method " + lereixgezrVarIobyxmoadg);
            }
            if (!(lereixgezrVarIobyxmoadg instanceof uh.zoijcleaow)) {
                if (zoijcleaow(lereixgezrVarIobyxmoadg)) {
                    return wkgbmnqykc(lereixgezrVarIobyxmoadg);
                }
                throw new c("Unknown origin of " + lereixgezrVarIobyxmoadg + " (" + lereixgezrVarIobyxmoadg.getClass() + ')');
            }
            jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg2 = ((uh.zoijcleaow) lereixgezrVarIobyxmoadg).lqeggnwhkg();
            yh.iobyxmoadg iobyxmoadgVar2 = xrmfcynszjVarLqeggnwhkg2 instanceof yh.iobyxmoadg ? (yh.iobyxmoadg) xrmfcynszjVarLqeggnwhkg2 : null;
            zh.draadjrbmk draadjrbmkVarPpxfxbqfkf2 = iobyxmoadgVar2 != null ? iobyxmoadgVar2.ppxfxbqfkf() : null;
            if (draadjrbmkVarPpxfxbqfkf2 instanceof ph.zdlpuopuiu) {
                return new agtfadlqog.zoijcleaow(((ph.zdlpuopuiu) draadjrbmkVarPpxfxbqfkf2).kegysxyocb());
            }
            if (draadjrbmkVarPpxfxbqfkf2 instanceof ph.vdvldrhtss) {
                ph.vdvldrhtss vdvldrhtssVar = (ph.vdvldrhtss) draadjrbmkVarPpxfxbqfkf2;
                if (vdvldrhtssVar.wflxmlrfwp()) {
                    return new agtfadlqog.iobyxmoadg(vdvldrhtssVar.kcexrzcfyt());
                }
            }
            throw new c("Incorrect resolution sequence for Java constructor " + lereixgezrVarIobyxmoadg + " (" + draadjrbmkVarPpxfxbqfkf2 + ')');
        }
        xi.zdlpuopuiu zdlpuopuiuVar = (xi.zdlpuopuiu) lereixgezrVarIobyxmoadg;
        kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog agtfadlqogVarOkpsazkaxt = zdlpuopuiuVar.okpsazkaxt();
        if ((agtfadlqogVarOkpsazkaxt instanceof di.dxjokdxxww) && (zoijcleaowVarEablkybsjg = hi.dxjokdxxww.f40413iobyxmoadg.eablkybsjg((di.dxjokdxxww) agtfadlqogVarOkpsazkaxt, zdlpuopuiuVar.ylkuphrtab(), zdlpuopuiuVar.yadqdtsiqt())) != null) {
            return new agtfadlqog.eablkybsjg(zoijcleaowVarEablkybsjg);
        }
        if (!(agtfadlqogVarOkpsazkaxt instanceof di.wkgbmnqykc) || (zoijcleaowVarZoijcleaow = hi.dxjokdxxww.f40413iobyxmoadg.zoijcleaow((di.wkgbmnqykc) agtfadlqogVarOkpsazkaxt, zdlpuopuiuVar.ylkuphrtab(), zdlpuopuiuVar.yadqdtsiqt())) == null) {
            return wkgbmnqykc(lereixgezrVarIobyxmoadg);
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = possiblySubstitutedFunction.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
        if (li.gtknphoqwx.zoijcleaow(wflxmlrfwpVarZoijcleaow)) {
            return new agtfadlqog.eablkybsjg(zoijcleaowVarZoijcleaow);
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = possiblySubstitutedFunction.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow2, "getContainingDeclaration(...)");
        if (!li.gtknphoqwx.wkgbmnqykc(wflxmlrfwpVarZoijcleaow2)) {
            return new agtfadlqog.wkgbmnqykc(zoijcleaowVarZoijcleaow);
        }
        jh.draadjrbmk draadjrbmkVar = (jh.draadjrbmk) possiblySubstitutedFunction;
        if (draadjrbmkVar.vipkmwdibw()) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVarZoijcleaow.eablkybsjg(), "constructor-impl") || !mj.kcexrzcfyt.zynmafqrjb(zoijcleaowVarZoijcleaow.wkgbmnqykc(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + zoijcleaowVarZoijcleaow).toString());
            }
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVarZoijcleaow.eablkybsjg(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + zoijcleaowVarZoijcleaow).toString());
            }
            jh.eablkybsjg eablkybsjgVarJhduphickx = draadjrbmkVar.jhduphickx();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarJhduphickx, "getConstructedClass(...)");
            String strYggfygwlhe = eh.ojitshcjhn.yggfygwlhe(eablkybsjgVarJhduphickx);
            if (mj.kcexrzcfyt.zynmafqrjb(zoijcleaowVarZoijcleaow.wkgbmnqykc(), ")V", false, 2, null)) {
                zoijcleaowVarZoijcleaow = hi.wkgbmnqykc.zoijcleaow.ppxfxbqfkf(zoijcleaowVarZoijcleaow, null, mj.kcexrzcfyt.hszhottldk(zoijcleaowVarZoijcleaow.wkgbmnqykc(), "V") + strYggfygwlhe, 1, null);
            } else if (!mj.kcexrzcfyt.zynmafqrjb(zoijcleaowVarZoijcleaow.wkgbmnqykc(), strYggfygwlhe, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + zoijcleaowVarZoijcleaow).toString());
            }
        }
        return new agtfadlqog.eablkybsjg(zoijcleaowVarZoijcleaow);
    }

    public final ii.zoijcleaow ppxfxbqfkf(Class klass) {
        ii.zoijcleaow zoijcleaowVarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        if (!klass.isArray()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(klass, Void.TYPE)) {
                return f28255zoijcleaow;
            }
            gh.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadg(klass);
            if (draadjrbmkVarIobyxmoadg != null) {
                return new ii.zoijcleaow(gh.ojitshcjhn.f37261pmvmpeiblj, draadjrbmkVarIobyxmoadg.agtfadlqog());
            }
            ii.zoijcleaow zoijcleaowVarEablkybsjg = ph.gxszxtbevo.eablkybsjg(klass);
            return (zoijcleaowVarEablkybsjg.dxjokdxxww() || (zoijcleaowVarWflxmlrfwp = ih.ppxfxbqfkf.f44265iobyxmoadg.wflxmlrfwp(zoijcleaowVarEablkybsjg.iobyxmoadg())) == null) ? zoijcleaowVarEablkybsjg : zoijcleaowVarWflxmlrfwp;
        }
        Class<?> componentType = klass.getComponentType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(componentType, "getComponentType(...)");
        gh.draadjrbmk draadjrbmkVarIobyxmoadg2 = iobyxmoadg(componentType);
        if (draadjrbmkVarIobyxmoadg2 != null) {
            return new ii.zoijcleaow(gh.ojitshcjhn.f37261pmvmpeiblj, draadjrbmkVarIobyxmoadg2.btonecajqb());
        }
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = gh.ojitshcjhn.iobyxmoadg.f37286dxjokdxxww.draadjrbmk();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk, "toSafe(...)");
        return iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVarDraadjrbmk);
    }
}
