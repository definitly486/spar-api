package pe;

import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static boolean iobyxmoadg(AtomicReference atomicReference, String str) {
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z13 = DynamiteModule.getLocalVersion(ge.dxjokdxxww.ppxfxbqfkf().zoijcleaow(), str) > 0;
        atomicReference.set(Boolean.valueOf(z13));
        return z13;
    }
}
