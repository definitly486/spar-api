package my;

import gy.CartInfoItemEntity;
import gy.CartProductEntity;
import gy.CartProductUnitEntity;
import gy.CartProgressBarDeliveryTermsEntity;
import gy.CartProgressBarRapidEntity;
import gy.ProductLimitEntity;
import gy.agtfadlqog;
import gy.draadjrbmk;
import gy.gtknphoqwx;
import gy.nufgyqmvbu;
import gy.ppxfxbqfkf;
import gy.wflxmlrfwp;
import hg.jyumaefscl;
import hy.btonecajqb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.OrderProperties;
import ru.myspar.core.domain.models.cart.AvailableInterval;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartBonuses;
import ru.myspar.core.domain.models.cart.CartEvropolis;
import ru.myspar.core.domain.models.cart.CartInfoItem;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.cart.CartProgressBar;
import ru.myspar.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.core.domain.models.cart.CartReceiver;
import ru.myspar.core.domain.models.cart.CartSum;
import ru.myspar.core.domain.models.cart.CartUnavailableOrderReason;
import ru.myspar.core.domain.models.cart.DeliveryInfo;
import ru.myspar.core.domain.models.cart.IntervalInfo;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final btonecajqb agtfadlqog(OrderProperties orderProperties) {
        zdlpuopuiu.btonecajqb(orderProperties, "<this>");
        return new btonecajqb(orderProperties.getMinPrice(), orderProperties.getFreeDeliveryFrom(), orderProperties.getBasketSum());
    }

    public static final gtknphoqwx btonecajqb(CartSum cartSum) {
        zdlpuopuiu.btonecajqb(cartSum, "<this>");
        return new gtknphoqwx(cartSum.getBasket(), Double.valueOf(cartSum.getDiscount()), Double.valueOf(cartSum.getDelivery()), Double.valueOf(cartSum.getOverweight()), cartSum.getWeight(), Double.valueOf(cartSum.getTotal()), Integer.valueOf(cartSum.getCount()));
    }

    public static final wflxmlrfwp draadjrbmk(DeliveryInfo deliveryInfo) {
        zdlpuopuiu.btonecajqb(deliveryInfo, "<this>");
        String title = deliveryInfo.getTitle();
        String subtitle = deliveryInfo.getSubtitle();
        String price = deliveryInfo.getPrice();
        DeliveryCode deliveryType = deliveryInfo.getDeliveryType();
        return new wflxmlrfwp(title, subtitle, price, deliveryType != null ? deliveryType.getServerCode() : null, deliveryInfo.getShopId());
    }

    public static final gy.btonecajqb dxjokdxxww(CartReceiver cartReceiver) {
        zdlpuopuiu.btonecajqb(cartReceiver, "<this>");
        return new gy.btonecajqb(cartReceiver.getName(), cartReceiver.getPhone());
    }

    public static final CartInfoItemEntity eablkybsjg(CartInfoItem cartInfoItem) {
        zdlpuopuiu.btonecajqb(cartInfoItem, "<this>");
        return new CartInfoItemEntity(cartInfoItem.getTitle(), cartInfoItem.getValue(), cartInfoItem.getTooltip());
    }

    private static final draadjrbmk gtknphoqwx(CartUnavailableOrderReason cartUnavailableOrderReason) {
        return new draadjrbmk(cartUnavailableOrderReason.getCanCreateOrder(), cartUnavailableOrderReason.getReasonMessage());
    }

    public static final CartProductEntity gxszxtbevo(CartProduct cartProduct) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(cartProduct, "<this>");
        List<MeasureType> units = cartProduct.getMeasureTypeModel().getUnits();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(units, 10));
        for (MeasureType measureType : units) {
            arrayList2.add(new CartProductUnitEntity(measureType.getValue(), measureType.getMinAvailable(), measureType.getRatio(), measureType.getBasketDefault()));
        }
        List<ProductLimit> listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(cartProduct.getLimits());
        if (listIobyxmoadg != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (ProductLimit productLimit : listIobyxmoadg) {
                arrayList3.add(new ProductLimitEntity(productLimit.getMeasureType(), productLimit.getQuantity()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String id2 = cartProduct.getId();
        String article = cartProduct.getArticle();
        String name = cartProduct.getName();
        double price = cartProduct.getPrice();
        Double oldPrice = cartProduct.getOldPrice();
        int percent = cartProduct.getPercent();
        List listBtonecajqb = mq.iobyxmoadg.btonecajqb(cartProduct.getHints());
        String value = cartProduct.getMeasureTypeModel().getCurrentMeasure().getValue();
        double weight = cartProduct.getWeight();
        Double avgWeight = cartProduct.getAvgWeight();
        String pic = cartProduct.getPic();
        double quantity = cartProduct.getQuantity();
        boolean isFavorite = cartProduct.getIsFavorite();
        String strName = cartProduct.getAvailability().name();
        AvailableInterval availableInterval = cartProduct.getAvailableInterval();
        String from = availableInterval != null ? availableInterval.getFrom() : null;
        AvailableInterval availableInterval2 = cartProduct.getAvailableInterval();
        return new CartProductEntity(id2, article, name, price, oldPrice, percent, value, weight, avgWeight, cartProduct.getRating(), cartProduct.getReviewsCount(), cartProduct.getCountry(), cartProduct.getRegion(), cartProduct.getCountryFlagEmoji(), arrayList2, pic, quantity, isFavorite, strName, from, availableInterval2 != null ? availableInterval2.getTo() : null, arrayList, cartProduct.getIsDispPer100(), listBtonecajqb);
    }

    public static final fy.zoijcleaow iobyxmoadg(Promocode promocode) {
        zdlpuopuiu.btonecajqb(promocode, "<this>");
        return new fy.zoijcleaow(promocode.getValue(), promocode.getStatus(), 0.0d, promocode.getStatusText(), 4, null);
    }

    public static final CartProgressBarDeliveryTermsEntity lqeggnwhkg(CartProgressBarDeliveryTerms cartProgressBarDeliveryTerms) {
        zdlpuopuiu.btonecajqb(cartProgressBarDeliveryTerms, "<this>");
        String deliveryTypeTitle = cartProgressBarDeliveryTerms.getDeliveryTypeTitle();
        String deliveryPriceTitle = cartProgressBarDeliveryTerms.getDeliveryPriceTitle();
        String sumForFreeDeliveryText = cartProgressBarDeliveryTerms.getSumForFreeDeliveryText();
        List<CartProgressBarRapid> rapids = cartProgressBarDeliveryTerms.getRapids();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(rapids, 10));
        for (CartProgressBarRapid cartProgressBarRapid : rapids) {
            arrayList.add(new CartProgressBarRapidEntity(cartProgressBarRapid.getImageUrl(), cartProgressBarRapid.getTitle(), cartProgressBarRapid.getMessageList()));
        }
        return new CartProgressBarDeliveryTermsEntity(deliveryTypeTitle, deliveryPriceTitle, sumForFreeDeliveryText, arrayList);
    }

    public static final nufgyqmvbu nufgyqmvbu(CartProgressBar cartProgressBar) {
        zdlpuopuiu.btonecajqb(cartProgressBar, "<this>");
        String title = cartProgressBar.getTitle();
        double currentValue = cartProgressBar.getCurrentValue();
        double neededValue = cartProgressBar.getNeededValue();
        String valuesDifference = cartProgressBar.getValuesDifference();
        String progressColor = cartProgressBar.getProgressColor();
        CartProgressBarDeliveryTerms deliveryTerms = cartProgressBar.getDeliveryTerms();
        return new nufgyqmvbu(title, currentValue, neededValue, valuesDifference, progressColor, deliveryTerms != null ? lqeggnwhkg(deliveryTerms) : null);
    }

    public static final gy.zoijcleaow ppxfxbqfkf(Cart cart) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(cart, "<this>");
        List basket = cart.getBasket();
        if (basket == null) {
            basket = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
        Iterator it = basket.iterator();
        while (it.hasNext()) {
            arrayList2.add(gxszxtbevo((CartProduct) it.next()));
        }
        long id2 = cart.getId();
        wflxmlrfwp wflxmlrfwpVarDraadjrbmk = draadjrbmk(cart.getDeliveryInfo());
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        agtfadlqog agtfadlqogVarWflxmlrfwp = intervalInfo != null ? wflxmlrfwp(intervalInfo) : null;
        String partnerCode = cart.getPartnerCode();
        String payment = cart.getPayment();
        CartSum sum = cart.getSum();
        gtknphoqwx gtknphoqwxVarBtonecajqb = sum != null ? btonecajqb(sum) : null;
        Promocode promocode = cart.getPromocode();
        fy.zoijcleaow zoijcleaowVarIobyxmoadg = promocode != null ? iobyxmoadg(promocode) : null;
        OrderProperties orderProperties = cart.getOrderProperties();
        btonecajqb btonecajqbVarAgtfadlqog = orderProperties != null ? agtfadlqog(orderProperties) : null;
        CartEvropolis evropolis = cart.getEvropolis();
        ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = evropolis != null ? wkgbmnqykc(evropolis) : null;
        CartBonuses cartBonuses = cart.getCartBonuses();
        gy.iobyxmoadg iobyxmoadgVarZoijcleaow = cartBonuses != null ? zoijcleaow(cartBonuses) : null;
        CartReceiver receiver = cart.getReceiver();
        gy.btonecajqb btonecajqbVarDxjokdxxww = receiver != null ? dxjokdxxww(receiver) : null;
        CartProgressBar progressBar = cart.getProgressBar();
        nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = progressBar != null ? nufgyqmvbu(progressBar) : null;
        List cartInfoList = cart.getCartInfoList();
        if (cartInfoList != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(cartInfoList, 10));
            Iterator it2 = cartInfoList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(eablkybsjg((CartInfoItem) it2.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        double orderSum = cart.getOrderSum();
        String orderSumNoDiscounts = cart.getOrderSumNoDiscounts();
        draadjrbmk draadjrbmkVarGtknphoqwx = gtknphoqwx(cart.getUnavailableOrderReason());
        List selectedComments = cart.getSelectedComments();
        return new gy.zoijcleaow(id2, wflxmlrfwpVarDraadjrbmk, agtfadlqogVarWflxmlrfwp, partnerCode, btonecajqbVarAgtfadlqog, arrayList2, gtknphoqwxVarBtonecajqb, payment, zoijcleaowVarIobyxmoadg, ppxfxbqfkfVarWkgbmnqykc, iobyxmoadgVarZoijcleaow, btonecajqbVarDxjokdxxww, nufgyqmvbuVarNufgyqmvbu, arrayList, orderSum, orderSumNoDiscounts, draadjrbmkVarGtknphoqwx, selectedComments != null ? py.nufgyqmvbu.ppxfxbqfkf(selectedComments) : null, dw.iobyxmoadg.lqeggnwhkg(cart.getPayments()));
    }

    public static final agtfadlqog wflxmlrfwp(IntervalInfo intervalInfo) {
        zdlpuopuiu.btonecajqb(intervalInfo, "<this>");
        return new agtfadlqog(intervalInfo.getTitle(), intervalInfo.getSubtitle(), intervalInfo.getDate(), intervalInfo.getTime(), intervalInfo.getIsOnlyOne());
    }

    public static final ppxfxbqfkf wkgbmnqykc(CartEvropolis cartEvropolis) {
        zdlpuopuiu.btonecajqb(cartEvropolis, "<this>");
        return new ppxfxbqfkf(cartEvropolis.getProgress(), cartEvropolis.getImage(), cartEvropolis.getText());
    }

    public static final gy.iobyxmoadg zoijcleaow(CartBonuses cartBonuses) {
        zdlpuopuiu.btonecajqb(cartBonuses, "<this>");
        return new gy.iobyxmoadg(cartBonuses.getAvailable(), cartBonuses.getBalance(), cartBonuses.getApplied(), cartBonuses.getTooltip());
    }
}
