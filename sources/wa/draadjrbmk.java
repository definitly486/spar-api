package wa;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk extends eablkybsjg implements wflxmlrfwp {
    public draadjrbmk() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // wa.eablkybsjg
    protected final boolean wflxmlrfwp(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) gxszxtbevo.iobyxmoadg(parcel, Bundle.CREATOR);
        gxszxtbevo.zoijcleaow(parcel);
        wkgbmnqykc(bundle);
        return true;
    }
}
