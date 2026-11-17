package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iwizpuwonk f9484iobyxmoadg = new iwizpuwonk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f9486zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f9485ppxfxbqfkf = new HashMap();

    private iwizpuwonk() {
    }

    private final boolean eablkybsjg(Class cls) {
        return cls != null && rgvfuqvkyq.class.isAssignableFrom(cls);
    }

    public static final agtfadlqog gxszxtbevo(Object object) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(object, "object");
        boolean z13 = object instanceof agtfadlqog;
        boolean z14 = object instanceof gxszxtbevo;
        if (z13 && z14) {
            return new lqeggnwhkg((gxszxtbevo) object, (agtfadlqog) object);
        }
        if (z14) {
            return new lqeggnwhkg((gxszxtbevo) object, null);
        }
        if (z13) {
            return (agtfadlqog) object;
        }
        Class<?> cls = object.getClass();
        iwizpuwonk iwizpuwonkVar = f9484iobyxmoadg;
        if (iwizpuwonkVar.wkgbmnqykc(cls) != 2) {
            return new iozdgvuglv(object);
        }
        Object obj = f9485ppxfxbqfkf.get(cls);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            iwizpuwonkVar.iobyxmoadg((Constructor) list.get(0), object);
            return new mbcevpiqjq(null);
        }
        int size = list.size();
        nufgyqmvbu[] nufgyqmvbuVarArr = new nufgyqmvbu[size];
        for (int i13 = 0; i13 < size; i13++) {
            f9484iobyxmoadg.iobyxmoadg((Constructor) list.get(i13), object);
            nufgyqmvbuVarArr[i13] = null;
        }
        return new eablkybsjg(nufgyqmvbuVarArr);
    }

    private final nufgyqmvbu iobyxmoadg(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objNewInstance);
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(objNewInstance);
            return null;
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException(e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    private final int lqeggnwhkg(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorZoijcleaow = zoijcleaow(cls);
        if (constructorZoijcleaow != null) {
            f9485ppxfxbqfkf.put(cls, hg.jyumaefscl.eablkybsjg(constructorZoijcleaow));
            return 2;
        }
        if (wkgbmnqykc.f9567ppxfxbqfkf.wkgbmnqykc(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (eablkybsjg(superclass)) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(superclass);
            if (wkgbmnqykc(superclass) == 1) {
                return 1;
            }
            Object obj = f9485ppxfxbqfkf.get(superclass);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getInterfaces());
        while (itIobyxmoadg.hasNext()) {
            Class cls2 = (Class) itIobyxmoadg.next();
            if (eablkybsjg(cls2)) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cls2);
                if (wkgbmnqykc(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f9485ppxfxbqfkf.get(cls2);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f9485ppxfxbqfkf.put(cls, arrayList);
        return 2;
    }

    public static final String ppxfxbqfkf(String className) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(className, "className");
        return mj.kcexrzcfyt.hcddaimhww(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int wkgbmnqykc(Class cls) {
        Map map = f9486zoijcleaow;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iLqeggnwhkg = lqeggnwhkg(cls);
        map.put(cls, Integer.valueOf(iLqeggnwhkg));
        return iLqeggnwhkg;
    }

    private final Constructor zoijcleaow(Class cls) {
        try {
            Package r13 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r13 != null ? r13.getName() : "";
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(name);
            if (name.length() != 0) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(canonicalName, "substring(...)");
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(canonicalName);
            String strPpxfxbqfkf = ppxfxbqfkf(canonicalName);
            if (name.length() != 0) {
                strPpxfxbqfkf = name + '.' + strPpxfxbqfkf;
            }
            Class<?> cls2 = Class.forName(strPpxfxbqfkf);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException(e13);
        }
    }
}
