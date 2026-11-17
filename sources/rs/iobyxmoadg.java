package rs;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.agtfadlqog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1886iobyxmoadg f83690ppxfxbqfkf = new C1886iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final c42.zoijcleaow f83691iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow[] f83692zoijcleaow;

    /* JADX INFO: renamed from: rs.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1886iobyxmoadg {
        public /* synthetic */ C1886iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1886iobyxmoadg() {
        }
    }

    public iobyxmoadg(c42.zoijcleaow crashLogger, zoijcleaow... customLoggers) {
        zdlpuopuiu.btonecajqb(crashLogger, "crashLogger");
        zdlpuopuiu.btonecajqb(customLoggers, "customLoggers");
        this.f83691iobyxmoadg = crashLogger;
        this.f83692zoijcleaow = customLoggers;
        jc2.iobyxmoadg.f51100iobyxmoadg.ojitshcjhn(new jc2.iobyxmoadg.C1098iobyxmoadg());
    }

    private final void eablkybsjg(String str, String str2, Object... objArr) {
        if (!(objArr.length == 0)) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        }
        String str3 = "[" + str + "] + " + str2;
        for (zoijcleaow zoijcleaowVar : this.f83692zoijcleaow) {
            zoijcleaowVar.iobyxmoadg(str3, "Timber", null);
        }
    }

    private final void gxszxtbevo(Throwable th2) {
        String strPpxfxbqfkf = ppxfxbqfkf(th2);
        for (zoijcleaow zoijcleaowVar : this.f83692zoijcleaow) {
            zoijcleaowVar.iobyxmoadg(strPpxfxbqfkf, "Timber", th2);
        }
    }

    private final String ppxfxbqfkf(Throwable th2) {
        StringWriter stringWriter = new StringWriter(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        try {
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            try {
                th2.printStackTrace(printWriter);
                printWriter.flush();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(printWriter, null);
                String string = stringWriter.toString();
                rg.zoijcleaow.iobyxmoadg(stringWriter, null);
                zdlpuopuiu.dxjokdxxww(string, "use(...)");
                return string;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rg.zoijcleaow.iobyxmoadg(printWriter, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                rg.zoijcleaow.iobyxmoadg(stringWriter, th5);
                throw th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    private final void wkgbmnqykc(Throwable th2, List list) {
        CrashlyticsKey[] crashlyticsKeyArr;
        boolean z13 = th2 instanceof CancellationException;
        if (th2 == null || z13) {
            return;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof CrashlyticsKey) {
                    arrayList.add(obj);
                }
            }
            crashlyticsKeyArr = (CrashlyticsKey[]) arrayList.toArray(new CrashlyticsKey[0]);
            if (crashlyticsKeyArr == null) {
                crashlyticsKeyArr = new CrashlyticsKey[0];
            }
        } else {
            crashlyticsKeyArr = new CrashlyticsKey[0];
        }
        this.f83691iobyxmoadg.iobyxmoadg(th2, (CrashlyticsKey[]) Arrays.copyOf(crashlyticsKeyArr, crashlyticsKeyArr.length));
    }

    @Override // rs.ppxfxbqfkf
    public void iobyxmoadg(String tag, String message, boolean z13) {
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(message, "message");
        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq(tag).iobyxmoadg(message, new Object[0]);
        if (z13) {
            if (this.f83692zoijcleaow.length == 0) {
                return;
            }
            eablkybsjg(tag, message, new Object[0]);
        }
    }

    @Override // rs.ppxfxbqfkf
    public void zoijcleaow(Throwable e13, CrashlyticsKey... keys) {
        zdlpuopuiu.btonecajqb(e13, "e");
        zdlpuopuiu.btonecajqb(keys, "keys");
        jc2.iobyxmoadg.f51100iobyxmoadg.ppxfxbqfkf(e13);
        wkgbmnqykc(e13, agtfadlqog.i(keys));
        if (this.f83692zoijcleaow.length == 0) {
            return;
        }
        gxszxtbevo(e13);
    }
}
