package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.v0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import g.lqeggnwhkg;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import roivzttewh.btonecajqb;
import roivzttewh.dxjokdxxww;
import t.tzroggbefp;
import t.ylkuphrtab;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import z.jyumaefscl;
import z.nufgyqmvbu;
import z.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends wflxmlrfwp implements nufgyqmvbu, jyumaefscl {

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private static final C0094ppxfxbqfkf f5351hkdspvbjdz = new C0094ppxfxbqfkf(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private draadjrbmk f5352hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final iwxlajgraz f5353jpowsppfya = v0.lqeggnwhkg(null, v0.dxjokdxxww());

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C0093iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            C0093iobyxmoadg(Object obj) {
                super(1, obj, ppxfxbqfkf.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((g.eablkybsjg) obj).zdlpuopuiu());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(long j13) {
                ((ppxfxbqfkf) this.receiver).S0(j13);
            }
        }

        iobyxmoadg() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objPpxfxbqfkf = zeieaojujs.iobyxmoadg.ppxfxbqfkf(ylkuphrtabVar, new C0093iobyxmoadg(ppxfxbqfkf.this), gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C0094ppxfxbqfkf {
        public /* synthetic */ C0094ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0094ppxfxbqfkf() {
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f5355iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f5356jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5358zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(btonecajqb btonecajqbVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5356jyumaefscl = btonecajqbVar;
            this.f5355iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new wkgbmnqykc(this.f5356jyumaefscl, this.f5355iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5358zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            draadjrbmk draadjrbmkVar = ppxfxbqfkf.this.f5352hcddaimhww;
            if (draadjrbmkVar != null) {
                this.f5358zdlpuopuiu = 1;
                if (draadjrbmkVar.invoke(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            btonecajqb btonecajqbVar = this.f5356jyumaefscl;
            zoijcleaow zoijcleaowVar = this.f5355iwizpuwonk;
            this.f5358zdlpuopuiu = 2;
            if (btonecajqbVar.iobyxmoadg(zoijcleaowVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private final class zoijcleaow implements dxjokdxxww {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final long f5360zdlpuopuiu;

        public /* synthetic */ zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, long j13, gtknphoqwx gtknphoqwxVar) {
            this(j13);
        }

        @Override // roivzttewh.dxjokdxxww
        public lqeggnwhkg f(x.rgvfuqvkyq rgvfuqvkyqVar) {
            return g.nufgyqmvbu.zoijcleaow(w(rgvfuqvkyqVar), g.gtknphoqwx.f35588zoijcleaow.zoijcleaow());
        }

        @Override // roivzttewh.dxjokdxxww
        public lrnfpwlwnk.ppxfxbqfkf sflfametgt() {
            return tbqsvytpvh.eablkybsjg.ppxfxbqfkf(ppxfxbqfkf.this);
        }

        @Override // roivzttewh.dxjokdxxww
        public long w(x.rgvfuqvkyq rgvfuqvkyqVar) {
            x.rgvfuqvkyq rgvfuqvkyqVarQ0 = ppxfxbqfkf.this.Q0();
            if (rgvfuqvkyqVarQ0 != null) {
                return rgvfuqvkyqVar.oipsdeybqn(rgvfuqvkyqVarQ0, this.f5360zdlpuopuiu);
            }
            rlfsiqarku.eablkybsjg.wkgbmnqykc("Tried to open context menu before the anchor was placed.");
            throw new KotlinNothingValueException();
        }

        private zoijcleaow(long j13) {
            this.f5360zdlpuopuiu = j13;
        }
    }

    public ppxfxbqfkf(draadjrbmk draadjrbmkVar) {
        this.f5352hcddaimhww = draadjrbmkVar;
        H0(tzroggbefp.iobyxmoadg(new iobyxmoadg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x.rgvfuqvkyq Q0() {
        return (x.rgvfuqvkyq) this.f5353jpowsppfya.getValue();
    }

    private final void R0(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f5353jpowsppfya.setValue(rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(long j13) {
        btonecajqb btonecajqbVar = (btonecajqb) z.dxjokdxxww.iobyxmoadg(this, roivzttewh.wflxmlrfwp.eablkybsjg());
        if (btonecajqbVar == null) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new wkgbmnqykc(btonecajqbVar, new zoijcleaow(this, j13, null), null), 3, null);
    }

    public final void T0(draadjrbmk draadjrbmkVar) {
        this.f5352hcddaimhww = draadjrbmkVar;
    }

    @Override // z.jyumaefscl
    public void yggfygwlhe(x.rgvfuqvkyq rgvfuqvkyqVar) {
        R0(rgvfuqvkyqVar);
    }
}
