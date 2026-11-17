package com.bumptech.glide;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(Runnable runnable) {
        runnable.run();
    }

    public static final agtfadlqog wkgbmnqykc(wflxmlrfwp wflxmlrfwpVar) {
        zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        return wflxmlrfwpVar.auzgnhcxok();
    }

    public static final void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, d9.dxjokdxxww targetAndRequestListener) {
        zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        zdlpuopuiu.btonecajqb(targetAndRequestListener, "targetAndRequestListener");
        wflxmlrfwpVar.lxfrhoxuzk(targetAndRequestListener, (c9.eablkybsjg) targetAndRequestListener, new Executor() { // from class: com.bumptech.glide.gxszxtbevo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                lqeggnwhkg.ppxfxbqfkf(runnable);
            }
        });
    }
}
