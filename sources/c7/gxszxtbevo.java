package c7;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import e7.draadjrbmk;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements wkgbmnqykc {
    private final boolean zoijcleaow(Uri uri) {
        String authority;
        return zdlpuopuiu.eablkybsjg(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !kcexrzcfyt.zfvoamnweg(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // c7.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Uri iobyxmoadg(Uri uri, draadjrbmk draadjrbmkVar) throws PackageManager.NameNotFoundException {
        if (!zoijcleaow(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = draadjrbmkVar.lqeggnwhkg().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + '/' + identifier);
        zdlpuopuiu.dxjokdxxww(uri2, "parse(this)");
        return uri2;
    }
}
