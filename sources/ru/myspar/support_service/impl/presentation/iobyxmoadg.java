package ru.myspar.support_service.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import l92.eablkybsjg;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.support_service.impl.domain.model.FAQItem;
import ru.myspar.support_service.impl.domain.model.SupportAction;
import ru.myspar.support_service.impl.domain.store.State;
import ru.myspar.support_service.impl.domain.store.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f104494btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f104495gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f104494btonecajqb = new draadjrbmk() { // from class: j92.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.support_service.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f104495gtknphoqwx = new draadjrbmk() { // from class: j92.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.support_service.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.support_service.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.support_service.impl.domain.store.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C2529zoijcleaow) {
            return new ru.myspar.support_service.impl.domain.store.ppxfxbqfkf.zoijcleaow(((zoijcleaow.C2529zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f104506iobyxmoadg)) {
            return ru.myspar.support_service.impl.domain.store.ppxfxbqfkf.C2526ppxfxbqfkf.f104473iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f104507iobyxmoadg)) {
            return ru.myspar.support_service.impl.domain.store.ppxfxbqfkf.wkgbmnqykc.f104474iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f104505iobyxmoadg)) {
            return ru.myspar.support_service.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f104472iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf sopmlzcsov(State state) {
        ppxfxbqfkf.iobyxmoadg c2528ppxfxbqfkf;
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        if (content instanceof State.Content.Error) {
            c2528ppxfxbqfkf = new ppxfxbqfkf.iobyxmoadg.C2527iobyxmoadg(((State.Content.Error) state.getContent()).getIsLoading());
        } else if (content instanceof State.Content.Success) {
            String picUrl = ((State.Content.Success) state.getContent()).getInfo().getPicUrl();
            String title = ((State.Content.Success) state.getContent()).getInfo().getTitle();
            String subtitle = ((State.Content.Success) state.getContent()).getInfo().getSubtitle();
            List actions = ((State.Content.Success) state.getContent()).getInfo().getActions();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(actions, 10));
            Iterator it = actions.iterator();
            while (it.hasNext()) {
                arrayList.add(l92.zoijcleaow.iobyxmoadg((SupportAction) it.next()));
            }
            l92.ppxfxbqfkf ppxfxbqfkfVar = new l92.ppxfxbqfkf(arrayList);
            List faqs = ((State.Content.Success) state.getContent()).getInfo().getFaqs();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(faqs, 10));
            Iterator it2 = faqs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(eablkybsjg.iobyxmoadg((FAQItem) it2.next()));
            }
            c2528ppxfxbqfkf = new ppxfxbqfkf.iobyxmoadg.C2528ppxfxbqfkf(picUrl, title, subtitle, ppxfxbqfkfVar, new l92.gxszxtbevo(arrayList2));
        } else {
            if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            c2528ppxfxbqfkf = ppxfxbqfkf.iobyxmoadg.zoijcleaow.f104503iobyxmoadg;
        }
        return new ppxfxbqfkf(c2528ppxfxbqfkf);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104494btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104495gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.support_service.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.support_service.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((ru.myspar.support_service.impl.domain.store.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(wkgbmnqykcVar instanceof ru.myspar.support_service.impl.domain.store.wkgbmnqykc.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        NavigationPayload navigationPayloadIobyxmoadg = ((ru.myspar.support_service.impl.domain.store.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadIobyxmoadg.zoijcleaow((191 & 1) != 0 ? navigationPayloadIobyxmoadg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadIobyxmoadg.reference : null, (191 & 4) != 0 ? navigationPayloadIobyxmoadg.title : null, (191 & 8) != 0 ? navigationPayloadIobyxmoadg.message : null, (191 & 16) != 0 ? navigationPayloadIobyxmoadg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadIobyxmoadg.deepLink : null, (191 & 64) != 0 ? navigationPayloadIobyxmoadg.analyticsPayload : new AnalyticsPayload(AnalyticsPage.SupportService.f84362iwizpuwonk, null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadIobyxmoadg.isPushPayload : false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
