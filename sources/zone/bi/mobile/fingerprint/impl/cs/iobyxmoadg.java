package zone.bi.mobile.fingerprint.impl.cs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg extends IInterface {

    /* JADX INFO: renamed from: zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractBinderC3344iobyxmoadg extends Binder implements iobyxmoadg {

        /* JADX INFO: renamed from: zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C3345iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private IBinder f130651eablkybsjg;

            C3345iobyxmoadg(IBinder iBinder) {
                this.f130651eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f130651eablkybsjg;
            }

            @Override // zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg
            public int iobyxmoadg() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
                    this.f130651eablkybsjg.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC3344iobyxmoadg() {
            attachInterface(this, "zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
        }

        public static iobyxmoadg wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof iobyxmoadg)) ? new C3345iobyxmoadg(iBinder) : (iobyxmoadg) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
            if (i13 >= 1 && i13 <= 16777215) {
                parcel.enforceInterface("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
            }
            if (i13 == 1598968902) {
                parcel2.writeString("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
                return true;
            }
            if (i13 != 1) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            int iIobyxmoadg = iobyxmoadg();
            parcel2.writeNoException();
            parcel2.writeInt(iIobyxmoadg);
            return true;
        }
    }

    int iobyxmoadg();
}
