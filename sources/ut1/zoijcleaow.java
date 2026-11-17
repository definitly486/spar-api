package ut1;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.iwizpuwonk;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.story.domain.model.StoryItem;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tt1.iobyxmoadg f114399ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk f114400zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114401iobyxmoadg;

        public iobyxmoadg(String storyId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            this.f114401iobyxmoadg = storyId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114401iobyxmoadg, ((iobyxmoadg) obj).f114401iobyxmoadg);
        }

        public int hashCode() {
            return this.f114401iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114401iobyxmoadg;
        }

        public String toString() {
            return "Params(storyId=" + this.f114401iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ut1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2837zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f114402cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f114404jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f114405yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f114406zdlpuopuiu;

        C2837zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f114404jyumaefscl = obj;
            this.f114402cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(iwizpuwonk isAdultCheckedUseCase, tt1.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f114400zoijcleaow = isAdultCheckedUseCase;
        this.f114399ppxfxbqfkf = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C2837zoijcleaow c2837zoijcleaow;
        zoijcleaow zoijcleaowVar;
        Object next;
        if (gxszxtbevoVar instanceof C2837zoijcleaow) {
            c2837zoijcleaow = (C2837zoijcleaow) gxszxtbevoVar;
            int i13 = c2837zoijcleaow.f114402cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2837zoijcleaow.f114402cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c2837zoijcleaow = new C2837zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2837zoijcleaow = new C2837zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2837zoijcleaow.f114404jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2837zoijcleaow.f114402cqumvgiudr;
        boolean z13 = true;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            tt1.iobyxmoadg iobyxmoadgVar2 = this.f114399ppxfxbqfkf;
            c2837zoijcleaow.f114406zdlpuopuiu = this;
            c2837zoijcleaow.f114405yggfygwlhe = iobyxmoadgVar;
            c2837zoijcleaow.f114402cqumvgiudr = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c2837zoijcleaow);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c2837zoijcleaow.f114405yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c2837zoijcleaow.f114406zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        List list = (List) objZoijcleaow;
        ArrayList arrayList = null;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((StoryItem) next).getId(), iobyxmoadgVar.iobyxmoadg()));
            StoryItem storyItem = (StoryItem) next;
            if (storyItem != null) {
                if (!storyItem.getIsAdult() && !((Boolean) zoijcleaowVar.f114400zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    z13 = false;
                }
                arrayList = new ArrayList();
                for (Object obj : list) {
                    StoryItem storyItem2 = (StoryItem) obj;
                    if (storyItem2.dxjokdxxww() == storyItem.dxjokdxxww() && (!storyItem2.getIsAdult() || z13)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }
}
