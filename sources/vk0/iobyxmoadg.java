package vk0;

import android.content.Context;
import androidx.media3.datasource.cache.nufgyqmvbu;
import androidx.media3.exoplayer.source.dxjokdxxww;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import java.io.File;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C2919iobyxmoadg f117482iobyxmoadg = new C2919iobyxmoadg(null);

    /* JADX INFO: renamed from: vk0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2919iobyxmoadg {
        public /* synthetic */ C2919iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2919iobyxmoadg() {
        }
    }

    public final oxmwwwfdhm.iobyxmoadg iobyxmoadg(Context context, p21.gxszxtbevo mediaClient) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(mediaClient, "mediaClient");
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(new File(context.getCacheDir(), "exoplayer_cache"), new c3.nufgyqmvbu(104857600L), new a3.zoijcleaow(context));
        androidx.media3.datasource.cache.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = new androidx.media3.datasource.cache.iobyxmoadg.ppxfxbqfkf().wkgbmnqykc(nufgyqmvbuVar).gxszxtbevo(new d3.iobyxmoadg.zoijcleaow(mediaClient.iobyxmoadg())).eablkybsjg(2);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "setFlags(...)");
        return new dxjokdxxww(ppxfxbqfkfVarEablkybsjg);
    }
}
