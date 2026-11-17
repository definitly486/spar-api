package q6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class hkdspvbjdz implements g6.iozdgvuglv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final String f77934ppxfxbqfkf = g6.yggfygwlhe.dxjokdxxww("WorkProgressUpdater");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final WorkDatabase f77935iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final r6.zoijcleaow f77936zoijcleaow;

    public hkdspvbjdz(WorkDatabase workDatabase, r6.zoijcleaow zoijcleaowVar) {
        this.f77935iobyxmoadg = workDatabase;
        this.f77936zoijcleaow = zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void ppxfxbqfkf(UUID uuid, androidx.work.zoijcleaow zoijcleaowVar) {
        String string = uuid.toString();
        g6.yggfygwlhe yggfygwlheVarEablkybsjg = g6.yggfygwlhe.eablkybsjg();
        String str = f77934ppxfxbqfkf;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Updating progress for " + uuid + " (" + zoijcleaowVar + ")");
        this.f77935iobyxmoadg.ojitshcjhn();
        try {
            p6.yggfygwlhe yggfygwlheVarDxjokdxxww = this.f77935iobyxmoadg.ulzqkzuiru().dxjokdxxww(string);
            if (yggfygwlheVarDxjokdxxww == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (yggfygwlheVarDxjokdxxww.f75811zoijcleaow == g6.hkdspvbjdz.ppxfxbqfkf.RUNNING) {
                this.f77935iobyxmoadg.ntlheqmsrt().zoijcleaow(new p6.vdvldrhtss(string, zoijcleaowVar));
            } else {
                g6.yggfygwlhe.eablkybsjg().gtknphoqwx(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            this.f77935iobyxmoadg.dsvhmnatus();
            this.f77935iobyxmoadg.kcexrzcfyt();
            return null;
        } catch (Throwable th2) {
            try {
                g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(f77934ppxfxbqfkf, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                this.f77935iobyxmoadg.kcexrzcfyt();
                throw th3;
            }
        }
    }

    @Override // g6.iozdgvuglv
    public com.google.common.util.concurrent.wkgbmnqykc iobyxmoadg(Context context, final UUID uuid, final androidx.work.zoijcleaow zoijcleaowVar) {
        return g6.zdlpuopuiu.gxszxtbevo(this.f77936zoijcleaow.ppxfxbqfkf(), "updateProgress", new tg.iobyxmoadg() { // from class: q6.jpowsppfya
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return this.f77945zdlpuopuiu.ppxfxbqfkf(uuid, zoijcleaowVar);
            }
        });
    }
}
