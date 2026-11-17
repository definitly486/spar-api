package dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ikoacuggdj implements kotlin.jvm.internal.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f28234zdlpuopuiu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final Class f28233yggfygwlhe = kotlin.jvm.internal.gtknphoqwx.class;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final mj.rgvfuqvkyq f28232jyumaefscl = new mj.rgvfuqvkyq("<v#(\\d+)>");

    public static final class eablkybsjg extends btonecajqb {
        eablkybsjg(ikoacuggdj ikoacuggdjVar) {
            super(ikoacuggdjVar);
        }

        @Override // mh.ojitshcjhn, jh.ojitshcjhn
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public pmvmpeiblj lqeggnwhkg(jh.draadjrbmk descriptor, gg.wwaezpbzkn data) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final mj.rgvfuqvkyq iobyxmoadg() {
            return ikoacuggdj.f28232jyumaefscl;
        }

        private iobyxmoadg() {
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f28235iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f28236zoijcleaow;

        public ppxfxbqfkf(List parameters, Class cls) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
            this.f28235iobyxmoadg = parameters;
            this.f28236zoijcleaow = cls;
        }

        public final List iobyxmoadg() {
            return this.f28235iobyxmoadg;
        }

        public final Class zoijcleaow() {
            return this.f28236zoijcleaow;
        }
    }

    protected enum wkgbmnqykc {
        DECLARED,
        INHERITED;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f28237iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        public final boolean wkgbmnqykc(jh.zoijcleaow member) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
            return member.getKind().iobyxmoadg() == (this == DECLARED);
        }
    }

    public abstract class zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f28241ppxfxbqfkf = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final e.iobyxmoadg f28242iobyxmoadg;

        public zoijcleaow() {
            this.f28242iobyxmoadg = e.ppxfxbqfkf(new okpsazkaxt(ikoacuggdj.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oh.gtknphoqwx ppxfxbqfkf(ikoacuggdj ikoacuggdjVar) {
            return d.iobyxmoadg(ikoacuggdjVar.zoijcleaow());
        }

        public final oh.gtknphoqwx zoijcleaow() {
            Object objZoijcleaow = this.f28242iobyxmoadg.zoijcleaow(this, f28241ppxfxbqfkf[0]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (oh.gtknphoqwx) objZoijcleaow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cdpycssgdh(tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        return ((Number) rgvfuqvkyqVar.invoke(obj, obj2)).intValue();
    }

    private final Class cllcsxoeiz(String str, int i13, int i14) throws ClassNotFoundException {
        char cCharAt = str.charAt(i13);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderBtonecajqb = ph.gxszxtbevo.btonecajqb(zoijcleaow());
            String strSubstring = str.substring(i13 + 1, i14 - 1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderBtonecajqb.loadClass(mj.kcexrzcfyt.pkzmftpjix(strSubstring, '/', '.', false, 4, null));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return n.gxszxtbevo(cllcsxoeiz(str, i13 + 1, i14));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new c("Unknown type prefix in the method signature: " + str);
        }
    }

    private final Constructor dsvhmnatus(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final ppxfxbqfkf hkdspvbjdz(String str, boolean z13) {
        int iYfnezrywwk;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        while (true) {
            if (str.charAt(i13) == ')') {
                return new ppxfxbqfkf(arrayList, z13 ? cllcsxoeiz(str, i13 + 1, str.length()) : null);
            }
            int i14 = i13;
            while (str.charAt(i14) == '[') {
                i14++;
            }
            char cCharAt = str.charAt(i14);
            if (mj.kcexrzcfyt.ulzqkzuiru("VZCBSIFJD", cCharAt, false, 2, null)) {
                iYfnezrywwk = i14 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new c("Unknown type prefix in the method signature: " + str);
                }
                iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(str, ';', i13, false, 4, null) + 1;
            }
            arrayList.add(cllcsxoeiz(str, i13, iYfnezrywwk));
            i13 = iYfnezrywwk;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int istkbnxepw(jh.yggfygwlhe yggfygwlheVar, jh.yggfygwlhe yggfygwlheVar2) {
        Integer numWkgbmnqykc = jh.zdlpuopuiu.wkgbmnqykc(yggfygwlheVar, yggfygwlheVar2);
        if (numWkgbmnqykc != null) {
            return numWkgbmnqykc.intValue();
        }
        return 0;
    }

    private final Method jpowsppfya(Class cls, String str, Class[] clsArr, Class cls2, boolean z13) {
        Method methodJpowsppfya;
        if (z13) {
            clsArr[0] = cls;
        }
        Method methodWypolnanlu = wypolnanlu(cls, str, clsArr, cls2);
        if (methodWypolnanlu != null) {
            return methodWypolnanlu;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodJpowsppfya = jpowsppfya(superclass, str, clsArr, cls2, z13)) != null) {
            return methodJpowsppfya;
        }
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getInterfaces());
        while (itIobyxmoadg.hasNext()) {
            Class cls3 = (Class) itIobyxmoadg.next();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cls3);
            Method methodJpowsppfya2 = jpowsppfya(cls3, str, clsArr, cls2, z13);
            if (methodJpowsppfya2 != null) {
                return methodJpowsppfya2;
            }
            if (z13) {
                Class clsIobyxmoadg = oh.eablkybsjg.iobyxmoadg(ph.gxszxtbevo.btonecajqb(cls3), cls3.getName() + "$DefaultImpls");
                if (clsIobyxmoadg != null) {
                    clsArr[0] = cls3;
                    Method methodWypolnanlu2 = wypolnanlu(clsIobyxmoadg, str, clsArr, cls2);
                    if (methodWypolnanlu2 != null) {
                        return methodWypolnanlu2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lereixgezr(jh.lereixgezr descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return ki.agtfadlqog.f55532gtknphoqwx.dsvhmnatus(descriptor) + " | " + j.f28254iobyxmoadg.lqeggnwhkg(descriptor).iobyxmoadg();
    }

    private final void wflxmlrfwp(List list, List list2, boolean z13) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hg.jyumaefscl.lxfrhoxuzk(list2), f28233yggfygwlhe)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i13 = 0; i13 < size; i13++) {
            Class TYPE = Integer.TYPE;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(TYPE, "TYPE");
            list.add(TYPE);
        }
        Class<Object> cls = z13 ? f28233yggfygwlhe : Object.class;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cls);
        list.add(cls);
    }

    private final Method wypolnanlu(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(method.getName(), str) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence yadqdtsiqt(jh.crxdokpmqz descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return ki.agtfadlqog.f55532gtknphoqwx.dsvhmnatus(descriptor) + " | " + j.f28254iobyxmoadg.gxszxtbevo(descriptor).iobyxmoadg();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
    public final jh.lereixgezr esjtqupxsv(String name, String signature) {
        Collection collectionLmojexxdyd;
        ArrayList arrayList;
        String strIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, "<init>")) {
            collectionLmojexxdyd = hg.jyumaefscl.m(iozdgvuglv());
            arrayList = new ArrayList();
            for (Object obj : collectionLmojexxdyd) {
                jh.draadjrbmk draadjrbmkVar = (jh.draadjrbmk) obj;
                if (draadjrbmkVar.vipkmwdibw()) {
                    jh.dxjokdxxww dxjokdxxwwVarZoijcleaow = draadjrbmkVar.zoijcleaow();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dxjokdxxwwVarZoijcleaow, "getContainingDeclaration(...)");
                    if (li.gtknphoqwx.wkgbmnqykc(dxjokdxxwwVarZoijcleaow)) {
                        String strIobyxmoadg2 = j.f28254iobyxmoadg.lqeggnwhkg(draadjrbmkVar).iobyxmoadg();
                        if (!mj.kcexrzcfyt.stevsuqkhv(strIobyxmoadg2, "constructor-impl", false, 2, null) || !mj.kcexrzcfyt.zynmafqrjb(strIobyxmoadg2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + draadjrbmkVar + ": " + strIobyxmoadg2).toString());
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(mj.kcexrzcfyt.hszhottldk(strIobyxmoadg2, "V"));
                        jh.dxjokdxxww dxjokdxxwwVarZoijcleaow2 = draadjrbmkVar.zoijcleaow();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dxjokdxxwwVarZoijcleaow2, "getContainingDeclaration(...)");
                        sb3.append(eh.ojitshcjhn.yggfygwlhe(dxjokdxxwwVarZoijcleaow2));
                        strIobyxmoadg = sb3.toString();
                    } else {
                        strIobyxmoadg = j.f28254iobyxmoadg.lqeggnwhkg(draadjrbmkVar).iobyxmoadg();
                    }
                } else {
                    strIobyxmoadg = j.f28254iobyxmoadg.lqeggnwhkg(draadjrbmkVar).iobyxmoadg();
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(name);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            collectionLmojexxdyd = lmojexxdyd(gxszxtbevoVarGxszxtbevo);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collectionLmojexxdyd) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(j.f28254iobyxmoadg.lqeggnwhkg((jh.lereixgezr) obj2).iobyxmoadg(), signature)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.size() == 1) {
            return (jh.lereixgezr) hg.jyumaefscl.yzdjzghtvl(arrayList);
        }
        String strIwxlajgraz = hg.jyumaefscl.iwxlajgraz(collectionLmojexxdyd, "\n", null, null, 0, null, jhduphickx.f28256zdlpuopuiu, 30, null);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Function '");
        sb4.append(name);
        sb4.append("' (JVM signature: ");
        sb4.append(signature);
        sb4.append(") not resolved in ");
        sb4.append(this);
        sb4.append(':');
        sb4.append(strIwxlajgraz.length() == 0 ? " no members found" : '\n' + strIwxlajgraz);
        throw new c(sb4.toString());
    }

    public abstract Collection hcddaimhww(ii.gxszxtbevo gxszxtbevoVar);

    public abstract Collection iozdgvuglv();

    public final Method iwizpuwonk(String name, String desc, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z13) {
            arrayList.add(zoijcleaow());
        }
        ppxfxbqfkf ppxfxbqfkfVarHkdspvbjdz = hkdspvbjdz(desc, true);
        wflxmlrfwp(arrayList, ppxfxbqfkfVarHkdspvbjdz.iobyxmoadg(), false);
        Class clsPkzmftpjix = pkzmftpjix();
        String str = name + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsZoijcleaow = ppxfxbqfkfVarHkdspvbjdz.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(clsZoijcleaow);
        return jpowsppfya(clsPkzmftpjix, str, clsArr, clsZoijcleaow, z13);
    }

    public abstract Collection lmojexxdyd(ii.gxszxtbevo gxszxtbevoVar);

    public final Constructor oxmwwwfdhm(String desc) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        Class clsZoijcleaow = zoijcleaow();
        ArrayList arrayList = new ArrayList();
        wflxmlrfwp(arrayList, hkdspvbjdz(desc, false).iobyxmoadg(), true);
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        return dsvhmnatus(clsZoijcleaow, arrayList);
    }

    protected Class pkzmftpjix() {
        Class clsGtknphoqwx = ph.gxszxtbevo.gtknphoqwx(zoijcleaow());
        return clsGtknphoqwx == null ? zoijcleaow() : clsGtknphoqwx;
    }

    public final Method pmvmpeiblj(String name, String desc) {
        Method methodJpowsppfya;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, "<init>")) {
            return null;
        }
        ppxfxbqfkf ppxfxbqfkfVarHkdspvbjdz = hkdspvbjdz(desc, true);
        Class[] clsArr = (Class[]) ppxfxbqfkfVarHkdspvbjdz.iobyxmoadg().toArray(new Class[0]);
        Class clsZoijcleaow = ppxfxbqfkfVarHkdspvbjdz.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(clsZoijcleaow);
        Method methodJpowsppfya2 = jpowsppfya(pkzmftpjix(), name, clsArr, clsZoijcleaow, false);
        if (methodJpowsppfya2 != null) {
            return methodJpowsppfya2;
        }
        if (!pkzmftpjix().isInterface() || (methodJpowsppfya = jpowsppfya(Object.class, name, clsArr, clsZoijcleaow, false)) == null) {
            return null;
        }
        return methodJpowsppfya;
    }

    public final Constructor rgvfuqvkyq(String desc) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        return dsvhmnatus(zoijcleaow(), hkdspvbjdz(desc, false).iobyxmoadg());
    }

    public abstract jh.crxdokpmqz wwaezpbzkn(int i13);

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    protected final Collection ylkuphrtab(si.gtknphoqwx scope, wkgbmnqykc belonginess) {
        pmvmpeiblj pmvmpeibljVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(belonginess, "belonginess");
        eablkybsjg eablkybsjgVar = new eablkybsjg(this);
        Collection<jh.wflxmlrfwp> collectionIobyxmoadg = si.agtfadlqog.iobyxmoadg.iobyxmoadg(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (jh.wflxmlrfwp wflxmlrfwpVar : collectionIobyxmoadg) {
            if (wflxmlrfwpVar instanceof jh.zoijcleaow) {
                jh.zoijcleaow zoijcleaowVar = (jh.zoijcleaow) wflxmlrfwpVar;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.getVisibility(), jh.zdlpuopuiu.f51359nufgyqmvbu) || !belonginess.wkgbmnqykc(zoijcleaowVar)) {
                    pmvmpeibljVar = null;
                } else {
                    pmvmpeibljVar = (pmvmpeiblj) wflxmlrfwpVar.tbqsvytpvh(eablkybsjgVar, gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            } else {
                pmvmpeibljVar = null;
            }
            if (pmvmpeibljVar != null) {
                arrayList.add(pmvmpeibljVar);
            }
        }
        return hg.jyumaefscl.m(arrayList);
    }

    public final jh.crxdokpmqz zynmafqrjb(String name, String signature) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
        mj.draadjrbmk draadjrbmkVarAgtfadlqog = f28232jyumaefscl.agtfadlqog(signature);
        if (draadjrbmkVarAgtfadlqog != null) {
            String str = (String) draadjrbmkVarAgtfadlqog.iobyxmoadg().iobyxmoadg().zoijcleaow().get(1);
            jh.crxdokpmqz crxdokpmqzVarWwaezpbzkn = wwaezpbzkn(Integer.parseInt(str));
            if (crxdokpmqzVarWwaezpbzkn != null) {
                return crxdokpmqzVarWwaezpbzkn;
            }
            throw new c("Local property #" + str + " not found in " + zoijcleaow());
        }
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(name);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        Collection collectionHcddaimhww = hcddaimhww(gxszxtbevoVarGxszxtbevo);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionHcddaimhww) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(j.f28254iobyxmoadg.gxszxtbevo((jh.crxdokpmqz) obj).iobyxmoadg(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new c("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (jh.crxdokpmqz) hg.jyumaefscl.yzdjzghtvl(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            jh.yggfygwlhe visibility = ((jh.crxdokpmqz) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = hg.tzroggbefp.nufgyqmvbu(linkedHashMap, new ribwqtqdhb(jlmebxxoox.f28257zdlpuopuiu)).values();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionValues, "<get-values>(...)");
        List list = (List) hg.jyumaefscl.dvvnrvtcbc(collectionValues);
        if (list.size() == 1) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
            return (jh.crxdokpmqz) hg.jyumaefscl.opjhrmiecq(list);
        }
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo2 = ii.gxszxtbevo.gxszxtbevo(name);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo2, "identifier(...)");
        String strIwxlajgraz = hg.jyumaefscl.iwxlajgraz(hcddaimhww(gxszxtbevoVarGxszxtbevo2), "\n", null, null, 0, null, vipkmwdibw.f28367zdlpuopuiu, 30, null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Property '");
        sb3.append(name);
        sb3.append("' (JVM signature: ");
        sb3.append(signature);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(':');
        sb3.append(strIwxlajgraz.length() == 0 ? " no members found" : '\n' + strIwxlajgraz);
        throw new c(sb3.toString());
    }
}
