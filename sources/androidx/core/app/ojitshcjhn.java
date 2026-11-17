package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
abstract class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f8372iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f8373zoijcleaow = new Object();

    static Bundle iobyxmoadg(wflxmlrfwp.iobyxmoadg iobyxmoadgVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        bundle.putInt("icon", iconCompatWkgbmnqykc != null ? iconCompatWkgbmnqykc.btonecajqb() : 0);
        bundle.putCharSequence("title", iobyxmoadgVar.nufgyqmvbu());
        bundle.putParcelable("actionIntent", iobyxmoadgVar.iobyxmoadg());
        Bundle bundle2 = iobyxmoadgVar.ppxfxbqfkf() != null ? new Bundle(iobyxmoadgVar.ppxfxbqfkf()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", iobyxmoadgVar.zoijcleaow());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", ppxfxbqfkf(iobyxmoadgVar.eablkybsjg()));
        bundle.putBoolean("showsUserInterface", iobyxmoadgVar.lqeggnwhkg());
        bundle.putInt("semanticAction", iobyxmoadgVar.gxszxtbevo());
        return bundle;
    }

    private static Bundle[] ppxfxbqfkf(zdlpuopuiu[] zdlpuopuiuVarArr) {
        if (zdlpuopuiuVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[zdlpuopuiuVarArr.length];
        for (int i13 = 0; i13 < zdlpuopuiuVarArr.length; i13++) {
            zdlpuopuiu zdlpuopuiuVar = zdlpuopuiuVarArr[i13];
            bundleArr[i13] = zoijcleaow(null);
        }
        return bundleArr;
    }

    private static Bundle zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
        new Bundle();
        throw null;
    }
}
