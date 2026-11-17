package s8;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.iozdgvuglv;
import r8.agtfadlqog;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f105676iobyxmoadg;

    public static class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f105677iobyxmoadg;

        public iobyxmoadg(Context context) {
            this.f105677iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new ppxfxbqfkf(this.f105677iobyxmoadg);
        }
    }

    public ppxfxbqfkf(Context context) {
        this.f105676iobyxmoadg = context.getApplicationContext();
    }

    private boolean eablkybsjg(l8.lqeggnwhkg lqeggnwhkgVar) {
        Long l13 = (Long) lqeggnwhkgVar.ppxfxbqfkf(iozdgvuglv.f21069wkgbmnqykc);
        return l13 != null && l13.longValue() == -1;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        if (m8.zoijcleaow.eablkybsjg(i13, i14) && eablkybsjg(lqeggnwhkgVar)) {
            return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), m8.ppxfxbqfkf.lqeggnwhkg(this.f105676iobyxmoadg, uri));
        }
        return null;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return m8.zoijcleaow.wkgbmnqykc(uri);
    }
}
