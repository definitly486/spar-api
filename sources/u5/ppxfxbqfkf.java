package u5;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f112703iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    public static final Uri iobyxmoadg(Cursor cursor) {
        zdlpuopuiu.btonecajqb(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        zdlpuopuiu.dxjokdxxww(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean zoijcleaow(ActivityManager activityManager) {
        zdlpuopuiu.btonecajqb(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
