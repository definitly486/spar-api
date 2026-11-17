package pj;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class crxdokpmqz {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f76676yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f76677zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76677zdlpuopuiu = obj;
            this.f76676yggfygwlhe |= Integer.MIN_VALUE;
            return crxdokpmqz.iobyxmoadg(this);
        }
    }

    public static final long eablkybsjg(long j13) {
        boolean zYadqdtsiqt = nj.iobyxmoadg.yadqdtsiqt(j13);
        if (zYadqdtsiqt) {
            return nj.iobyxmoadg.ojitshcjhn(nj.iobyxmoadg.iozdgvuglv(j13, nj.ppxfxbqfkf.zdlpuopuiu(999999L, nj.wkgbmnqykc.NANOSECONDS)));
        }
        if (zYadqdtsiqt) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f76676yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f76676yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f76677zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f76676yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar.f76676yggfygwlhe = 1;
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar), 1);
            rgvfuqvkyqVar.lereixgezr();
            Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar);
            }
            if (objZdlpuopuiu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final Object ppxfxbqfkf(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = zoijcleaow(eablkybsjg(j13), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final sopmlzcsov wkgbmnqykc(lg.btonecajqb btonecajqbVar) {
        lg.btonecajqb.zoijcleaow zoijcleaowVar = btonecajqbVar.get(lg.lqeggnwhkg.f62508dxjokdxxww);
        sopmlzcsov sopmlzcsovVar = zoijcleaowVar instanceof sopmlzcsov ? (sopmlzcsov) zoijcleaowVar : null;
        return sopmlzcsovVar == null ? mbcevpiqjq.iobyxmoadg() : sopmlzcsovVar;
    }

    public static final Object zoijcleaow(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        if (j13 <= 0) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        if (j13 < Long.MAX_VALUE) {
            wkgbmnqykc(rgvfuqvkyqVar.getContext()).cdpycssgdh(j13, rgvfuqvkyqVar);
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
