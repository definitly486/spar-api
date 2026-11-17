package ge;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final GmsLogger f36935iobyxmoadg = new GmsLogger("CommonUtils", "");

    public static String iobyxmoadg(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e13) {
            f36935iobyxmoadg.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e13.toString()));
            return "";
        }
    }

    public static String zoijcleaow(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb3 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb3.append("-");
            sb3.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb3.append("-");
            sb3.append(locale.getVariant());
        }
        return sb3.toString();
    }
}
