package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.w;
import androidx.compose.ui.platform.zeieaojujs;
import gg.wwaezpbzkn;
import ikoacuggdj.esjtqupxsv;
import ikoacuggdj.tzroggbefp;
import java.util.List;
import jztzpxfvev.nuxfzjnpeb;
import jztzpxfvev.ribwqtqdhb;
import t.ntlheqmsrt;
import t.pmvmpeiblj;
import t.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends androidx.compose.foundation.iobyxmoadg {

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private final boolean f5264metgxyhuhe;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private pmvmpeiblj f5265rlfsiqarku;

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0091iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ lqeggnwhkg f5267iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ long f5268jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f5269yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f5270zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0091iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f5267iwizpuwonk = lqeggnwhkgVar;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((ribwqtqdhb) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f5270zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) this.f5269yggfygwlhe;
                    long j13 = this.f5268jyumaefscl;
                    if (this.f5267iwizpuwonk.e1()) {
                        lqeggnwhkg lqeggnwhkgVar = this.f5267iwizpuwonk;
                        this.f5270zdlpuopuiu = 1;
                        if (lqeggnwhkgVar.g1(ribwqtqdhbVar, j13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(ribwqtqdhb ribwqtqdhbVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
                C0091iobyxmoadg c0091iobyxmoadg = new C0091iobyxmoadg(this.f5267iwizpuwonk, gxszxtbevoVar);
                c0091iobyxmoadg.f5269yggfygwlhe = ribwqtqdhbVar;
                c0091iobyxmoadg.f5268jyumaefscl = j13;
                return c0091iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zoijcleaow(lqeggnwhkg lqeggnwhkgVar, g.eablkybsjg eablkybsjgVar) {
            if (lqeggnwhkgVar.e1()) {
                lqeggnwhkgVar.f1().invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            C0091iobyxmoadg c0091iobyxmoadg = new C0091iobyxmoadg(lqeggnwhkg.this, null);
            final lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
            Object objDxjokdxxww = nuxfzjnpeb.dxjokdxxww(ylkuphrtabVar, c0091iobyxmoadg, new tg.draadjrbmk() { // from class: androidx.compose.foundation.gxszxtbevo
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return lqeggnwhkg.iobyxmoadg.zoijcleaow(lqeggnwhkgVar, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar);
            return objDxjokdxxww == mg.zoijcleaow.gxszxtbevo() ? objDxjokdxxww : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ lqeggnwhkg(metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(draadjrbmkVar, tzroggbefpVar, z13, z14, str, nufgyqmvbuVar, iobyxmoadgVar);
    }

    private final long u1(long j13) {
        long jV = z.gtknphoqwx.draadjrbmk(this).V(((w) z.dxjokdxxww.iobyxmoadg(this, zeieaojujs.kcexrzcfyt())).gxszxtbevo());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jV >> 32)) - ((int) (j13 >> 32))) / 2.0f;
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV & 4294967295L)) - ((int) (j13 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    public ntlheqmsrt Z0() {
        if (this.f5264metgxyhuhe) {
            return t.tzroggbefp.iobyxmoadg(new iobyxmoadg());
        }
        return null;
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    protected final boolean m1(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.iobyxmoadg, z.tbqsvytpvh
    public void metgxyhuhe(t.rgvfuqvkyq rgvfuqvkyqVar, t.oxmwwwfdhm oxmwwwfdhmVar, long j13) {
        super.metgxyhuhe(rgvfuqvkyqVar, oxmwwwfdhmVar, j13);
        if (this.f5264metgxyhuhe) {
            return;
        }
        int i13 = 0;
        if (oxmwwwfdhmVar != t.oxmwwwfdhm.Main) {
            if (oxmwwwfdhmVar != t.oxmwwwfdhm.Final || this.f5265rlfsiqarku == null) {
                return;
            }
            List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
            int size = listPpxfxbqfkf.size();
            while (i13 < size) {
                pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) listPpxfxbqfkf.get(i13);
                if (pmvmpeibljVar.rgvfuqvkyq() && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pmvmpeibljVar, this.f5265rlfsiqarku)) {
                    this.f5265rlfsiqarku = null;
                    h1();
                    return;
                }
                i13++;
            }
            return;
        }
        pmvmpeiblj pmvmpeibljVar2 = this.f5265rlfsiqarku;
        if (pmvmpeibljVar2 == null) {
            if (nuxfzjnpeb.agtfadlqog(rgvfuqvkyqVar, true, false, 2, null)) {
                pmvmpeiblj pmvmpeibljVar3 = (pmvmpeiblj) rgvfuqvkyqVar.ppxfxbqfkf().get(0);
                pmvmpeibljVar3.iobyxmoadg();
                this.f5265rlfsiqarku = pmvmpeibljVar3;
                if (e1()) {
                    j1(pmvmpeibljVar3.nufgyqmvbu());
                    return;
                }
                return;
            }
            return;
        }
        List listPpxfxbqfkf2 = rgvfuqvkyqVar.ppxfxbqfkf();
        int size2 = listPpxfxbqfkf2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (!t.vdvldrhtss.ppxfxbqfkf((pmvmpeiblj) listPpxfxbqfkf2.get(i14))) {
                long jU1 = u1(j13);
                List listPpxfxbqfkf3 = rgvfuqvkyqVar.ppxfxbqfkf();
                int size3 = listPpxfxbqfkf3.size();
                while (i13 < size3) {
                    pmvmpeiblj pmvmpeibljVar4 = (pmvmpeiblj) listPpxfxbqfkf3.get(i13);
                    if (pmvmpeibljVar4.rgvfuqvkyq() || t.vdvldrhtss.gxszxtbevo(pmvmpeibljVar4, j13, jU1)) {
                        this.f5265rlfsiqarku = null;
                        h1();
                        return;
                    }
                    i13++;
                }
                return;
            }
        }
        ((pmvmpeiblj) rgvfuqvkyqVar.ppxfxbqfkf().get(0)).iobyxmoadg();
        if (e1()) {
            i1(pmvmpeibljVar2.nufgyqmvbu());
            f1().invoke();
        }
        this.f5265rlfsiqarku = null;
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    protected final boolean n1(KeyEvent keyEvent) {
        f1().invoke();
        return true;
    }

    @Override // androidx.compose.foundation.iobyxmoadg, z.tbqsvytpvh
    public void s() {
        super.s();
        if (this.f5265rlfsiqarku != null) {
            this.f5265rlfsiqarku = null;
            h1();
        }
    }

    public final void v1(metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        t1(draadjrbmkVar, tzroggbefpVar, z13, z14, str, nufgyqmvbuVar, iobyxmoadgVar);
    }

    private lqeggnwhkg(metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        super(draadjrbmkVar, tzroggbefpVar, z13, z14, str, nufgyqmvbuVar, iobyxmoadgVar, null);
        this.f5264metgxyhuhe = (esjtqupxsv.f44795ppxfxbqfkf && esjtqupxsv.f44787draadjrbmk) ? false : true;
    }
}
