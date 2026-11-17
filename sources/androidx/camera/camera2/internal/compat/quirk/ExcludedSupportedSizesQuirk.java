package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import istkbnxepw.vipkmwdibw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lereixgezr.sopmlzcsov;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements vipkmwdibw {
    private static boolean agtfadlqog() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean btonecajqb() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean draadjrbmk() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private List dxjokdxxww(String str, int i13, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
            if (i13 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i13 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i13 == 34 || i13 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private List eablkybsjg(String str, int i13) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i13 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private static boolean gtknphoqwx() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private List gxszxtbevo(String str, int i13) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i13 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List lqeggnwhkg(String str, int i13) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i13 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    private List nufgyqmvbu(String str, int i13, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
            if (i13 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i13 == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i13 == 34 || i13 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private static boolean ojitshcjhn() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean rgvfuqvkyq() {
        return gtknphoqwx() || draadjrbmk() || btonecajqb() || ojitshcjhn() || agtfadlqog() || wflxmlrfwp();
    }

    private static boolean wflxmlrfwp() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    private List wkgbmnqykc(String str, int i13, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && (i13 == 34 || i13 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST));
        }
        return arrayList;
    }

    public List ppxfxbqfkf(String str, int i13) {
        if (gtknphoqwx()) {
            return eablkybsjg(str, i13);
        }
        if (draadjrbmk()) {
            return gxszxtbevo(str, i13);
        }
        if (btonecajqb()) {
            return wkgbmnqykc(str, i13, null);
        }
        if (ojitshcjhn()) {
            return dxjokdxxww(str, i13, null);
        }
        if (agtfadlqog()) {
            return nufgyqmvbu(str, i13, null);
        }
        if (wflxmlrfwp()) {
            return lqeggnwhkg(str, i13);
        }
        sopmlzcsov.draadjrbmk("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
