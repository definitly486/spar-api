package ru.myspar.proloyalty.support_service.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fv1.eablkybsjg;
import fv1.gxszxtbevo;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.support_service.impl.domain.model.FAQItem;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportAction;
import ru.myspar.proloyalty.support_service.impl.domain.store.State;
import ru.myspar.proloyalty.support_service.impl.domain.store.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f101857btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f101858gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f101857btonecajqb = new draadjrbmk() { // from class: dv1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.support_service.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f101858gtknphoqwx = new draadjrbmk() { // from class: dv1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.support_service.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.support_service.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C2451zoijcleaow) {
            return new ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2451zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f101869iobyxmoadg)) {
            return ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f101839iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f101870iobyxmoadg)) {
            return ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc.C2448wkgbmnqykc.f101840iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f101868iobyxmoadg)) {
            return ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc.iobyxmoadg.f101838iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf sopmlzcsov(State state) {
        ppxfxbqfkf.iobyxmoadg c2450ppxfxbqfkf;
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        if (content instanceof State.Content.Error) {
            c2450ppxfxbqfkf = new ppxfxbqfkf.iobyxmoadg.C2449iobyxmoadg(((State.Content.Error) state.getContent()).getIsLoading());
        } else if (content instanceof State.Content.Success) {
            String picUrl = ((State.Content.Success) state.getContent()).getInfo().getPicUrl();
            String title = ((State.Content.Success) state.getContent()).getInfo().getTitle();
            String subtitle = ((State.Content.Success) state.getContent()).getInfo().getSubtitle();
            List actions = ((State.Content.Success) state.getContent()).getInfo().getActions();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(actions, 10));
            Iterator it = actions.iterator();
            while (it.hasNext()) {
                arrayList.add(fv1.zoijcleaow.iobyxmoadg((SupportAction) it.next(), state.getUnreadChatSupportMessagesCount()));
            }
            fv1.ppxfxbqfkf ppxfxbqfkfVar = new fv1.ppxfxbqfkf(arrayList);
            List faqs = ((State.Content.Success) state.getContent()).getInfo().getFaqs();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(faqs, 10));
            Iterator it2 = faqs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(eablkybsjg.iobyxmoadg((FAQItem) it2.next()));
            }
            c2450ppxfxbqfkf = new ppxfxbqfkf.iobyxmoadg.C2450ppxfxbqfkf(picUrl, title, subtitle, ppxfxbqfkfVar, new gxszxtbevo(arrayList2));
        } else {
            if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            c2450ppxfxbqfkf = ppxfxbqfkf.iobyxmoadg.zoijcleaow.f101866iobyxmoadg;
        }
        return new ppxfxbqfkf(c2450ppxfxbqfkf);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101857btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101858gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.support_service.impl.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.support_service.impl.domain.store.eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((ru.myspar.proloyalty.support_service.impl.domain.store.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.support_service.impl.domain.store.eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        NavigationPayload navigationPayloadIobyxmoadg = ((ru.myspar.proloyalty.support_service.impl.domain.store.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg();
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadIobyxmoadg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadIobyxmoadg.reference : null, (191 & 4) != 0 ? navigationPayloadIobyxmoadg.title : null, (191 & 8) != 0 ? navigationPayloadIobyxmoadg.message : null, (191 & 16) != 0 ? navigationPayloadIobyxmoadg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadIobyxmoadg.deepLink : null, (191 & 64) != 0 ? navigationPayloadIobyxmoadg.analyticsPayload : new AnalyticsPayload(AnalyticsPage.SupportService.f92390iwizpuwonk, null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadIobyxmoadg.isPushPayload : false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
