package m8;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static boolean eablkybsjg(int i13, int i14) {
        return i13 != Integer.MIN_VALUE && i14 != Integer.MIN_VALUE && i13 <= 512 && i14 <= 384;
    }

    private static boolean gxszxtbevo(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean iobyxmoadg(Uri uri) {
        return ppxfxbqfkf(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean ppxfxbqfkf(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean wkgbmnqykc(Uri uri) {
        return ppxfxbqfkf(uri) && gxszxtbevo(uri);
    }

    public static boolean zoijcleaow(Uri uri) {
        return ppxfxbqfkf(uri) && !gxszxtbevo(uri);
    }
}
