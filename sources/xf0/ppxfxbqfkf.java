package xf0;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.ezmngbhpjk;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.roivzttewh;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.zeieaojujs;
import gg.wwaezpbzkn;
import jztzpxfvev.jyumaefscl;
import jztzpxfvev.nuxfzjnpeb;
import jztzpxfvev.ribwqtqdhb;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import t.pmvmpeiblj;
import t.tzroggbefp;
import t.ylkuphrtab;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import w0.agtfadlqog;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122297iobyxmoadg;

        static {
            int[] iArr = new int[xf0.iobyxmoadg.values().length];
            try {
                iArr[xf0.iobyxmoadg.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xf0.iobyxmoadg.SWIPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xf0.iobyxmoadg.DISMISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122297iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: xf0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C3079ppxfxbqfkf implements PointerInputEventHandler {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f122298eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f122299iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f122300ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ roivzttewh f122301wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ float f122302zoijcleaow;

        C3079ppxfxbqfkf(draadjrbmk draadjrbmkVar, float f13, tg.iobyxmoadg iobyxmoadgVar, roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar) {
            this.f122299iobyxmoadg = draadjrbmkVar;
            this.f122302zoijcleaow = f13;
            this.f122300ppxfxbqfkf = iobyxmoadgVar;
            this.f122301wkgbmnqykc = roivzttewhVar;
            this.f122298eablkybsjg = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(draadjrbmk draadjrbmkVar, float f13, tg.iobyxmoadg iobyxmoadgVar, roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar) {
            draadjrbmkVar.invoke(Boolean.FALSE);
            if (ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) < (-f13)) {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, -200.0f);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, xf0.iobyxmoadg.DISMISSED);
                iobyxmoadgVar.invoke();
            } else {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, 0.0f);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, xf0.iobyxmoadg.DEFAULT);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wkgbmnqykc(roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar, pmvmpeiblj change, float f13) {
            zdlpuopuiu.btonecajqb(change, "change");
            change.iobyxmoadg();
            if (f13 < 0.0f || ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) < 0.0f) {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) + f13);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, xf0.iobyxmoadg.SWIPED);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, gxszxtbevo gxszxtbevoVar) {
            final draadjrbmk draadjrbmkVar = this.f122299iobyxmoadg;
            final float f13 = this.f122302zoijcleaow;
            final tg.iobyxmoadg iobyxmoadgVar = this.f122300ppxfxbqfkf;
            final roivzttewh roivzttewhVar = this.f122301wkgbmnqykc;
            final iwxlajgraz iwxlajgrazVar = this.f122298eablkybsjg;
            tg.iobyxmoadg iobyxmoadgVar2 = new tg.iobyxmoadg() { // from class: xf0.wkgbmnqykc
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ppxfxbqfkf.C3079ppxfxbqfkf.ppxfxbqfkf(draadjrbmkVar, f13, iobyxmoadgVar, roivzttewhVar, iwxlajgrazVar);
                }
            };
            final roivzttewh roivzttewhVar2 = this.f122301wkgbmnqykc;
            final iwxlajgraz iwxlajgrazVar2 = this.f122298eablkybsjg;
            Object objVdvldrhtss = jyumaefscl.vdvldrhtss(ylkuphrtabVar, null, iobyxmoadgVar2, null, new rgvfuqvkyq() { // from class: xf0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.C3079ppxfxbqfkf.wkgbmnqykc(roivzttewhVar2, iwxlajgrazVar2, (pmvmpeiblj) obj, ((Float) obj2).floatValue());
                }
            }, gxszxtbevoVar, 5, null);
            return objVdvldrhtss == mg.zoijcleaow.gxszxtbevo() ? objVdvldrhtss : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f122303iobyxmoadg;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f122304jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f122305yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f122306zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f122304jyumaefscl = draadjrbmkVar;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((ribwqtqdhb) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f122306zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) this.f122305yggfygwlhe;
                    this.f122304jyumaefscl.invoke(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                    this.f122306zdlpuopuiu = 1;
                    if (ribwqtqdhbVar.P(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f122304jyumaefscl.invoke(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(ribwqtqdhb ribwqtqdhbVar, long j13, gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f122304jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f122305yggfygwlhe = ribwqtqdhbVar;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zoijcleaow(draadjrbmk draadjrbmkVar) {
            this.f122303iobyxmoadg = draadjrbmkVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, gxszxtbevo gxszxtbevoVar) {
            Object objGtknphoqwx = nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, new iobyxmoadg(this.f122303iobyxmoadg, null), null, gxszxtbevoVar, 11, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iwxlajgraz iwxlajgrazVar, xf0.iobyxmoadg iobyxmoadgVar) {
        iwxlajgrazVar.setValue(iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog draadjrbmk(i1 i1Var, w0.wkgbmnqykc offset) {
        zdlpuopuiu.btonecajqb(offset, "$this$offset");
        return agtfadlqog.ppxfxbqfkf(agtfadlqog.wkgbmnqykc((((long) ((int) gtknphoqwx(i1Var))) & 4294967295L) | (((long) 0) << 32)));
    }

    private static final xf0.iobyxmoadg dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return (xf0.iobyxmoadg) iwxlajgrazVar.getValue();
    }

    private static final float eablkybsjg(xf0.iobyxmoadg iobyxmoadgVar, float f13) {
        int i13 = iobyxmoadg.f122297iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return 0.0f;
        }
        if (i13 == 2) {
            return f13;
        }
        if (i13 == 3) {
            return -200.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float gtknphoqwx(i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    public static final androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc swipeToDismiss, draadjrbmk onHold, tg.iobyxmoadg onDismiss, float f13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        zdlpuopuiu.btonecajqb(swipeToDismiss, "$this$swipeToDismiss");
        zdlpuopuiu.btonecajqb(onHold, "onHold");
        zdlpuopuiu.btonecajqb(onDismiss, "onDismiss");
        draadjrbmkVar.sopmlzcsov(-1037420804);
        float fLqeggnwhkg = (i14 & 4) != 0 ? nufgyqmvbu.lqeggnwhkg(40) : f13;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1037420804, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.snackbar.utils.swipeToDismiss (SwipeToDismiss.kt:26)");
        }
        draadjrbmkVar.sopmlzcsov(-1984039466);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = ezmngbhpjk.iobyxmoadg(0.0f);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        roivzttewh roivzttewhVar = (roivzttewh) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        float fI = ((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).I(fLqeggnwhkg);
        draadjrbmkVar.sopmlzcsov(-1984035103);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = c1.ppxfxbqfkf(xf0.iobyxmoadg.DEFAULT, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt2;
        draadjrbmkVar.stevsuqkhv();
        final i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg(eablkybsjg(dxjokdxxww(iwxlajgrazVar), lqeggnwhkg(roivzttewhVar)), vipkmwdibw.draadjrbmk.btonecajqb(0.5f, 200.0f, null, 4, null), 0.0f, null, null, draadjrbmkVar, 48, 28);
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        draadjrbmkVar.sopmlzcsov(-1984023046);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(i1VarEablkybsjg);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt3 = new draadjrbmk() { // from class: xf0.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ppxfxbqfkf.draadjrbmk(i1VarEablkybsjg, (w0.wkgbmnqykc) obj);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        draadjrbmkVar.stevsuqkhv();
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = androidx.compose.foundation.layout.zdlpuopuiu.ppxfxbqfkf(iobyxmoadgVar2, (draadjrbmk) objYadqdtsiqt3);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        draadjrbmkVar.sopmlzcsov(-1984020514);
        int i15 = (i13 & 112) ^ 48;
        boolean z13 = (i15 > 32 && draadjrbmkVar.ulzqkzuiru(onHold)) || (i13 & 48) == 32;
        Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt4 = new zoijcleaow(onHold);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
        }
        draadjrbmkVar.stevsuqkhv();
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf, wwaezpbzknVar, (PointerInputEventHandler) objYadqdtsiqt4);
        draadjrbmkVar.sopmlzcsov(-1984011288);
        boolean zZoijcleaow = ((i15 > 32 && draadjrbmkVar.ulzqkzuiru(onHold)) || (i13 & 48) == 32) | draadjrbmkVar.zoijcleaow(fI) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar.ulzqkzuiru(onDismiss)) || (i13 & 384) == 256);
        Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
        if (zZoijcleaow || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
            Object c3079ppxfxbqfkf = new C3079ppxfxbqfkf(onHold, fI, onDismiss, roivzttewhVar, iwxlajgrazVar);
            draadjrbmkVar.jyumaefscl(c3079ppxfxbqfkf);
            objYadqdtsiqt5 = c3079ppxfxbqfkf;
        }
        draadjrbmkVar.stevsuqkhv();
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = swipeToDismiss.eablkybsjg(tzroggbefp.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf2, wwaezpbzknVar, (PointerInputEventHandler) objYadqdtsiqt5));
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return wkgbmnqykcVarEablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lqeggnwhkg(roivzttewh roivzttewhVar) {
        return roivzttewhVar.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(roivzttewh roivzttewhVar, float f13) {
        roivzttewhVar.pkzmftpjix(f13);
    }
}
