package m21;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f64969iobyxmoadg = new dxjokdxxww();

    private dxjokdxxww() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent agtfadlqog(String str, Context it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent btonecajqb(String str, Context it) {
        zdlpuopuiu.btonecajqb(it, "it");
        Intent intent = new Intent("android.intent.action.DIAL");
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format("tel:%s", Arrays.copyOf(new Object[]{str}, 1));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        Intent data = intent.setData(Uri.parse(str2));
        zdlpuopuiu.dxjokdxxww(data, "setData(...)");
        return data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent draadjrbmk(double d13, double d14, Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str = String.format("yandexnavi://build_route_on_map?lat_to=%s&lon_to=%s", Arrays.copyOf(new Object[]{Double.valueOf(d13), Double.valueOf(d14)}, 2));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).setPackage("ru.yandex.yandexnavi");
        zdlpuopuiu.dxjokdxxww(intent, "setPackage(...)");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        zdlpuopuiu.dxjokdxxww(listQueryIntentActivities, "queryIntentActivities(...)");
        if (!listQueryIntentActivities.isEmpty()) {
            return intent;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(uw0.ppxfxbqfkf.f114521iobyxmoadg.crxdokpmqz()));
        zdlpuopuiu.lqeggnwhkg(data);
        return data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent esjtqupxsv(Context it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return new Intent("android.settings.WIFI_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent iwizpuwonk(String str, Context it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent oxmwwwfdhm(String str, Context it) {
        zdlpuopuiu.btonecajqb(it, "it");
        Intent type = new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", str).setType("text/plain");
        zdlpuopuiu.dxjokdxxww(type, "setType(...)");
        Intent intentCreateChooser = Intent.createChooser(type, null);
        zdlpuopuiu.dxjokdxxww(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent rgvfuqvkyq(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.setFlags(268435456);
        return intent;
    }

    private static final boolean yggfygwlhe(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String strYadqdtsiqt = uw0.ppxfxbqfkf.f114521iobyxmoadg.yadqdtsiqt();
            if (Build.VERSION.SDK_INT >= 33) {
                packageManager.getPackageInfo(strYadqdtsiqt, PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageManager.getPackageInfo(strYadqdtsiqt, 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent zdlpuopuiu(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(yggfygwlhe(context) ? uw0.ppxfxbqfkf.f114521iobyxmoadg.iozdgvuglv() : uw0.ppxfxbqfkf.f114521iobyxmoadg.stevsuqkhv()));
        return intent;
    }

    public final m9.iobyxmoadg cqumvgiudr() {
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.esjtqupxsv((Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg dxjokdxxww(final String phone) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.btonecajqb(phone, (Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg gtknphoqwx(final double d13, final double d14) {
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.draadjrbmk(d13, d14, (Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg jyumaefscl(final String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.iwizpuwonk(url, (Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg kcexrzcfyt() {
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.nufgyqmvbu
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.zdlpuopuiu((Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg ojitshcjhn() {
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.rgvfuqvkyq((Context) obj);
            }
        }, 3, null);
    }

    public final m9.iobyxmoadg vdvldrhtss(final String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.oxmwwwfdhm(message, (Context) obj);
            }
        }, 3, null);
    }

    public final vdvldrhtss wflxmlrfwp(final String bankLaunchSchema) {
        zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
        return m9.iobyxmoadg.C1374iobyxmoadg.zoijcleaow(m9.iobyxmoadg.f66565iobyxmoadg, null, null, new m9.ppxfxbqfkf() { // from class: m21.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.agtfadlqog(bankLaunchSchema, (Context) obj);
            }
        }, 3, null);
    }
}
