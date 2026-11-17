package t72;

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
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StorySlide;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a82.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final u72.zoijcleaow f110033iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v72.iobyxmoadg f110034zoijcleaow;

    /* JADX INFO: renamed from: t72.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2701iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f110035cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f110037jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f110038yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110039zdlpuopuiu;

        C2701iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110037jyumaefscl = obj;
            this.f110035cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f110041jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110043zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f110043zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f110042yggfygwlhe;
            Set setEablkybsjg = (Set) this.f110041jyumaefscl;
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
            ppxfxbqfkfVar.f110042yggfygwlhe = list;
            ppxfxbqfkfVar.f110041jyumaefscl = set;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f110044cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f110046jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f110047yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110048zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110046jyumaefscl = obj;
            this.f110044cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.dxjokdxxww(null, this);
        }
    }

    public iobyxmoadg(u72.zoijcleaow localSource, v72.iobyxmoadg remoteSource) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localSource, "localSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        this.f110033iobyxmoadg = localSource;
        this.f110034zoijcleaow = remoteSource;
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
    @Override // a82.iobyxmoadg
    public Object dxjokdxxww(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        List list;
        Set setEablkybsjg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f110044cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f110044cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f110046jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f110044cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f110047yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f110048zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) zoijcleaowVar.f110047yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f110048zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            setEablkybsjg = (Set) objIobyxmoadg;
            if (setEablkybsjg == null) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
            return iobyxmoadgVar3.btonecajqb(list, setEablkybsjg);
        }
        zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        this.f110033iobyxmoadg.wkgbmnqykc();
        v72.iobyxmoadg iobyxmoadgVar4 = this.f110034zoijcleaow;
        zoijcleaowVar.f110048zdlpuopuiu = this;
        zoijcleaowVar.f110047yggfygwlhe = this;
        zoijcleaowVar.f110044cqumvgiudr = 1;
        objIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(str, zoijcleaowVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        List list2 = (List) objIobyxmoadg;
        u72.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar2.f110033iobyxmoadg;
        zoijcleaowVar.f110048zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f110047yggfygwlhe = list2;
        zoijcleaowVar.f110044cqumvgiudr = 2;
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

    @Override // a82.iobyxmoadg
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
        return this.f110034zoijcleaow.zoijcleaow(str, gxszxtbevoVar);
    }

    @Override // a82.iobyxmoadg
    public Object gxszxtbevo(String str, gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f110033iobyxmoadg.ppxfxbqfkf(str, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a82.iobyxmoadg
    public Object lqeggnwhkg(String str, LocalDateTime localDateTime, gxszxtbevo gxszxtbevoVar) {
        Object objOjitshcjhn = this.f110033iobyxmoadg.ojitshcjhn(str, localDateTime, gxszxtbevoVar);
        return objOjitshcjhn == mg.zoijcleaow.gxszxtbevo() ? objOjitshcjhn : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a82.iobyxmoadg
    public Object nufgyqmvbu(String str, gxszxtbevo gxszxtbevoVar) {
        return this.f110033iobyxmoadg.lqeggnwhkg(str, gxszxtbevoVar);
    }

    @Override // a82.iobyxmoadg
    public lqeggnwhkg ppxfxbqfkf() {
        return dxjokdxxww.wflxmlrfwp(this.f110033iobyxmoadg.gtknphoqwx(), this.f110033iobyxmoadg.draadjrbmk(), new ppxfxbqfkf(null));
    }

    @Override // a82.iobyxmoadg
    public Object wkgbmnqykc(List list, gxszxtbevo gxszxtbevoVar) {
        Object objRgvfuqvkyq = this.f110033iobyxmoadg.rgvfuqvkyq(list, gxszxtbevoVar);
        return objRgvfuqvkyq == mg.zoijcleaow.gxszxtbevo() ? objRgvfuqvkyq : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a82.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C2701iobyxmoadg c2701iobyxmoadg;
        List list;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2701iobyxmoadg) {
            c2701iobyxmoadg = (C2701iobyxmoadg) gxszxtbevoVar;
            int i13 = c2701iobyxmoadg.f110035cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2701iobyxmoadg.f110035cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c2701iobyxmoadg = new C2701iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2701iobyxmoadg = new C2701iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2701iobyxmoadg.f110037jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2701iobyxmoadg.f110035cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            List listNufgyqmvbu = this.f110033iobyxmoadg.nufgyqmvbu();
            if (listNufgyqmvbu == null) {
                return null;
            }
            u72.zoijcleaow zoijcleaowVar = this.f110033iobyxmoadg;
            c2701iobyxmoadg.f110039zdlpuopuiu = this;
            c2701iobyxmoadg.f110038yggfygwlhe = listNufgyqmvbu;
            c2701iobyxmoadg.f110035cqumvgiudr = 1;
            Object objDxjokdxxww = zoijcleaowVar.dxjokdxxww(c2701iobyxmoadg);
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
            list = (List) c2701iobyxmoadg.f110038yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c2701iobyxmoadg.f110039zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        Set setEablkybsjg = (Set) obj;
        if (setEablkybsjg == null) {
            setEablkybsjg = ikoacuggdj.eablkybsjg();
        }
        return iobyxmoadgVar.btonecajqb(list, setEablkybsjg);
    }
}
