package tf;

import android.content.Context;
import java.util.Set;
import rf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: tf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2706iobyxmoadg {
        Set wkgbmnqykc();
    }

    public static boolean iobyxmoadg(Context context) {
        Set setWkgbmnqykc = ((InterfaceC2706iobyxmoadg) ppxfxbqfkf.iobyxmoadg(context, InterfaceC2706iobyxmoadg.class)).wkgbmnqykc();
        wkgbmnqykc.ppxfxbqfkf(setWkgbmnqykc.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setWkgbmnqykc.isEmpty()) {
            return true;
        }
        return ((Boolean) setWkgbmnqykc.iterator().next()).booleanValue();
    }
}
