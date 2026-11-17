package ic0;

import e10.eablkybsjg;
import hg.jyumaefscl;
import j00.gxszxtbevo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.core.domain.models.reference.Reference;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.legacy.presentation.screen.editorder.iwizpuwonk;
import t00.nufgyqmvbu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f42391ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f42392wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f42393iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f42394zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42395iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f42396ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f42397zoijcleaow;

        static {
            int[] iArr = new int[DeliveryCode.values().length];
            try {
                iArr[DeliveryCode.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42395iobyxmoadg = iArr;
            int[] iArr2 = new int[o10.iobyxmoadg.values().length];
            try {
                iArr2[o10.iobyxmoadg.CHECKBOX_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f42397zoijcleaow = iArr2;
            int[] iArr3 = new int[PaymentCode.values().length];
            try {
                iArr3[PaymentCode.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr3[PaymentCode.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[PaymentCode.ONLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[PaymentCode.SBER_PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PaymentCode.SBP.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PaymentCode.SBP_RECURRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PaymentCode.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            f42396ppxfxbqfkf = iArr3;
        }
    }

    public ppxfxbqfkf(d60.iobyxmoadg resourcesManager, gxszxtbevo productInteractor) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f42393iobyxmoadg = resourcesManager;
        this.f42394zoijcleaow = productInteractor;
    }

    private final String btonecajqb(PaymentCode paymentCode) {
        switch (zoijcleaow.f42396ppxfxbqfkf[paymentCode.ordinal()]) {
            case 1:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.title_cash);
            case 2:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.title_card_upon_receipt);
            case 3:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.title_card_online);
            case 4:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.title_sber_pay);
            case 5:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.title_pay_qr);
            case 6:
                return this.f42393iobyxmoadg.getString(dxjokdxxww.sbp_recurring_pay_title);
            case 7:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return ppxfxbqfkfVar.f42393iobyxmoadg.getString(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence eablkybsjg(String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return kcexrzcfyt.p(it).toString();
    }

    private final String gxszxtbevo(double d13) {
        return this.f42393iobyxmoadg.getString(dxjokdxxww.approximate_price_format, n30.iobyxmoadg.f68492iobyxmoadg.gxszxtbevo(Double.valueOf(d13)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    private final CartProductUiModel nufgyqmvbu(eablkybsjg eablkybsjgVar, ProductUIData productUIData, boolean z13) {
        MeasureType originalMeasure;
        List listDxjokdxxww;
        String string = this.f42393iobyxmoadg.getString(dxjokdxxww.discount_badge, Integer.valueOf(eablkybsjgVar.wflxmlrfwp()));
        boolean z14 = eablkybsjgVar.wflxmlrfwp() > 0;
        nufgyqmvbu nufgyqmvbuVar = eablkybsjgVar.yggfygwlhe() ? nufgyqmvbu.AVAILABLE : nufgyqmvbu.UNAVAILABLE;
        boolean z15 = eablkybsjgVar.ojitshcjhn() == 0.0d;
        if (productUIData == null || (originalMeasure = productUIData.getMeasureType()) == null) {
            originalMeasure = eablkybsjgVar.btonecajqb().getOriginalMeasure();
        }
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(eablkybsjgVar.btonecajqb(), null, null, originalMeasure, 3, null);
        if (productUIData == null || (listDxjokdxxww = productUIData.getLimits()) == null) {
            listDxjokdxxww = eablkybsjgVar.dxjokdxxww();
        } else {
            if (listDxjokdxxww.isEmpty()) {
                listDxjokdxxww = null;
            }
            if (listDxjokdxxww == null) {
                listDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            }
        }
        List list = listDxjokdxxww;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f42394zoijcleaow.iobyxmoadg(eablkybsjgVar.yggfygwlhe(), false, z15, false, new draadjrbmk() { // from class: ic0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.dxjokdxxww(this.f42398zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        CounterModel counterModelIobyxmoadg = pt.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), productUIData != null, productUIData != null ? productUIData.getIsLoading() : false, eablkybsjgVar.ojitshcjhn(), eablkybsjgVar.draadjrbmk(), eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.jyumaefscl(), eablkybsjgVar.rgvfuqvkyq(), measureTypeModelPpxfxbqfkf.nufgyqmvbu(), measureTypeModelPpxfxbqfkf.getCurrentMeasure(), productUIData != null ? productUIData.getMessageType() : null, null);
        String strNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
        String strPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
        String strGtknphoqwx = eablkybsjgVar.gtknphoqwx();
        String strAgtfadlqog = eablkybsjgVar.agtfadlqog();
        if (strAgtfadlqog == null) {
            strAgtfadlqog = "";
        }
        return new CartProductUiModel(strNufgyqmvbu, strPpxfxbqfkf, strGtknphoqwx, strAgtfadlqog, eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.ojitshcjhn(), eablkybsjgVar.draadjrbmk(), string, eablkybsjgVar.rgvfuqvkyq(), z14, z13, false, eablkybsjgVar.ojitshcjhn() == 0.0d, eablkybsjgVar.vdvldrhtss(), eablkybsjgVar.kcexrzcfyt(), eablkybsjgVar.jyumaefscl(), eablkybsjgVar.iwizpuwonk(), xt.iobyxmoadg.eablkybsjg(eablkybsjgVar.lqeggnwhkg()), eablkybsjgVar.eablkybsjg(), eablkybsjgVar.oxmwwwfdhm(), eablkybsjgVar.gxszxtbevo(), nufgyqmvbuVar, us.iobyxmoadg.READY, null, measureTypeModelPpxfxbqfkf, null, availabilityUiModelIobyxmoadg, null, counterModelIobyxmoadg, null, list, 704645120, null);
    }

    private final String ppxfxbqfkf(e10.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.agtfadlqog().eablkybsjg().isEmpty()) {
            return jyumaefscl.iwxlajgraz(kcexrzcfyt.ixidwrxhsl(iobyxmoadgVar.lqeggnwhkg(), new String[]{".,"}, false, 0, 6, null), "\n", null, null, 0, null, new draadjrbmk() { // from class: ic0.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ppxfxbqfkf.eablkybsjg((String) obj);
                }
            }, 30, null);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iobyxmoadgVar.agtfadlqog().eablkybsjg().iterator();
        while (it.hasNext()) {
            List items = ((CommentReferences) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList2.add(wkgbmnqykc((Reference) it2.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return kcexrzcfyt.p(jyumaefscl.iwxlajgraz(arrayList, "\n", null, null, 0, null, null, 62, null)).toString();
    }

    private static final String wkgbmnqykc(Reference reference) {
        StringBuilder sb3 = new StringBuilder();
        if (zoijcleaow.f42397zoijcleaow[reference.getType().ordinal()] == 1) {
            sb3.append(reference.getText());
        } else {
            sb3.append(reference.getName());
        }
        return sb3.toString();
    }

    public final iwizpuwonk lqeggnwhkg(e10.iobyxmoadg model, List list, boolean z13) {
        zdlpuopuiu.btonecajqb(model, "model");
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList();
        Iterator it = listPpxfxbqfkf.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) it.next();
            CartProductUiModel cartProductUiModelNufgyqmvbu = null;
            Object obj = null;
            ProductUIData productUIData = null;
            eablkybsjg eablkybsjgVar2 = !(eablkybsjgVar.rgvfuqvkyq() == 0.0d) ? eablkybsjgVar : null;
            if (eablkybsjgVar2 != null) {
                if (list != null) {
                    for (Object obj2 : list) {
                        if (zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), eablkybsjgVar.nufgyqmvbu())) {
                            obj = obj2;
                            break;
                        }
                    }
                    productUIData = (ProductUIData) obj;
                }
                cartProductUiModelNufgyqmvbu = nufgyqmvbu(eablkybsjgVar2, productUIData, z13);
            }
            if (cartProductUiModelNufgyqmvbu != null) {
                arrayList.add(cartProductUiModelNufgyqmvbu);
            }
        }
        iwizpuwonk.iobyxmoadg iobyxmoadgVar = model.wflxmlrfwp().ppxfxbqfkf().length() > 0 ? model.wflxmlrfwp().wkgbmnqykc() ? iwizpuwonk.iobyxmoadg.APPLIED : iwizpuwonk.iobyxmoadg.NOT_APPLIED : iwizpuwonk.iobyxmoadg.NOT_ENTERED;
        d60.iobyxmoadg iobyxmoadgVar2 = this.f42393iobyxmoadg;
        DeliveryCode deliveryCodeEablkybsjg = model.eablkybsjg();
        String string = iobyxmoadgVar2.getString((deliveryCodeEablkybsjg == null ? -1 : zoijcleaow.f42395iobyxmoadg[deliveryCodeEablkybsjg.ordinal()]) == 1 ? dxjokdxxww.edit_order_pickup_title : dxjokdxxww.edit_order_delivery_title);
        String string2 = this.f42393iobyxmoadg.getString(dxjokdxxww.format_order_number, model.nufgyqmvbu());
        LocalDateTime localDateTimeIobyxmoadg = model.dxjokdxxww().iobyxmoadg();
        String string3 = this.f42393iobyxmoadg.getString(dxjokdxxww.space_format, model.agtfadlqog().dxjokdxxww(), model.agtfadlqog().btonecajqb());
        String strGtknphoqwx = model.agtfadlqog().gtknphoqwx();
        String strNufgyqmvbu = model.agtfadlqog().nufgyqmvbu();
        String strPpxfxbqfkf = model.agtfadlqog().ppxfxbqfkf();
        String string4 = this.f42393iobyxmoadg.getString(dxjokdxxww.space_format, model.agtfadlqog().gxszxtbevo(), model.agtfadlqog().lqeggnwhkg());
        String string5 = this.f42393iobyxmoadg.getString(model.btonecajqb().getTitleStringRes());
        String strBtonecajqb = btonecajqb(model.gtknphoqwx());
        double dPpxfxbqfkf = model.rgvfuqvkyq().ppxfxbqfkf();
        String strGxszxtbevo = gxszxtbevo(model.rgvfuqvkyq().gxszxtbevo());
        String strGxszxtbevo2 = gxszxtbevo(model.rgvfuqvkyq().wkgbmnqykc());
        String strGxszxtbevo3 = gxszxtbevo(model.rgvfuqvkyq().nufgyqmvbu());
        String strPpxfxbqfkf2 = model.wflxmlrfwp().ppxfxbqfkf();
        String strPpxfxbqfkf3 = ppxfxbqfkf(model);
        List listVdvldrhtss = model.vdvldrhtss();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listVdvldrhtss, 10));
        Iterator it2 = listVdvldrhtss.iterator();
        while (it2.hasNext()) {
            arrayList2.add(bu.iobyxmoadg.iobyxmoadg((OrderTotalInfoItem) it2.next()));
        }
        return new iwizpuwonk(string2, localDateTimeIobyxmoadg, string3, strGtknphoqwx, strNufgyqmvbu, string, strPpxfxbqfkf, string4, string5, strBtonecajqb, arrayList, Double.valueOf(dPpxfxbqfkf), strGxszxtbevo, strGxszxtbevo2, strGxszxtbevo3, strPpxfxbqfkf2, iobyxmoadgVar, strPpxfxbqfkf3, false, arrayList2, model.gtknphoqwx(), model.draadjrbmk(), model.agtfadlqog().wkgbmnqykc(), Double.valueOf(model.rgvfuqvkyq().nufgyqmvbu()), 262144, null);
    }
}
