package pm;

import android.content.Context;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import java.io.File;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.iwizpuwonk;
import lk.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f76986iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public final iwizpuwonk iobyxmoadg() {
        Object objZoijcleaow = mf.iobyxmoadg.f66906iobyxmoadg.zoijcleaow();
        if (objZoijcleaow instanceof iwizpuwonk) {
            return (iwizpuwonk) objZoijcleaow;
        }
        return null;
    }

    public final oxmwwwfdhm.iobyxmoadg zoijcleaow(Context context, lereixgezr okHttpClient) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        androidx.media3.datasource.cache.nufgyqmvbu nufgyqmvbuVar = new androidx.media3.datasource.cache.nufgyqmvbu(new File(context.getCacheDir(), "exoplayer_cache"), new c3.nufgyqmvbu(104857600L), new a3.zoijcleaow(context));
        androidx.media3.datasource.cache.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = new androidx.media3.datasource.cache.iobyxmoadg.ppxfxbqfkf().wkgbmnqykc(nufgyqmvbuVar).gxszxtbevo(new d3.iobyxmoadg.zoijcleaow(okHttpClient)).eablkybsjg(2);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "setFlags(...)");
        return new androidx.media3.exoplayer.source.dxjokdxxww(ppxfxbqfkfVarEablkybsjg);
    }
}
