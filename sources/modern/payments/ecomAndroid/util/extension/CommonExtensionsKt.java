package modern.payments.ecomAndroid.util.extension;

import android.content.Context;
import android.util.Log;
import gg.lqeggnwhkg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.config.DataModes;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;
import rg.gtknphoqwx;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a9\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"T", "R", "Lkotlin/Function1;", "block", "tryCatchNull", "(Ljava/lang/Object;Ltg/draadjrbmk;)Ljava/lang/Object;", "", "getRetrofitBaseUrl", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "readJsonFromAssets", "(Ljava/lang/String;Landroid/content/Context;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)Ljava/lang/String;", "SANDBOX_URL", "Ljava/lang/String;", "PROD_URL", "PSI_URL", "IFT_URL", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CommonExtensionsKt {
    private static final String IFT_URL = "https://ift.gate1.spaymentsplus.ru/";
    private static final String PROD_URL = "https://gate1.spaymentsplus.ru/";
    private static final String PSI_URL = "https://psi.gate1.spaymentsplus.ru/";
    private static final String SANDBOX_URL = "https://ift.gate2.spaymentsplus.ru/";

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataModes.values().length];
            try {
                iArr[DataModes.PROD_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataModes.PSI_SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataModes.IFT_SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataModes.LOCAL_MOCKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataModes.SANDBOX_SERVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getRetrofitBaseUrl() {
        int i13 = WhenMappings.$EnumSwitchMapping$0[EcomStagingConfig.INSTANCE.getDataMode().ordinal()];
        if (i13 == 1) {
            return "https://gate1.spaymentsplus.ru/";
        }
        if (i13 == 2) {
            return "https://psi.gate1.spaymentsplus.ru/";
        }
        if (i13 == 3 || i13 == 4) {
            return "https://ift.gate1.spaymentsplus.ru/";
        }
        if (i13 == 5) {
            return "https://ift.gate2.spaymentsplus.ru/";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String readJsonFromAssets(String str, Context context, ITracker tracker, EcomSdkOptionsRepository optionsRepository) throws Throwable {
        String strPpxfxbqfkf;
        Throwable th2;
        zdlpuopuiu.btonecajqb(str, "<this>");
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            zdlpuopuiu.dxjokdxxww(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, mj.wkgbmnqykc.f67326zoijcleaow), 8192);
            try {
                strPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(bufferedReader);
                try {
                    bufferedReader.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    lqeggnwhkg.iobyxmoadg(th4, th5);
                }
                th2 = th4;
                strPpxfxbqfkf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            zdlpuopuiu.lqeggnwhkg(strPpxfxbqfkf);
            if (strPpxfxbqfkf != null) {
                return strPpxfxbqfkf;
            }
            zdlpuopuiu.pmvmpeiblj("jsonString");
            return null;
        } catch (IOException e13) {
            FeatureExtensionsKt.track$default(tracker, optionsRepository, null, e13, ITracker.Priority.ERROR, null, 16, null);
            strPpxfxbqfkf = null;
        }
    }

    public static final <T, R> T tryCatchNull(R r13, draadjrbmk block) {
        zdlpuopuiu.btonecajqb(block, "block");
        try {
            return (T) block.invoke(r13);
        } catch (Exception e13) {
            Log.i("CATCH BLOCK EXCEPTION", e13.toString());
            return null;
        }
    }
}
