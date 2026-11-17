package bz;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class fiwbwshyhd extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17417eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    pc2.iobyxmoadg f17418gxszxtbevo;

    fiwbwshyhd(pc2.iobyxmoadg iobyxmoadgVar, Context context) {
        super(kc2.lqeggnwhkg.PackageManager);
        this.f17418gxszxtbevo = iobyxmoadgVar;
        this.f17417eablkybsjg = context;
    }

    private String cdpycssgdh(oc2.iobyxmoadg iobyxmoadgVar) {
        try {
            return nc2.gxszxtbevo.ppxfxbqfkf(nc2.gxszxtbevo.nufgyqmvbu(nc2.gxszxtbevo.dxjokdxxww(iobyxmoadgVar)), "TestKey");
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // bz.metgxyhuhe
    protected Serializable lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        PackageManager packageManager = this.f17417eablkybsjg.getPackageManager();
        if (this.f17418gxszxtbevo.nufgyqmvbu().contains(kc2.lqeggnwhkg.SystemAvailableFeatures)) {
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            LinkedList linkedList = new LinkedList();
            iobyxmoadgVar.put("SystemAvailableFeatures", linkedList);
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str = featureInfo.name;
                if (str != null) {
                    linkedList.add(str);
                }
            }
        }
        if (this.f17418gxszxtbevo.nufgyqmvbu().contains(kc2.lqeggnwhkg.SystemSharedLibraryNames)) {
            String[] systemSharedLibraryNames = packageManager.getSystemSharedLibraryNames();
            LinkedList linkedList2 = new LinkedList();
            iobyxmoadgVar.put("SystemSharedLibraryNames", linkedList2);
            if (systemSharedLibraryNames != null) {
                linkedList2.addAll(Arrays.asList(systemSharedLibraryNames));
            }
        }
        return this.f17418gxszxtbevo.btonecajqb().contains(kc2.lqeggnwhkg.PackageManager) ? cdpycssgdh(iobyxmoadgVar) : iobyxmoadgVar;
    }
}
