package hx0;

import bx0.CartInfoItemEntity;
import bx0.CartProductEntity;
import bx0.CartProductUnitEntity;
import bx0.CartProgressBarDeliveryTermsEntity;
import bx0.CartProgressBarRapidEntity;
import bx0.ProductLimitEntity;
import bx0.agtfadlqog;
import bx0.nufgyqmvbu;
import bx0.ppxfxbqfkf;
import bx0.wflxmlrfwp;
import cx0.btonecajqb;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jx0.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import px0.MeasureParamsDto;
import ru.myspar.proloyalty.core.domain.models.OrderProperties;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.cart.CartEvropolis;
import ru.myspar.proloyalty.core.domain.models.cart.CartInfoItem;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBar;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;
import ru.myspar.proloyalty.core.domain.models.cart.CartSum;
import ru.myspar.proloyalty.core.domain.models.cart.CartUnavailableOrderReason;
import ru.myspar.proloyalty.core.domain.models.cart.DeliveryInfo;
import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;
import ru.myspar.proloyalty.core.domain.models.interval.DateWithInterval;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import tg.draadjrbmk;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f41250zdlpuopuiu;

    public zoijcleaow(lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f41250zdlpuopuiu = measureTypeModelMapper;
    }

    private final CartProgressBar agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        String strEablkybsjg = nufgyqmvbuVar.eablkybsjg();
        double dIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
        double dPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        String strGxszxtbevo = nufgyqmvbuVar.gxszxtbevo();
        String strWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc();
        CartProgressBarDeliveryTermsEntity cartProgressBarDeliveryTermsEntityZoijcleaow = nufgyqmvbuVar.zoijcleaow();
        return new CartProgressBar(strEablkybsjg, dIobyxmoadg, dPpxfxbqfkf, strGxszxtbevo, strWkgbmnqykc, cartProgressBarDeliveryTermsEntityZoijcleaow != null ? ojitshcjhn(cartProgressBarDeliveryTermsEntityZoijcleaow) : null);
    }

    private final CartEvropolis btonecajqb(ppxfxbqfkf ppxfxbqfkfVar) {
        return new CartEvropolis(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf());
    }

    private final Map cqumvgiudr(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CartProductUnitEntity cartProductUnitEntity = (CartProductUnitEntity) it.next();
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(cartProductUnitEntity.getKey(), new MeasureParamsDto(Double.valueOf(cartProductUnitEntity.getBasketDefault()), Double.valueOf(cartProductUnitEntity.getMinAvailable()), Double.valueOf(cartProductUnitEntity.getRatio())));
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }

    private final CartInfoItem gtknphoqwx(CartInfoItemEntity cartInfoItemEntity) {
        return new CartInfoItem(cartInfoItemEntity.getTitle(), cartInfoItemEntity.getValue(), cartInfoItemEntity.getTooltip());
    }

    private final OrderProperties gxszxtbevo(btonecajqb btonecajqbVar) {
        return new OrderProperties(btonecajqbVar.ppxfxbqfkf(), btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg());
    }

    private final Promocode iwizpuwonk(ax0.zoijcleaow zoijcleaowVar) {
        String strWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        return new Promocode(strWkgbmnqykc, zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf());
    }

    private final IntervalInfo jyumaefscl(agtfadlqog agtfadlqogVar) {
        return new IntervalInfo(agtfadlqogVar.wkgbmnqykc(), agtfadlqogVar.zoijcleaow(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.eablkybsjg());
    }

    private final CartSum kcexrzcfyt(bx0.gtknphoqwx gtknphoqwxVar) {
        double dIobyxmoadg = gtknphoqwxVar.iobyxmoadg();
        Double dWkgbmnqykc = gtknphoqwxVar.wkgbmnqykc();
        double dDoubleValue = dWkgbmnqykc != null ? dWkgbmnqykc.doubleValue() : 0.0d;
        Double dPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf();
        double dDoubleValue2 = dPpxfxbqfkf != null ? dPpxfxbqfkf.doubleValue() : 0.0d;
        Double dEablkybsjg = gtknphoqwxVar.eablkybsjg();
        double dDoubleValue3 = dEablkybsjg != null ? dEablkybsjg.doubleValue() : 0.0d;
        double dLqeggnwhkg = gtknphoqwxVar.lqeggnwhkg();
        Double dGxszxtbevo = gtknphoqwxVar.gxszxtbevo();
        double dDoubleValue4 = dGxszxtbevo != null ? dGxszxtbevo.doubleValue() : 0.0d;
        Integer numZoijcleaow = gtknphoqwxVar.zoijcleaow();
        return new CartSum(dIobyxmoadg, dDoubleValue, dDoubleValue2, dDoubleValue3, dLqeggnwhkg, dDoubleValue4, numZoijcleaow != null ? numZoijcleaow.intValue() : 0);
    }

    private final CartBonuses lqeggnwhkg(bx0.iobyxmoadg iobyxmoadgVar) {
        return new CartBonuses(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc());
    }

    private final CartProgressBarDeliveryTerms ojitshcjhn(CartProgressBarDeliveryTermsEntity cartProgressBarDeliveryTermsEntity) {
        String deliveryTypeTitle = cartProgressBarDeliveryTermsEntity.getDeliveryTypeTitle();
        String deliveryPriceTitle = cartProgressBarDeliveryTermsEntity.getDeliveryPriceTitle();
        String sumForFreeDeliveryText = cartProgressBarDeliveryTermsEntity.getSumForFreeDeliveryText();
        List<CartProgressBarRapidEntity> rapids = cartProgressBarDeliveryTermsEntity.getRapids();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(rapids, 10));
        for (CartProgressBarRapidEntity cartProgressBarRapidEntity : rapids) {
            arrayList.add(new CartProgressBarRapid(cartProgressBarRapidEntity.getImageUrl(), cartProgressBarRapidEntity.getTitle(), cartProgressBarRapidEntity.getMessageList()));
        }
        return new CartProgressBarDeliveryTerms(deliveryTypeTitle, deliveryPriceTitle, sumForFreeDeliveryText, arrayList);
    }

    private final CartReceiver oxmwwwfdhm(bx0.btonecajqb btonecajqbVar) {
        return new CartReceiver(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
    }

    private final CartProduct wflxmlrfwp(CartProductEntity cartProductEntity) {
        Double d13;
        String str;
        ArrayList arrayList;
        String id2 = cartProductEntity.getId();
        String article = cartProductEntity.getArticle();
        String pic = cartProductEntity.getPic();
        String name = cartProductEntity.getName();
        double price = cartProductEntity.getPrice();
        Double oldPrice = cartProductEntity.getOldPrice();
        double quantity = cartProductEntity.getQuantity();
        Double avgWeight = cartProductEntity.getAvgWeight();
        int percent = cartProductEntity.getPercent();
        List listNufgyqmvbu = yo0.iobyxmoadg.nufgyqmvbu(cartProductEntity.getHints());
        double weight = cartProductEntity.getWeight();
        Double rating = cartProductEntity.getRating();
        int reviewsCount = cartProductEntity.getReviewsCount();
        String country = cartProductEntity.getCountry();
        String region = cartProductEntity.getRegion();
        String countryFlagEmoji = cartProductEntity.getCountryFlagEmoji();
        boolean isFavorite = cartProductEntity.getIsFavorite();
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f41250zdlpuopuiu.ppxfxbqfkf(cqumvgiudr(cartProductEntity.getUnits()), cartProductEntity.getMeasure());
        List limits = cartProductEntity.getLimits();
        if (limits != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
            Iterator it = limits.iterator();
            while (it.hasNext()) {
                ProductLimitEntity productLimitEntity = (ProductLimitEntity) it.next();
                arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                it = it;
                pic = pic;
                avgWeight = avgWeight;
            }
            d13 = avgWeight;
            str = pic;
        } else {
            d13 = avgWeight;
            str = pic;
            arrayList = null;
        }
        List listWflxmlrfwp = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        boolean isDispPer100 = cartProductEntity.getIsDispPer100();
        boolean isAvailable = cartProductEntity.getIsAvailable();
        String unavailableReason = cartProductEntity.getUnavailableReason();
        if (unavailableReason == null) {
            unavailableReason = "";
        }
        return new CartProduct(id2, article, name, price, oldPrice, percent, listNufgyqmvbu, weight, d13, str, quantity, rating, reviewsCount, country, region, countryFlagEmoji, isFavorite, isDispPer100, false, measureTypeModelPpxfxbqfkf, listWflxmlrfwp, isAvailable, unavailableReason, 262144, null);
    }

    private final DeliveryInfo yggfygwlhe(wflxmlrfwp wflxmlrfwpVar) {
        return new DeliveryInfo(wflxmlrfwpVar.eablkybsjg(), wflxmlrfwpVar.wkgbmnqykc(), wflxmlrfwpVar.zoijcleaow(), DeliveryCode.INSTANCE.iobyxmoadg(wflxmlrfwpVar.iobyxmoadg()), wflxmlrfwpVar.ppxfxbqfkf());
    }

    private final CartUnavailableOrderReason zdlpuopuiu(bx0.draadjrbmk draadjrbmkVar) {
        return new CartUnavailableOrderReason(draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
    }

    public final DeliveryInfo eablkybsjg(bx0.zoijcleaow entity) {
        zdlpuopuiu.btonecajqb(entity, "entity");
        return yggfygwlhe(entity.wkgbmnqykc());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Cart invoke(bx0.zoijcleaow entity) {
        ArrayList arrayList;
        CartUnavailableOrderReason cartUnavailableOrderReasonIobyxmoadg;
        zdlpuopuiu.btonecajqb(entity, "entity");
        long jGxszxtbevo = entity.gxszxtbevo();
        DeliveryInfo deliveryInfoYggfygwlhe = yggfygwlhe(entity.wkgbmnqykc());
        agtfadlqog agtfadlqogVarLqeggnwhkg = entity.lqeggnwhkg();
        IntervalInfo intervalInfoJyumaefscl = agtfadlqogVarLqeggnwhkg != null ? jyumaefscl(agtfadlqogVarLqeggnwhkg) : null;
        String strDraadjrbmk = entity.draadjrbmk();
        String strWflxmlrfwp = entity.wflxmlrfwp();
        bx0.gtknphoqwx gtknphoqwxVarOxmwwwfdhm = entity.oxmwwwfdhm();
        CartSum cartSumKcexrzcfyt = gtknphoqwxVarOxmwwwfdhm != null ? kcexrzcfyt(gtknphoqwxVarOxmwwwfdhm) : null;
        ax0.zoijcleaow zoijcleaowVarRgvfuqvkyq = entity.rgvfuqvkyq();
        Promocode promocodeIwizpuwonk = zoijcleaowVarRgvfuqvkyq != null ? iwizpuwonk(zoijcleaowVarRgvfuqvkyq) : null;
        btonecajqb btonecajqbVarDxjokdxxww = entity.dxjokdxxww();
        OrderProperties orderPropertiesGxszxtbevo = btonecajqbVarDxjokdxxww != null ? gxszxtbevo(btonecajqbVarDxjokdxxww) : null;
        List listIobyxmoadg = entity.iobyxmoadg();
        if (listIobyxmoadg == null) {
            listIobyxmoadg = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList2.add(wflxmlrfwp((CartProductEntity) it.next()));
        }
        ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = entity.eablkybsjg();
        CartEvropolis cartEvropolisBtonecajqb = ppxfxbqfkfVarEablkybsjg != null ? btonecajqb(ppxfxbqfkfVarEablkybsjg) : null;
        bx0.iobyxmoadg iobyxmoadgVarZoijcleaow = entity.zoijcleaow();
        CartBonuses cartBonusesLqeggnwhkg = iobyxmoadgVarZoijcleaow != null ? lqeggnwhkg(iobyxmoadgVarZoijcleaow) : null;
        bx0.btonecajqb btonecajqbVarVdvldrhtss = entity.vdvldrhtss();
        CartReceiver cartReceiverOxmwwwfdhm = btonecajqbVarVdvldrhtss != null ? oxmwwwfdhm(btonecajqbVarVdvldrhtss) : null;
        nufgyqmvbu nufgyqmvbuVarOjitshcjhn = entity.ojitshcjhn();
        CartProgressBar cartProgressBarAgtfadlqog = nufgyqmvbuVarOjitshcjhn != null ? agtfadlqog(nufgyqmvbuVarOjitshcjhn) : null;
        List listPpxfxbqfkf = entity.ppxfxbqfkf();
        if (listPpxfxbqfkf != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
            Iterator it2 = listPpxfxbqfkf.iterator();
            while (it2.hasNext()) {
                arrayList3.add(gtknphoqwx((CartInfoItemEntity) it2.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List listZoijcleaow = kx0.nufgyqmvbu.zoijcleaow(entity.nufgyqmvbu());
        double dBtonecajqb = entity.btonecajqb();
        String strGtknphoqwx = entity.gtknphoqwx();
        bx0.draadjrbmk draadjrbmkVarKcexrzcfyt = entity.kcexrzcfyt();
        if (draadjrbmkVarKcexrzcfyt == null || (cartUnavailableOrderReasonIobyxmoadg = zdlpuopuiu(draadjrbmkVarKcexrzcfyt)) == null) {
            cartUnavailableOrderReasonIobyxmoadg = CartUnavailableOrderReason.INSTANCE.iobyxmoadg();
        }
        CartUnavailableOrderReason cartUnavailableOrderReason = cartUnavailableOrderReasonIobyxmoadg;
        List listAgtfadlqog = entity.agtfadlqog();
        List listZoijcleaow2 = listAgtfadlqog != null ? xu0.iobyxmoadg.zoijcleaow(listAgtfadlqog) : null;
        return new Cart(jGxszxtbevo, deliveryInfoYggfygwlhe, intervalInfoJyumaefscl, strDraadjrbmk, strWflxmlrfwp, cartSumKcexrzcfyt, promocodeIwizpuwonk, orderPropertiesGxszxtbevo, arrayList2, null, false, null, cartEvropolisBtonecajqb, null, cartBonusesLqeggnwhkg, cartReceiverOxmwwwfdhm, cartProgressBarAgtfadlqog, arrayList, listZoijcleaow, dBtonecajqb, strGtknphoqwx, cartUnavailableOrderReason, listZoijcleaow2 == null ? jyumaefscl.wflxmlrfwp() : listZoijcleaow2, null, 8400384, null);
    }

    public final pz0.iobyxmoadg ppxfxbqfkf(bx0.zoijcleaow entity) {
        zdlpuopuiu.btonecajqb(entity, "entity");
        String strPpxfxbqfkf = entity.wkgbmnqykc().ppxfxbqfkf();
        if (strPpxfxbqfkf == null || kcexrzcfyt.zfvoamnweg(strPpxfxbqfkf)) {
            return null;
        }
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(entity.wkgbmnqykc().iobyxmoadg());
        String strPpxfxbqfkf2 = entity.wkgbmnqykc().ppxfxbqfkf();
        agtfadlqog agtfadlqogVarLqeggnwhkg = entity.lqeggnwhkg();
        String strIobyxmoadg = agtfadlqogVarLqeggnwhkg != null ? agtfadlqogVarLqeggnwhkg.iobyxmoadg() : null;
        if (strIobyxmoadg == null) {
            strIobyxmoadg = "";
        }
        agtfadlqog agtfadlqogVarLqeggnwhkg2 = entity.lqeggnwhkg();
        String strPpxfxbqfkf3 = agtfadlqogVarLqeggnwhkg2 != null ? agtfadlqogVarLqeggnwhkg2.ppxfxbqfkf() : null;
        return new pz0.iobyxmoadg(strPpxfxbqfkf2, deliveryCodeIobyxmoadg, new DateWithInterval(strIobyxmoadg, strPpxfxbqfkf3 != null ? strPpxfxbqfkf3 : ""));
    }

    public final List zoijcleaow(bx0.zoijcleaow zoijcleaowVar) {
        List<CartProductEntity> listIobyxmoadg;
        ArrayList arrayList;
        if (zoijcleaowVar == null || (listIobyxmoadg = zoijcleaowVar.iobyxmoadg()) == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        for (CartProductEntity cartProductEntity : listIobyxmoadg) {
            String id2 = cartProductEntity.getId();
            String article = cartProductEntity.getArticle();
            double quantity = cartProductEntity.getQuantity();
            MeasureType currentMeasure = this.f41250zdlpuopuiu.ppxfxbqfkf(cqumvgiudr(cartProductEntity.getUnits()), cartProductEntity.getMeasure()).getCurrentMeasure();
            List<ProductLimitEntity> limits = cartProductEntity.getLimits();
            if (limits != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
                for (ProductLimitEntity productLimitEntity : limits) {
                    arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new lz0.iobyxmoadg(id2, article, quantity, currentMeasure, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList));
        }
        return arrayList2;
    }
}
