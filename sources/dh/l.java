package dh;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence iobyxmoadg(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cls);
        return ph.gxszxtbevo.gxszxtbevo(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(Method method) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
        sb3.append(hg.agtfadlqog.wizcaqwiak(parameterTypes, "", "(", ")", 0, null, k.f28264zdlpuopuiu, 24, null));
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
        sb3.append(ph.gxszxtbevo.gxszxtbevo(returnType));
        return sb3.toString();
    }
}
