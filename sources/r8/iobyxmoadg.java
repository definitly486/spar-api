package r8;

import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements agtfadlqog {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f82061ppxfxbqfkf = 22;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AssetManager f82062iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final InterfaceC1831iobyxmoadg f82063zoijcleaow;

    /* JADX INFO: renamed from: r8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1831iobyxmoadg {
        com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(AssetManager assetManager, String str);
    }

    public static class ppxfxbqfkf implements ojitshcjhn, InterfaceC1831iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AssetManager f82064iobyxmoadg;

        public ppxfxbqfkf(AssetManager assetManager) {
            this.f82064iobyxmoadg = assetManager;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.iobyxmoadg.InterfaceC1831iobyxmoadg
        public com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.wflxmlrfwp(assetManager, str);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new iobyxmoadg(this.f82064iobyxmoadg, this);
        }
    }

    public static class zoijcleaow implements ojitshcjhn, InterfaceC1831iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AssetManager f82065iobyxmoadg;

        public zoijcleaow(AssetManager assetManager) {
            this.f82065iobyxmoadg = assetManager;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.iobyxmoadg.InterfaceC1831iobyxmoadg
        public com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.nufgyqmvbu(assetManager, str);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new iobyxmoadg(this.f82065iobyxmoadg, this);
        }
    }

    public iobyxmoadg(AssetManager assetManager, InterfaceC1831iobyxmoadg interfaceC1831iobyxmoadg) {
        this.f82062iobyxmoadg = assetManager;
        this.f82063zoijcleaow = interfaceC1831iobyxmoadg;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), this.f82063zoijcleaow.iobyxmoadg(this.f82062iobyxmoadg, uri.toString().substring(f82061ppxfxbqfkf)));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
