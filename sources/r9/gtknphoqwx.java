package r9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f82193iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f82194ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f82195zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82196iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Map f82197zoijcleaow = null;

        iobyxmoadg(Context context) {
            this.f82196iobyxmoadg = context;
        }

        private Map iobyxmoadg(Context context) {
            Bundle bundleWkgbmnqykc = wkgbmnqykc(context);
            if (bundleWkgbmnqykc == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleWkgbmnqykc.keySet()) {
                Object obj = bundleWkgbmnqykc.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(StringUtils.COMMA, -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map ppxfxbqfkf() {
            if (this.f82197zoijcleaow == null) {
                this.f82197zoijcleaow = iobyxmoadg(this.f82196iobyxmoadg);
            }
            return this.f82197zoijcleaow;
        }

        private static Bundle wkgbmnqykc(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        wkgbmnqykc zoijcleaow(String str) {
            String str2 = (String) ppxfxbqfkf().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (wkgbmnqykc) Class.forName(str2).asSubclass(wkgbmnqykc.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e13) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e13);
                return null;
            } catch (IllegalAccessException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e14);
                return null;
            } catch (InstantiationException e15) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e15);
                return null;
            } catch (NoSuchMethodException e16) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e16);
                return null;
            } catch (InvocationTargetException e17) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e17);
                return null;
            }
        }
    }

    gtknphoqwx(Context context, dxjokdxxww dxjokdxxwwVar) {
        this(new iobyxmoadg(context), dxjokdxxwwVar);
    }

    @Override // r9.eablkybsjg
    public synchronized wflxmlrfwp get(String str) {
        if (this.f82194ppxfxbqfkf.containsKey(str)) {
            return (wflxmlrfwp) this.f82194ppxfxbqfkf.get(str);
        }
        wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f82193iobyxmoadg.zoijcleaow(str);
        if (wkgbmnqykcVarZoijcleaow == null) {
            return null;
        }
        wflxmlrfwp wflxmlrfwpVarCreate = wkgbmnqykcVarZoijcleaow.create(this.f82195zoijcleaow.iobyxmoadg(str));
        this.f82194ppxfxbqfkf.put(str, wflxmlrfwpVarCreate);
        return wflxmlrfwpVarCreate;
    }

    gtknphoqwx(iobyxmoadg iobyxmoadgVar, dxjokdxxww dxjokdxxwwVar) {
        this.f82194ppxfxbqfkf = new HashMap();
        this.f82193iobyxmoadg = iobyxmoadgVar;
        this.f82195zoijcleaow = dxjokdxxwwVar;
    }
}
