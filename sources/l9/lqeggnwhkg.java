package l9;

import android.os.Handler;
import android.os.Looper;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private dxjokdxxww f61916iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f61918zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Handler f61917ppxfxbqfkf = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(lqeggnwhkg this$0, eablkybsjg[] commands) {
        wwaezpbzkn wwaezpbzknVar;
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(commands, "$commands");
        dxjokdxxww dxjokdxxwwVar = this$0.f61916iobyxmoadg;
        if (dxjokdxxwwVar == null) {
            wwaezpbzknVar = null;
        } else {
            dxjokdxxwwVar.iobyxmoadg(commands);
            wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wwaezpbzknVar == null) {
            this$0.f61918zoijcleaow.add(commands);
        }
    }

    @Override // l9.btonecajqb
    public void iobyxmoadg(dxjokdxxww navigator) {
        zdlpuopuiu.btonecajqb(navigator, "navigator");
        this.f61916iobyxmoadg = navigator;
        Iterator it = this.f61918zoijcleaow.iterator();
        while (it.hasNext()) {
            navigator.iobyxmoadg((eablkybsjg[]) it.next());
        }
        this.f61918zoijcleaow.clear();
    }

    public final void ppxfxbqfkf(final eablkybsjg[] commands) {
        zdlpuopuiu.btonecajqb(commands, "commands");
        this.f61917ppxfxbqfkf.post(new Runnable() { // from class: l9.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                lqeggnwhkg.wkgbmnqykc(this.f61915zdlpuopuiu, commands);
            }
        });
    }
}
