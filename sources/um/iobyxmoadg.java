package um;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import modern.payments.ecomAndroid.data.common.MockConstants;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.address.impl.address_search.domain.State;
import ru.myspar.components.search_address.api.model.SearchAddress;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sw.iobyxmoadg f113930ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private auzgnhcxok f113931wkgbmnqykc;

    /* JADX INFO: renamed from: um.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2824iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f113932jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113934zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2824iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113932jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2824iobyxmoadg(this.f113932jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        /* JADX WARN: Code duplicated, block: B:28:0x008f  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113934zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) obj);
                    iobyxmoadgVar = iobyxmoadg.this;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.wkgbmnqykc((List) objWkgbmnqykc));
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.crxdokpmqz(new wkgbmnqykc.ppxfxbqfkf(thDxjokdxxww));
                    }
                    iobyxmoadg.this.ulzqkzuiru(new eablkybsjg.zoijcleaow(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f113934zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg.this.ulzqkzuiru(new eablkybsjg.zoijcleaow(true));
                iobyxmoadg.this.ulzqkzuiru(new eablkybsjg.iobyxmoadg(null));
                sw.iobyxmoadg.C2669iobyxmoadg c2669iobyxmoadg = new sw.iobyxmoadg.C2669iobyxmoadg(this.f113932jyumaefscl, iobyxmoadg.ikoacuggdj(iobyxmoadg.this).getLocation());
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                sw.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar2.f113930ppxfxbqfkf;
                this.f113934zdlpuopuiu = 2;
                obj = iobyxmoadgVar4.zoijcleaow(c2669iobyxmoadg, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.wkgbmnqykc((List) objWkgbmnqykc));
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.crxdokpmqz(new wkgbmnqykc.ppxfxbqfkf(thDxjokdxxww));
            }
            iobyxmoadg.this.ulzqkzuiru(new eablkybsjg.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2824iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(sw.iobyxmoadg searchAddressUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchAddressUseCase, "searchAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f113930ppxfxbqfkf = searchAddressUseCase;
    }

    public static final /* synthetic */ State ikoacuggdj(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void jztzpxfvev(String str) {
        Object next;
        Iterator it = ((State) jlmebxxoox()).getSearchResult().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((SearchAddress) next).getFullAddress(), str));
        SearchAddress searchAddress = (SearchAddress) next;
        if (searchAddress == null) {
            return;
        }
        crxdokpmqz(new wkgbmnqykc.zoijcleaow(searchAddress.getShortAddress(), searchAddress.getLocation()));
    }

    private final void metgxyhuhe(String str) {
        auzgnhcxok auzgnhcxokVar = this.f113931wkgbmnqykc;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f113931wkgbmnqykc = gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2824iobyxmoadg(str, null), 3, null);
    }

    private final void xrmfcynszj(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new eablkybsjg.ppxfxbqfkf(tzroggbefpVar));
        if (!mj.kcexrzcfyt.zfvoamnweg(tzroggbefpVar.draadjrbmk())) {
            metgxyhuhe(tzroggbefpVar.draadjrbmk());
            return;
        }
        auzgnhcxok auzgnhcxokVar = this.f113931wkgbmnqykc;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        ulzqkzuiru(new eablkybsjg.wkgbmnqykc(jyumaefscl.wflxmlrfwp()));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f113937iobyxmoadg)) {
            crxdokpmqz(wkgbmnqykc.iobyxmoadg.f113940iobyxmoadg);
        } else if (intent instanceof ppxfxbqfkf.C2825ppxfxbqfkf) {
            xrmfcynszj(((ppxfxbqfkf.C2825ppxfxbqfkf) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            jztzpxfvev(((ppxfxbqfkf.zoijcleaow) intent).iobyxmoadg());
        }
    }
}
