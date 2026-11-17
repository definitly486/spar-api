package ph;

import hg.tzroggbefp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f76572iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f76573ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f76574wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f76575zoijcleaow;

    static {
        int i13 = 0;
        List<ah.wkgbmnqykc> listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(cllcsxoeiz.zoijcleaow(Boolean.TYPE), cllcsxoeiz.zoijcleaow(Byte.TYPE), cllcsxoeiz.zoijcleaow(Character.TYPE), cllcsxoeiz.zoijcleaow(Double.TYPE), cllcsxoeiz.zoijcleaow(Float.TYPE), cllcsxoeiz.zoijcleaow(Integer.TYPE), cllcsxoeiz.zoijcleaow(Long.TYPE), cllcsxoeiz.zoijcleaow(Short.TYPE));
        f76572iobyxmoadg = listRgvfuqvkyq;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        for (ah.wkgbmnqykc wkgbmnqykcVar : listRgvfuqvkyq) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(sg.iobyxmoadg.ppxfxbqfkf(wkgbmnqykcVar), sg.iobyxmoadg.wkgbmnqykc(wkgbmnqykcVar)));
        }
        f76575zoijcleaow = tzroggbefp.kcexrzcfyt(arrayList);
        List<ah.wkgbmnqykc> list = f76572iobyxmoadg;
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        for (ah.wkgbmnqykc wkgbmnqykcVar2 : list) {
            arrayList2.add(gg.cqumvgiudr.iobyxmoadg(sg.iobyxmoadg.wkgbmnqykc(wkgbmnqykcVar2), sg.iobyxmoadg.ppxfxbqfkf(wkgbmnqykcVar2)));
        }
        f76573ppxfxbqfkf = tzroggbefp.kcexrzcfyt(arrayList2);
        List listRgvfuqvkyq2 = hg.jyumaefscl.rgvfuqvkyq(tg.iobyxmoadg.class, tg.draadjrbmk.class, tg.rgvfuqvkyq.class, tg.vdvldrhtss.class, tg.oxmwwwfdhm.class, tg.kcexrzcfyt.class, tg.zdlpuopuiu.class, tg.yggfygwlhe.class, tg.jyumaefscl.class, tg.iwizpuwonk.class, tg.zoijcleaow.class, tg.ppxfxbqfkf.class, tg.wkgbmnqykc.class, tg.eablkybsjg.class, tg.gxszxtbevo.class, tg.lqeggnwhkg.class, tg.nufgyqmvbu.class, tg.dxjokdxxww.class, tg.btonecajqb.class, tg.gtknphoqwx.class, tg.wflxmlrfwp.class, tg.agtfadlqog.class, tg.ojitshcjhn.class);
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq2, 10));
        for (Object obj : listRgvfuqvkyq2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList3.add(gg.cqumvgiudr.iobyxmoadg((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f76574wkgbmnqykc = tzroggbefp.kcexrzcfyt(arrayList3);
    }

    public static final ClassLoader btonecajqb(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final boolean draadjrbmk(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }

    public static final Class dxjokdxxww(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        return (Class) f76575zoijcleaow.get(cls);
    }

    public static final ii.zoijcleaow eablkybsjg(Class cls) {
        ii.zoijcleaow zoijcleaowVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (zoijcleaowVarEablkybsjg = eablkybsjg(declaringClass)) != null) {
                    ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(cls.getSimpleName());
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
                    ii.zoijcleaow zoijcleaowVarWkgbmnqykc = zoijcleaowVarEablkybsjg.wkgbmnqykc(gxszxtbevoVarGxszxtbevo);
                    if (zoijcleaowVarWkgbmnqykc != null) {
                        return zoijcleaowVarWkgbmnqykc;
                    }
                }
                return ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf(cls.getName()));
            }
        }
        ii.ppxfxbqfkf ppxfxbqfkfVar = new ii.ppxfxbqfkf(cls.getName());
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        ii.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = ii.ppxfxbqfkf.gtknphoqwx(ppxfxbqfkfVar.lqeggnwhkg());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarGtknphoqwx, "topLevel(...)");
        return new ii.zoijcleaow(ppxfxbqfkfVarEablkybsjg, ppxfxbqfkfVarGtknphoqwx, true);
    }

    public static final Class gtknphoqwx(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        return (Class) f76573ppxfxbqfkf.get(cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String gxszxtbevo(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                return mj.kcexrzcfyt.pkzmftpjix(name, '.', '/', false, 4, null);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append('L');
            String name2 = cls.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name2, "getName(...)");
            sb3.append(mj.kcexrzcfyt.pkzmftpjix(name2, '.', '/', false, 4, null));
            sb3.append(';');
            return sb3.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType iobyxmoadg(ParameterizedType it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final Integer lqeggnwhkg(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        return (Integer) f76574wkgbmnqykc.get(cls);
    }

    public static final List nufgyqmvbu(Type type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.wwaezpbzkn(lj.wflxmlrfwp.agtfadlqog(type, wkgbmnqykc.f76613zdlpuopuiu), eablkybsjg.f76571zdlpuopuiu));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actualTypeArguments, "getActualTypeArguments(...)");
        return hg.agtfadlqog.i(actualTypeArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj.btonecajqb zoijcleaow(ParameterizedType it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actualTypeArguments, "getActualTypeArguments(...)");
        return hg.agtfadlqog.jlmebxxoox(actualTypeArguments);
    }
}
