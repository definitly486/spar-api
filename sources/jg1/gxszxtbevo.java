package jg1;

import fg1.vdvldrhtss;
import gg.cqumvgiudr;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.proloyalty.core.domain.models.order.RemovedOrderProduct;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.State;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jg1.iobyxmoadg f51280yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f51281zdlpuopuiu;

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Boolean.valueOf(((lt0.ppxfxbqfkf) obj2).iobyxmoadg().vdvldrhtss()), Boolean.valueOf(((lt0.ppxfxbqfkf) obj).iobyxmoadg().vdvldrhtss()));
        }
    }

    public gxszxtbevo(q41.iobyxmoadg resourcesManager, jg1.iobyxmoadg orderProductsUiMapper) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(orderProductsUiMapper, "orderProductsUiMapper");
        this.f51281zdlpuopuiu = resourcesManager;
        this.f51280yggfygwlhe = orderProductsUiMapper;
    }

    private final vdvldrhtss agtfadlqog(State state) {
        List listIobyxmoadg = this.f51280yggfygwlhe.iobyxmoadg(state.getProducts(), state.getDeliveryCode());
        boolean z13 = state.getIsOneProductReplacement() || state.getIsOneProductUnavailable();
        gg.vdvldrhtss vdvldrhtssVarEablkybsjg = eablkybsjg(listIobyxmoadg, z13);
        List list = (List) vdvldrhtssVarEablkybsjg.iobyxmoadg();
        List list2 = (List) vdvldrhtssVarEablkybsjg.wkgbmnqykc();
        String id2 = state.getId();
        String string = this.f51281zdlpuopuiu.getString(lqeggnwhkg.proloyalty_format_order_number_2, state.getId());
        String strBtonecajqb = btonecajqb(state.getReceiver());
        String strGtknphoqwx = gtknphoqwx(state.getRecipientPhone());
        String deliveryPhone = state.getDeliveryPhone();
        String strLqeggnwhkg = lqeggnwhkg(state.getEmail());
        String partnerCode = state.getPartnerCode();
        String partnerType = state.getPartnerType();
        String partnerName = state.getPartnerName();
        String deliveryMethod = state.getDeliveryMethod();
        String address = state.getAddress();
        String strIobyxmoadg = iobyxmoadg(state.getDeliveryTime().getDeliveryDate(), state.getDeliveryTime().getDeliveryHours());
        int titleStringRes = state.getOrderStatus().getTitleStringRes();
        String title = state.getPayment().getTitle();
        String totalDiscount = state.getTotalDiscount();
        String totalWeight = state.getTotalWeight();
        String strZoijcleaow = zoijcleaow(state.getTotalPrice());
        boolean canRate = state.getCanRate();
        int rating = state.getRating();
        boolean isRatedOrder = state.getIsRatedOrder();
        boolean cancelOrderButtonIsVisible = state.getCancelOrderButtonIsVisible();
        boolean callButtonIsVisible = state.getCallButtonIsVisible();
        boolean isCanBePaid = state.getPayment().getIsCanBePaid();
        boolean z14 = state.getPayButtonsIsEnabled() && !state.getIsLoading();
        boolean editOrderIsVisible = state.getEditOrderIsVisible();
        boolean isOrderBlockedForEdit = state.getIsOrderBlockedForEdit();
        boolean trackingButtonIsVisible = state.getTrackingButtonIsVisible();
        boolean repeatOrderIsVisible = state.getRepeatOrderIsVisible();
        OrderPickupStatus pickupStatus = state.getPickupStatus();
        boolean isProductsClickable = state.getIsProductsClickable();
        boolean isPartnerInfoVisible = state.getIsPartnerInfoVisible();
        boolean isPickupStatusButtonFeatureEnabled = state.getIsPickupStatusButtonFeatureEnabled();
        boolean isLoading = state.getIsLoading();
        String strWflxmlrfwp = wflxmlrfwp(state.getRemainTime());
        boolean isOneProductReplacement = state.getIsOneProductReplacement();
        boolean isOneProductAvailableWithoutReplacement = state.getIsOneProductAvailableWithoutReplacement();
        boolean isOneProductAvailableWithoutReplacement2 = state.getIsOneProductAvailableWithoutReplacement();
        boolean z15 = state.getMessage().length() > 0;
        String message = state.getMessage();
        boolean confirmBtnEnabled = state.getConfirmBtnEnabled();
        String postamatCode = state.getPostamatCode();
        boolean tipsAvailable = state.getTipsAvailable();
        List totalInfo = state.getTotalInfo();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(totalInfo, 10));
        Iterator it = totalInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(vs0.iobyxmoadg.iobyxmoadg((OrderTotalInfoItem) it.next()));
        }
        List removedProducts = state.getRemovedProducts();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(removedProducts, 10));
        Iterator it2 = removedProducts.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ojitshcjhn((RemovedOrderProduct) it2.next()));
        }
        return new vdvldrhtss(id2, string, strBtonecajqb, strGtknphoqwx, deliveryPhone, strLqeggnwhkg, partnerCode, partnerType, partnerName, deliveryMethod, address, strIobyxmoadg, titleStringRes, title, totalDiscount, totalWeight, strZoijcleaow, canRate, rating, isRatedOrder, cancelOrderButtonIsVisible, callButtonIsVisible, isCanBePaid, z14, editOrderIsVisible, isOrderBlockedForEdit, trackingButtonIsVisible, repeatOrderIsVisible, pickupStatus, isProductsClickable, isPartnerInfoVisible, isPickupStatusButtonFeatureEnabled, isLoading, strWflxmlrfwp, z13, isOneProductReplacement, isOneProductAvailableWithoutReplacement, isOneProductAvailableWithoutReplacement2, z15, confirmBtnEnabled, message, postamatCode, tipsAvailable, arrayList, list, arrayList2, list2);
    }

    private final String btonecajqb(String str) {
        return str;
    }

    private final gg.vdvldrhtss eablkybsjg(List list, boolean z13) {
        if (!z13) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it0.iobyxmoadg.iobyxmoadg(((lt0.ppxfxbqfkf) it.next()).iobyxmoadg()));
            }
            return cqumvgiudr.iobyxmoadg(arrayList, jyumaefscl.wflxmlrfwp());
        }
        gg.vdvldrhtss vdvldrhtssVarPpxfxbqfkf = ppxfxbqfkf(list);
        Iterable iterable = (Iterable) vdvldrhtssVarPpxfxbqfkf.lqeggnwhkg();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it0.iobyxmoadg.iobyxmoadg(((lt0.ppxfxbqfkf) it2.next()).iobyxmoadg()));
        }
        return cqumvgiudr.iobyxmoadg(arrayList2, jyumaefscl.d((Iterable) vdvldrhtssVarPpxfxbqfkf.nufgyqmvbu(), new iobyxmoadg()));
    }

    private final String gtknphoqwx(String str) {
        return str;
    }

    private final String iobyxmoadg(String str, String str2) {
        return this.f51281zdlpuopuiu.getString(lqeggnwhkg.proloyalty_space_format, str, str2);
    }

    private final String lqeggnwhkg(String str) {
        return str;
    }

    private final jt0.wkgbmnqykc ojitshcjhn(RemovedOrderProduct removedOrderProduct) {
        return new jt0.wkgbmnqykc(removedOrderProduct.getId(), removedOrderProduct.getArticle(), removedOrderProduct.getName(), removedOrderProduct.getImageUrl(), null, false, MeasureTypeModel.INSTANCE.iobyxmoadg(), new CounterModel(false, false, false, new Price(dxjokdxxww.ppxfxbqfkf(), dxjokdxxww.ppxfxbqfkf(), 0.0d), null, null, false, 0.0d, false, MeasureType.INSTANCE.zoijcleaow(), null, null, false, null, 15671, null), null, new AvailabilityUiModel(true, true, dxjokdxxww.ppxfxbqfkf(), dxjokdxxww.ppxfxbqfkf()), 0, dxjokdxxww.ppxfxbqfkf(), dxjokdxxww.ppxfxbqfkf(), jyumaefscl.wflxmlrfwp(), null, null, false, null, false, null, null);
    }

    private final gg.vdvldrhtss ppxfxbqfkf(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((lt0.ppxfxbqfkf) obj).iobyxmoadg().eablkybsjg()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new gg.vdvldrhtss(arrayList, arrayList2);
    }

    private final String wflxmlrfwp(int i13) {
        return kcexrzcfyt.tbqsvytpvh(String.valueOf(i13 / 60), 2, '0') + StringUtils.PROCESS_POSTFIX_DELIMITER + kcexrzcfyt.tbqsvytpvh(String.valueOf(i13 % 60), 2, '0');
    }

    private final String zoijcleaow(double d13) {
        return this.f51281zdlpuopuiu.getString(lqeggnwhkg.proloyalty_approximate_price_format, t11.iobyxmoadg.f109303iobyxmoadg.gxszxtbevo(Double.valueOf(d13)));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public vdvldrhtss invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return agtfadlqog(state);
    }
}
