package ru.myspar.start_activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.activity.wflxmlrfwp;
import androidx.activity.zynmafqrjb;
import c60.zoijcleaow;
import e60.eablkybsjg;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.main_activity.impl.MainActivity;
import ru.myspar.start_activity.StartActivity;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/myspar/start_activity/StartActivity;", "Landroidx/appcompat/app/wkgbmnqykc;", "<init>", "()V", "Lgg/wwaezpbzkn;", "ylkuphrtab", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "cqumvgiudr", "Lgg/gtknphoqwx;", "lmojexxdyd", "()Landroid/content/SharedPreferences;", "preferences", "app_rustoreGMSProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StartActivity extends ru.myspar.start_activity.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx preferences = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q72.iobyxmoadg
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return StartActivity.wwaezpbzkn(this.f78185zdlpuopuiu);
        }
    });

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f104283iobyxmoadg;

        static {
            int[] iArr = new int[j40.iobyxmoadg.values().length];
            try {
                iArr[j40.iobyxmoadg.BITRIX_OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j40.iobyxmoadg.BITRIX_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104283iobyxmoadg = iArr;
        }
    }

    private final SharedPreferences lmojexxdyd() {
        return (SharedPreferences) this.preferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences wwaezpbzkn(StartActivity startActivity) {
        return startActivity.getSharedPreferences("network_preferences", 0);
    }

    private final void ylkuphrtab() {
        wflxmlrfwp.zoijcleaow(this, null, zoijcleaow.eablkybsjg(this) ? zynmafqrjb.f2374eablkybsjg.ppxfxbqfkf(0) : zynmafqrjb.f2374eablkybsjg.wkgbmnqykc(0, 0), 1, null);
    }

    @Override // ru.myspar.start_activity.iobyxmoadg, androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Class cls;
        eablkybsjg eablkybsjgVar = eablkybsjg.f30596iobyxmoadg;
        eablkybsjgVar.ppxfxbqfkf(this);
        super.onCreate(savedInstanceState);
        f30.zoijcleaow.iobyxmoadg iobyxmoadgVar = f30.zoijcleaow.f32718ppxfxbqfkf;
        Intent intent = getIntent();
        zdlpuopuiu.dxjokdxxww(intent, "getIntent(...)");
        iobyxmoadgVar.iobyxmoadg(intent);
        eablkybsjg.eablkybsjg(eablkybsjgVar, this, false, 2, null);
        ylkuphrtab();
        int i13 = iobyxmoadg.f104283iobyxmoadg[j40.iobyxmoadg.f50684yggfygwlhe.iobyxmoadg(lmojexxdyd().getString("bitrix_version", null)).ordinal()];
        if (i13 == 1) {
            cls = MainActivity.class;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cls = ru.myspar.proloyalty.main_activity.impl.MainActivity.class;
        }
        Intent intent2 = new Intent(this, (Class<?>) cls);
        intent2.setFlags(536870912);
        intent2.putExtras(getIntent());
        intent2.setData(getIntent().getData());
        startActivity(intent2);
        finish();
    }
}
