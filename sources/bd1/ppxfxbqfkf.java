package bd1;

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

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f15845iobyxmoadg;

        static {
            int[] iArr = new int[bd1.iobyxmoadg.values().length];
            try {
                iArr[bd1.iobyxmoadg.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bd1.iobyxmoadg.SWIPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bd1.iobyxmoadg.DISMISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15845iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: bd1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0275ppxfxbqfkf implements PointerInputEventHandler {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f15846eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f15847iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f15848ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ roivzttewh f15849wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ float f15850zoijcleaow;

        C0275ppxfxbqfkf(draadjrbmk draadjrbmkVar, float f13, tg.iobyxmoadg iobyxmoadgVar, roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar) {
            this.f15847iobyxmoadg = draadjrbmkVar;
            this.f15850zoijcleaow = f13;
            this.f15848ppxfxbqfkf = iobyxmoadgVar;
            this.f15849wkgbmnqykc = roivzttewhVar;
            this.f15846eablkybsjg = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(draadjrbmk draadjrbmkVar, float f13, tg.iobyxmoadg iobyxmoadgVar, roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar) {
            draadjrbmkVar.invoke(Boolean.FALSE);
            if (ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) < (-f13)) {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, -200.0f);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, bd1.iobyxmoadg.DISMISSED);
                iobyxmoadgVar.invoke();
            } else {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, 0.0f);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, bd1.iobyxmoadg.DEFAULT);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wkgbmnqykc(roivzttewh roivzttewhVar, iwxlajgraz iwxlajgrazVar, pmvmpeiblj change, float f13) {
            zdlpuopuiu.btonecajqb(change, "change");
            change.iobyxmoadg();
            if (f13 < 0.0f || ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) < 0.0f) {
                ppxfxbqfkf.nufgyqmvbu(roivzttewhVar, ppxfxbqfkf.lqeggnwhkg(roivzttewhVar) + f13);
                ppxfxbqfkf.btonecajqb(iwxlajgrazVar, bd1.iobyxmoadg.SWIPED);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, gxszxtbevo gxszxtbevoVar) {
            final draadjrbmk draadjrbmkVar = this.f15847iobyxmoadg;
            final float f13 = this.f15850zoijcleaow;
            final tg.iobyxmoadg iobyxmoadgVar = this.f15848ppxfxbqfkf;
            final roivzttewh roivzttewhVar = this.f15849wkgbmnqykc;
            final iwxlajgraz iwxlajgrazVar = this.f15846eablkybsjg;
            tg.iobyxmoadg iobyxmoadgVar2 = new tg.iobyxmoadg() { // from class: bd1.wkgbmnqykc
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ppxfxbqfkf.C0275ppxfxbqfkf.ppxfxbqfkf(draadjrbmkVar, f13, iobyxmoadgVar, roivzttewhVar, iwxlajgrazVar);
                }
            };
            final roivzttewh roivzttewhVar2 = this.f15849wkgbmnqykc;
            final iwxlajgraz iwxlajgrazVar2 = this.f15846eablkybsjg;
            Object objVdvldrhtss = jyumaefscl.vdvldrhtss(ylkuphrtabVar, null, iobyxmoadgVar2, null, new rgvfuqvkyq() { // from class: bd1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.C0275ppxfxbqfkf.wkgbmnqykc(roivzttewhVar2, iwxlajgrazVar2, (pmvmpeiblj) obj, ((Float) obj2).floatValue());
                }
            }, gxszxtbevoVar, 5, null);
            return objVdvldrhtss == mg.zoijcleaow.gxszxtbevo() ? objVdvldrhtss : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f15851iobyxmoadg;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f15852jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f15853yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f15854zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f15852jyumaefscl = draadjrbmkVar;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((ribwqtqdhb) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f15854zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) this.f15853yggfygwlhe;
                    this.f15852jyumaefscl.invoke(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                    this.f15854zdlpuopuiu = 1;
                    if (ribwqtqdhbVar.P(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f15852jyumaefscl.invoke(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(ribwqtqdhb ribwqtqdhbVar, long j13, gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f15852jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f15853yggfygwlhe = ribwqtqdhbVar;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zoijcleaow(draadjrbmk draadjrbmkVar) {
            this.f15851iobyxmoadg = draadjrbmkVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, gxszxtbevo gxszxtbevoVar) {
            Object objGtknphoqwx = nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, new iobyxmoadg(this.f15851iobyxmoadg, null), null, gxszxtbevoVar, 11, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iwxlajgraz iwxlajgrazVar, bd1.iobyxmoadg iobyxmoadgVar) {
        iwxlajgrazVar.setValue(iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog draadjrbmk(i1 i1Var, w0.wkgbmnqykc offset) {
        zdlpuopuiu.btonecajqb(offset, "$this$offset");
        return agtfadlqog.ppxfxbqfkf(agtfadlqog.wkgbmnqykc((((long) ((int) gtknphoqwx(i1Var))) & 4294967295L) | (((long) 0) << 32)));
    }

    private static final bd1.iobyxmoadg dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return (bd1.iobyxmoadg) iwxlajgrazVar.getValue();
    }

    private static final float eablkybsjg(bd1.iobyxmoadg iobyxmoadgVar, float f13) {
        int i13 = iobyxmoadg.f15845iobyxmoadg[iobyxmoadgVar.ordinal()];
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
        draadjrbmkVar.sopmlzcsov(-2054821275);
        float fLqeggnwhkg = (i14 & 4) != 0 ? nufgyqmvbu.lqeggnwhkg(40) : f13;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2054821275, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.snackbar.utils.swipeToDismiss (SwipeToDismiss.kt:26)");
        }
        draadjrbmkVar.sopmlzcsov(-1150471143);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = ezmngbhpjk.iobyxmoadg(0.0f);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        roivzttewh roivzttewhVar = (roivzttewh) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        float fI = ((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).I(fLqeggnwhkg);
        draadjrbmkVar.sopmlzcsov(-1150466780);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = c1.ppxfxbqfkf(bd1.iobyxmoadg.DEFAULT, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt2;
        draadjrbmkVar.stevsuqkhv();
        final i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg(eablkybsjg(dxjokdxxww(iwxlajgrazVar), lqeggnwhkg(roivzttewhVar)), vipkmwdibw.draadjrbmk.btonecajqb(0.5f, 200.0f, null, 4, null), 0.0f, null, null, draadjrbmkVar, 48, 28);
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        draadjrbmkVar.sopmlzcsov(-1150454723);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(i1VarEablkybsjg);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt3 = new draadjrbmk() { // from class: bd1.zoijcleaow
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
        draadjrbmkVar.sopmlzcsov(-1150452191);
        int i15 = (i13 & 112) ^ 48;
        boolean z13 = (i15 > 32 && draadjrbmkVar.ulzqkzuiru(onHold)) || (i13 & 48) == 32;
        Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt4 = new zoijcleaow(onHold);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
        }
        draadjrbmkVar.stevsuqkhv();
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf, wwaezpbzknVar, (PointerInputEventHandler) objYadqdtsiqt4);
        draadjrbmkVar.sopmlzcsov(-1150442965);
        boolean zZoijcleaow = ((i15 > 32 && draadjrbmkVar.ulzqkzuiru(onHold)) || (i13 & 48) == 32) | draadjrbmkVar.zoijcleaow(fI) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar.ulzqkzuiru(onDismiss)) || (i13 & 384) == 256);
        Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
        if (zZoijcleaow || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
            Object c0275ppxfxbqfkf = new C0275ppxfxbqfkf(onHold, fI, onDismiss, roivzttewhVar, iwxlajgrazVar);
            draadjrbmkVar.jyumaefscl(c0275ppxfxbqfkf);
            objYadqdtsiqt5 = c0275ppxfxbqfkf;
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
