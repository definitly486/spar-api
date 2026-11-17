package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f8343iobyxmoadg = (IconCompat) versionedParcel.jyumaefscl(remoteActionCompat.f8343iobyxmoadg, 1);
        remoteActionCompat.f8346zoijcleaow = versionedParcel.draadjrbmk(remoteActionCompat.f8346zoijcleaow, 2);
        remoteActionCompat.f8344ppxfxbqfkf = versionedParcel.draadjrbmk(remoteActionCompat.f8344ppxfxbqfkf, 3);
        remoteActionCompat.f8345wkgbmnqykc = (PendingIntent) versionedParcel.oxmwwwfdhm(remoteActionCompat.f8345wkgbmnqykc, 4);
        remoteActionCompat.f8341eablkybsjg = versionedParcel.nufgyqmvbu(remoteActionCompat.f8341eablkybsjg, 5);
        remoteActionCompat.f8342gxszxtbevo = versionedParcel.nufgyqmvbu(remoteActionCompat.f8342gxszxtbevo, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.cqumvgiudr(false, false);
        versionedParcel.hkdspvbjdz(remoteActionCompat.f8343iobyxmoadg, 1);
        versionedParcel.cdpycssgdh(remoteActionCompat.f8346zoijcleaow, 2);
        versionedParcel.cdpycssgdh(remoteActionCompat.f8344ppxfxbqfkf, 3);
        versionedParcel.wwaezpbzkn(remoteActionCompat.f8345wkgbmnqykc, 4);
        versionedParcel.lereixgezr(remoteActionCompat.f8341eablkybsjg, 5);
        versionedParcel.lereixgezr(remoteActionCompat.f8342gxszxtbevo, 6);
    }
}
