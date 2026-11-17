package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ScheduledExecutorService f24788btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final rgvfuqvkyq f24789dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final uc.eablkybsjg f24790eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gxszxtbevo f24791gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f24792iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Context f24793lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f24794nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f24795ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24796wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zdlpuopuiu f24797zoijcleaow;

    public class iobyxmoadg implements pd.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pd.ppxfxbqfkf f24798iobyxmoadg;

        public iobyxmoadg(pd.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f24798iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // pd.wkgbmnqykc
        public void remove() {
            vdvldrhtss.this.wkgbmnqykc(this.f24798iobyxmoadg);
        }
    }

    public vdvldrhtss(com.google.firebase.gxszxtbevo gxszxtbevoVar, uc.eablkybsjg eablkybsjgVar, wflxmlrfwp wflxmlrfwpVar, gxszxtbevo gxszxtbevoVar2, Context context, String str, rgvfuqvkyq rgvfuqvkyqVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f24792iobyxmoadg = linkedHashSet;
        this.f24797zoijcleaow = new zdlpuopuiu(gxszxtbevoVar, eablkybsjgVar, wflxmlrfwpVar, gxszxtbevoVar2, context, str, linkedHashSet, rgvfuqvkyqVar, scheduledExecutorService);
        this.f24796wkgbmnqykc = gxszxtbevoVar;
        this.f24795ppxfxbqfkf = wflxmlrfwpVar;
        this.f24790eablkybsjg = eablkybsjgVar;
        this.f24791gxszxtbevo = gxszxtbevoVar2;
        this.f24793lqeggnwhkg = context;
        this.f24794nufgyqmvbu = str;
        this.f24789dxjokdxxww = rgvfuqvkyqVar;
        this.f24788btonecajqb = scheduledExecutorService;
    }

    private synchronized void ppxfxbqfkf() {
        if (!this.f24792iobyxmoadg.isEmpty()) {
            this.f24797zoijcleaow.istkbnxepw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void wkgbmnqykc(pd.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f24792iobyxmoadg.remove(ppxfxbqfkfVar);
    }

    public synchronized void eablkybsjg(boolean z13) {
        this.f24797zoijcleaow.lereixgezr(z13);
        if (!z13) {
            ppxfxbqfkf();
        }
    }

    public synchronized pd.wkgbmnqykc zoijcleaow(pd.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f24792iobyxmoadg.add(ppxfxbqfkfVar);
        ppxfxbqfkf();
        return new iobyxmoadg(ppxfxbqfkfVar);
    }
}
