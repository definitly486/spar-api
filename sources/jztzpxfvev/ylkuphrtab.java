package jztzpxfvev;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final tg.vdvldrhtss f53087iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final tg.vdvldrhtss f53088zoijcleaow = new zoijcleaow(null);

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53089zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((pj.cllcsxoeiz) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53089zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object ojitshcjhn(pj.cllcsxoeiz cllcsxoeizVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(gxszxtbevoVar).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53090zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((pj.cllcsxoeiz) obj, ((Number) obj2).floatValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53090zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object ojitshcjhn(pj.cllcsxoeiz cllcsxoeizVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(gxszxtbevoVar).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long agtfadlqog(long j13) {
        return w0.lereixgezr.iobyxmoadg(Float.isNaN(w0.esjtqupxsv.nufgyqmvbu(j13)) ? 0.0f : w0.esjtqupxsv.nufgyqmvbu(j13), Float.isNaN(w0.esjtqupxsv.dxjokdxxww(j13)) ? 0.0f : w0.esjtqupxsv.dxjokdxxww(j13));
    }

    public static final jpowsppfya btonecajqb(tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-183245213, i13, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:130)");
        }
        final i1 i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar, draadjrbmkVar2, i13 & 14);
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = zoijcleaow(new tg.draadjrbmk() { // from class: jztzpxfvev.wwaezpbzkn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ylkuphrtab.gtknphoqwx(i1VarAgtfadlqog, ((Float) obj).floatValue());
                }
            });
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return jpowsppfyaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float draadjrbmk(long j13, jlmebxxoox jlmebxxooxVar) {
        return Float.intBitsToFloat((int) (jlmebxxooxVar == jlmebxxoox.Vertical ? j13 & 4294967295L : j13 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(i1 i1Var, float f13) {
        ((tg.draadjrbmk) i1Var.getValue()).invoke(Float.valueOf(f13));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, jpowsppfya jpowsppfyaVar, jlmebxxoox jlmebxxooxVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z14, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, boolean z15) {
        return wkgbmnqykcVar.eablkybsjg(new DraggableElement(jpowsppfyaVar, jlmebxxooxVar, z13, draadjrbmkVar, z14, vdvldrhtssVar, vdvldrhtssVar2, z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float wflxmlrfwp(long j13, jlmebxxoox jlmebxxooxVar) {
        return jlmebxxooxVar == jlmebxxoox.Vertical ? w0.esjtqupxsv.dxjokdxxww(j13) : w0.esjtqupxsv.nufgyqmvbu(j13);
    }

    public static final jpowsppfya zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
        return new gtknphoqwx(draadjrbmkVar);
    }
}
