package x6;

import android.content.Context;
import bl.esjtqupxsv;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.jyumaefscl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn {

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f121226zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Context context) {
            super(0);
            this.f121226zdlpuopuiu = context;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return i7.gtknphoqwx.wflxmlrfwp(this.f121226zdlpuopuiu);
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f121227zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Context context) {
            super(0);
            this.f121227zdlpuopuiu = context;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return i7.gtknphoqwx.wflxmlrfwp(this.f121227zdlpuopuiu);
        }
    }

    public static final agtfadlqog iobyxmoadg(bl.eablkybsjg eablkybsjgVar, Context context) {
        return new vdvldrhtss(eablkybsjgVar, new iobyxmoadg(context), null);
    }

    public static final agtfadlqog ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, bl.dxjokdxxww dxjokdxxwwVar, String str, Closeable closeable) {
        return new wflxmlrfwp(esjtqupxsvVar, dxjokdxxwwVar, str, closeable, null);
    }

    public static /* synthetic */ agtfadlqog wkgbmnqykc(esjtqupxsv esjtqupxsvVar, bl.dxjokdxxww dxjokdxxwwVar, String str, Closeable closeable, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            dxjokdxxwwVar = bl.dxjokdxxww.f16668zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            closeable = null;
        }
        return ppxfxbqfkf(esjtqupxsvVar, dxjokdxxwwVar, str, closeable);
    }

    public static final agtfadlqog zoijcleaow(bl.eablkybsjg eablkybsjgVar, Context context, agtfadlqog.iobyxmoadg iobyxmoadgVar) {
        return new vdvldrhtss(eablkybsjgVar, new zoijcleaow(context), iobyxmoadgVar);
    }
}
