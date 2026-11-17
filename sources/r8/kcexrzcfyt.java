package r8;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class kcexrzcfyt implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f82070iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Resources f82071zoijcleaow;

    public static final class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Resources f82072iobyxmoadg;

        public iobyxmoadg(Resources resources) {
            this.f82072iobyxmoadg = resources;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new kcexrzcfyt(this.f82072iobyxmoadg, oxmwwwfdhmVar.wkgbmnqykc(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class ppxfxbqfkf implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Resources f82073iobyxmoadg;

        public ppxfxbqfkf(Resources resources) {
            this.f82073iobyxmoadg = resources;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new kcexrzcfyt(this.f82073iobyxmoadg, iwizpuwonk.ppxfxbqfkf());
        }
    }

    public static class zoijcleaow implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Resources f82074iobyxmoadg;

        public zoijcleaow(Resources resources) {
            this.f82074iobyxmoadg = resources;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new kcexrzcfyt(this.f82074iobyxmoadg, oxmwwwfdhmVar.wkgbmnqykc(Uri.class, InputStream.class));
        }
    }

    public kcexrzcfyt(Resources resources, agtfadlqog agtfadlqogVar) {
        this.f82071zoijcleaow = resources;
        this.f82070iobyxmoadg = agtfadlqogVar;
    }

    private Uri wkgbmnqykc(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f82071zoijcleaow.getResourcePackageName(num.intValue()) + '/' + this.f82071zoijcleaow.getResourceTypeName(num.intValue()) + '/' + this.f82071zoijcleaow.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e13) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e13);
            return null;
        }
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Integer num) {
        return true;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Integer num, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        Uri uriWkgbmnqykc = wkgbmnqykc(num);
        if (uriWkgbmnqykc == null) {
            return null;
        }
        return this.f82070iobyxmoadg.zoijcleaow(uriWkgbmnqykc, i13, i14, lqeggnwhkgVar);
    }
}
