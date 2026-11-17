package r8;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class jyumaefscl implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f82069iobyxmoadg;

    public static final class iobyxmoadg implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new jyumaefscl(oxmwwwfdhmVar.wkgbmnqykc(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class ppxfxbqfkf implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new jyumaefscl(oxmwwwfdhmVar.wkgbmnqykc(Uri.class, InputStream.class));
        }
    }

    public static class zoijcleaow implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new jyumaefscl(oxmwwwfdhmVar.wkgbmnqykc(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public jyumaefscl(agtfadlqog agtfadlqogVar) {
        this.f82069iobyxmoadg = agtfadlqogVar;
    }

    private static Uri eablkybsjg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return gxszxtbevo(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? gxszxtbevo(str) : uri;
    }

    private static Uri gxszxtbevo(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(String str, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        Uri uriEablkybsjg = eablkybsjg(str);
        if (uriEablkybsjg == null || !this.f82069iobyxmoadg.iobyxmoadg(uriEablkybsjg)) {
            return null;
        }
        return this.f82069iobyxmoadg.zoijcleaow(uriEablkybsjg, i13, i14, lqeggnwhkgVar);
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(String str) {
        return true;
    }
}
