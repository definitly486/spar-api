package xb;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f121955iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow f121956zoijcleaow = null;

    private class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121957iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f121959zoijcleaow;

        private zoijcleaow() {
            int iRgvfuqvkyq = ac.btonecajqb.rgvfuqvkyq(gxszxtbevo.this.f121955iobyxmoadg, "com.google.firebase.crashlytics.unity_version", "string");
            if (iRgvfuqvkyq == 0) {
                if (!gxszxtbevo.this.ppxfxbqfkf("flutter_assets/NOTICES.Z")) {
                    this.f121957iobyxmoadg = null;
                    this.f121959zoijcleaow = null;
                    return;
                } else {
                    this.f121957iobyxmoadg = "Flutter";
                    this.f121959zoijcleaow = null;
                    lqeggnwhkg.gxszxtbevo().dxjokdxxww("Development platform is: Flutter");
                    return;
                }
            }
            this.f121957iobyxmoadg = "Unity";
            String string = gxszxtbevo.this.f121955iobyxmoadg.getResources().getString(iRgvfuqvkyq);
            this.f121959zoijcleaow = string;
            lqeggnwhkg.gxszxtbevo().dxjokdxxww("Unity Editor version is: " + string);
        }
    }

    public gxszxtbevo(Context context) {
        this.f121955iobyxmoadg = context;
    }

    private zoijcleaow gxszxtbevo() {
        if (this.f121956zoijcleaow == null) {
            this.f121956zoijcleaow = new zoijcleaow();
        }
        return this.f121956zoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ppxfxbqfkf(String str) {
        if (this.f121955iobyxmoadg.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f121955iobyxmoadg.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String eablkybsjg() {
        return gxszxtbevo().f121959zoijcleaow;
    }

    public String wkgbmnqykc() {
        return gxszxtbevo().f121957iobyxmoadg;
    }
}
