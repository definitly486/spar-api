package wb2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StatFs;
import android.util.DisplayMetrics;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import zb2.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements wb2.ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final iobyxmoadg f119236lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f119237eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gtknphoqwx f119238gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f119239iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f119240ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f119241wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tb2.iobyxmoadg f119242zoijcleaow;

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {
        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            return wkgbmnqykc.this.lqeggnwhkg();
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            return wkgbmnqykc.this.dxjokdxxww();
        }
    }

    /* JADX INFO: renamed from: wb2.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2976wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {
        C2976wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            return wkgbmnqykc.this.gxszxtbevo();
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            return wkgbmnqykc.this.nufgyqmvbu();
        }
    }

    public wkgbmnqykc(Context context, tb2.iobyxmoadg settings) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(settings, "settings");
        this.f119239iobyxmoadg = context;
        this.f119242zoijcleaow = settings;
        this.f119240ppxfxbqfkf = draadjrbmk.zoijcleaow(new C2976wkgbmnqykc());
        this.f119241wkgbmnqykc = draadjrbmk.zoijcleaow(new eablkybsjg());
        this.f119237eablkybsjg = draadjrbmk.zoijcleaow(new zoijcleaow());
        this.f119238gxszxtbevo = draadjrbmk.zoijcleaow(new ppxfxbqfkf());
    }

    private final String btonecajqb() {
        return (String) this.f119237eablkybsjg.getValue();
    }

    private final String draadjrbmk() {
        return (String) this.f119240ppxfxbqfkf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String dxjokdxxww() {
        ApplicationInfo applicationInfo = this.f119239iobyxmoadg.getApplicationInfo();
        int i13 = applicationInfo.labelRes;
        if (i13 == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        String string = this.f119239iobyxmoadg.getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "context.getString(stringId)");
        return string;
    }

    private final String gtknphoqwx() {
        return (String) this.f119238gxszxtbevo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String gxszxtbevo() {
        DisplayMetrics displayMetrics = this.f119239iobyxmoadg.getResources().getDisplayMetrics();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(displayMetrics.heightPixels);
        sb3.append('x');
        sb3.append(displayMetrics.widthPixels);
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String lqeggnwhkg() {
        try {
            File externalFilesDir = this.f119239iobyxmoadg.getExternalFilesDir(null);
            long totalBytes = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null).getTotalBytes();
            return totalBytes <= -1 ? "UNKNOWN" : String.valueOf(totalBytes);
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nufgyqmvbu() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr == null || strArr.length == 0) {
            return "UNKNOWN";
        }
        String str = strArr[0];
        zdlpuopuiu.dxjokdxxww(str, "abis[0]");
        return str;
    }

    private final String wflxmlrfwp() {
        return (String) this.f119241wkgbmnqykc.getValue();
    }

    @Override // wb2.ppxfxbqfkf
    public MetaData iobyxmoadg() {
        String strIobyxmoadg = this.f119242zoijcleaow.iobyxmoadg();
        String string = Locale.getDefault().toString();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        String MODEL = Build.MODEL;
        String strDraadjrbmk = draadjrbmk();
        String strWflxmlrfwp = wflxmlrfwp();
        String strBtonecajqb = btonecajqb();
        String strGtknphoqwx = gtknphoqwx();
        zdlpuopuiu.dxjokdxxww(string, "toString()");
        zdlpuopuiu.dxjokdxxww(MANUFACTURER, "MANUFACTURER");
        zdlpuopuiu.dxjokdxxww(MODEL, "MODEL");
        return new MetaData(strIobyxmoadg, "MOBILE", "Android", "Android", strValueOf, string, MANUFACTURER, MODEL, strDraadjrbmk, strWflxmlrfwp, strBtonecajqb, strGtknphoqwx, (String) null, 4096, (kotlin.jvm.internal.gtknphoqwx) null);
    }
}
