package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface zoijcleaow extends IInterface {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final String f13272zoijcleaow = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static abstract class iobyxmoadg extends Binder implements zoijcleaow {

        /* JADX INFO: renamed from: androidx.room.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C0192iobyxmoadg implements zoijcleaow {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private IBinder f13273eablkybsjg;

            C0192iobyxmoadg(IBinder iBinder) {
                this.f13273eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13273eablkybsjg;
            }

            @Override // androidx.room.zoijcleaow
            public void zoijcleaow(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(zoijcleaow.f13272zoijcleaow);
                    parcelObtain.writeStringArray(strArr);
                    this.f13273eablkybsjg.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public iobyxmoadg() {
            attachInterface(this, zoijcleaow.f13272zoijcleaow);
        }

        public static zoijcleaow wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(zoijcleaow.f13272zoijcleaow);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zoijcleaow)) ? new C0192iobyxmoadg(iBinder) : (zoijcleaow) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
            String str = zoijcleaow.f13272zoijcleaow;
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
            zoijcleaow(parcel.createStringArray());
            return true;
        }
    }

    void zoijcleaow(String[] strArr);
}
