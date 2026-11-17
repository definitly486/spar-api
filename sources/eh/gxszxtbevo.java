package eh;

import dh.c;
import hg.jyumaefscl;
import hg.wwaezpbzkn;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    private static final String agtfadlqog(gg.gtknphoqwx gtknphoqwxVar) {
        return (String) gtknphoqwxVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int btonecajqb(Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) value);
            } else {
                iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * 127);
        }
        return iHashCode2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String draadjrbmk(Class cls, Map map) throws IOException {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('@');
        sb3.append(cls.getCanonicalName());
        wwaezpbzkn.roivzttewh(map.entrySet(), sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : eablkybsjg.f31319zdlpuopuiu);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    private static final boolean dxjokdxxww(Class cls, List list, Map map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zEablkybsjg;
        boolean z13;
        ah.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!zdlpuopuiu.eablkybsjg((annotation == null || (wkgbmnqykcVarIobyxmoadg = sg.iobyxmoadg.iobyxmoadg(annotation)) == null) ? null : sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVarIobyxmoadg), cls)) {
            return false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Method method = (Method) it.next();
                Object obj2 = map.get(method.getName());
                Object objInvoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zEablkybsjg = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zEablkybsjg = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zEablkybsjg = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zEablkybsjg = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zEablkybsjg = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zEablkybsjg = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zEablkybsjg = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zEablkybsjg = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zEablkybsjg = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zEablkybsjg = zdlpuopuiu.eablkybsjg(obj2, objInvoke);
                }
                if (!zEablkybsjg) {
                    z13 = false;
                }
            }
            z13 = true;
        } else {
            z13 = true;
        }
        return z13;
    }

    private static final int gtknphoqwx(gg.gtknphoqwx gtknphoqwxVar) {
        return ((Number) gtknphoqwxVar.getValue()).intValue();
    }

    public static final Object lqeggnwhkg(Class annotationClass, Map values, List methods) {
        zdlpuopuiu.btonecajqb(annotationClass, "annotationClass");
        zdlpuopuiu.btonecajqb(values, "values");
        zdlpuopuiu.btonecajqb(methods, "methods");
        gg.gtknphoqwx gtknphoqwxVarZoijcleaow = gg.draadjrbmk.zoijcleaow(new zoijcleaow(values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new wkgbmnqykc(annotationClass, values, gg.draadjrbmk.zoijcleaow(new ppxfxbqfkf(annotationClass, values)), gtknphoqwxVarZoijcleaow, methods));
        zdlpuopuiu.nufgyqmvbu(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object nufgyqmvbu(Class cls, Map map, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return lqeggnwhkg(cls, map, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ojitshcjhn(Class cls, Map map, gg.gtknphoqwx gtknphoqwxVar, gg.gtknphoqwx gtknphoqwxVar2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(gtknphoqwx(gtknphoqwxVar2));
                }
            } else if (name.equals("toString")) {
                return agtfadlqog(gtknphoqwxVar);
            }
        }
        if (zdlpuopuiu.eablkybsjg(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(dxjokdxxww(cls, list, map, hg.agtfadlqog.ixidwrxhsl(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Method is not supported: ");
        sb3.append(method);
        sb3.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb3.append(hg.agtfadlqog.i(objArr));
        sb3.append(')');
        throw new c(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void rgvfuqvkyq(int i13, String str, Class cls) {
        ah.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        String strYggfygwlhe;
        if (zdlpuopuiu.eablkybsjg(cls, Class.class)) {
            wkgbmnqykcVarZoijcleaow = cllcsxoeiz.zoijcleaow(ah.wkgbmnqykc.class);
        } else {
            wkgbmnqykcVarZoijcleaow = (cls.isArray() && zdlpuopuiu.eablkybsjg(cls.getComponentType(), Class.class)) ? cllcsxoeiz.zoijcleaow(ah.wkgbmnqykc[].class) : sg.iobyxmoadg.eablkybsjg(cls);
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow.yggfygwlhe(), cllcsxoeiz.zoijcleaow(Object[].class).yggfygwlhe())) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(wkgbmnqykcVarZoijcleaow.yggfygwlhe());
            sb3.append('<');
            Class<?> componentType = sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVarZoijcleaow).getComponentType();
            zdlpuopuiu.dxjokdxxww(componentType, "getComponentType(...)");
            sb3.append(sg.iobyxmoadg.eablkybsjg(componentType).yggfygwlhe());
            sb3.append('>');
            strYggfygwlhe = sb3.toString();
        } else {
            strYggfygwlhe = wkgbmnqykcVarZoijcleaow.yggfygwlhe();
        }
        throw new IllegalArgumentException("Argument #" + i13 + ' ' + str + " is not of the required type " + strYggfygwlhe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object vdvldrhtss(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof ah.wkgbmnqykc) {
            obj = sg.iobyxmoadg.zoijcleaow((ah.wkgbmnqykc) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof ah.wkgbmnqykc[]) {
                zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                ah.wkgbmnqykc[] wkgbmnqykcVarArr = (ah.wkgbmnqykc[]) obj;
                ArrayList arrayList = new ArrayList(wkgbmnqykcVarArr.length);
                for (ah.wkgbmnqykc wkgbmnqykcVar : wkgbmnqykcVarArr) {
                    arrayList.add(sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence wflxmlrfwp(Map.Entry entry) {
        String string;
        zdlpuopuiu.btonecajqb(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
