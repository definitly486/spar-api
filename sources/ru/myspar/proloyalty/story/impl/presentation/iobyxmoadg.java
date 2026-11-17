package ru.myspar.proloyalty.story.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.impl.presentation.store.State;
import ru.myspar.proloyalty.story.impl.presentation.store.eablkybsjg;
import ru.myspar.proloyalty.story.impl.presentation.store.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f101659btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f101660gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f101659btonecajqb = new draadjrbmk() { // from class: wt1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.story.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f101660gtknphoqwx = new draadjrbmk() { // from class: wt1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.story.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.story.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.story.impl.presentation.store.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        ru.myspar.proloyalty.story.impl.presentation.store.wkgbmnqykc zoijcleaowVar2;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return ru.myspar.proloyalty.story.impl.presentation.store.wkgbmnqykc.iobyxmoadg.f101686iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2443zoijcleaow) {
            zoijcleaow.C2443zoijcleaow c2443zoijcleaow = (zoijcleaow.C2443zoijcleaow) zoijcleaowVar;
            zoijcleaowVar2 = new ru.myspar.proloyalty.story.impl.presentation.store.wkgbmnqykc.ppxfxbqfkf(c2443zoijcleaow.iobyxmoadg(), c2443zoijcleaow.zoijcleaow());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            zoijcleaowVar2 = new ru.myspar.proloyalty.story.impl.presentation.store.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        }
        return zoijcleaowVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = null;
        if (content instanceof State.Content.Groups) {
            List stories = ((State.Content.Groups) state.getContent()).getStories();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(stories, 10));
            Iterator it = stories.iterator();
            while (it.hasNext()) {
                arrayList.add(au1.zoijcleaow.iobyxmoadg((StoryItem) it.next()));
            }
            Iterator it2 = ((State.Content.Groups) state.getContent()).getStories().iterator();
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (zdlpuopuiu.eablkybsjg(((StoryItem) it2.next()).getId(), ((State.Content.Groups) state.getContent()).getInitialStoryId())) {
                    break;
                }
                i13++;
            }
            Integer numValueOf = Integer.valueOf(i13);
            Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
            iobyxmoadgVar = new ppxfxbqfkf.iobyxmoadg(arrayList, num != null ? num.intValue() : 0);
        } else if (content instanceof State.Content.Onboarding) {
            iobyxmoadgVar = new ppxfxbqfkf.iobyxmoadg(jyumaefscl.eablkybsjg(au1.zoijcleaow.iobyxmoadg(((State.Content.Onboarding) state.getContent()).getStory())), 0);
        } else if (content != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new ppxfxbqfkf(iobyxmoadgVar);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101659btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101660gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f101691iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(zoijcleaowVar.iobyxmoadg().getAction()), zoijcleaowVar.iobyxmoadg().getReference(), null, null, false, null, new AnalyticsPayload(new AnalyticsPage.Story(zoijcleaowVar.zoijcleaow()), null, null, 6, null), false, 188, null));
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f101691iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
