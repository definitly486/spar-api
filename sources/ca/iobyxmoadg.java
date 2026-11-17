package ca;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n9.ppxfxbqfkf;
import n9.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public interface iobyxmoadg extends IInterface {

    /* JADX INFO: renamed from: ca.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0351iobyxmoadg extends zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: ca.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static class C0352iobyxmoadg extends n9.iobyxmoadg implements iobyxmoadg {
            C0352iobyxmoadg(IBinder iBinder) {
                super(iBinder);
            }

            @Override // ca.iobyxmoadg
            public final Bundle ppxfxbqfkf(Bundle bundle) {
                Parcel parcelWflxmlrfwp = wflxmlrfwp();
                ppxfxbqfkf.zoijcleaow(parcelWflxmlrfwp, bundle);
                Parcel parcelAgtfadlqog = agtfadlqog(parcelWflxmlrfwp);
                Bundle bundle2 = (Bundle) ppxfxbqfkf.iobyxmoadg(parcelAgtfadlqog, Bundle.CREATOR);
                parcelAgtfadlqog.recycle();
                return bundle2;
            }
        }

        public static iobyxmoadg wflxmlrfwp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof iobyxmoadg ? (iobyxmoadg) iInterfaceQueryLocalInterface : new C0352iobyxmoadg(iBinder);
        }
    }

    Bundle ppxfxbqfkf(Bundle bundle);
}
