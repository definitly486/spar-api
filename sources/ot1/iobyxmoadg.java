package ot1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import qt1.GetStoriesRequest;
import qt1.GetStotyByIdRequest;
import rt1.StoriesListDto;
import rt1.StoryItemDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pt1.iobyxmoadg f74709iobyxmoadg;

    /* JADX INFO: renamed from: ot1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1621iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74710jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f74712zdlpuopuiu;

        C1621iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74712zdlpuopuiu = obj;
            this.f74710jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74713jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f74715zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74715zdlpuopuiu = obj;
            this.f74713jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(pt1.iobyxmoadg storyApiService) {
        zdlpuopuiu.btonecajqb(storyApiService, "storyApiService");
        this.f74709iobyxmoadg = storyApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C1621iobyxmoadg c1621iobyxmoadg;
        if (gxszxtbevoVar instanceof C1621iobyxmoadg) {
            c1621iobyxmoadg = (C1621iobyxmoadg) gxszxtbevoVar;
            int i13 = c1621iobyxmoadg.f74710jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1621iobyxmoadg.f74710jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1621iobyxmoadg = new C1621iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1621iobyxmoadg = new C1621iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1621iobyxmoadg.f74712zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1621iobyxmoadg.f74710jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            pt1.iobyxmoadg iobyxmoadgVar = this.f74709iobyxmoadg;
            GetStoriesRequest getStoriesRequest = new GetStoriesRequest(str);
            c1621iobyxmoadg.f74710jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getStoriesRequest, c1621iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List stories = ((StoriesListDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getStories();
        if (stories == null) {
            stories = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(stories, 10));
        Iterator it = stories.iterator();
        while (it.hasNext()) {
            arrayList.add(lt1.iobyxmoadg.iobyxmoadg((StoryItemDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        StoryItemDto storyItemDto;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74713jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74713jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f74715zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74713jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            pt1.iobyxmoadg iobyxmoadgVar = this.f74709iobyxmoadg;
            GetStotyByIdRequest getStotyByIdRequest = new GetStotyByIdRequest(str);
            zoijcleaowVar.f74713jyumaefscl = 1;
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
        List stories = ((StoriesListDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null)).getStories();
        if (stories == null || (storyItemDto = (StoryItemDto) jyumaefscl.weqkydbzbr(stories)) == null) {
            return null;
        }
        return lt1.iobyxmoadg.iobyxmoadg(storyItemDto);
    }
}
