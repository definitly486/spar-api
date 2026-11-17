package p0;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import j0.l;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ribwqtqdhb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(EditorInfo editorInfo) {
        if (i2.iobyxmoadg.wkgbmnqykc()) {
            i2.iobyxmoadg.iobyxmoadg();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: p0.jlmebxxoox
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j13) {
                ribwqtqdhb.gxszxtbevo(runnable, j13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(Runnable runnable, long j13) {
        runnable.run();
    }

    private static final boolean lqeggnwhkg(int i13, int i14) {
        return (i13 & i14) == i14;
    }

    public static final void nufgyqmvbu(EditorInfo editorInfo, zdlpuopuiu zdlpuopuiuVar, tzroggbefp tzroggbefpVar) {
        int iEablkybsjg = zdlpuopuiuVar.eablkybsjg();
        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f75246zoijcleaow;
        int i13 = 6;
        if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.iobyxmoadg())) {
            if (!zdlpuopuiuVar.nufgyqmvbu()) {
                i13 = 0;
            }
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.eablkybsjg())) {
            i13 = 1;
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.ppxfxbqfkf())) {
            i13 = 2;
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.wkgbmnqykc())) {
            i13 = 5;
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.gxszxtbevo())) {
            i13 = 7;
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.lqeggnwhkg())) {
            i13 = 3;
        } else if (kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.nufgyqmvbu())) {
            i13 = 4;
        } else if (!kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.zoijcleaow())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i13;
        zdlpuopuiuVar.lqeggnwhkg();
        int iGxszxtbevo = zdlpuopuiuVar.gxszxtbevo();
        lereixgezr.iobyxmoadg iobyxmoadgVar2 = lereixgezr.f75258zoijcleaow;
        if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.nufgyqmvbu())) {
            editorInfo.inputType = 1;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.iobyxmoadg())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.wkgbmnqykc())) {
            editorInfo.inputType = 2;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.lqeggnwhkg())) {
            editorInfo.inputType = 3;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.btonecajqb())) {
            editorInfo.inputType = 17;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.ppxfxbqfkf())) {
            editorInfo.inputType = 33;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.gxszxtbevo())) {
            editorInfo.inputType = 129;
        } else if (lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.eablkybsjg())) {
            editorInfo.inputType = 18;
        } else {
            if (!lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.zoijcleaow())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!zdlpuopuiuVar.nufgyqmvbu() && lqeggnwhkg(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (kcexrzcfyt.wflxmlrfwp(zdlpuopuiuVar.eablkybsjg(), iobyxmoadgVar.iobyxmoadg())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (lqeggnwhkg(editorInfo.inputType, 1)) {
            int iPpxfxbqfkf = zdlpuopuiuVar.ppxfxbqfkf();
            esjtqupxsv.iobyxmoadg iobyxmoadgVar3 = esjtqupxsv.f75216zoijcleaow;
            if (esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.iobyxmoadg())) {
                editorInfo.inputType |= 4096;
            } else if (esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.eablkybsjg())) {
                editorInfo.inputType |= 8192;
            } else if (esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.ppxfxbqfkf())) {
                editorInfo.inputType |= 16384;
            }
            if (zdlpuopuiuVar.zoijcleaow()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = l.agtfadlqog(tzroggbefpVar.gtknphoqwx());
        editorInfo.initialSelEnd = l.dxjokdxxww(tzroggbefpVar.gtknphoqwx());
        y1.iobyxmoadg.eablkybsjg(editorInfo, tzroggbefpVar.draadjrbmk());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor wkgbmnqykc(final Choreographer choreographer) {
        return new Executor() { // from class: p0.crxdokpmqz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ribwqtqdhb.eablkybsjg(choreographer, runnable);
            }
        };
    }
}
