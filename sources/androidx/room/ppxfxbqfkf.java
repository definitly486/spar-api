package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface ppxfxbqfkf extends IInterface {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final String f13239ppxfxbqfkf = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class iobyxmoadg extends Binder implements ppxfxbqfkf {

        /* JADX INFO: renamed from: androidx.room.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C0190iobyxmoadg implements ppxfxbqfkf {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private IBinder f13240eablkybsjg;

            C0190iobyxmoadg(IBinder iBinder) {
                this.f13240eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13240eablkybsjg;
            }

            @Override // androidx.room.ppxfxbqfkf
            public int btonecajqb(zoijcleaow zoijcleaowVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ppxfxbqfkf.f13239ppxfxbqfkf);
                    parcelObtain.writeStrongInterface(zoijcleaowVar);
                    parcelObtain.writeString(str);
                    this.f13240eablkybsjg.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.ppxfxbqfkf
            public void lqeggnwhkg(int i13, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ppxfxbqfkf.f13239ppxfxbqfkf);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeStringArray(strArr);
                    this.f13240eablkybsjg.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public iobyxmoadg() {
            attachInterface(this, ppxfxbqfkf.f13239ppxfxbqfkf);
        }

        public static ppxfxbqfkf wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ppxfxbqfkf.f13239ppxfxbqfkf);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ppxfxbqfkf)) ? new C0190iobyxmoadg(iBinder) : (ppxfxbqfkf) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
            String str = ppxfxbqfkf.f13239ppxfxbqfkf;
            if (i13 >= 1 && i13 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i13 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i13 == 1) {
                int iBtonecajqb = btonecajqb(zoijcleaow.iobyxmoadg.wflxmlrfwp(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iBtonecajqb);
            } else if (i13 == 2) {
                draadjrbmk(zoijcleaow.iobyxmoadg.wflxmlrfwp(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i13 != 3) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                lqeggnwhkg(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int btonecajqb(zoijcleaow zoijcleaowVar, String str);

    void draadjrbmk(zoijcleaow zoijcleaowVar, int i13);

    void lqeggnwhkg(int i13, String[] strArr);
}
