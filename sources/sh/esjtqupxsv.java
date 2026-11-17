package sh;

import java.util.HashMap;
import java.util.Map;
import jh.nuxfzjnpeb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final jh.yggfygwlhe f106529iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final jh.yggfygwlhe f106530ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f106531wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final jh.yggfygwlhe f106532zoijcleaow;

    static class iobyxmoadg extends jh.oxmwwwfdhm {
        iobyxmoadg(nuxfzjnpeb nuxfzjnpebVar) {
            super(nuxfzjnpebVar);
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "from";
            } else if (i13 == 2) {
                objArr[0] = "fromPackage";
            } else if (i13 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i13 == 2 || i13 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // jh.yggfygwlhe
        public boolean eablkybsjg(ti.lqeggnwhkg lqeggnwhkgVar, jh.vdvldrhtss vdvldrhtssVar, jh.wflxmlrfwp wflxmlrfwpVar, boolean z13) {
            if (vdvldrhtssVar == null) {
                lqeggnwhkg(0);
            }
            if (wflxmlrfwpVar == null) {
                lqeggnwhkg(1);
            }
            return esjtqupxsv.wkgbmnqykc(vdvldrhtssVar, wflxmlrfwpVar);
        }
    }

    static class ppxfxbqfkf extends jh.oxmwwwfdhm {
        ppxfxbqfkf(nuxfzjnpeb nuxfzjnpebVar) {
            super(nuxfzjnpebVar);
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // jh.yggfygwlhe
        public boolean eablkybsjg(ti.lqeggnwhkg lqeggnwhkgVar, jh.vdvldrhtss vdvldrhtssVar, jh.wflxmlrfwp wflxmlrfwpVar, boolean z13) {
            if (vdvldrhtssVar == null) {
                lqeggnwhkg(0);
            }
            if (wflxmlrfwpVar == null) {
                lqeggnwhkg(1);
            }
            return esjtqupxsv.eablkybsjg(lqeggnwhkgVar, vdvldrhtssVar, wflxmlrfwpVar);
        }
    }

    static class zoijcleaow extends jh.oxmwwwfdhm {
        zoijcleaow(nuxfzjnpeb nuxfzjnpebVar) {
            super(nuxfzjnpebVar);
        }

        private static /* synthetic */ void lqeggnwhkg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // jh.yggfygwlhe
        public boolean eablkybsjg(ti.lqeggnwhkg lqeggnwhkgVar, jh.vdvldrhtss vdvldrhtssVar, jh.wflxmlrfwp wflxmlrfwpVar, boolean z13) {
            if (vdvldrhtssVar == null) {
                lqeggnwhkg(0);
            }
            if (wflxmlrfwpVar == null) {
                lqeggnwhkg(1);
            }
            return esjtqupxsv.eablkybsjg(lqeggnwhkgVar, vdvldrhtssVar, wflxmlrfwpVar);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(nh.iobyxmoadg.f70060ppxfxbqfkf);
        f106529iobyxmoadg = iobyxmoadgVar;
        zoijcleaow zoijcleaowVar = new zoijcleaow(nh.ppxfxbqfkf.f70061ppxfxbqfkf);
        f106532zoijcleaow = zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(nh.zoijcleaow.f70062ppxfxbqfkf);
        f106530ppxfxbqfkf = ppxfxbqfkfVar;
        f106531wkgbmnqykc = new HashMap();
        gxszxtbevo(iobyxmoadgVar);
        gxszxtbevo(zoijcleaowVar);
        gxszxtbevo(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean eablkybsjg(ti.lqeggnwhkg lqeggnwhkgVar, jh.vdvldrhtss vdvldrhtssVar, jh.wflxmlrfwp wflxmlrfwpVar) {
        if (vdvldrhtssVar == null) {
            iobyxmoadg(0);
        }
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(1);
        }
        if (wkgbmnqykc(li.dxjokdxxww.hkdspvbjdz(vdvldrhtssVar), wflxmlrfwpVar)) {
            return true;
        }
        return jh.zdlpuopuiu.f51361ppxfxbqfkf.eablkybsjg(lqeggnwhkgVar, vdvldrhtssVar, wflxmlrfwpVar, false);
    }

    private static void gxszxtbevo(jh.yggfygwlhe yggfygwlheVar) {
        f106531wkgbmnqykc.put(yggfygwlheVar.zoijcleaow(), yggfygwlheVar);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i13 == 5 || i13 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i13 == 2 || i13 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i13 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i13 != 5 && i13 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static jh.yggfygwlhe lqeggnwhkg(nuxfzjnpeb nuxfzjnpebVar) {
        if (nuxfzjnpebVar == null) {
            iobyxmoadg(4);
        }
        jh.yggfygwlhe yggfygwlheVar = (jh.yggfygwlhe) f106531wkgbmnqykc.get(nuxfzjnpebVar);
        if (yggfygwlheVar != null) {
            return yggfygwlheVar;
        }
        jh.yggfygwlhe yggfygwlheVarBtonecajqb = jh.zdlpuopuiu.btonecajqb(nuxfzjnpebVar);
        if (yggfygwlheVarBtonecajqb == null) {
            iobyxmoadg(5);
        }
        return yggfygwlheVarBtonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wkgbmnqykc(jh.wflxmlrfwp wflxmlrfwpVar, jh.wflxmlrfwp wflxmlrfwpVar2) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(2);
        }
        if (wflxmlrfwpVar2 == null) {
            iobyxmoadg(3);
        }
        jh.hkdspvbjdz hkdspvbjdzVar = (jh.hkdspvbjdz) li.dxjokdxxww.oxmwwwfdhm(wflxmlrfwpVar, jh.hkdspvbjdz.class, false);
        jh.hkdspvbjdz hkdspvbjdzVar2 = (jh.hkdspvbjdz) li.dxjokdxxww.oxmwwwfdhm(wflxmlrfwpVar2, jh.hkdspvbjdz.class, false);
        return (hkdspvbjdzVar2 == null || hkdspvbjdzVar == null || !hkdspvbjdzVar.gxszxtbevo().equals(hkdspvbjdzVar2.gxszxtbevo())) ? false : true;
    }
}
