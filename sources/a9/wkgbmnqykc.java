package a9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f1126iobyxmoadg;

    public wkgbmnqykc(Context context) {
        this.f1126iobyxmoadg = context;
    }

    private ApplicationInfo iobyxmoadg() {
        return this.f1126iobyxmoadg.getPackageManager().getApplicationInfo(this.f1126iobyxmoadg.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    private static zoijcleaow ppxfxbqfkf(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e13) {
                wkgbmnqykc(cls, e13);
            } catch (InstantiationException e14) {
                wkgbmnqykc(cls, e14);
            } catch (NoSuchMethodException e15) {
                wkgbmnqykc(cls, e15);
            } catch (InvocationTargetException e16) {
                wkgbmnqykc(cls, e16);
            }
            if (objNewInstance instanceof zoijcleaow) {
                return (zoijcleaow) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e17) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e17);
        }
    }

    private static void wkgbmnqykc(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List zoijcleaow() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoIobyxmoadg = iobyxmoadg();
            if (applicationInfoIobyxmoadg != null && applicationInfoIobyxmoadg.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfoIobyxmoadg.metaData);
                }
                for (String str : applicationInfoIobyxmoadg.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoIobyxmoadg.metaData.get(str))) {
                        arrayList.add(ppxfxbqfkf(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e13) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e13);
            }
        }
    }
}
