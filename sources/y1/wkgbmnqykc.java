package y1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f123511iobyxmoadg;

    private static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final InputContentInfo f123512iobyxmoadg;

        iobyxmoadg(Object obj) {
            this.f123512iobyxmoadg = (InputContentInfo) obj;
        }

        @Override // y1.wkgbmnqykc.zoijcleaow
        public ClipDescription getDescription() {
            return this.f123512iobyxmoadg.getDescription();
        }

        @Override // y1.wkgbmnqykc.zoijcleaow
        public Object iobyxmoadg() {
            return this.f123512iobyxmoadg;
        }

        @Override // y1.wkgbmnqykc.zoijcleaow
        public void ppxfxbqfkf() {
            this.f123512iobyxmoadg.requestPermission();
        }

        @Override // y1.wkgbmnqykc.zoijcleaow
        public Uri wkgbmnqykc() {
            return this.f123512iobyxmoadg.getLinkUri();
        }

        @Override // y1.wkgbmnqykc.zoijcleaow
        public Uri zoijcleaow() {
            return this.f123512iobyxmoadg.getContentUri();
        }
    }

    private interface zoijcleaow {
        ClipDescription getDescription();

        Object iobyxmoadg();

        void ppxfxbqfkf();

        Uri wkgbmnqykc();

        Uri zoijcleaow();
    }

    private wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        this.f123511iobyxmoadg = zoijcleaowVar;
    }

    public static wkgbmnqykc gxszxtbevo(Object obj) {
        if (obj == null) {
            return null;
        }
        return new wkgbmnqykc(new iobyxmoadg(obj));
    }

    public Object eablkybsjg() {
        return this.f123511iobyxmoadg.iobyxmoadg();
    }

    public Uri iobyxmoadg() {
        return this.f123511iobyxmoadg.zoijcleaow();
    }

    public Uri ppxfxbqfkf() {
        return this.f123511iobyxmoadg.wkgbmnqykc();
    }

    public void wkgbmnqykc() {
        this.f123511iobyxmoadg.ppxfxbqfkf();
    }

    public ClipDescription zoijcleaow() {
        return this.f123511iobyxmoadg.getDescription();
    }
}
