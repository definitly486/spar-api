package ae;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final zoijcleaow f1655iobyxmoadg;

    private static class ppxfxbqfkf extends zoijcleaow {
        private ppxfxbqfkf() {
            super();
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        public Method iobyxmoadg(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        String[] ppxfxbqfkf(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        boolean wkgbmnqykc(Class cls) {
            return false;
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        Constructor zoijcleaow(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }

    private static class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f1656iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Method f1657ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Method f1658wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f1659zoijcleaow;

        @Override // ae.iobyxmoadg.zoijcleaow
        public Method iobyxmoadg(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e13) {
                throw iobyxmoadg.wkgbmnqykc(e13);
            }
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        String[] ppxfxbqfkf(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f1659zoijcleaow.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i13 = 0; i13 < objArr.length; i13++) {
                    strArr[i13] = (String) this.f1657ppxfxbqfkf.invoke(objArr[i13], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e13) {
                throw iobyxmoadg.wkgbmnqykc(e13);
            }
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        boolean wkgbmnqykc(Class cls) {
            try {
                return ((Boolean) this.f1656iobyxmoadg.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e13) {
                throw iobyxmoadg.wkgbmnqykc(e13);
            }
        }

        @Override // ae.iobyxmoadg.zoijcleaow
        public Constructor zoijcleaow(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f1659zoijcleaow.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i13 = 0; i13 < objArr.length; i13++) {
                    clsArr[i13] = (Class) this.f1658wkgbmnqykc.invoke(objArr[i13], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e13) {
                throw iobyxmoadg.wkgbmnqykc(e13);
            }
        }

        private wkgbmnqykc() throws NoSuchMethodException {
            super();
            this.f1656iobyxmoadg = Class.class.getMethod("isRecord", null);
            Method method = Class.class.getMethod("getRecordComponents", null);
            this.f1659zoijcleaow = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f1657ppxfxbqfkf = componentType.getMethod("getName", null);
            this.f1658wkgbmnqykc = componentType.getMethod("getType", null);
        }
    }

    private static abstract class zoijcleaow {
        private zoijcleaow() {
        }

        public abstract Method iobyxmoadg(Class cls, Field field);

        abstract String[] ppxfxbqfkf(Class cls);

        abstract boolean wkgbmnqykc(Class cls);

        abstract Constructor zoijcleaow(Class cls);
    }

    static {
        zoijcleaow ppxfxbqfkfVar;
        try {
            ppxfxbqfkfVar = new wkgbmnqykc();
        } catch (NoSuchMethodException unused) {
            ppxfxbqfkfVar = new ppxfxbqfkf();
        }
        f1655iobyxmoadg = ppxfxbqfkfVar;
    }

    public static String[] btonecajqb(Class cls) {
        return f1655iobyxmoadg.ppxfxbqfkf(cls);
    }

    public static void draadjrbmk(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e13) {
            throw new JsonIOException("Failed making " + lqeggnwhkg(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e13);
        }
    }

    public static Constructor dxjokdxxww(Class cls) {
        return f1655iobyxmoadg.zoijcleaow(cls);
    }

    public static RuntimeException eablkybsjg(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static boolean gtknphoqwx(Class cls) {
        return f1655iobyxmoadg.wkgbmnqykc(cls);
    }

    public static String gxszxtbevo(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String lqeggnwhkg(AccessibleObject accessibleObject, boolean z13) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + gxszxtbevo((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb3 = new StringBuilder(method.getName());
            zoijcleaow(method, sb3);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb3.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + ppxfxbqfkf((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z13 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method nufgyqmvbu(Class cls, Field field) {
        return f1655iobyxmoadg.iobyxmoadg(cls, field);
    }

    public static String ppxfxbqfkf(Constructor constructor) {
        StringBuilder sb3 = new StringBuilder(constructor.getDeclaringClass().getName());
        zoijcleaow(constructor, sb3);
        return sb3.toString();
    }

    public static String wflxmlrfwp(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e13) {
            return "Failed making constructor '" + ppxfxbqfkf(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e13.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException wkgbmnqykc(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    private static void zoijcleaow(AccessibleObject accessibleObject, StringBuilder sb3) {
        sb3.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i13 = 0; i13 < parameterTypes.length; i13++) {
            if (i13 > 0) {
                sb3.append(", ");
            }
            sb3.append(parameterTypes[i13].getSimpleName());
        }
        sb3.append(')');
    }
}
