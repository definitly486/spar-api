package ru.myspar.proloyalty.story.impl.presentation.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;
import ru.myspar.proloyalty.story.domain.model.StorySlide;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ut1.zoijcleaow f101674eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ut1.gxszxtbevo f101675ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ut1.ppxfxbqfkf f101676wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2442iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f101677jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ StoryPayload f101678yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101679zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2442iobyxmoadg(StoryPayload storyPayload, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101678yggfygwlhe = storyPayload;
            this.f101677jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2442iobyxmoadg(this.f101678yggfygwlhe, this.f101677jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        /* JADX WARN: Code duplicated, block: B:30:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x0096  */
        /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objWkgbmnqykc2;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            List list;
            kr0.wkgbmnqykc wkgbmnqykcVar;
            Throwable thDxjokdxxww2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101679zdlpuopuiu;
            try {
                try {
                    if (i13 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        StoryPayload storyPayload = this.f101678yggfygwlhe;
                        if (storyPayload instanceof StoryPayload.Groups) {
                            ut1.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new ut1.zoijcleaow.iobyxmoadg(((StoryPayload.Groups) storyPayload).getInitialStoryId());
                            iobyxmoadg iobyxmoadgVar3 = this.f101677jyumaefscl;
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                            ut1.zoijcleaow zoijcleaowVar = iobyxmoadgVar3.f101674eablkybsjg;
                            this.f101679zdlpuopuiu = 1;
                            obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, this);
                            if (obj == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc((List) obj);
                            iobyxmoadgVar = this.f101677jyumaefscl;
                            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                            if (thDxjokdxxww != null) {
                                iobyxmoadgVar.crxdokpmqz(new eablkybsjg.ppxfxbqfkf(thDxjokdxxww));
                            }
                            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                                objWkgbmnqykc2 = null;
                            }
                            list = (List) objWkgbmnqykc2;
                            if (list != null) {
                                this.f101677jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f101669iobyxmoadg);
                            } else {
                                this.f101677jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f101669iobyxmoadg);
                            }
                        } else {
                            if (!(storyPayload instanceof StoryPayload.Onboarding)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String id2 = ((StoryPayload.Onboarding) storyPayload).getStory().getId();
                            Integer onboardingTime = ((StoryPayload.Onboarding) this.f101678yggfygwlhe).getStory().getOnboardingTime();
                            ut1.gxszxtbevo.iobyxmoadg iobyxmoadgVar5 = new ut1.gxszxtbevo.iobyxmoadg(id2, onboardingTime != null ? onboardingTime.intValue() : 0);
                            iobyxmoadg iobyxmoadgVar6 = this.f101677jyumaefscl;
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                            ut1.gxszxtbevo gxszxtbevoVar = iobyxmoadgVar6.f101675ppxfxbqfkf;
                            this.f101679zdlpuopuiu = 2;
                            if (gxszxtbevoVar.zoijcleaow(iobyxmoadgVar5, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                            wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                            thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                            if (thDxjokdxxww2 != null) {
                                wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                            }
                            this.f101677jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(new State.Content.Onboarding(((StoryPayload.Onboarding) this.f101678yggfygwlhe).getStory(), ((StoryPayload.Onboarding) this.f101678yggfygwlhe).getEndPoint())));
                        }
                    } else if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc((List) obj);
                        iobyxmoadgVar = this.f101677jyumaefscl;
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.ppxfxbqfkf(thDxjokdxxww));
                        }
                        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                            objWkgbmnqykc2 = null;
                        }
                        list = (List) objWkgbmnqykc2;
                        if (list != null || list.isEmpty()) {
                            this.f101677jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f101669iobyxmoadg);
                        } else {
                            this.f101677jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(new State.Content.Groups(list, ((StoryPayload.Groups) this.f101678yggfygwlhe).getInitialStoryId())));
                        }
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                        wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                        thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww2 != null) {
                            wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                        }
                        this.f101677jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(new State.Content.Onboarding(((StoryPayload.Onboarding) this.f101678yggfygwlhe).getStory(), ((StoryPayload.Onboarding) this.f101678yggfygwlhe).getEndPoint())));
                    }
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
            } catch (Throwable th3) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th3));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2442iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f101680jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ StorySlide f101681yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101682zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(StorySlide storySlide, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101681yggfygwlhe = storySlide;
            this.f101680jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f101681yggfygwlhe, this.f101680jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101682zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ut1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = new ut1.ppxfxbqfkf.iobyxmoadg(this.f101681yggfygwlhe.getId());
                    iobyxmoadg iobyxmoadgVar2 = this.f101680jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    ut1.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar2.f101676wkgbmnqykc;
                    this.f101682zdlpuopuiu = 1;
                    if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            kr0.wkgbmnqykc wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ut1.gxszxtbevo updateOnboardingStoryTimeUseCase, ut1.ppxfxbqfkf markSlideAsViewedUseCase, ut1.zoijcleaow getStoriesGroupUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateOnboardingStoryTimeUseCase, "updateOnboardingStoryTimeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(markSlideAsViewedUseCase, "markSlideAsViewedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStoriesGroupUseCase, "getStoriesGroupUseCase");
        this.f101675ppxfxbqfkf = updateOnboardingStoryTimeUseCase;
        this.f101676wkgbmnqykc = markSlideAsViewedUseCase;
        this.f101674eablkybsjg = getStoriesGroupUseCase;
    }

    private final auzgnhcxok czzsidtyhn(StoryPayload storyPayload) {
        return gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2442iobyxmoadg(storyPayload, this, null), 3, null);
    }

    private final void metgxyhuhe() {
        State.Content content = ((State) jlmebxxoox()).getContent();
        if (content instanceof State.Content.Groups) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f101669iobyxmoadg);
        } else if (content instanceof State.Content.Onboarding) {
            State.Content.Onboarding onboarding = (State.Content.Onboarding) content;
            crxdokpmqz(new eablkybsjg.zoijcleaow(onboarding.getStory().getId(), onboarding.getEndPoint()));
        } else if (content != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final StorySlide rlfsiqarku(List list, String str, String str2) {
        Object obj;
        Object next;
        List slides;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((StoryItem) next).getId(), str));
        StoryItem storyItem = (StoryItem) next;
        if (storyItem == null || (slides = storyItem.getSlides()) == null) {
            return null;
        }
        for (Object obj2 : slides) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((StorySlide) obj2).getId(), str2)) {
                obj = obj2;
                break;
            }
        }
        return (StorySlide) obj;
    }

    private final void uwvvkdfqfp(String str, String str2) {
        StorySlide storySlideRlfsiqarku;
        State.Content content = ((State) jlmebxxoox()).getContent();
        if (!(content instanceof State.Content.Groups) || (storySlideRlfsiqarku = rlfsiqarku(((State.Content.Groups) content).getStories(), str, str2)) == null) {
            return;
        }
        if (storySlideRlfsiqarku.getIsViewed()) {
            storySlideRlfsiqarku = null;
        }
        if (storySlideRlfsiqarku != null) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(storySlideRlfsiqarku, this, null), 3, null);
        }
    }

    private final void yfnezrywwk(String str, String str2) {
        StorySlide storySlideRlfsiqarku;
        StoryNavLink navLink;
        State.Content content = ((State) jlmebxxoox()).getContent();
        if (content instanceof State.Content.Groups) {
            storySlideRlfsiqarku = rlfsiqarku(((State.Content.Groups) content).getStories(), str, str2);
        } else {
            Object obj = null;
            if (content instanceof State.Content.Onboarding) {
                for (Object obj2 : ((State.Content.Onboarding) content).getStory().getSlides()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((StorySlide) obj2).getId(), str2)) {
                        obj = obj2;
                        break;
                    }
                }
                storySlideRlfsiqarku = (StorySlide) obj;
            } else {
                if (content != null) {
                    throw new NoWhenBranchMatchedException();
                }
                storySlideRlfsiqarku = null;
            }
        }
        if (storySlideRlfsiqarku == null || (navLink = storySlideRlfsiqarku.getNavLink()) == null) {
            return;
        }
        crxdokpmqz(new eablkybsjg.zoijcleaow(str, navLink));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn(((ppxfxbqfkf.iobyxmoadg) action).iobyxmoadg());
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof wkgbmnqykc.iobyxmoadg) {
            metgxyhuhe();
            return;
        }
        if (intent instanceof wkgbmnqykc.ppxfxbqfkf) {
            wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (wkgbmnqykc.ppxfxbqfkf) intent;
            yfnezrywwk(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
        } else {
            if (!(intent instanceof wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykc.zoijcleaow zoijcleaowVar = (wkgbmnqykc.zoijcleaow) intent;
            uwvvkdfqfp(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        }
    }
}
