package s8;

import java.io.InputStream;
import java.net.URL;
import r8.agtfadlqog;
import r8.nufgyqmvbu;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f105675iobyxmoadg;

    public static class iobyxmoadg implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new lqeggnwhkg(oxmwwwfdhmVar.wkgbmnqykc(nufgyqmvbu.class, InputStream.class));
        }
    }

    public lqeggnwhkg(agtfadlqog agtfadlqogVar) {
        this.f105675iobyxmoadg = agtfadlqogVar;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(URL url, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f105675iobyxmoadg.zoijcleaow(new nufgyqmvbu(url), i13, i14, lqeggnwhkgVar);
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(URL url) {
        return true;
    }
}
