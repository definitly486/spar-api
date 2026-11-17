package s8;

import android.content.Context;
import android.net.Uri;
import r8.agtfadlqog;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f105695iobyxmoadg;

    public static class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f105696iobyxmoadg;

        public iobyxmoadg(Context context) {
            this.f105696iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new zoijcleaow(this.f105696iobyxmoadg);
        }
    }

    public zoijcleaow(Context context) {
        this.f105695iobyxmoadg = context.getApplicationContext();
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        if (m8.zoijcleaow.eablkybsjg(i13, i14)) {
            return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), m8.ppxfxbqfkf.gxszxtbevo(this.f105695iobyxmoadg, uri));
        }
        return null;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return m8.zoijcleaow.zoijcleaow(uri);
    }
}
