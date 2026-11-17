package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static wkgbmnqykc f9567ppxfxbqfkf = new wkgbmnqykc();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f9568iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f9569zoijcleaow = new HashMap();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Map f9570iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Map f9571zoijcleaow;

        iobyxmoadg(Map map) {
            this.f9571zoijcleaow = map;
            for (Map.Entry entry : map.entrySet()) {
                gtknphoqwx.iobyxmoadg iobyxmoadgVar = (gtknphoqwx.iobyxmoadg) entry.getValue();
                List arrayList = (List) this.f9570iobyxmoadg.get(iobyxmoadgVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f9570iobyxmoadg.put(iobyxmoadgVar, arrayList);
                }
                arrayList.add((zoijcleaow) entry.getKey());
            }
        }

        private static void zoijcleaow(List list, vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((zoijcleaow) list.get(size)).iobyxmoadg(vdvldrhtssVar, iobyxmoadgVar, obj);
                }
            }
        }

        void iobyxmoadg(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar, Object obj) {
            zoijcleaow((List) this.f9570iobyxmoadg.get(iobyxmoadgVar), vdvldrhtssVar, iobyxmoadgVar, obj);
            zoijcleaow((List) this.f9570iobyxmoadg.get(gtknphoqwx.iobyxmoadg.ON_ANY), vdvldrhtssVar, iobyxmoadgVar, obj);
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f9572iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Method f9573zoijcleaow;

        zoijcleaow(int i13, Method method) {
            this.f9572iobyxmoadg = i13;
            this.f9573zoijcleaow = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f9572iobyxmoadg == zoijcleaowVar.f9572iobyxmoadg && this.f9573zoijcleaow.getName().equals(zoijcleaowVar.f9573zoijcleaow.getName());
        }

        public int hashCode() {
            return (this.f9572iobyxmoadg * 31) + this.f9573zoijcleaow.getName().hashCode();
        }

        void iobyxmoadg(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar, Object obj) {
            try {
                int i13 = this.f9572iobyxmoadg;
                if (i13 == 0) {
                    this.f9573zoijcleaow.invoke(obj, null);
                } else if (i13 == 1) {
                    this.f9573zoijcleaow.invoke(obj, vdvldrhtssVar);
                } else {
                    if (i13 != 2) {
                        return;
                    }
                    this.f9573zoijcleaow.invoke(obj, vdvldrhtssVar, iobyxmoadgVar);
                }
            } catch (IllegalAccessException e13) {
                throw new RuntimeException(e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException("Failed to call observer method", e14.getCause());
            }
        }
    }

    wkgbmnqykc() {
    }

    private void eablkybsjg(Map map, zoijcleaow zoijcleaowVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar, Class cls) {
        gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = (gtknphoqwx.iobyxmoadg) map.get(zoijcleaowVar);
        if (iobyxmoadgVar2 == null || iobyxmoadgVar == iobyxmoadgVar2) {
            if (iobyxmoadgVar2 == null) {
                map.put(zoijcleaowVar, iobyxmoadgVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + zoijcleaowVar.f9573zoijcleaow.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + iobyxmoadgVar2 + ", new value " + iobyxmoadgVar);
    }

    private iobyxmoadg iobyxmoadg(Class cls, Method[] methodArr) {
        int i13;
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(superclass)) != null) {
            map.putAll(iobyxmoadgVarPpxfxbqfkf.f9571zoijcleaow);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : ppxfxbqfkf(cls2).f9571zoijcleaow.entrySet()) {
                eablkybsjg(map, (zoijcleaow) entry.getKey(), (gtknphoqwx.iobyxmoadg) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = zoijcleaow(cls);
        }
        boolean z13 = false;
        for (Method method : methodArr) {
            istkbnxepw istkbnxepwVar = (istkbnxepw) method.getAnnotation(istkbnxepw.class);
            if (istkbnxepwVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i13 = 0;
                } else {
                    if (!vdvldrhtss.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i13 = 1;
                }
                gtknphoqwx.iobyxmoadg iobyxmoadgVarValue = istkbnxepwVar.value();
                if (parameterTypes.length > 1) {
                    if (!gtknphoqwx.iobyxmoadg.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (iobyxmoadgVarValue != gtknphoqwx.iobyxmoadg.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i13 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                eablkybsjg(map, new zoijcleaow(i13, method), iobyxmoadgVarValue, cls);
                z13 = true;
            }
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(map);
        this.f9568iobyxmoadg.put(cls, iobyxmoadgVar);
        this.f9569zoijcleaow.put(cls, Boolean.valueOf(z13));
        return iobyxmoadgVar;
    }

    private Method[] zoijcleaow(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e13) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e13);
        }
    }

    iobyxmoadg ppxfxbqfkf(Class cls) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f9568iobyxmoadg.get(cls);
        return iobyxmoadgVar != null ? iobyxmoadgVar : iobyxmoadg(cls, null);
    }

    boolean wkgbmnqykc(Class cls) {
        Boolean bool = (Boolean) this.f9569zoijcleaow.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrZoijcleaow = zoijcleaow(cls);
        for (Method method : methodArrZoijcleaow) {
            if (((istkbnxepw) method.getAnnotation(istkbnxepw.class)) != null) {
                iobyxmoadg(cls, methodArrZoijcleaow);
                return true;
            }
        }
        this.f9569zoijcleaow.put(cls, Boolean.FALSE);
        return false;
    }
}
