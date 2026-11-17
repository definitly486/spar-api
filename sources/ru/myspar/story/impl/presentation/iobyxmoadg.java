package ru.myspar.story.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.impl.presentation.store.State;
import ru.myspar.story.impl.presentation.store.eablkybsjg;
import ru.myspar.story.impl.presentation.store.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f104325btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f104326gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f104325btonecajqb = new draadjrbmk() { // from class: d82.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.story.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f104326gtknphoqwx = new draadjrbmk() { // from class: d82.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.story.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.story.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.story.impl.presentation.store.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        ru.myspar.story.impl.presentation.store.wkgbmnqykc zoijcleaowVar2;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return ru.myspar.story.impl.presentation.store.wkgbmnqykc.iobyxmoadg.f104352iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2523zoijcleaow) {
            zoijcleaow.C2523zoijcleaow c2523zoijcleaow = (zoijcleaow.C2523zoijcleaow) zoijcleaowVar;
            zoijcleaowVar2 = new ru.myspar.story.impl.presentation.store.wkgbmnqykc.ppxfxbqfkf(c2523zoijcleaow.iobyxmoadg(), c2523zoijcleaow.zoijcleaow());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            zoijcleaowVar2 = new ru.myspar.story.impl.presentation.store.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
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
                arrayList.add(h82.zoijcleaow.iobyxmoadg((StoryItem) it.next()));
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
            iobyxmoadgVar = new ppxfxbqfkf.iobyxmoadg(jyumaefscl.eablkybsjg(h82.zoijcleaow.iobyxmoadg(((State.Content.Onboarding) state.getContent()).getStory())), 0);
        } else if (content != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new ppxfxbqfkf(iobyxmoadgVar);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104325btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104326gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f104357iobyxmoadg, gxszxtbevoVar);
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
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(zoijcleaowVar.iobyxmoadg().getAction()), zoijcleaowVar.iobyxmoadg().getReference(), null, null, false, null, new AnalyticsPayload(new AnalyticsPage.Story(zoijcleaowVar.zoijcleaow()), null, null, 6, null), false, 188, null));
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f104357iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
