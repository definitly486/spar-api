package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static String dxjokdxxww(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String eablkybsjg(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String gxszxtbevo(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lqeggnwhkg(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String nufgyqmvbu(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? dxjokdxxww(installerPackageName) : "";
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(od.ppxfxbqfkf.zoijcleaow());
        arrayList.add(rc.gxszxtbevo.lqeggnwhkg());
        arrayList.add(od.nufgyqmvbu.zoijcleaow("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(od.nufgyqmvbu.zoijcleaow("fire-core", "21.0.0"));
        arrayList.add(od.nufgyqmvbu.zoijcleaow("device-name", dxjokdxxww(Build.PRODUCT)));
        arrayList.add(od.nufgyqmvbu.zoijcleaow("device-model", dxjokdxxww(Build.DEVICE)));
        arrayList.add(od.nufgyqmvbu.zoijcleaow("device-brand", dxjokdxxww(Build.BRAND)));
        arrayList.add(od.nufgyqmvbu.ppxfxbqfkf("android-target-sdk", new od.nufgyqmvbu.iobyxmoadg() { // from class: com.google.firebase.nufgyqmvbu
            @Override // od.nufgyqmvbu.iobyxmoadg
            public final String iobyxmoadg(Object obj) {
                return FirebaseCommonRegistrar.eablkybsjg((Context) obj);
            }
        }));
        arrayList.add(od.nufgyqmvbu.ppxfxbqfkf("android-min-sdk", new od.nufgyqmvbu.iobyxmoadg() { // from class: com.google.firebase.dxjokdxxww
            @Override // od.nufgyqmvbu.iobyxmoadg
            public final String iobyxmoadg(Object obj) {
                return FirebaseCommonRegistrar.gxszxtbevo((Context) obj);
            }
        }));
        arrayList.add(od.nufgyqmvbu.ppxfxbqfkf("android-platform", new od.nufgyqmvbu.iobyxmoadg() { // from class: com.google.firebase.btonecajqb
            @Override // od.nufgyqmvbu.iobyxmoadg
            public final String iobyxmoadg(Object obj) {
                return FirebaseCommonRegistrar.lqeggnwhkg((Context) obj);
            }
        }));
        arrayList.add(od.nufgyqmvbu.ppxfxbqfkf("android-installer", new od.nufgyqmvbu.iobyxmoadg() { // from class: com.google.firebase.gtknphoqwx
            @Override // od.nufgyqmvbu.iobyxmoadg
            public final String iobyxmoadg(Object obj) {
                return FirebaseCommonRegistrar.nufgyqmvbu((Context) obj);
            }
        }));
        String strIobyxmoadg = od.eablkybsjg.iobyxmoadg();
        if (strIobyxmoadg != null) {
            arrayList.add(od.nufgyqmvbu.zoijcleaow("kotlin", strIobyxmoadg));
        }
        return arrayList;
    }
}
