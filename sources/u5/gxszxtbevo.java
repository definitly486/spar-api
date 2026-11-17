package u5;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f112686iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    public static final List iobyxmoadg(Cursor cursor) {
        zdlpuopuiu.btonecajqb(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        zdlpuopuiu.lqeggnwhkg(notificationUris);
        return notificationUris;
    }

    public static final void zoijcleaow(Cursor cursor, ContentResolver cr2, List uris) {
        zdlpuopuiu.btonecajqb(cursor, "cursor");
        zdlpuopuiu.btonecajqb(cr2, "cr");
        zdlpuopuiu.btonecajqb(uris, "uris");
        cursor.setNotificationUris(cr2, uris);
    }
}
