package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface iobyxmoadg extends IInterface {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final String f2284iobyxmoadg = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: renamed from: android.support.v4.os.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0061iobyxmoadg extends Binder implements iobyxmoadg {

        /* JADX INFO: renamed from: android.support.v4.os.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C0062iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private IBinder f2285eablkybsjg;

            C0062iobyxmoadg(IBinder iBinder) {
                this.f2285eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2285eablkybsjg;
            }
        }

        public AbstractBinderC0061iobyxmoadg() {
            attachInterface(this, iobyxmoadg.f2284iobyxmoadg);
        }

        public static iobyxmoadg wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(iobyxmoadg.f2284iobyxmoadg);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof iobyxmoadg)) ? new C0062iobyxmoadg(iBinder) : (iobyxmoadg) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
            String str = iobyxmoadg.f2284iobyxmoadg;
            if (i13 >= 1 && i13 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i13 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i13 != 1) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            nufgyqmvbu(parcel.readInt(), (Bundle) zoijcleaow.zoijcleaow(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class zoijcleaow {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object zoijcleaow(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void nufgyqmvbu(int i13, Bundle bundle);
}
