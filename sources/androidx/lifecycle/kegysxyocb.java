package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kegysxyocb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f9504iobyxmoadg = hg.jyumaefscl.rgvfuqvkyq(Application.class, pkzmftpjix.class);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f9505zoijcleaow = hg.jyumaefscl.eablkybsjg(pkzmftpjix.class);

    public static final Constructor ppxfxbqfkf(Class modelClass, List signature) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(modelClass.getConstructors());
        while (itIobyxmoadg.hasNext()) {
            Constructor constructor = (Constructor) itIobyxmoadg.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
            List listI = hg.agtfadlqog.i(parameterTypes);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(signature, listI)) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listI.size() && listI.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final ntlheqmsrt wkgbmnqykc(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        try {
            return (ntlheqmsrt) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access " + modelClass, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e15.getCause());
        }
    }
}
