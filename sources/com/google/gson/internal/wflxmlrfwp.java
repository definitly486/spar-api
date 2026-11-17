package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f25171iobyxmoadg = ppxfxbqfkf();

    class iobyxmoadg extends wflxmlrfwp {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Object f25172ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Method f25173zoijcleaow;

        iobyxmoadg(Method method, Object obj) {
            this.f25173zoijcleaow = method;
            this.f25172ppxfxbqfkf = obj;
        }

        @Override // com.google.gson.internal.wflxmlrfwp
        public Object wkgbmnqykc(Class cls) {
            wflxmlrfwp.zoijcleaow(cls);
            return this.f25173zoijcleaow.invoke(this.f25172ppxfxbqfkf, cls);
        }
    }

    class ppxfxbqfkf extends wflxmlrfwp {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Method f25174zoijcleaow;

        ppxfxbqfkf(Method method) {
            this.f25174zoijcleaow = method;
        }

        @Override // com.google.gson.internal.wflxmlrfwp
        public Object wkgbmnqykc(Class cls) {
            wflxmlrfwp.zoijcleaow(cls);
            return this.f25174zoijcleaow.invoke(null, cls, Object.class);
        }
    }

    class wkgbmnqykc extends wflxmlrfwp {
        wkgbmnqykc() {
        }

        @Override // com.google.gson.internal.wflxmlrfwp
        public Object wkgbmnqykc(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    class zoijcleaow extends wflxmlrfwp {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ int f25175ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Method f25176zoijcleaow;

        zoijcleaow(Method method, int i13) {
            this.f25176zoijcleaow = method;
            this.f25175ppxfxbqfkf = i13;
        }

        @Override // com.google.gson.internal.wflxmlrfwp
        public Object wkgbmnqykc(Class cls) {
            wflxmlrfwp.zoijcleaow(cls);
            return this.f25176zoijcleaow.invoke(null, cls, Integer.valueOf(this.f25175ppxfxbqfkf));
        }
    }

    private static wflxmlrfwp ppxfxbqfkf() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new iobyxmoadg(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new wkgbmnqykc();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new ppxfxbqfkf(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new zoijcleaow(declaredMethod3, iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zoijcleaow(Class cls) {
        String strIobyxmoadg = com.google.gson.internal.ppxfxbqfkf.iobyxmoadg(cls);
        if (strIobyxmoadg == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strIobyxmoadg);
    }

    public abstract Object wkgbmnqykc(Class cls);
}
