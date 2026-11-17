package n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements IInterface {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final IBinder f69379eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f69380gxszxtbevo = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected iobyxmoadg(IBinder iBinder) {
        this.f69379eablkybsjg = iBinder;
    }

    protected final Parcel agtfadlqog(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f69379eablkybsjg.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e13) {
                parcelObtain.recycle();
                throw e13;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f69379eablkybsjg;
    }

    protected final Parcel wflxmlrfwp() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f69380gxszxtbevo);
        return parcelObtain;
    }
}
