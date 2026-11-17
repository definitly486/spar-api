package q6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class hcddaimhww implements g6.gtknphoqwx {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f77930wkgbmnqykc = g6.yggfygwlhe.dxjokdxxww("WMFgUpdater");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final r6.zoijcleaow f77931iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final p6.jyumaefscl f77932ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final o6.iobyxmoadg f77933zoijcleaow;

    public hcddaimhww(WorkDatabase workDatabase, o6.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar) {
        this.f77933zoijcleaow = iobyxmoadgVar;
        this.f77931iobyxmoadg = zoijcleaowVar;
        this.f77932ppxfxbqfkf = workDatabase.ulzqkzuiru();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void ppxfxbqfkf(UUID uuid, g6.btonecajqb btonecajqbVar, Context context) {
        String string = uuid.toString();
        p6.yggfygwlhe yggfygwlheVarDxjokdxxww = this.f77932ppxfxbqfkf.dxjokdxxww(string);
        if (yggfygwlheVarDxjokdxxww == null || yggfygwlheVarDxjokdxxww.f75811zoijcleaow.wkgbmnqykc()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.f77933zoijcleaow.iobyxmoadg(string, btonecajqbVar);
        context.startService(androidx.work.impl.foreground.iobyxmoadg.eablkybsjg(context, p6.lereixgezr.iobyxmoadg(yggfygwlheVarDxjokdxxww), btonecajqbVar));
        return null;
    }

    @Override // g6.gtknphoqwx
    public com.google.common.util.concurrent.wkgbmnqykc iobyxmoadg(final Context context, final UUID uuid, final g6.btonecajqb btonecajqbVar) {
        return g6.zdlpuopuiu.gxszxtbevo(this.f77931iobyxmoadg.ppxfxbqfkf(), "setForegroundAsync", new tg.iobyxmoadg() { // from class: q6.pkzmftpjix
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return this.f77954zdlpuopuiu.ppxfxbqfkf(uuid, btonecajqbVar, context);
            }
        });
    }
}
