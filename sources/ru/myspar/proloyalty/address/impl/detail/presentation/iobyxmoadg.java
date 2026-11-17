package ru.myspar.proloyalty.address.impl.detail.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import rl0.eablkybsjg;
import rl0.nufgyqmvbu;
import ru.myspar.proloyalty.address.api.AddressDetailResultHelper;
import ru.myspar.proloyalty.address.api.AddressMapResultHelper;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.address.impl.detail.domain.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f91937agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f91938btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressMapResultHelper f91939draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final bl0.iobyxmoadg f91940gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f91941ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final AddressDetailResultHelper f91942wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.detail.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2137iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddressMapResultHelper.Result f91943jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91945zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2137iobyxmoadg(AddressMapResultHelper.Result result, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91943jyumaefscl = result;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2137iobyxmoadg(this.f91943jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91945zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                rl0.wkgbmnqykc.agtfadlqog agtfadlqogVar = new rl0.wkgbmnqykc.agtfadlqog(this.f91943jyumaefscl.getShortAddress(), this.f91943jyumaefscl.getFullAddress(), this.f91943jyumaefscl.getLocation());
                this.f91945zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(agtfadlqogVar, this) == objGxszxtbevo) {
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
            return ((C2137iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, bl0.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressDetailResultHelper addressDetailResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressDetailResultHelper, "addressDetailResultHelper");
        this.f91938btonecajqb = resourcesManager;
        this.f91940gtknphoqwx = addressFeatureApi;
        this.f91939draadjrbmk = addressMapResultHelper;
        this.f91942wflxmlrfwp = addressDetailResultHelper;
        this.f91937agtfadlqog = new draadjrbmk() { // from class: tl0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.detail.presentation.iobyxmoadg.vipkmwdibw(this.f111041zdlpuopuiu, (State) obj);
            }
        };
        this.f91941ojitshcjhn = new draadjrbmk() { // from class: tl0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.detail.presentation.iobyxmoadg.sopmlzcsov((ru.myspar.proloyalty.address.impl.detail.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jhduphickx(iobyxmoadg iobyxmoadgVar, int i13) {
        return iobyxmoadgVar.f91938btonecajqb.getString(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        AddressMapResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f91939draadjrbmk.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        iobyxmoadgVar.ribwqtqdhb(resultZoijcleaow);
    }

    private final void ribwqtqdhb(AddressMapResultHelper.Result result) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C2137iobyxmoadg(result, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rl0.wkgbmnqykc sopmlzcsov(zoijcleaow zoijcleaowVar) {
        rl0.wkgbmnqykc draadjrbmkVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f91964iobyxmoadg)) {
            return rl0.wkgbmnqykc.ppxfxbqfkf.f83078iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f91960iobyxmoadg)) {
            return rl0.wkgbmnqykc.iobyxmoadg.f83074iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f91966iobyxmoadg)) {
            return rl0.wkgbmnqykc.C1864wkgbmnqykc.f83080iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2138zoijcleaow.f91967iobyxmoadg)) {
            return rl0.wkgbmnqykc.zoijcleaow.f83081iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            zoijcleaow.eablkybsjg eablkybsjgVar = (zoijcleaow.eablkybsjg) zoijcleaowVar;
            draadjrbmkVar = new rl0.wkgbmnqykc.eablkybsjg(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
            draadjrbmkVar = new rl0.wkgbmnqykc.gxszxtbevo(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            draadjrbmkVar = new rl0.wkgbmnqykc.lqeggnwhkg(((zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu) {
            zoijcleaow.nufgyqmvbu nufgyqmvbuVar = (zoijcleaow.nufgyqmvbu) zoijcleaowVar;
            draadjrbmkVar = new rl0.wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wflxmlrfwp.f91965iobyxmoadg)) {
                return rl0.wkgbmnqykc.wflxmlrfwp.f83079iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                draadjrbmkVar = new rl0.wkgbmnqykc.dxjokdxxww(((zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                draadjrbmkVar = new rl0.wkgbmnqykc.btonecajqb(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
                draadjrbmkVar = new rl0.wkgbmnqykc.gtknphoqwx(((zoijcleaow.gtknphoqwx) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.draadjrbmk)) {
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar = new rl0.wkgbmnqykc.draadjrbmk(((zoijcleaow.draadjrbmk) zoijcleaowVar).iobyxmoadg());
            }
        }
        return draadjrbmkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tl0.gtknphoqwx vipkmwdibw(final iobyxmoadg iobyxmoadgVar, State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return vl0.iobyxmoadg.ppxfxbqfkf(state, new draadjrbmk() { // from class: tl0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.detail.presentation.iobyxmoadg.jhduphickx(this.f111043zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f83029iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f91942wflxmlrfwp.ppxfxbqfkf(), this.f91942wflxmlrfwp.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
            iobyxmoadgVar.oxmwwwfdhm().gxszxtbevo();
        } else if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            i21.iobyxmoadg.f41720iobyxmoadg.wflxmlrfwp();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C1861eablkybsjg.f83022iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(el0.gxszxtbevo.proloyalty_selected_address_cannot_be_deleted), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg iobyxmoadgVar2 = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar2.oxmwwwfdhm().wkgbmnqykc(this.f91939draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: tl0.wkgbmnqykc
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.proloyalty.address.impl.detail.presentation.iobyxmoadg.jlmebxxoox(this.f111044iobyxmoadg, obj);
                }
            });
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            iobyxmoadgVar2.oxmwwwfdhm().lqeggnwhkg(this.f91940gtknphoqwx.zoijcleaow(new AddressMapScreenArgs(new AddressMapScreenFlow.Delivery(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow(), true), cl0.iobyxmoadg.EDIT, false)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91937agtfadlqog;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91941ojitshcjhn;
    }
}
