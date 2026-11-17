package mt1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StorySlide;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements tt1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nt1.zoijcleaow f67947iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ot1.iobyxmoadg f67948zoijcleaow;

    /* JADX INFO: renamed from: mt1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1445iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67949cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67951jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67952yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67953zdlpuopuiu;

        C1445iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67951jyumaefscl = obj;
            this.f67949cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67955jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f67956yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67957zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f67957zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f67956yggfygwlhe;
            Set setEablkybsjg = (Set) this.f67955jyumaefscl;
            if (list == null) {
                return null;
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            if (setEablkybsjg == null) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
            return iobyxmoadgVar.btonecajqb(list, setEablkybsjg);
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Set set, gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f67956yggfygwlhe = list;
            ppxfxbqfkfVar.f67955jyumaefscl = set;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67958cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67960jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67961yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67962zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67960jyumaefscl = obj;
            this.f67958cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.dxjokdxxww(null, this);
        }
    }

    public iobyxmoadg(nt1.zoijcleaow localSource, ot1.iobyxmoadg remoteSource) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localSource, "localSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        this.f67947iobyxmoadg = localSource;
        this.f67948zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List btonecajqb(List list, Set set) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoryItem storyItem = (StoryItem) it.next();
            List<StorySlide> slides = storyItem.getSlides();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(slides, 10));
            for (StorySlide storySlide : slides) {
                arrayList2.add(StorySlide.ppxfxbqfkf(storySlide, null, null, null, null, null, null, set.contains(storySlide.getId()), 63, null));
            }
            arrayList.add(StoryItem.ppxfxbqfkf(storyItem, null, null, null, false, arrayList2, null, 47, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tt1.iobyxmoadg
    public Object dxjokdxxww(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        List list;
        Set setEablkybsjg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f67958cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f67958cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f67960jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f67958cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f67961yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f67962zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) zoijcleaowVar.f67961yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f67962zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            setEablkybsjg = (Set) objIobyxmoadg;
            if (setEablkybsjg == null) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
            return iobyxmoadgVar3.btonecajqb(list, setEablkybsjg);
        }
        zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        this.f67947iobyxmoadg.wkgbmnqykc();
        ot1.iobyxmoadg iobyxmoadgVar4 = this.f67948zoijcleaow;
        zoijcleaowVar.f67962zdlpuopuiu = this;
        zoijcleaowVar.f67961yggfygwlhe = this;
        zoijcleaowVar.f67958cqumvgiudr = 1;
        objIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(str, zoijcleaowVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        List list2 = (List) objIobyxmoadg;
        nt1.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar2.f67947iobyxmoadg;
        zoijcleaowVar.f67962zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f67961yggfygwlhe = list2;
        zoijcleaowVar.f67958cqumvgiudr = 2;
        Object objDxjokdxxww = zoijcleaowVar2.dxjokdxxww(zoijcleaowVar);
        if (objDxjokdxxww == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar;
        list = list2;
        objIobyxmoadg = objDxjokdxxww;
        setEablkybsjg = (Set) objIobyxmoadg;
        if (setEablkybsjg == null) {
            setEablkybsjg = ikoacuggdj.eablkybsjg();
        }
        return iobyxmoadgVar3.btonecajqb(list, setEablkybsjg);
    }

    @Override // tt1.iobyxmoadg
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
        return this.f67948zoijcleaow.zoijcleaow(str, gxszxtbevoVar);
    }

    @Override // tt1.iobyxmoadg
    public Object gxszxtbevo(String str, gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f67947iobyxmoadg.ppxfxbqfkf(str, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tt1.iobyxmoadg
    public Object lqeggnwhkg(String str, LocalDateTime localDateTime, gxszxtbevo gxszxtbevoVar) {
        Object objOjitshcjhn = this.f67947iobyxmoadg.ojitshcjhn(str, localDateTime, gxszxtbevoVar);
        return objOjitshcjhn == mg.zoijcleaow.gxszxtbevo() ? objOjitshcjhn : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tt1.iobyxmoadg
    public Object nufgyqmvbu(String str, gxszxtbevo gxszxtbevoVar) {
        return this.f67947iobyxmoadg.lqeggnwhkg(str, gxszxtbevoVar);
    }

    @Override // tt1.iobyxmoadg
    public lqeggnwhkg ppxfxbqfkf() {
        return dxjokdxxww.wflxmlrfwp(this.f67947iobyxmoadg.gtknphoqwx(), this.f67947iobyxmoadg.draadjrbmk(), new ppxfxbqfkf(null));
    }

    @Override // tt1.iobyxmoadg
    public Object wkgbmnqykc(List list, gxszxtbevo gxszxtbevoVar) {
        Object objRgvfuqvkyq = this.f67947iobyxmoadg.rgvfuqvkyq(list, gxszxtbevoVar);
        return objRgvfuqvkyq == mg.zoijcleaow.gxszxtbevo() ? objRgvfuqvkyq : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tt1.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C1445iobyxmoadg c1445iobyxmoadg;
        List list;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1445iobyxmoadg) {
            c1445iobyxmoadg = (C1445iobyxmoadg) gxszxtbevoVar;
            int i13 = c1445iobyxmoadg.f67949cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1445iobyxmoadg.f67949cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1445iobyxmoadg = new C1445iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1445iobyxmoadg = new C1445iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1445iobyxmoadg.f67951jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1445iobyxmoadg.f67949cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            List listNufgyqmvbu = this.f67947iobyxmoadg.nufgyqmvbu();
            if (listNufgyqmvbu == null) {
                return null;
            }
            nt1.zoijcleaow zoijcleaowVar = this.f67947iobyxmoadg;
            c1445iobyxmoadg.f67953zdlpuopuiu = this;
            c1445iobyxmoadg.f67952yggfygwlhe = listNufgyqmvbu;
            c1445iobyxmoadg.f67949cqumvgiudr = 1;
            Object objDxjokdxxww = zoijcleaowVar.dxjokdxxww(c1445iobyxmoadg);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list = listNufgyqmvbu;
            obj = objDxjokdxxww;
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c1445iobyxmoadg.f67952yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c1445iobyxmoadg.f67953zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        Set setEablkybsjg = (Set) obj;
        if (setEablkybsjg == null) {
            setEablkybsjg = ikoacuggdj.eablkybsjg();
        }
        return iobyxmoadgVar.btonecajqb(list, setEablkybsjg);
    }
}
