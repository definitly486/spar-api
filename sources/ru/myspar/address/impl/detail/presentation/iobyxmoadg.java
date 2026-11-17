package ru.myspar.address.impl.detail.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import gn.eablkybsjg;
import gn.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.address.api.AddressDetailResultHelper;
import ru.myspar.address.api.AddressMapResultHelper;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.detail.domain.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f83912agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f83913btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressMapResultHelper f83914draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final qm.iobyxmoadg f83915gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f83916ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final AddressDetailResultHelper f83917wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.address.impl.detail.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1893iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddressMapResultHelper.Result f83918jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83920zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1893iobyxmoadg(AddressMapResultHelper.Result result, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83918jyumaefscl = result;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1893iobyxmoadg(this.f83918jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83920zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                gn.wkgbmnqykc.agtfadlqog agtfadlqogVar = new gn.wkgbmnqykc.agtfadlqog(this.f83918jyumaefscl.getShortAddress(), this.f83918jyumaefscl.getFullAddress(), this.f83918jyumaefscl.getLocation());
                this.f83920zdlpuopuiu = 1;
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
            return ((C1893iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nufgyqmvbu store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, qm.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressDetailResultHelper addressDetailResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressDetailResultHelper, "addressDetailResultHelper");
        this.f83913btonecajqb = resourcesManager;
        this.f83915gtknphoqwx = addressFeatureApi;
        this.f83914draadjrbmk = addressMapResultHelper;
        this.f83917wflxmlrfwp = addressDetailResultHelper;
        this.f83912agtfadlqog = new draadjrbmk() { // from class: in.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.detail.presentation.iobyxmoadg.vipkmwdibw(this.f44996zdlpuopuiu, (State) obj);
            }
        };
        this.f83916ojitshcjhn = new draadjrbmk() { // from class: in.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.detail.presentation.iobyxmoadg.sopmlzcsov((ru.myspar.address.impl.detail.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jhduphickx(iobyxmoadg iobyxmoadgVar, int i13) {
        return iobyxmoadgVar.f83913btonecajqb.getString(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        AddressMapResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f83914draadjrbmk.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        iobyxmoadgVar.ribwqtqdhb(resultZoijcleaow);
    }

    private final void ribwqtqdhb(AddressMapResultHelper.Result result) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C1893iobyxmoadg(result, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gn.wkgbmnqykc sopmlzcsov(zoijcleaow zoijcleaowVar) {
        gn.wkgbmnqykc draadjrbmkVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f83939iobyxmoadg)) {
            return gn.wkgbmnqykc.ppxfxbqfkf.f37964iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f83935iobyxmoadg)) {
            return gn.wkgbmnqykc.iobyxmoadg.f37960iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f83941iobyxmoadg)) {
            return gn.wkgbmnqykc.C0861wkgbmnqykc.f37966iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C1894zoijcleaow.f83942iobyxmoadg)) {
            return gn.wkgbmnqykc.zoijcleaow.f37967iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            zoijcleaow.eablkybsjg eablkybsjgVar = (zoijcleaow.eablkybsjg) zoijcleaowVar;
            draadjrbmkVar = new gn.wkgbmnqykc.eablkybsjg(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
            draadjrbmkVar = new gn.wkgbmnqykc.gxszxtbevo(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            draadjrbmkVar = new gn.wkgbmnqykc.lqeggnwhkg(((zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu) {
            zoijcleaow.nufgyqmvbu nufgyqmvbuVar = (zoijcleaow.nufgyqmvbu) zoijcleaowVar;
            draadjrbmkVar = new gn.wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wflxmlrfwp.f83940iobyxmoadg)) {
                return gn.wkgbmnqykc.wflxmlrfwp.f37965iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                draadjrbmkVar = new gn.wkgbmnqykc.dxjokdxxww(((zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                draadjrbmkVar = new gn.wkgbmnqykc.btonecajqb(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
                draadjrbmkVar = new gn.wkgbmnqykc.gtknphoqwx(((zoijcleaow.gtknphoqwx) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.draadjrbmk)) {
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar = new gn.wkgbmnqykc.draadjrbmk(((zoijcleaow.draadjrbmk) zoijcleaowVar).iobyxmoadg());
            }
        }
        return draadjrbmkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final in.gtknphoqwx vipkmwdibw(final iobyxmoadg iobyxmoadgVar, State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return kn.iobyxmoadg.ppxfxbqfkf(state, new draadjrbmk() { // from class: in.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.detail.presentation.iobyxmoadg.jhduphickx(this.f44998zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f37915iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f83917wflxmlrfwp.ppxfxbqfkf(), this.f83917wflxmlrfwp.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
            iobyxmoadgVar.oxmwwwfdhm().gxszxtbevo();
        } else if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.wflxmlrfwp();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C0858eablkybsjg.f37908iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(tm.gxszxtbevo.selected_address_cannot_be_deleted), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg iobyxmoadgVar2 = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar2.oxmwwwfdhm().wkgbmnqykc(this.f83914draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: in.wkgbmnqykc
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.address.impl.detail.presentation.iobyxmoadg.jlmebxxoox(this.f44999iobyxmoadg, obj);
                }
            });
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            iobyxmoadgVar2.oxmwwwfdhm().lqeggnwhkg(this.f83915gtknphoqwx.iobyxmoadg(new AddressMapScreenArgs(new AddressMapScreenFlow.Delivery(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow(), true), rm.iobyxmoadg.EDIT, false)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f83912agtfadlqog;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f83916ojitshcjhn;
    }
}
