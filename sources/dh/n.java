package dh;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ii.ppxfxbqfkf f28278iobyxmoadg = new ii.ppxfxbqfkf("kotlin.jvm.JvmStatic");

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f28279iobyxmoadg;

        static {
            int[] iArr = new int[gh.draadjrbmk.values().length];
            try {
                iArr[gh.draadjrbmk.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gh.draadjrbmk.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gh.draadjrbmk.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gh.draadjrbmk.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gh.draadjrbmk.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gh.draadjrbmk.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gh.draadjrbmk.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gh.draadjrbmk.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f28279iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class agtfadlqog(ClassLoader classLoader, String str, String str2, int i13) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                sb3.append("[");
            }
            sb3.append("L");
        }
        if (str.length() > 0) {
            sb3.append(str + '.');
        }
        sb3.append(mj.kcexrzcfyt.pkzmftpjix(str2, '.', '$', false, 4, null));
        if (i13 > 0) {
            sb3.append(";");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return oh.eablkybsjg.iobyxmoadg(classLoader, string);
    }

    public static final ii.ppxfxbqfkf btonecajqb() {
        return f28278iobyxmoadg;
    }

    public static final boolean draadjrbmk(ah.ojitshcjhn ojitshcjhnVar) {
        zi.kegysxyocb kegysxyocbVarOxmwwwfdhm;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ojitshcjhnVar, "<this>");
        eslsurpljm eslsurpljmVar = ojitshcjhnVar instanceof eslsurpljm ? (eslsurpljm) ojitshcjhnVar : null;
        return (eslsurpljmVar == null || (kegysxyocbVarOxmwwwfdhm = eslsurpljmVar.oxmwwwfdhm()) == null || !li.gtknphoqwx.ppxfxbqfkf(kegysxyocbVarOxmwwwfdhm)) ? false : true;
    }

    public static final jh.vipkmwdibw dxjokdxxww(jh.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        if (iobyxmoadgVar.hcddaimhww() == null) {
            return null;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow).fiwbwshyhd();
    }

    public static final List eablkybsjg(kh.iobyxmoadg iobyxmoadgVar) {
        Annotation annotationRgvfuqvkyq;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        kh.nufgyqmvbu<kh.ppxfxbqfkf> annotations = iobyxmoadgVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kh.ppxfxbqfkf ppxfxbqfkfVar : annotations) {
            jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
            if (xrmfcynszjVarLqeggnwhkg instanceof oh.zoijcleaow) {
                annotationRgvfuqvkyq = ((oh.zoijcleaow) xrmfcynszjVarLqeggnwhkg).wkgbmnqykc();
            } else if (xrmfcynszjVarLqeggnwhkg instanceof oh.draadjrbmk.iobyxmoadg) {
                ph.yggfygwlhe yggfygwlheVarPpxfxbqfkf = ((oh.draadjrbmk.iobyxmoadg) xrmfcynszjVarLqeggnwhkg).ppxfxbqfkf();
                ph.lqeggnwhkg lqeggnwhkgVar = yggfygwlheVarPpxfxbqfkf instanceof ph.lqeggnwhkg ? (ph.lqeggnwhkg) yggfygwlheVarPpxfxbqfkf : null;
                annotationRgvfuqvkyq = lqeggnwhkgVar != null ? lqeggnwhkgVar.stevsuqkhv() : null;
            } else {
                annotationRgvfuqvkyq = rgvfuqvkyq(ppxfxbqfkfVar);
            }
            if (annotationRgvfuqvkyq != null) {
                arrayList.add(annotationRgvfuqvkyq);
            }
        }
        return zdlpuopuiu(arrayList);
    }

    public static final boolean gtknphoqwx(ah.ojitshcjhn ojitshcjhnVar) {
        zi.kegysxyocb kegysxyocbVarOxmwwwfdhm;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ojitshcjhnVar, "<this>");
        eslsurpljm eslsurpljmVar = ojitshcjhnVar instanceof eslsurpljm ? (eslsurpljm) ojitshcjhnVar : null;
        return (eslsurpljmVar == null || (kegysxyocbVarOxmwwwfdhm = eslsurpljmVar.oxmwwwfdhm()) == null || !li.gtknphoqwx.dxjokdxxww(kegysxyocbVarOxmwwwfdhm)) ? false : true;
    }

    public static final Class gxszxtbevo(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object iobyxmoadg(ni.zoijcleaow r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.n.iobyxmoadg(ni.zoijcleaow, java.lang.ClassLoader):java.lang.Object");
    }

    private static final Object kcexrzcfyt(ni.lqeggnwhkg lqeggnwhkgVar, ClassLoader classLoader) {
        if (lqeggnwhkgVar instanceof ni.iobyxmoadg) {
            return rgvfuqvkyq((kh.ppxfxbqfkf) ((ni.iobyxmoadg) lqeggnwhkgVar).zoijcleaow());
        }
        if (lqeggnwhkgVar instanceof ni.zoijcleaow) {
            return iobyxmoadg((ni.zoijcleaow) lqeggnwhkgVar, classLoader);
        }
        if (lqeggnwhkgVar instanceof ni.gtknphoqwx) {
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) ((ni.gtknphoqwx) lqeggnwhkgVar).zoijcleaow();
            ii.zoijcleaow zoijcleaowVar = (ii.zoijcleaow) vdvldrhtssVar.iobyxmoadg();
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) vdvldrhtssVar.wkgbmnqykc();
            Class clsOjitshcjhn = ojitshcjhn(classLoader, zoijcleaowVar, 0, 4, null);
            if (clsOjitshcjhn != null) {
                return m.iobyxmoadg(clsOjitshcjhn, gxszxtbevoVar.zoijcleaow());
            }
        } else if (lqeggnwhkgVar instanceof ni.kcexrzcfyt) {
            ni.kcexrzcfyt.zoijcleaow zoijcleaowVar2 = (ni.kcexrzcfyt.zoijcleaow) ((ni.kcexrzcfyt) lqeggnwhkgVar).zoijcleaow();
            if (zoijcleaowVar2 instanceof ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow) {
                ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow c1512zoijcleaow = (ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow) zoijcleaowVar2;
                return wflxmlrfwp(classLoader, c1512zoijcleaow.zoijcleaow(), c1512zoijcleaow.iobyxmoadg());
            }
            if (!(zoijcleaowVar2 instanceof ni.kcexrzcfyt.zoijcleaow.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ((ni.kcexrzcfyt.zoijcleaow.iobyxmoadg) zoijcleaowVar2).iobyxmoadg().grlcpdaxtj().ylkuphrtab();
            jh.eablkybsjg eablkybsjgVar = nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc : null;
            if (eablkybsjgVar != null) {
                return vdvldrhtss(eablkybsjgVar);
            }
        } else if (!(lqeggnwhkgVar instanceof ni.draadjrbmk) && !(lqeggnwhkgVar instanceof ni.yggfygwlhe)) {
            return lqeggnwhkgVar.zoijcleaow();
        }
        return null;
    }

    public static final Object lqeggnwhkg(Type type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Integer.TYPE)) {
                    return 0;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Long.TYPE)) {
                    return 0L;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    public static final jh.iobyxmoadg nufgyqmvbu(Class moduleAnchor, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, fi.ppxfxbqfkf nameResolver, fi.lqeggnwhkg typeTable, fi.iobyxmoadg metadataVersion, tg.rgvfuqvkyq createDescriptor) {
        List listIyctptxqzt;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createDescriptor, "createDescriptor");
        oh.gtknphoqwx gtknphoqwxVarIobyxmoadg = d.iobyxmoadg(moduleAnchor);
        if (proto instanceof di.dxjokdxxww) {
            listIyctptxqzt = ((di.dxjokdxxww) proto).opjhrmiecq();
        } else {
            if (!(proto instanceof di.agtfadlqog)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listIyctptxqzt = ((di.agtfadlqog) proto).iyctptxqzt();
        }
        List list = listIyctptxqzt;
        vi.agtfadlqog agtfadlqogVarIobyxmoadg = gtknphoqwxVarIobyxmoadg.iobyxmoadg();
        jh.lmojexxdyd lmojexxdydVarZoijcleaow = gtknphoqwxVarIobyxmoadg.zoijcleaow();
        fi.nufgyqmvbu nufgyqmvbuVarZoijcleaow = fi.nufgyqmvbu.f33904zoijcleaow.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
        return (jh.iobyxmoadg) createDescriptor.invoke(new vi.hcddaimhww(new vi.rgvfuqvkyq(agtfadlqogVarIobyxmoadg, nameResolver, lmojexxdydVarZoijcleaow, typeTable, nufgyqmvbuVarZoijcleaow, metadataVersion, null, null, list)), proto);
    }

    static /* synthetic */ Class ojitshcjhn(ClassLoader classLoader, ii.zoijcleaow zoijcleaowVar, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return wflxmlrfwp(classLoader, zoijcleaowVar, i13);
    }

    public static final ah.kcexrzcfyt oxmwwwfdhm(jh.yggfygwlhe yggfygwlheVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51354eablkybsjg)) {
            return ah.kcexrzcfyt.PUBLIC;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51361ppxfxbqfkf)) {
            return ah.kcexrzcfyt.PROTECTED;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51365wkgbmnqykc)) {
            return ah.kcexrzcfyt.INTERNAL;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51357iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51366zoijcleaow)) {
            return ah.kcexrzcfyt.PRIVATE;
        }
        return null;
    }

    public static final rlfsiqarku ppxfxbqfkf(Object obj) {
        rlfsiqarku rlfsiqarkuVar = obj instanceof rlfsiqarku ? (rlfsiqarku) obj : null;
        if (rlfsiqarkuVar != null) {
            return rlfsiqarkuVar;
        }
        kotlin.jvm.internal.rgvfuqvkyq rgvfuqvkyqVar = obj instanceof kotlin.jvm.internal.rgvfuqvkyq ? (kotlin.jvm.internal.rgvfuqvkyq) obj : null;
        ah.ppxfxbqfkf ppxfxbqfkfVarCompute = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.compute() : null;
        if (ppxfxbqfkfVarCompute instanceof rlfsiqarku) {
            return (rlfsiqarku) ppxfxbqfkfVarCompute;
        }
        return null;
    }

    private static final Annotation rgvfuqvkyq(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        jh.eablkybsjg eablkybsjgVarDraadjrbmk = pi.eablkybsjg.draadjrbmk(ppxfxbqfkfVar);
        Class clsVdvldrhtss = eablkybsjgVarDraadjrbmk != null ? vdvldrhtss(eablkybsjgVarDraadjrbmk) : null;
        if (clsVdvldrhtss == null) {
            clsVdvldrhtss = null;
        }
        if (clsVdvldrhtss == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = ppxfxbqfkfVar.zoijcleaow().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) entry.getKey();
            ni.lqeggnwhkg lqeggnwhkgVar = (ni.lqeggnwhkg) entry.getValue();
            ClassLoader classLoader = clsVdvldrhtss.getClassLoader();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(classLoader, "getClassLoader(...)");
            Object objKcexrzcfyt = kcexrzcfyt(lqeggnwhkgVar, classLoader);
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = objKcexrzcfyt != null ? gg.cqumvgiudr.iobyxmoadg(gxszxtbevoVar.zoijcleaow(), objKcexrzcfyt) : null;
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return (Annotation) eh.gxszxtbevo.nufgyqmvbu(clsVdvldrhtss, hg.tzroggbefp.kcexrzcfyt(arrayList), null, 4, null);
    }

    public static final Class vdvldrhtss(jh.eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        jh.xrmfcynszj xrmfcynszjVarLqeggnwhkg = eablkybsjgVar.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(xrmfcynszjVarLqeggnwhkg, "getSource(...)");
        if (xrmfcynszjVarLqeggnwhkg instanceof bi.lereixgezr) {
            bi.cqumvgiudr cqumvgiudrVarWkgbmnqykc = ((bi.lereixgezr) xrmfcynszjVarLqeggnwhkg).wkgbmnqykc();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cqumvgiudrVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((oh.gxszxtbevo) cqumvgiudrVarWkgbmnqykc).zoijcleaow();
        }
        if (xrmfcynszjVarLqeggnwhkg instanceof oh.draadjrbmk.iobyxmoadg) {
            ph.yggfygwlhe yggfygwlheVarPpxfxbqfkf = ((oh.draadjrbmk.iobyxmoadg) xrmfcynszjVarLqeggnwhkg).ppxfxbqfkf();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(yggfygwlheVarPpxfxbqfkf, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ph.vdvldrhtss) yggfygwlheVarPpxfxbqfkf).kcexrzcfyt();
        }
        ii.zoijcleaow zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(eablkybsjgVar);
        if (zoijcleaowVarAgtfadlqog == null) {
            return null;
        }
        return wflxmlrfwp(ph.gxszxtbevo.btonecajqb(eablkybsjgVar.getClass()), zoijcleaowVarAgtfadlqog, 0);
    }

    private static final Class wflxmlrfwp(ClassLoader classLoader, ii.zoijcleaow zoijcleaowVar, int i13) {
        ih.ppxfxbqfkf ppxfxbqfkfVar = ih.ppxfxbqfkf.f44265iobyxmoadg;
        ii.wkgbmnqykc wkgbmnqykcVarBtonecajqb = zoijcleaowVar.iobyxmoadg().btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarBtonecajqb, "toUnsafe(...)");
        ii.zoijcleaow zoijcleaowVarAgtfadlqog = ppxfxbqfkfVar.agtfadlqog(wkgbmnqykcVarBtonecajqb);
        if (zoijcleaowVarAgtfadlqog != null) {
            zoijcleaowVar = zoijcleaowVarAgtfadlqog;
        }
        String strZoijcleaow = zoijcleaowVar.gxszxtbevo().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        String strZoijcleaow2 = zoijcleaowVar.lqeggnwhkg().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
        return agtfadlqog(classLoader, strZoijcleaow, strZoijcleaow2, i13);
    }

    public static final fyldjkxazc wkgbmnqykc(Object obj) {
        fyldjkxazc fyldjkxazcVar = obj instanceof fyldjkxazc ? (fyldjkxazc) obj : null;
        if (fyldjkxazcVar != null) {
            return fyldjkxazcVar;
        }
        kotlin.jvm.internal.wwaezpbzkn wwaezpbzknVar = obj instanceof kotlin.jvm.internal.wwaezpbzkn ? (kotlin.jvm.internal.wwaezpbzkn) obj : null;
        ah.ppxfxbqfkf ppxfxbqfkfVarCompute = wwaezpbzknVar != null ? wwaezpbzknVar.compute() : null;
        if (ppxfxbqfkfVarCompute instanceof fyldjkxazc) {
            return (fyldjkxazc) ppxfxbqfkfVarCompute;
        }
        return null;
    }

    private static final List zdlpuopuiu(List list) throws IllegalAccessException, InvocationTargetException {
        List listEablkybsjg;
        if (list != null && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class clsZoijcleaow = sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(annotation));
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(clsZoijcleaow.getSimpleName(), "Container") || clsZoijcleaow.getAnnotation(kotlin.jvm.internal.wypolnanlu.class) == null) {
                        listEablkybsjg = hg.jyumaefscl.eablkybsjg(annotation);
                    } else {
                        Object objInvoke = clsZoijcleaow.getDeclaredMethod("value", null).invoke(annotation, null);
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listEablkybsjg = hg.agtfadlqog.gxszxtbevo((Annotation[]) objInvoke);
                    }
                    hg.jyumaefscl.istkbnxepw(arrayList, listEablkybsjg);
                }
                return arrayList;
            }
        }
        return list;
    }

    public static final pmvmpeiblj zoijcleaow(Object obj) {
        pmvmpeiblj pmvmpeibljVar = obj instanceof pmvmpeiblj ? (pmvmpeiblj) obj : null;
        if (pmvmpeibljVar != null) {
            return pmvmpeibljVar;
        }
        rlfsiqarku rlfsiqarkuVarPpxfxbqfkf = ppxfxbqfkf(obj);
        return rlfsiqarkuVarPpxfxbqfkf != null ? rlfsiqarkuVarPpxfxbqfkf : wkgbmnqykc(obj);
    }
}
