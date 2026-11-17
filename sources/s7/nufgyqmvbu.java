package s7;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.btonecajqb;
import com.airbnb.lottie.wypolnanlu;
import com.airbnb.lottie.zdlpuopuiu;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f105622iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f105623zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f105624iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            f105624iobyxmoadg = iArr;
            try {
                iArr[ppxfxbqfkf.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105624iobyxmoadg[ppxfxbqfkf.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo gxszxtbevoVar) {
        this.f105622iobyxmoadg = lqeggnwhkgVar;
        this.f105623zoijcleaow = gxszxtbevoVar;
    }

    private wypolnanlu eablkybsjg(Context context, String str, InputStream inputStream, String str2, String str3) {
        wypolnanlu wypolnanluVarLqeggnwhkg;
        ppxfxbqfkf ppxfxbqfkfVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (str2 == null) {
            str2 = PaymentFlowNetworkModuleKt.REQUEST_TYPE;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            v7.wkgbmnqykc.iobyxmoadg("Handling zip response.");
            ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.ZIP;
            wypolnanluVarLqeggnwhkg = lqeggnwhkg(context, str, inputStream, str3);
            ppxfxbqfkfVar = ppxfxbqfkfVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            v7.wkgbmnqykc.iobyxmoadg("Handling gzip response.");
            ppxfxbqfkfVar = ppxfxbqfkf.GZIP;
            wypolnanluVarLqeggnwhkg = wkgbmnqykc(str, inputStream, str3);
        } else {
            v7.wkgbmnqykc.iobyxmoadg("Received json response.");
            ppxfxbqfkfVar = ppxfxbqfkf.JSON;
            wypolnanluVarLqeggnwhkg = gxszxtbevo(str, inputStream, str3);
        }
        if (str3 != null && wypolnanluVarLqeggnwhkg.zoijcleaow() != null && (lqeggnwhkgVar = this.f105622iobyxmoadg) != null) {
            lqeggnwhkgVar.lqeggnwhkg(str, ppxfxbqfkfVar);
        }
        return wypolnanluVarLqeggnwhkg;
    }

    private wypolnanlu gxszxtbevo(String str, InputStream inputStream, String str2) {
        lqeggnwhkg lqeggnwhkgVar;
        return (str2 == null || (lqeggnwhkgVar = this.f105622iobyxmoadg) == null) ? zdlpuopuiu.oxmwwwfdhm(inputStream, null) : zdlpuopuiu.oxmwwwfdhm(new FileInputStream(lqeggnwhkgVar.nufgyqmvbu(str, inputStream, ppxfxbqfkf.JSON).getAbsolutePath()), str);
    }

    private btonecajqb iobyxmoadg(Context context, String str, String str2) {
        lqeggnwhkg lqeggnwhkgVar;
        Pair pairZoijcleaow;
        wypolnanlu wypolnanluVarCdpycssgdh;
        if (str2 == null || (lqeggnwhkgVar = this.f105622iobyxmoadg) == null || (pairZoijcleaow = lqeggnwhkgVar.zoijcleaow(str)) == null) {
            return null;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) pairZoijcleaow.first;
        InputStream inputStream = (InputStream) pairZoijcleaow.second;
        int i13 = iobyxmoadg.f105624iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            wypolnanluVarCdpycssgdh = zdlpuopuiu.cdpycssgdh(context, new ZipInputStream(inputStream), str2);
        } else if (i13 != 2) {
            wypolnanluVarCdpycssgdh = zdlpuopuiu.oxmwwwfdhm(inputStream, str2);
        } else {
            try {
                wypolnanluVarCdpycssgdh = zdlpuopuiu.oxmwwwfdhm(new GZIPInputStream(inputStream), str2);
            } catch (IOException e13) {
                wypolnanluVarCdpycssgdh = new wypolnanlu((Throwable) e13);
            }
        }
        if (wypolnanluVarCdpycssgdh.zoijcleaow() != null) {
            return (btonecajqb) wypolnanluVarCdpycssgdh.zoijcleaow();
        }
        return null;
    }

    private wypolnanlu lqeggnwhkg(Context context, String str, InputStream inputStream, String str2) {
        lqeggnwhkg lqeggnwhkgVar;
        return (str2 == null || (lqeggnwhkgVar = this.f105622iobyxmoadg) == null) ? zdlpuopuiu.cdpycssgdh(context, new ZipInputStream(inputStream), null) : zdlpuopuiu.cdpycssgdh(context, new ZipInputStream(new FileInputStream(lqeggnwhkgVar.nufgyqmvbu(str, inputStream, ppxfxbqfkf.ZIP))), str);
    }

    private wypolnanlu wkgbmnqykc(String str, InputStream inputStream, String str2) {
        lqeggnwhkg lqeggnwhkgVar;
        return (str2 == null || (lqeggnwhkgVar = this.f105622iobyxmoadg) == null) ? zdlpuopuiu.oxmwwwfdhm(new GZIPInputStream(inputStream), null) : zdlpuopuiu.oxmwwwfdhm(new GZIPInputStream(new FileInputStream(lqeggnwhkgVar.nufgyqmvbu(str, inputStream, ppxfxbqfkf.GZIP))), str);
    }

    private wypolnanlu zoijcleaow(Context context, String str, String str2) {
        v7.wkgbmnqykc.iobyxmoadg("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f105623zoijcleaow.iobyxmoadg(str);
                if (!wkgbmnqykcVarIobyxmoadg.iwxlajgraz()) {
                    wypolnanlu wypolnanluVar = new wypolnanlu((Throwable) new IllegalArgumentException(wkgbmnqykcVarIobyxmoadg.C()));
                    try {
                        wkgbmnqykcVarIobyxmoadg.close();
                    } catch (IOException e13) {
                        v7.wkgbmnqykc.wkgbmnqykc("LottieFetchResult close failed ", e13);
                    }
                    return wypolnanluVar;
                }
                wypolnanlu wypolnanluVarEablkybsjg = eablkybsjg(context, str, wkgbmnqykcVarIobyxmoadg.ydmasvzmpa(), wkgbmnqykcVarIobyxmoadg.jztzpxfvev(), str2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Completed fetch from network. Success: ");
                sb3.append(wypolnanluVarEablkybsjg.zoijcleaow() != null);
                v7.wkgbmnqykc.iobyxmoadg(sb3.toString());
                try {
                    wkgbmnqykcVarIobyxmoadg.close();
                } catch (IOException e14) {
                    v7.wkgbmnqykc.wkgbmnqykc("LottieFetchResult close failed ", e14);
                }
                return wypolnanluVarEablkybsjg;
            } catch (Exception e15) {
                wypolnanlu wypolnanluVar2 = new wypolnanlu((Throwable) e15);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e16) {
                        v7.wkgbmnqykc.wkgbmnqykc("LottieFetchResult close failed ", e16);
                    }
                }
                return wypolnanluVar2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e17) {
                    v7.wkgbmnqykc.wkgbmnqykc("LottieFetchResult close failed ", e17);
                }
            }
            throw th2;
        }
    }

    public wypolnanlu ppxfxbqfkf(Context context, String str, String str2) {
        btonecajqb btonecajqbVarIobyxmoadg = iobyxmoadg(context, str, str2);
        if (btonecajqbVarIobyxmoadg != null) {
            return new wypolnanlu(btonecajqbVarIobyxmoadg);
        }
        v7.wkgbmnqykc.iobyxmoadg("Animation for " + str + " not found in cache. Fetching from network.");
        return zoijcleaow(context, str, str2);
    }
}
