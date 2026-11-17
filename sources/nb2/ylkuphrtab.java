package nb2;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes6.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f69630iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final gg.gtknphoqwx f69631zoijcleaow;

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        public iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            Object objWkgbmnqykc;
            ylkuphrtab ylkuphrtabVar = ylkuphrtab.this;
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                PackageManager packageManager = ylkuphrtabVar.f69630iobyxmoadg.getPackageManager();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(packageManager, "context.packageManager");
                String packageName = ylkuphrtabVar.f69630iobyxmoadg.getPackageName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(packageName, "context.packageName");
                String value = hcddaimhww.iobyxmoadg(packageManager, packageName).versionName;
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value, "requireNotNull(context.p…packageName).versionName)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new lmojexxdyd(value));
                if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    objWkgbmnqykc = null;
                }
                lmojexxdyd lmojexxdydVar = (lmojexxdyd) objWkgbmnqykc;
                String str = lmojexxdydVar != null ? lmojexxdydVar.f69585iobyxmoadg : null;
                if (str != null) {
                    return new lmojexxdyd(str);
                }
                return null;
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        }
    }

    public ylkuphrtab(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f69630iobyxmoadg = context;
        this.f69631zoijcleaow = gg.draadjrbmk.zoijcleaow(new iobyxmoadg());
    }
}
