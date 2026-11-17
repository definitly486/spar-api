package p72;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o72.Splash;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n72.iobyxmoadg f75950zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75951iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75953yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75954zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75953yggfygwlhe = obj;
            this.f75951iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75955iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75957yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75958zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75957yggfygwlhe = obj;
            this.f75955iwizpuwonk |= Integer.MIN_VALUE;
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
    public eablkybsjg(n72.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75950zoijcleaow = splashRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        n72.iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f75951iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f75951iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objGxszxtbevo = iobyxmoadgVar.f75953yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f75951iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (n72.iobyxmoadg) iobyxmoadgVar.f75954zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            } else if (i14 == 2) {
                iobyxmoadgVar2 = (n72.iobyxmoadg) iobyxmoadgVar.f75954zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
                iobyxmoadgVar.f75954zdlpuopuiu = null;
                iobyxmoadgVar.f75951iwizpuwonk = 3;
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
        n72.iobyxmoadg iobyxmoadgVar3 = this.f75950zoijcleaow;
        iobyxmoadgVar.f75954zdlpuopuiu = iobyxmoadgVar3;
        iobyxmoadgVar.f75951iwizpuwonk = 1;
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
        iobyxmoadgVar.f75954zdlpuopuiu = iobyxmoadgVar2;
        iobyxmoadgVar.f75951iwizpuwonk = 2;
        objGxszxtbevo = iobyxmoadgVar2.gxszxtbevo(listD, iobyxmoadgVar);
        if (objGxszxtbevo == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        iobyxmoadgVar.f75954zdlpuopuiu = null;
        iobyxmoadgVar.f75951iwizpuwonk = 3;
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
            int i13 = ppxfxbqfkfVar.f75955iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f75955iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f75957yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f75955iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f75958zdlpuopuiu;
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
        n72.iobyxmoadg iobyxmoadgVar = this.f75950zoijcleaow;
        ppxfxbqfkfVar.f75958zdlpuopuiu = this;
        ppxfxbqfkfVar.f75955iwizpuwonk = 1;
        if (iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        ppxfxbqfkfVar.f75958zdlpuopuiu = null;
        ppxfxbqfkfVar.f75955iwizpuwonk = 2;
        if (eablkybsjgVar.iobyxmoadg(wwaezpbzknVar, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
