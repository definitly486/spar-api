package ub;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f113139iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f113140zoijcleaow;

    interface ppxfxbqfkf {
        List iobyxmoadg(Object obj);
    }

    private static class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f113141iobyxmoadg;

        private Bundle zoijcleaow(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f113141iobyxmoadg), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f113141iobyxmoadg + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // ub.gxszxtbevo.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Context context) {
            Bundle bundleZoijcleaow = zoijcleaow(context);
            if (bundleZoijcleaow == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleZoijcleaow.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleZoijcleaow.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private zoijcleaow(Class cls) {
            this.f113141iobyxmoadg = cls;
        }
    }

    gxszxtbevo(Object obj, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f113139iobyxmoadg = obj;
        this.f113140zoijcleaow = ppxfxbqfkfVar;
    }

    public static gxszxtbevo ppxfxbqfkf(Context context, Class cls) {
        return new gxszxtbevo(context, new zoijcleaow(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar wkgbmnqykc(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e13) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e13);
        } catch (InstantiationException e14) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e14);
        } catch (NoSuchMethodException e15) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e15);
        } catch (InvocationTargetException e16) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e16);
        }
    }

    public List zoijcleaow() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f113140zoijcleaow.iobyxmoadg(this.f113139iobyxmoadg)) {
            arrayList.add(new tc.zoijcleaow() { // from class: ub.eablkybsjg
                @Override // tc.zoijcleaow
                public final Object get() {
                    return gxszxtbevo.wkgbmnqykc(str);
                }
            });
        }
        return arrayList;
    }
}
