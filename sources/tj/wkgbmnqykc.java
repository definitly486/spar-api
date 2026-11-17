package tj;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.kegysxyocb;
import pj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc implements rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final rj.iobyxmoadg f110702jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f110703yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final lg.btonecajqb f110704zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f110705iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f110706jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f110707yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110708zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110706jyumaefscl = nufgyqmvbuVar;
            this.f110705iwizpuwonk = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f110706jyumaefscl, this.f110705iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f110707yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110708zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f110707yggfygwlhe;
                sj.nufgyqmvbu nufgyqmvbuVar = this.f110706jyumaefscl;
                rj.jyumaefscl jyumaefsclVarDraadjrbmk = this.f110705iwizpuwonk.draadjrbmk(cllcsxoeizVar);
                this.f110708zdlpuopuiu = 1;
                if (sj.dxjokdxxww.jyumaefscl(nufgyqmvbuVar, jyumaefsclVarDraadjrbmk, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110710yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110711zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = wkgbmnqykc.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f110710yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110711zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f110710yggfygwlhe;
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                this.f110711zdlpuopuiu = 1;
                if (wkgbmnqykcVar.eablkybsjg(zdlpuopuiuVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public wkgbmnqykc(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        this.f110704zdlpuopuiu = btonecajqbVar;
        this.f110703yggfygwlhe = i13;
        this.f110702jyumaefscl = iobyxmoadgVar;
    }

    static /* synthetic */ Object wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = dsvhmnatus.gxszxtbevo(new iobyxmoadg(nufgyqmvbuVar, wkgbmnqykcVar, null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(this, nufgyqmvbuVar, gxszxtbevoVar);
    }

    public rj.jyumaefscl draadjrbmk(cllcsxoeiz cllcsxoeizVar) {
        return rj.oxmwwwfdhm.wkgbmnqykc(cllcsxoeizVar, this.f110704zdlpuopuiu, gtknphoqwx(), this.f110702jyumaefscl, wypolnanlu.ATOMIC, null, dxjokdxxww(), 16, null);
    }

    public final tg.rgvfuqvkyq dxjokdxxww() {
        return new zoijcleaow(null);
    }

    protected abstract Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar);

    public final int gtknphoqwx() {
        int i13 = this.f110703yggfygwlhe;
        if (i13 == -3) {
            return -2;
        }
        return i13;
    }

    protected abstract wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar);

    public sj.lqeggnwhkg nufgyqmvbu() {
        return null;
    }

    protected String ppxfxbqfkf() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strPpxfxbqfkf = ppxfxbqfkf();
        if (strPpxfxbqfkf != null) {
            arrayList.add(strPpxfxbqfkf);
        }
        if (this.f110704zdlpuopuiu != lg.gtknphoqwx.f62507zdlpuopuiu) {
            arrayList.add("context=" + this.f110704zdlpuopuiu);
        }
        if (this.f110703yggfygwlhe != -3) {
            arrayList.add("capacity=" + this.f110703yggfygwlhe);
        }
        if (this.f110702jyumaefscl != rj.iobyxmoadg.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f110702jyumaefscl);
        }
        return kegysxyocb.iobyxmoadg(this) + '[' + hg.jyumaefscl.iwxlajgraz(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // tj.rgvfuqvkyq
    public sj.lqeggnwhkg zoijcleaow(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        lg.btonecajqb btonecajqbVarPlus = btonecajqbVar.plus(this.f110704zdlpuopuiu);
        if (iobyxmoadgVar == rj.iobyxmoadg.SUSPEND) {
            int i14 = this.f110703yggfygwlhe;
            if (i14 != -3) {
                if (i13 == -3) {
                    i13 = i14;
                } else if (i14 != -2) {
                    if (i13 == -2) {
                        i13 = i14;
                    } else {
                        i13 += i14;
                        if (i13 < 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            iobyxmoadgVar = this.f110702jyumaefscl;
        }
        return (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVarPlus, this.f110704zdlpuopuiu) && i13 == this.f110703yggfygwlhe && iobyxmoadgVar == this.f110702jyumaefscl) ? this : gxszxtbevo(btonecajqbVarPlus, i13, iobyxmoadgVar);
    }
}
