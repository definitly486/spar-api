package r8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f82117iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f82118zoijcleaow;

    private static final class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82119iobyxmoadg;

        iobyxmoadg(Context context) {
            this.f82119iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new zdlpuopuiu(this.f82119iobyxmoadg, oxmwwwfdhmVar.wkgbmnqykc(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class zoijcleaow implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82120iobyxmoadg;

        zoijcleaow(Context context) {
            this.f82120iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new zdlpuopuiu(this.f82120iobyxmoadg, oxmwwwfdhmVar.wkgbmnqykc(Integer.class, InputStream.class));
        }
    }

    zdlpuopuiu(Context context, agtfadlqog agtfadlqogVar) {
        this.f82117iobyxmoadg = context.getApplicationContext();
        this.f82118zoijcleaow = agtfadlqogVar;
    }

    public static ojitshcjhn eablkybsjg(Context context) {
        return new iobyxmoadg(context);
    }

    public static ojitshcjhn gxszxtbevo(Context context) {
        return new zoijcleaow(context);
    }

    private agtfadlqog.iobyxmoadg lqeggnwhkg(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        try {
            int i15 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i15 != 0) {
                return this.f82118zoijcleaow.zoijcleaow(Integer.valueOf(i15), i13, i14, lqeggnwhkgVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e13) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e13);
            }
            return null;
        }
    }

    private agtfadlqog.iobyxmoadg nufgyqmvbu(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f82117iobyxmoadg.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f82117iobyxmoadg.getPackageName());
        if (identifier != 0) {
            return this.f82118zoijcleaow.zoijcleaow(Integer.valueOf(identifier), i13, i14, lqeggnwhkgVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return lqeggnwhkg(uri, i13, i14, lqeggnwhkgVar);
        }
        if (pathSegments.size() == 2) {
            return nufgyqmvbu(uri, i13, i14, lqeggnwhkgVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f82117iobyxmoadg.getPackageName().equals(uri.getAuthority());
    }
}
