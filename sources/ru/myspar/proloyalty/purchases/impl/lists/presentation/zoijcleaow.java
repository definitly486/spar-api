package ru.myspar.proloyalty.purchases.impl.lists.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.purchases.impl.lists.domain.store.State;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseList;
import sj1.eablkybsjg;
import sj1.lqeggnwhkg;
import sj1.wkgbmnqykc;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f99836btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99837draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ri1.iobyxmoadg f99838gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99839wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f99841zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f99841zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                ppxfxbqfkf.C2398ppxfxbqfkf c2398ppxfxbqfkf = ppxfxbqfkf.C2398ppxfxbqfkf.f99834iobyxmoadg;
                this.f99841zdlpuopuiu = 1;
                if (zoijcleaowVar.cllcsxoeiz(c2398ppxfxbqfkf, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, CreatePurchaseListsResultHelper resultHelper, ri1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f99836btonecajqb = resultHelper;
        this.f99838gtknphoqwx = purchasesFeatureApi;
        this.f99837draadjrbmk = new draadjrbmk() { // from class: tj1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.lists.presentation.zoijcleaow.jlmebxxoox((State) obj);
            }
        };
        this.f99839wflxmlrfwp = new draadjrbmk() { // from class: tj1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.lists.presentation.zoijcleaow.ulzqkzuiru((ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f99836btonecajqb.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(zoijcleaowVar), null, null, zoijcleaowVar.new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tj1.iobyxmoadg jlmebxxoox(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        List purchaseLists = state.getPurchaseLists();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(purchaseLists, 10));
        Iterator it = purchaseLists.iterator();
        while (it.hasNext()) {
            arrayList.add(vj1.iobyxmoadg.iobyxmoadg((PurchaseList) it.next()));
        }
        return new tj1.iobyxmoadg(arrayList, state.getIsPurchaseListsLoading(), state.getIsInitializing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ulzqkzuiru(ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.C2397iobyxmoadg.f99825iobyxmoadg)) {
            return wkgbmnqykc.iobyxmoadg.f107184iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.zoijcleaow.f99828iobyxmoadg)) {
            return wkgbmnqykc.zoijcleaow.f107187iobyxmoadg;
        }
        if (iobyxmoadgVar instanceof ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.wkgbmnqykc) {
            ppxfxbqfkfVar = new wkgbmnqykc.C2631wkgbmnqykc(((ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg());
        } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.eablkybsjg) {
            ppxfxbqfkfVar = new wkgbmnqykc.eablkybsjg(((ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg());
        } else {
            if (!(iobyxmoadgVar instanceof ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.ppxfxbqfkf)) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.gxszxtbevo.f99824iobyxmoadg)) {
                    return wkgbmnqykc.gxszxtbevo.f107183iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new wkgbmnqykc.ppxfxbqfkf(((ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99837draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99839wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f107152iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f99838gtknphoqwx.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f107153iobyxmoadg)) {
                if (!(eablkybsjgVar instanceof eablkybsjg.C2629eablkybsjg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.C2629eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().wkgbmnqykc(this.f99836btonecajqb.zoijcleaow(), new l9.draadjrbmk() { // from class: tj1.wkgbmnqykc
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.proloyalty.purchases.impl.lists.presentation.zoijcleaow.crxdokpmqz(this.f110749iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar.kcexrzcfyt().lqeggnwhkg(ru.myspar.proloyalty.purchases.impl.create_list.presentation.iobyxmoadg.ppxfxbqfkf(null, 1, null));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
