package th0;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final uh0.zoijcleaow f110522iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ob0.ppxfxbqfkf f110523ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final de0.wkgbmnqykc f110524wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f110525zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f110526iobyxmoadg;

        static {
            int[] iArr = new int[ax.wkgbmnqykc.values().length];
            try {
                iArr[ax.wkgbmnqykc.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ax.wkgbmnqykc.FOR_HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ax.wkgbmnqykc.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ax.wkgbmnqykc.POPULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ax.wkgbmnqykc.SEASONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ax.wkgbmnqykc.BLOCK_07.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ax.wkgbmnqykc.BLOCK_08.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ax.wkgbmnqykc.BLOCK_09.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ax.wkgbmnqykc.BLOCK_10.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ax.wkgbmnqykc.BLOCK_11.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f110526iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f110527jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f110529zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110529zdlpuopuiu = obj;
            this.f110527jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.dxjokdxxww(null, null, null, null, this);
        }
    }

    public eablkybsjg(uh0.zoijcleaow bannersUiMapper, lqeggnwhkg specialProductsUiMapper, ob0.ppxfxbqfkf comboSetUiMapper, de0.wkgbmnqykc updateProductUiModelByProductDataUseCase) {
        zdlpuopuiu.btonecajqb(bannersUiMapper, "bannersUiMapper");
        zdlpuopuiu.btonecajqb(specialProductsUiMapper, "specialProductsUiMapper");
        zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        zdlpuopuiu.btonecajqb(updateProductUiModelByProductDataUseCase, "updateProductUiModelByProductDataUseCase");
        this.f110522iobyxmoadg = bannersUiMapper;
        this.f110525zoijcleaow = specialProductsUiMapper;
        this.f110523ppxfxbqfkf = comboSetUiMapper;
        this.f110524wkgbmnqykc = updateProductUiModelByProductDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh0.iobyxmoadg agtfadlqog(List list, final eablkybsjg eablkybsjgVar, String str, yh0.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(str, "<unused var>");
        yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg abstractC3155iobyxmoadg = iobyxmoadgVar instanceof yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg ? (yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) iobyxmoadgVar : null;
        return abstractC3155iobyxmoadg == null ? iobyxmoadgVar : abstractC3155iobyxmoadg.nufgyqmvbu(abstractC3155iobyxmoadg.lqeggnwhkg().dxjokdxxww(list, new rgvfuqvkyq() { // from class: th0.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.ojitshcjhn(this.f110534zdlpuopuiu, (ProductUiModel) obj, (ProductUIData) obj2);
            }
        }));
    }

    private final wh0.wkgbmnqykc btonecajqb(ax.iobyxmoadg iobyxmoadgVar, ax.wkgbmnqykc wkgbmnqykcVar, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, rgvfuqvkyq rgvfuqvkyqVar) {
        lqeggnwhkg lqeggnwhkgVar = this.f110525zoijcleaow;
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        return lqeggnwhkgVar.iobyxmoadg(strPpxfxbqfkf, strWkgbmnqykc, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), wkgbmnqykc(wkgbmnqykcVar), wkgbmnqykcVar.lqeggnwhkg(), list, deliveryCode, z13, z14, false, rgvfuqvkyqVar);
    }

    private final Object eablkybsjg(List list, boolean z13, int i13, int i14, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f110522iobyxmoadg.zoijcleaow(z13, i13, i14, list, gxszxtbevoVar);
    }

    private final vdvldrhtss gtknphoqwx(ax.wkgbmnqykc wkgbmnqykcVar, wh0.wkgbmnqykc wkgbmnqykcVar2) {
        switch (iobyxmoadg.f110526iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.C3156btonecajqb.f125042pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 2:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.gxszxtbevo.f125048pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 3:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.lqeggnwhkg.f125052pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 4:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.nufgyqmvbu.f125054pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 5:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.dxjokdxxww.f125044pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 6:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.C3161iobyxmoadg.f125050pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 7:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.zoijcleaow.f125060pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 8:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.ppxfxbqfkf.f125056pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 9:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.wkgbmnqykc.f125058pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            case 10:
                return yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.eablkybsjg.f125046pmvmpeiblj.zoijcleaow(wkgbmnqykcVar2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final List gxszxtbevo(List list) {
        return th0.iobyxmoadg.iobyxmoadg(list);
    }

    private final List lqeggnwhkg(List list) {
        return this.f110523ppxfxbqfkf.ppxfxbqfkf(list, false);
    }

    private final List nufgyqmvbu(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo.ppxfxbqfkf((xg0.gxszxtbevo) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductUiModel ojitshcjhn(eablkybsjg eablkybsjgVar, ProductUiModel product, ProductUIData productUIData) {
        zdlpuopuiu.btonecajqb(product, "product");
        return eablkybsjgVar.f110524wkgbmnqykc.invoke(product, productUIData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh0.iobyxmoadg wflxmlrfwp(rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        return (yh0.iobyxmoadg) rgvfuqvkyqVar.invoke(obj, obj2);
    }

    private final wh0.wkgbmnqykc.iobyxmoadg wkgbmnqykc(ax.wkgbmnqykc wkgbmnqykcVar) {
        switch (iobyxmoadg.f110526iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return wh0.wkgbmnqykc.iobyxmoadg.WEEK;
            case 2:
                return wh0.wkgbmnqykc.iobyxmoadg.FOR_HOME;
            case 3:
                return wh0.wkgbmnqykc.iobyxmoadg.NEW;
            case 4:
                return wh0.wkgbmnqykc.iobyxmoadg.POPULAR;
            case 5:
                return wh0.wkgbmnqykc.iobyxmoadg.SEASONAL;
            case 6:
                return wh0.wkgbmnqykc.iobyxmoadg.BLOCK_07;
            case 7:
                return wh0.wkgbmnqykc.iobyxmoadg.BLOCK_08;
            case 8:
                return wh0.wkgbmnqykc.iobyxmoadg.BLOCK_09;
            case 9:
                return wh0.wkgbmnqykc.iobyxmoadg.BLOCK_10;
            case 10:
                return wh0.wkgbmnqykc.iobyxmoadg.BLOCK_11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Map draadjrbmk(Map sections, final List cartProducts) {
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(cartProducts, "cartProducts");
        Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(sections);
        final rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq() { // from class: th0.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.agtfadlqog(cartProducts, this, (String) obj, (yh0.iobyxmoadg) obj2);
            }
        };
        mapIwizpuwonk.replaceAll(new BiFunction() { // from class: th0.ppxfxbqfkf
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return eablkybsjg.wflxmlrfwp(rgvfuqvkyqVar, obj, obj2);
            }
        });
        return mapIwizpuwonk;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object dxjokdxxww(wg0.iobyxmoadg iobyxmoadgVar, List list, DeliveryCode deliveryCode, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f110527jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f110527jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objEablkybsjg = zoijcleaowVar2.f110529zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f110527jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            if (iobyxmoadgVar instanceof wg0.iobyxmoadg.C2987iobyxmoadg) {
                return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.AbstractC3181iobyxmoadg.f125122iwizpuwonk.zoijcleaow(((wg0.iobyxmoadg.C2987iobyxmoadg) iobyxmoadgVar).iobyxmoadg()));
            }
            if (!(iobyxmoadgVar instanceof wg0.iobyxmoadg.zoijcleaow)) {
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.ppxfxbqfkf) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.zoijcleaow.f125156iwizpuwonk.zoijcleaow(gxszxtbevo(((wg0.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar).iobyxmoadg())));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.wkgbmnqykc) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.f125104zynmafqrjb.zoijcleaow(wh0.ppxfxbqfkf.iobyxmoadg(((wg0.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg())));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.eablkybsjg) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.ppxfxbqfkf.f125137iwizpuwonk.zoijcleaow(lqeggnwhkg(((wg0.iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg())));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.lqeggnwhkg) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gxszxtbevo.wkgbmnqykc.f125116pmvmpeiblj.zoijcleaow(nufgyqmvbu(((wg0.iobyxmoadg.lqeggnwhkg) iobyxmoadgVar).iobyxmoadg())));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.nufgyqmvbu) {
                    wg0.iobyxmoadg.nufgyqmvbu nufgyqmvbuVar = (wg0.iobyxmoadg.nufgyqmvbu) iobyxmoadgVar;
                    Map mapIobyxmoadg = nufgyqmvbuVar.iobyxmoadg().iobyxmoadg();
                    ArrayList arrayList = new ArrayList(mapIobyxmoadg.size());
                    for (Map.Entry entry : mapIobyxmoadg.entrySet()) {
                        ax.wkgbmnqykc wkgbmnqykcVar = (ax.wkgbmnqykc) entry.getKey();
                        ax.iobyxmoadg iobyxmoadgVar2 = (ax.iobyxmoadg) entry.getValue();
                        ax.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2 != null ? iobyxmoadgVar2 : null;
                        arrayList.add(gtknphoqwx(wkgbmnqykcVar, iobyxmoadgVar3 != null ? btonecajqb(iobyxmoadgVar3, wkgbmnqykcVar, list, deliveryCode, nufgyqmvbuVar.iobyxmoadg().ppxfxbqfkf(), nufgyqmvbuVar.iobyxmoadg().zoijcleaow(), rgvfuqvkyqVar) : null));
                    }
                    return arrayList;
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.dxjokdxxww) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.f125088pmvmpeiblj.zoijcleaow(((wg0.iobyxmoadg.dxjokdxxww) iobyxmoadgVar).iobyxmoadg()));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.btonecajqb) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gxszxtbevo.AbstractC3173gxszxtbevo.f125099pmvmpeiblj.zoijcleaow(((wg0.iobyxmoadg.btonecajqb) iobyxmoadgVar).iobyxmoadg()));
                }
                if (iobyxmoadgVar instanceof wg0.iobyxmoadg.gtknphoqwx) {
                    return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gtknphoqwx.f125080cqumvgiudr.zoijcleaow(wh0.gxszxtbevo.iobyxmoadg(((wg0.iobyxmoadg.gtknphoqwx) iobyxmoadgVar).iobyxmoadg())));
                }
                if (!(iobyxmoadgVar instanceof wg0.iobyxmoadg.gxszxtbevo)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<rv.zoijcleaow> listIobyxmoadg = ((wg0.iobyxmoadg.gxszxtbevo) iobyxmoadgVar).iobyxmoadg();
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
                for (rv.zoijcleaow zoijcleaowVar3 : listIobyxmoadg) {
                    arrayList2.add(new qe0.iobyxmoadg(zoijcleaowVar3.zoijcleaow(), zoijcleaowVar3.wkgbmnqykc(), f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(zoijcleaowVar3.iobyxmoadg()), zoijcleaowVar3.ppxfxbqfkf()));
                }
                return jyumaefscl.eablkybsjg(yh0.iobyxmoadg.gxszxtbevo.ppxfxbqfkf.f125110zynmafqrjb.zoijcleaow(arrayList2));
            }
            wg0.iobyxmoadg.zoijcleaow zoijcleaowVar4 = (wg0.iobyxmoadg.zoijcleaow) iobyxmoadgVar;
            List listZoijcleaow = zoijcleaowVar4.iobyxmoadg().zoijcleaow();
            boolean zWkgbmnqykc = zoijcleaowVar4.iobyxmoadg().wkgbmnqykc();
            int iPpxfxbqfkf = zoijcleaowVar4.iobyxmoadg().ppxfxbqfkf();
            int iIobyxmoadg = zoijcleaowVar4.iobyxmoadg().iobyxmoadg();
            zoijcleaowVar2.f110527jyumaefscl = 1;
            objEablkybsjg = eablkybsjg(listZoijcleaow, zWkgbmnqykc, iPpxfxbqfkf, iIobyxmoadg, zoijcleaowVar2);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        wh0.iobyxmoadg iobyxmoadgVar4 = (wh0.iobyxmoadg) objEablkybsjg;
        vdvldrhtss vdvldrhtssVarZoijcleaow = yh0.iobyxmoadg.eablkybsjg.f125075cqumvgiudr.zoijcleaow(iobyxmoadgVar4.zoijcleaow());
        yh0.iobyxmoadg.wkgbmnqykc.C3188iobyxmoadg c3188iobyxmoadg = yh0.iobyxmoadg.wkgbmnqykc.f125147iwizpuwonk;
        nb0.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
        return jyumaefscl.rgvfuqvkyq(vdvldrhtssVarZoijcleaow, c3188iobyxmoadg.zoijcleaow(wkgbmnqykcVarIobyxmoadg != null ? wkgbmnqykcVarIobyxmoadg.wkgbmnqykc() : null), yh0.iobyxmoadg.lqeggnwhkg.f125126cqumvgiudr.zoijcleaow(iobyxmoadgVar4.ppxfxbqfkf()), yh0.iobyxmoadg.nufgyqmvbu.f125132iwizpuwonk.zoijcleaow(iobyxmoadgVar4.wkgbmnqykc()), yh0.iobyxmoadg.dxjokdxxww.f125070iwizpuwonk.zoijcleaow(iobyxmoadgVar4.eablkybsjg()), yh0.iobyxmoadg.wflxmlrfwp.f125142iwizpuwonk.zoijcleaow(iobyxmoadgVar4.lqeggnwhkg()), yh0.iobyxmoadg.draadjrbmk.f125064cqumvgiudr.zoijcleaow(iobyxmoadgVar4.gxszxtbevo()));
    }
}
