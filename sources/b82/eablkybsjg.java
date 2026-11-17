package b82;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.story.domain.model.StoryItem;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a82.iobyxmoadg f15529zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15530iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f15530iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15530iobyxmoadg, ((iobyxmoadg) obj).f15530iobyxmoadg);
        }

        public int hashCode() {
            return this.f15530iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15530iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f15530iobyxmoadg + ")";
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f15531iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f15533yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f15534zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15533yggfygwlhe = obj;
            this.f15531iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Boolean.valueOf(((StoryItem) obj).dxjokdxxww()), Boolean.valueOf(((StoryItem) obj2).dxjokdxxww()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(a82.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f15529zoijcleaow = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f15531iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f15531iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objDxjokdxxww = ppxfxbqfkfVar.f15533yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f15531iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f15534zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        a82.iobyxmoadg iobyxmoadgVar2 = this.f15529zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ppxfxbqfkfVar.f15534zdlpuopuiu = this;
        ppxfxbqfkfVar.f15531iwizpuwonk = 1;
        objDxjokdxxww = iobyxmoadgVar2.dxjokdxxww(strIobyxmoadg, ppxfxbqfkfVar);
        if (objDxjokdxxww == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        List listD = jyumaefscl.d((List) objDxjokdxxww, new zoijcleaow());
        a82.iobyxmoadg iobyxmoadgVar3 = eablkybsjgVar.f15529zoijcleaow;
        ppxfxbqfkfVar.f15534zdlpuopuiu = listD;
        ppxfxbqfkfVar.f15531iwizpuwonk = 2;
        if (iobyxmoadgVar3.wkgbmnqykc(listD, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
