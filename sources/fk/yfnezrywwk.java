package fk;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfnezrywwk {
    public static final Void agtfadlqog(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        throw new SerializationException(ydmasvzmpa.ppxfxbqfkf(sg.iobyxmoadg.eablkybsjg(cls)));
    }

    private static final bk.zoijcleaow btonecajqb(Object obj, bk.zoijcleaow... zoijcleaowVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (zoijcleaowVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = zoijcleaowVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i13 = 0; i13 < length; i13++) {
                    clsArr2[i13] = bk.zoijcleaow.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(zoijcleaowVarArr, zoijcleaowVarArr.length));
            if (objInvoke instanceof bk.zoijcleaow) {
                return (bk.zoijcleaow) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause == null) {
                throw e13;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e13.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final boolean draadjrbmk(Class cls) {
        return cls.getAnnotation(bk.wflxmlrfwp.class) == null && cls.getAnnotation(bk.ppxfxbqfkf.class) == null;
    }

    public static final Map dxjokdxxww() {
        Map mapPpxfxbqfkf = hg.tzroggbefp.ppxfxbqfkf();
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(String.class), ck.iobyxmoadg.ylkuphrtab(kotlin.jvm.internal.tzroggbefp.f60034iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Character.TYPE), ck.iobyxmoadg.istkbnxepw(kotlin.jvm.internal.lqeggnwhkg.f60027iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(char[].class), ck.iobyxmoadg.wkgbmnqykc());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Double.TYPE), ck.iobyxmoadg.cdpycssgdh(kotlin.jvm.internal.draadjrbmk.f60004iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(double[].class), ck.iobyxmoadg.eablkybsjg());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Float.TYPE), ck.iobyxmoadg.yadqdtsiqt(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(float[].class), ck.iobyxmoadg.gxszxtbevo());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Long.TYPE), ck.iobyxmoadg.lmojexxdyd(kotlin.jvm.internal.iwizpuwonk.f60023iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(long[].class), ck.iobyxmoadg.dxjokdxxww());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.istkbnxepw.class), ck.iobyxmoadg.cqumvgiudr(gg.istkbnxepw.f37109yggfygwlhe));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Integer.TYPE), ck.iobyxmoadg.iozdgvuglv(kotlin.jvm.internal.kcexrzcfyt.f60025iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(int[].class), ck.iobyxmoadg.lqeggnwhkg());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.pmvmpeiblj.class), ck.iobyxmoadg.iwizpuwonk(gg.pmvmpeiblj.f37131yggfygwlhe));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Short.TYPE), ck.iobyxmoadg.wwaezpbzkn(kotlin.jvm.internal.stevsuqkhv.f60033iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(short[].class), ck.iobyxmoadg.ojitshcjhn());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.iozdgvuglv.class), ck.iobyxmoadg.esjtqupxsv(gg.iozdgvuglv.f37107yggfygwlhe));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Byte.TYPE), ck.iobyxmoadg.zynmafqrjb(kotlin.jvm.internal.eablkybsjg.f60012iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(byte[].class), ck.iobyxmoadg.ppxfxbqfkf());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.esjtqupxsv.class), ck.iobyxmoadg.jyumaefscl(gg.esjtqupxsv.f37099yggfygwlhe));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Boolean.TYPE), ck.iobyxmoadg.pmvmpeiblj(kotlin.jvm.internal.wkgbmnqykc.f60036iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(boolean[].class), ck.iobyxmoadg.zoijcleaow());
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.wwaezpbzkn.class), ck.iobyxmoadg.lereixgezr(gg.wwaezpbzkn.f37140iobyxmoadg));
        mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Void.class), ck.iobyxmoadg.draadjrbmk());
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(nj.iobyxmoadg.class), ck.iobyxmoadg.pkzmftpjix(nj.iobyxmoadg.f70173yggfygwlhe));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.cdpycssgdh.class), ck.iobyxmoadg.kcexrzcfyt());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.zynmafqrjb.class), ck.iobyxmoadg.oxmwwwfdhm());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.lmojexxdyd.class), ck.iobyxmoadg.zdlpuopuiu());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gg.lereixgezr.class), ck.iobyxmoadg.vdvldrhtss());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapPpxfxbqfkf.put(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(oj.zoijcleaow.class), ck.iobyxmoadg.hcddaimhww(oj.zoijcleaow.f72979jyumaefscl));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return hg.tzroggbefp.zoijcleaow(mapPpxfxbqfkf);
    }

    private static final bk.zoijcleaow eablkybsjg(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new pmvmpeiblj(canonicalName, (Enum[]) enumConstants);
    }

    private static final bk.zoijcleaow gtknphoqwx(Class cls, bk.zoijcleaow... zoijcleaowVarArr) {
        Object objIobyxmoadg = iobyxmoadg(cls, "Companion");
        if (objIobyxmoadg == null) {
            return null;
        }
        return btonecajqb(objIobyxmoadg, (bk.zoijcleaow[]) Arrays.copyOf(zoijcleaowVarArr, zoijcleaowVarArr.length));
    }

    private static final bk.zoijcleaow gxszxtbevo(Class cls, bk.zoijcleaow... zoijcleaowVarArr) {
        Field field;
        bk.zoijcleaow zoijcleaowVarBtonecajqb;
        Object objLqeggnwhkg = lqeggnwhkg(cls);
        if (objLqeggnwhkg != null && (zoijcleaowVarBtonecajqb = btonecajqb(objLqeggnwhkg, (bk.zoijcleaow[]) Arrays.copyOf(zoijcleaowVarArr, zoijcleaowVarArr.length))) != null) {
            return zoijcleaowVarBtonecajqb;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i13 = 0;
            Class<?> cls2 = null;
            boolean z13 = false;
            while (true) {
                if (i13 >= length) {
                    if (z13) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i13];
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cls3.getSimpleName(), "$serializer")) {
                        if (!z13) {
                            z13 = true;
                            cls2 = cls3;
                        }
                    }
                    i13++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof bk.zoijcleaow) {
                return (bk.zoijcleaow) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object iobyxmoadg(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final Object lqeggnwhkg(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i13];
            if (cls2.getAnnotation(ribwqtqdhb.class) != null) {
                break;
            }
            i13++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
        return iobyxmoadg(cls, simpleName);
    }

    private static final bk.zoijcleaow nufgyqmvbu(Class cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        int i13 = 0;
        if (mj.kcexrzcfyt.stevsuqkhv(canonicalName, "java.", false, 2, null) || mj.kcexrzcfyt.stevsuqkhv(canonicalName, "kotlin.", false, 2, null)) {
            return null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        Field field = null;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 >= length) {
                if (!z13) {
                    break;
                }
                break;
            }
            Field field2 = declaredFields[i14];
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(field2.getName(), "INSTANCE") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                if (!z13) {
                    z13 = true;
                    field = field2;
                }
            }
            i14++;
            field = null;
            break;
        }
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(methods, "getMethods(...)");
        int length2 = methods.length;
        Method method = null;
        boolean z14 = false;
        while (true) {
            if (i13 >= length2) {
                if (!z14) {
                    break;
                }
                break;
            }
            Method method2 = methods[i13];
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(method2.getName(), "serializer")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(method2.getReturnType(), bk.zoijcleaow.class)) {
                    if (!z14) {
                        method = method2;
                        z14 = true;
                    }
                }
            }
            i13++;
            method = null;
            break;
        }
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(obj, null);
        if (objInvoke instanceof bk.zoijcleaow) {
            return (bk.zoijcleaow) objInvoke;
        }
        return null;
    }

    public static final Object[] ojitshcjhn(ArrayList arrayList, ah.wkgbmnqykc eClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) sg.iobyxmoadg.zoijcleaow(eClass), arrayList.size());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(array, "toArray(...)");
        return array;
    }

    public static final bk.zoijcleaow ppxfxbqfkf(ah.wkgbmnqykc wkgbmnqykcVar, bk.zoijcleaow... args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        return wkgbmnqykc(sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVar), (bk.zoijcleaow[]) Arrays.copyOf(args, args.length));
    }

    private static final boolean wflxmlrfwp(Class cls) {
        if (cls.getAnnotation(bk.ppxfxbqfkf.class) != null) {
            return true;
        }
        bk.wflxmlrfwp wflxmlrfwpVar = (bk.wflxmlrfwp) cls.getAnnotation(bk.wflxmlrfwp.class);
        return wflxmlrfwpVar != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(wflxmlrfwpVar.with()), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(bk.gxszxtbevo.class));
    }

    public static final bk.zoijcleaow wkgbmnqykc(Class cls, bk.zoijcleaow... args) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        if (cls.isEnum() && draadjrbmk(cls)) {
            return eablkybsjg(cls);
        }
        bk.zoijcleaow zoijcleaowVarGtknphoqwx = gtknphoqwx(cls, (bk.zoijcleaow[]) Arrays.copyOf(args, args.length));
        if (zoijcleaowVarGtknphoqwx != null) {
            return zoijcleaowVarGtknphoqwx;
        }
        bk.zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu(cls);
        if (zoijcleaowVarNufgyqmvbu != null) {
            return zoijcleaowVarNufgyqmvbu;
        }
        bk.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(cls, (bk.zoijcleaow[]) Arrays.copyOf(args, args.length));
        if (zoijcleaowVarGxszxtbevo != null) {
            return zoijcleaowVarGxszxtbevo;
        }
        if (wflxmlrfwp(cls)) {
            return new bk.gxszxtbevo(sg.iobyxmoadg.eablkybsjg(cls));
        }
        return null;
    }

    public static final bk.zoijcleaow zoijcleaow(ah.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        return ppxfxbqfkf(wkgbmnqykcVar, new bk.zoijcleaow[0]);
    }
}
