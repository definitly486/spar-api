package r8;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class cqumvgiudr implements agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f82023zoijcleaow = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f82024iobyxmoadg;

    public static final class iobyxmoadg implements ojitshcjhn, ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f82025iobyxmoadg;

        public iobyxmoadg(ContentResolver contentResolver) {
            this.f82025iobyxmoadg = contentResolver;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.cqumvgiudr.ppxfxbqfkf
        public com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(Uri uri) {
            return new com.bumptech.glide.load.data.iobyxmoadg(this.f82025iobyxmoadg, uri);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new cqumvgiudr(this);
        }
    }

    public interface ppxfxbqfkf {
        com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(Uri uri);
    }

    public static class wkgbmnqykc implements ojitshcjhn, ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f82026iobyxmoadg;

        public wkgbmnqykc(ContentResolver contentResolver) {
            this.f82026iobyxmoadg = contentResolver;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.cqumvgiudr.ppxfxbqfkf
        public com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(Uri uri) {
            return new com.bumptech.glide.load.data.agtfadlqog(this.f82026iobyxmoadg, uri);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new cqumvgiudr(this);
        }
    }

    public static class zoijcleaow implements ojitshcjhn, ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f82027iobyxmoadg;

        public zoijcleaow(ContentResolver contentResolver) {
            this.f82027iobyxmoadg = contentResolver;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.cqumvgiudr.ppxfxbqfkf
        public com.bumptech.glide.load.data.wkgbmnqykc iobyxmoadg(Uri uri) {
            return new com.bumptech.glide.load.data.dxjokdxxww(this.f82027iobyxmoadg, uri);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new cqumvgiudr(this);
        }
    }

    public cqumvgiudr(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f82024iobyxmoadg = ppxfxbqfkfVar;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), this.f82024iobyxmoadg.iobyxmoadg(uri));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return f82023zoijcleaow.contains(uri.getScheme());
    }
}
