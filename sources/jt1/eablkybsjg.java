package jt1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import it1.Splash;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ht1.iobyxmoadg f52339zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f52340iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f52342yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52343zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52342yggfygwlhe = obj;
            this.f52340iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f52344iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f52346yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52347zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52346yggfygwlhe = obj;
            this.f52344iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.wkgbmnqykc(this);
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(((Splash) obj).getEndTime(), ((Splash) obj2).getEndTime());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(ht1.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f52339zoijcleaow = splashRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ht1.iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f52340iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f52340iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objGxszxtbevo = iobyxmoadgVar.f52342yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f52340iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (ht1.iobyxmoadg) iobyxmoadgVar.f52343zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            } else if (i14 == 2) {
                iobyxmoadgVar2 = (ht1.iobyxmoadg) iobyxmoadgVar.f52343zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
                iobyxmoadgVar.f52343zdlpuopuiu = null;
                iobyxmoadgVar.f52340iwizpuwonk = 3;
                if (iobyxmoadgVar2.wkgbmnqykc((List) objGxszxtbevo, iobyxmoadgVar) == objGxszxtbevo2) {
                    return objGxszxtbevo2;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        ht1.iobyxmoadg iobyxmoadgVar3 = this.f52339zoijcleaow;
        iobyxmoadgVar.f52343zdlpuopuiu = iobyxmoadgVar3;
        iobyxmoadgVar.f52340iwizpuwonk = 1;
        Object objEablkybsjg = iobyxmoadgVar3.eablkybsjg(iobyxmoadgVar);
        if (objEablkybsjg == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        iobyxmoadgVar2 = iobyxmoadgVar3;
        objGxszxtbevo = objEablkybsjg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objGxszxtbevo) {
            if (((Splash) obj).getShowCount() != 0) {
                arrayList.add(obj);
            }
        }
        List listD = jyumaefscl.d(arrayList, new zoijcleaow());
        iobyxmoadgVar.f52343zdlpuopuiu = iobyxmoadgVar2;
        iobyxmoadgVar.f52340iwizpuwonk = 2;
        objGxszxtbevo = iobyxmoadgVar2.gxszxtbevo(listD, iobyxmoadgVar);
        if (objGxszxtbevo == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        iobyxmoadgVar.f52343zdlpuopuiu = null;
        iobyxmoadgVar.f52340iwizpuwonk = 3;
        if (iobyxmoadgVar2.wkgbmnqykc((List) objGxszxtbevo, iobyxmoadgVar) == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f52344iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f52344iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f52346yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f52344iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f52347zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        ht1.iobyxmoadg iobyxmoadgVar = this.f52339zoijcleaow;
        ppxfxbqfkfVar.f52347zdlpuopuiu = this;
        ppxfxbqfkfVar.f52344iwizpuwonk = 1;
        if (iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        ppxfxbqfkfVar.f52347zdlpuopuiu = null;
        ppxfxbqfkfVar.f52344iwizpuwonk = 2;
        if (eablkybsjgVar.iobyxmoadg(wwaezpbzknVar, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
