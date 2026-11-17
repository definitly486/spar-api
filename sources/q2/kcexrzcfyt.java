package q2;

import androidx.compose.runtime.a;
import androidx.compose.runtime.lmojexxdyd;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f77754iobyxmoadg;

    static {
        Object objWkgbmnqykc;
        a aVar;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            ClassLoader classLoader = androidx.lifecycle.vdvldrhtss.class.getClassLoader();
            zdlpuopuiu.lqeggnwhkg(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof a) {
                        aVar = (a) objInvoke;
                        break;
                    }
                } else if (!(annotations[i13] instanceof gg.eablkybsjg)) {
                    i13++;
                }
                aVar = null;
                break;
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(aVar);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        a aVarBtonecajqb = (a) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (aVarBtonecajqb == null) {
            aVarBtonecajqb = lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: q2.oxmwwwfdhm
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return kcexrzcfyt.zoijcleaow();
                }
            });
        }
        f77754iobyxmoadg = aVarBtonecajqb;
    }

    public static final a ppxfxbqfkf() {
        return f77754iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.vdvldrhtss zoijcleaow() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }
}
