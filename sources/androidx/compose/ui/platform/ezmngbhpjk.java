package androidx.compose.ui.platform;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ezmngbhpjk {
    public static final String iobyxmoadg(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append('@');
        kotlin.jvm.internal.tzroggbefp tzroggbefpVar = kotlin.jvm.internal.tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        sb3.append(str2);
        return sb3.toString();
    }
}
