package v72;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;
import x72.GetStoriesRequest;
import x72.GetStotyByIdRequest;
import y72.StoriesListDto;
import y72.StoryItemDto;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final w72.iobyxmoadg f116305iobyxmoadg;

    /* JADX INFO: renamed from: v72.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2895iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116306jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116308zdlpuopuiu;

        C2895iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116308zdlpuopuiu = obj;
            this.f116306jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116309jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116311zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116311zdlpuopuiu = obj;
            this.f116309jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(w72.iobyxmoadg storyApiService) {
        zdlpuopuiu.btonecajqb(storyApiService, "storyApiService");
        this.f116305iobyxmoadg = storyApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C2895iobyxmoadg c2895iobyxmoadg;
        if (gxszxtbevoVar instanceof C2895iobyxmoadg) {
            c2895iobyxmoadg = (C2895iobyxmoadg) gxszxtbevoVar;
            int i13 = c2895iobyxmoadg.f116306jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2895iobyxmoadg.f116306jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2895iobyxmoadg = new C2895iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2895iobyxmoadg = new C2895iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2895iobyxmoadg.f116308zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2895iobyxmoadg.f116306jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            w72.iobyxmoadg iobyxmoadgVar = this.f116305iobyxmoadg;
            GetStoriesRequest getStoriesRequest = new GetStoriesRequest(str);
            c2895iobyxmoadg.f116306jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getStoriesRequest, c2895iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List stories = ((StoriesListDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getStories();
        if (stories == null) {
            stories = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(stories, 10));
        Iterator it = stories.iterator();
        while (it.hasNext()) {
            arrayList.add(s72.iobyxmoadg.iobyxmoadg((StoryItemDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        StoryItemDto storyItemDto;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f116309jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f116309jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f116311zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f116309jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            w72.iobyxmoadg iobyxmoadgVar = this.f116305iobyxmoadg;
            GetStotyByIdRequest getStotyByIdRequest = new GetStotyByIdRequest(str);
            zoijcleaowVar.f116309jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(getStotyByIdRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        List stories = ((StoriesListDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null)).getStories();
        if (stories == null || (storyItemDto = (StoryItemDto) jyumaefscl.weqkydbzbr(stories)) == null) {
            return null;
        }
        return s72.iobyxmoadg.iobyxmoadg(storyItemDto);
    }
}
