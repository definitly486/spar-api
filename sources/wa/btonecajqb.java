package wa;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb extends eablkybsjg implements gtknphoqwx {
    public static gtknphoqwx agtfadlqog(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof gtknphoqwx ? (gtknphoqwx) iInterfaceQueryLocalInterface : new dxjokdxxww(iBinder);
    }
}
