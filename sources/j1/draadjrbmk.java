package j1;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk extends gtknphoqwx {
    @Override // j1.gtknphoqwx
    protected Typeface dxjokdxxww(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f50466lqeggnwhkg, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f50468wflxmlrfwp.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // j1.gtknphoqwx
    protected Method zdlpuopuiu(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
