package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.oipsdeybqn;
import istkbnxepw.vipkmwdibw;
import istkbnxepw.zfvoamnweg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final zfvoamnweg f3628iobyxmoadg = ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final zfvoamnweg f3631zoijcleaow = wkgbmnqykc();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Set f3629ppxfxbqfkf = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Set f3630wkgbmnqykc = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    private static boolean btonecajqb() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f3630wkgbmnqykc.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean dxjokdxxww() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f3629ppxfxbqfkf.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private List gxszxtbevo(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f3628iobyxmoadg);
        }
        return arrayList;
    }

    private static boolean lqeggnwhkg() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean nufgyqmvbu() {
        return lqeggnwhkg() || dxjokdxxww() || btonecajqb();
    }

    private static zfvoamnweg ppxfxbqfkf() {
        zfvoamnweg zfvoamnwegVar = new zfvoamnweg();
        oipsdeybqn.zoijcleaow zoijcleaowVar = oipsdeybqn.zoijcleaow.YUV;
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(zoijcleaowVar, oipsdeybqn.iobyxmoadg.VGA));
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(oipsdeybqn.zoijcleaow.PRIV, oipsdeybqn.iobyxmoadg.PREVIEW));
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(zoijcleaowVar, oipsdeybqn.iobyxmoadg.MAXIMUM));
        return zfvoamnwegVar;
    }

    private static zfvoamnweg wkgbmnqykc() {
        zfvoamnweg zfvoamnwegVar = new zfvoamnweg();
        oipsdeybqn.zoijcleaow zoijcleaowVar = oipsdeybqn.zoijcleaow.PRIV;
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(zoijcleaowVar, oipsdeybqn.iobyxmoadg.PREVIEW));
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(zoijcleaowVar, oipsdeybqn.iobyxmoadg.VGA));
        zfvoamnwegVar.iobyxmoadg(oipsdeybqn.iobyxmoadg(oipsdeybqn.zoijcleaow.YUV, oipsdeybqn.iobyxmoadg.MAXIMUM));
        return zfvoamnwegVar;
    }

    public List eablkybsjg(String str) {
        if (lqeggnwhkg()) {
            return gxszxtbevo(str);
        }
        return (dxjokdxxww() || btonecajqb()) ? Collections.singletonList(f3631zoijcleaow) : Collections.emptyList();
    }
}
