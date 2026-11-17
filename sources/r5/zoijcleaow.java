package r5;

import androidx.compose.runtime.a;
import androidx.compose.runtime.lmojexxdyd;
import gg.eablkybsjg;
import gg.kcexrzcfyt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.zdlpuopuiu;
import q5.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f81707iobyxmoadg;

    static {
        Object objWkgbmnqykc;
        a aVar;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            ClassLoader classLoader = dxjokdxxww.class.getClassLoader();
            zdlpuopuiu.lqeggnwhkg(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            zdlpuopuiu.dxjokdxxww(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof a) {
                        aVar = (a) objInvoke;
                        break;
                    }
                } else if (!(annotations[i13] instanceof eablkybsjg)) {
                    i13++;
                }
                aVar = null;
                break;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(aVar);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        a aVarBtonecajqb = (a) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (aVarBtonecajqb == null) {
            aVarBtonecajqb = lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: r5.iobyxmoadg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return zoijcleaow.zoijcleaow();
                }
            });
        }
        f81707iobyxmoadg = aVarBtonecajqb;
    }

    public static final a ppxfxbqfkf() {
        return f81707iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww zoijcleaow() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }
}
