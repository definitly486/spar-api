package wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements IInterface {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final IBinder f119132eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f119133gxszxtbevo = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    protected iobyxmoadg(IBinder iBinder, String str) {
        this.f119132eablkybsjg = iBinder;
    }

    protected final void agtfadlqog(int i13, Parcel parcel) {
        try {
            this.f119132eablkybsjg.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f119132eablkybsjg;
    }

    protected final Parcel wflxmlrfwp() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f119133gxszxtbevo);
        return parcelObtain;
    }
}
