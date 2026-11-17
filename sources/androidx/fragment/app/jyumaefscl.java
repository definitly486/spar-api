package androidx.fragment.app;

import androidx.collection.jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final jztzpxfvev f9271iobyxmoadg = new jztzpxfvev();

    private static Class ppxfxbqfkf(ClassLoader classLoader, String str) throws ClassNotFoundException {
        jztzpxfvev jztzpxfvevVar = f9271iobyxmoadg;
        jztzpxfvev jztzpxfvevVar2 = (jztzpxfvev) jztzpxfvevVar.get(classLoader);
        if (jztzpxfvevVar2 == null) {
            jztzpxfvevVar2 = new jztzpxfvev();
            jztzpxfvevVar.put(classLoader, jztzpxfvevVar2);
        }
        Class cls = (Class) jztzpxfvevVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jztzpxfvevVar2.put(str, cls2);
        return cls2;
    }

    public static Class wkgbmnqykc(ClassLoader classLoader, String str) {
        try {
            return ppxfxbqfkf(classLoader, str);
        } catch (ClassCastException e13) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e13);
        } catch (ClassNotFoundException e14) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e14);
        }
    }

    static boolean zoijcleaow(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(ppxfxbqfkf(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public abstract Fragment iobyxmoadg(ClassLoader classLoader, String str);
}
