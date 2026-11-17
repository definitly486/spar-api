package qj;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import gg.kcexrzcfyt;
import gg.zdlpuopuiu;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f78926iobyxmoadg;

    static {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(new ppxfxbqfkf(iobyxmoadg(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        f78926iobyxmoadg = (wkgbmnqykc) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
    }

    public static final Handler iobyxmoadg(Looper looper, boolean z13) throws IllegalAccessException, InvocationTargetException {
        if (!z13) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static /* synthetic */ wkgbmnqykc ppxfxbqfkf(Handler handler, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return zoijcleaow(handler, str);
    }

    public static final wkgbmnqykc zoijcleaow(Handler handler, String str) {
        return new ppxfxbqfkf(handler, str);
    }
}
