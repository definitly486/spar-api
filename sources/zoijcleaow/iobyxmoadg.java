package zoijcleaow;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface iobyxmoadg extends IInterface {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final String f130647wkgbmnqykc = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: zoijcleaow.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractBinderC3342iobyxmoadg extends Binder implements iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C3343iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private IBinder f130648eablkybsjg;

            C3343iobyxmoadg(IBinder iBinder) {
                this.f130648eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f130648eablkybsjg;
            }

            @Override // zoijcleaow.iobyxmoadg
            public void gtknphoqwx(String str, int i13, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(iobyxmoadg.f130647wkgbmnqykc);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeString(str2);
                    zoijcleaow.zoijcleaow(parcelObtain, notification, 0);
                    this.f130648eablkybsjg.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static iobyxmoadg wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(iobyxmoadg.f130647wkgbmnqykc);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof iobyxmoadg)) ? new C3343iobyxmoadg(iBinder) : (iobyxmoadg) iInterfaceQueryLocalInterface;
        }
    }

    public static class zoijcleaow {
        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(Parcel parcel, Parcelable parcelable, int i13) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i13);
            }
        }
    }

    void gtknphoqwx(String str, int i13, String str2, Notification notification);
}
