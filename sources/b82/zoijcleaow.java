package b82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.story.domain.model.StoryItem;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a82.iobyxmoadg f15554ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f15555zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15556iobyxmoadg;

        public iobyxmoadg(String storyId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            this.f15556iobyxmoadg = storyId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15556iobyxmoadg, ((iobyxmoadg) obj).f15556iobyxmoadg);
        }

        public int hashCode() {
            return this.f15556iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15556iobyxmoadg;
        }

        public String toString() {
            return "Params(storyId=" + this.f15556iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: b82.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0267zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f15557cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f15559jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f15560yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f15561zdlpuopuiu;

        C0267zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15559jyumaefscl = obj;
            this.f15557cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(v10.zoijcleaow sharedPreferencesRepository, a82.iobyxmoadg storyRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(storyRepository, "storyRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f15555zoijcleaow = sharedPreferencesRepository;
        this.f15554ppxfxbqfkf = storyRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C0267zoijcleaow c0267zoijcleaow;
        zoijcleaow zoijcleaowVar;
        Object next;
        if (gxszxtbevoVar instanceof C0267zoijcleaow) {
            c0267zoijcleaow = (C0267zoijcleaow) gxszxtbevoVar;
            int i13 = c0267zoijcleaow.f15557cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0267zoijcleaow.f15557cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0267zoijcleaow = new C0267zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0267zoijcleaow = new C0267zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0267zoijcleaow.f15559jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0267zoijcleaow.f15557cqumvgiudr;
        boolean z13 = true;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            a82.iobyxmoadg iobyxmoadgVar2 = this.f15554ppxfxbqfkf;
            c0267zoijcleaow.f15561zdlpuopuiu = this;
            c0267zoijcleaow.f15560yggfygwlhe = iobyxmoadgVar;
            c0267zoijcleaow.f15557cqumvgiudr = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c0267zoijcleaow);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c0267zoijcleaow.f15560yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c0267zoijcleaow.f15561zdlpuopuiu;
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
                if (!storyItem.getIsAdult() && !zoijcleaowVar.f15555zoijcleaow.kcexrzcfyt()) {
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
