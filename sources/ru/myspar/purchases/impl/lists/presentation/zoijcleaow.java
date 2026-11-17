package ru.myspar.purchases.impl.lists.presentation;

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
import my1.eablkybsjg;
import my1.lqeggnwhkg;
import my1.wkgbmnqykc;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.purchases.impl.lists.domain.store.State;
import ru.myspar.purchases_list.api.models.PurchaseList;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f102550btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f102551draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lx1.iobyxmoadg f102552gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f102553wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f102555zdlpuopuiu;

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
            int i13 = this.f102555zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                ppxfxbqfkf.C2480ppxfxbqfkf c2480ppxfxbqfkf = ppxfxbqfkf.C2480ppxfxbqfkf.f102548iobyxmoadg;
                this.f102555zdlpuopuiu = 1;
                if (zoijcleaowVar.cllcsxoeiz(c2480ppxfxbqfkf, this) == objGxszxtbevo) {
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
    public zoijcleaow(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, CreatePurchaseListsResultHelper resultHelper, lx1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f102550btonecajqb = resultHelper;
        this.f102552gtknphoqwx = purchasesFeatureApi;
        this.f102551draadjrbmk = new draadjrbmk() { // from class: ny1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.lists.presentation.zoijcleaow.jlmebxxoox((State) obj);
            }
        };
        this.f102553wflxmlrfwp = new draadjrbmk() { // from class: ny1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.lists.presentation.zoijcleaow.ulzqkzuiru((ru.myspar.purchases.impl.lists.presentation.iobyxmoadg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f102550btonecajqb.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(zoijcleaowVar), null, null, zoijcleaowVar.new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ny1.iobyxmoadg jlmebxxoox(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        List purchaseLists = state.getPurchaseLists();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(purchaseLists, 10));
        Iterator it = purchaseLists.iterator();
        while (it.hasNext()) {
            arrayList.add(py1.iobyxmoadg.iobyxmoadg((PurchaseList) it.next()));
        }
        return new ny1.iobyxmoadg(arrayList, state.getIsPurchaseListsLoading(), state.getIsInitializing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ulzqkzuiru(ru.myspar.purchases.impl.lists.presentation.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.C2479iobyxmoadg.f102539iobyxmoadg)) {
            return wkgbmnqykc.iobyxmoadg.f68173iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.zoijcleaow.f102542iobyxmoadg)) {
            return wkgbmnqykc.zoijcleaow.f68176iobyxmoadg;
        }
        if (iobyxmoadgVar instanceof ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.wkgbmnqykc) {
            ppxfxbqfkfVar = new wkgbmnqykc.C1466wkgbmnqykc(((ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg());
        } else if (iobyxmoadgVar instanceof ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.eablkybsjg) {
            ppxfxbqfkfVar = new wkgbmnqykc.eablkybsjg(((ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg());
        } else {
            if (!(iobyxmoadgVar instanceof ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.ppxfxbqfkf)) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.gxszxtbevo.f102538iobyxmoadg)) {
                    return wkgbmnqykc.gxszxtbevo.f68172iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new wkgbmnqykc.ppxfxbqfkf(((ru.myspar.purchases.impl.lists.presentation.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102551draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102553wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f68141iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f102552gtknphoqwx.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f68142iobyxmoadg)) {
                if (!(eablkybsjgVar instanceof eablkybsjg.C1464eablkybsjg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.C1464eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().wkgbmnqykc(this.f102550btonecajqb.zoijcleaow(), new l9.draadjrbmk() { // from class: ny1.wkgbmnqykc
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.purchases.impl.lists.presentation.zoijcleaow.crxdokpmqz(this.f71435iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar.kcexrzcfyt().lqeggnwhkg(ru.myspar.purchases.impl.create_list.presentation.iobyxmoadg.ppxfxbqfkf(null, 1, null));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
