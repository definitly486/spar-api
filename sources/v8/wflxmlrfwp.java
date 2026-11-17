package v8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final l8.gxszxtbevo f116319zoijcleaow = l8.gxszxtbevo.eablkybsjg("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f116320iobyxmoadg;

    public wflxmlrfwp(Context context) {
        this.f116320iobyxmoadg = context.getApplicationContext();
    }

    private int eablkybsjg(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e13) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e13);
        }
    }

    private int gxszxtbevo(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, ConstantDeviceInfo.APP_PLATFORM);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int lqeggnwhkg(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return gxszxtbevo(context, uri);
        }
        if (pathSegments.size() == 1) {
            return eablkybsjg(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    private Context wkgbmnqykc(Uri uri, String str) {
        if (str.equals(this.f116320iobyxmoadg.getPackageName())) {
            return this.f116320iobyxmoadg;
        }
        try {
            return this.f116320iobyxmoadg.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e13) {
            if (str.contains(this.f116320iobyxmoadg.getPackageName())) {
                return this.f116320iobyxmoadg;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e13);
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri, l8.lqeggnwhkg lqeggnwhkgVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextWkgbmnqykc = wkgbmnqykc(uri, authority);
            int iLqeggnwhkg = lqeggnwhkg(contextWkgbmnqykc, uri);
            Resources.Theme theme = ((String) g9.gtknphoqwx.eablkybsjg(authority)).equals(this.f116320iobyxmoadg.getPackageName()) ? (Resources.Theme) lqeggnwhkgVar.ppxfxbqfkf(f116319zoijcleaow) : null;
            return draadjrbmk.eablkybsjg(theme == null ? dxjokdxxww.zoijcleaow(this.f116320iobyxmoadg, contextWkgbmnqykc, iLqeggnwhkg) : dxjokdxxww.iobyxmoadg(this.f116320iobyxmoadg, iLqeggnwhkg, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }
}
