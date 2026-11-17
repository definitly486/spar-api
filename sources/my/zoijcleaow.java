package my;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gy.CartInfoItemEntity;
import gy.CartProductEntity;
import gy.CartProductUnitEntity;
import gy.CartProgressBarDeliveryTermsEntity;
import gy.CartProgressBarRapidEntity;
import gy.ProductLimitEntity;
import gy.agtfadlqog;
import gy.ppxfxbqfkf;
import gy.wflxmlrfwp;
import hg.jyumaefscl;
import hg.tzroggbefp;
import hy.btonecajqb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import oy.lqeggnwhkg;
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
import ru.myspar.core.domain.models.interval.DateWithInterval;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.core.models.promocode.Promocode;
import t00.nufgyqmvbu;
import tg.draadjrbmk;
import uy.MeasureParamsDto;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f68087zdlpuopuiu;

    public zoijcleaow(lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f68087zdlpuopuiu = measureTypeModelMapper;
    }

    private final CartInfoItem agtfadlqog(CartInfoItemEntity cartInfoItemEntity) {
        return new CartInfoItem(cartInfoItemEntity.getTitle(), cartInfoItemEntity.getValue(), cartInfoItemEntity.getTooltip());
    }

    private final OrderProperties btonecajqb(btonecajqb btonecajqbVar) {
        return new OrderProperties(btonecajqbVar.ppxfxbqfkf(), btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg());
    }

    private final IntervalInfo cqumvgiudr(agtfadlqog agtfadlqogVar) {
        return new IntervalInfo(agtfadlqogVar.wkgbmnqykc(), agtfadlqogVar.zoijcleaow(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.eablkybsjg());
    }

    private final Promocode esjtqupxsv(fy.zoijcleaow zoijcleaowVar) {
        String strWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        return new Promocode(strWkgbmnqykc, zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf());
    }

    private final CartBonuses gtknphoqwx(gy.iobyxmoadg iobyxmoadgVar) {
        return new CartBonuses(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc());
    }

    private final nufgyqmvbu iobyxmoadg(CartProductEntity cartProductEntity) {
        return !kcexrzcfyt.zfvoamnweg(cartProductEntity.getAvailability()) ? nufgyqmvbu.valueOf(cartProductEntity.getAvailability()) : nufgyqmvbu.AVAILABLE;
    }

    private final DeliveryInfo iwizpuwonk(wflxmlrfwp wflxmlrfwpVar) {
        return new DeliveryInfo(wflxmlrfwpVar.eablkybsjg(), wflxmlrfwpVar.wkgbmnqykc(), wflxmlrfwpVar.zoijcleaow(), DeliveryCode.INSTANCE.iobyxmoadg(wflxmlrfwpVar.iobyxmoadg()), wflxmlrfwpVar.ppxfxbqfkf());
    }

    private final CartUnavailableOrderReason jyumaefscl(gy.draadjrbmk draadjrbmkVar) {
        return new CartUnavailableOrderReason(draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
    }

    private final CartProgressBarDeliveryTerms kcexrzcfyt(CartProgressBarDeliveryTermsEntity cartProgressBarDeliveryTermsEntity) {
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

    private final Map lereixgezr(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CartProductUnitEntity cartProductUnitEntity = (CartProductUnitEntity) it.next();
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(cartProductUnitEntity.getKey(), new MeasureParamsDto(Double.valueOf(cartProductUnitEntity.getBasketDefault()), Double.valueOf(cartProductUnitEntity.getMinAvailable()), Double.valueOf(cartProductUnitEntity.getRatio())));
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }

    private final CartProduct ojitshcjhn(CartProductEntity cartProductEntity) {
        double d13;
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
        List listNufgyqmvbu = mq.iobyxmoadg.nufgyqmvbu(cartProductEntity.getHints());
        double weight = cartProductEntity.getWeight();
        Double rating = cartProductEntity.getRating();
        int reviewsCount = cartProductEntity.getReviewsCount();
        String country = cartProductEntity.getCountry();
        String region = cartProductEntity.getRegion();
        String countryFlagEmoji = cartProductEntity.getCountryFlagEmoji();
        boolean isFavorite = cartProductEntity.getIsFavorite();
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg = iobyxmoadg(cartProductEntity);
        AvailableInterval availableIntervalZoijcleaow = zoijcleaow(cartProductEntity);
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f68087zdlpuopuiu.ppxfxbqfkf(lereixgezr(cartProductEntity.getUnits()), cartProductEntity.getMeasure());
        List limits = cartProductEntity.getLimits();
        if (limits != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
            Iterator it = limits.iterator();
            while (it.hasNext()) {
                ProductLimitEntity productLimitEntity = (ProductLimitEntity) it.next();
                arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                it = it;
                pic = pic;
                weight = weight;
            }
            d13 = weight;
            str = pic;
        } else {
            d13 = weight;
            str = pic;
            arrayList = null;
        }
        return new CartProduct(id2, article, nufgyqmvbuVarIobyxmoadg, name, price, oldPrice, percent, listNufgyqmvbu, d13, avgWeight, str, quantity, rating, reviewsCount, country, region, countryFlagEmoji, isFavorite, cartProductEntity.getIsDispPer100(), false, availableIntervalZoijcleaow, measureTypeModelPpxfxbqfkf, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList, 524288, null);
    }

    private final CartProgressBar oxmwwwfdhm(gy.nufgyqmvbu nufgyqmvbuVar) {
        String strEablkybsjg = nufgyqmvbuVar.eablkybsjg();
        double dIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
        double dPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        String strGxszxtbevo = nufgyqmvbuVar.gxszxtbevo();
        String strWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc();
        CartProgressBarDeliveryTermsEntity cartProgressBarDeliveryTermsEntityZoijcleaow = nufgyqmvbuVar.zoijcleaow();
        return new CartProgressBar(strEablkybsjg, dIobyxmoadg, dPpxfxbqfkf, strGxszxtbevo, strWkgbmnqykc, cartProgressBarDeliveryTermsEntityZoijcleaow != null ? kcexrzcfyt(cartProgressBarDeliveryTermsEntityZoijcleaow) : null);
    }

    private final CartEvropolis wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar) {
        return new CartEvropolis(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf());
    }

    private final CartSum yggfygwlhe(gy.gtknphoqwx gtknphoqwxVar) {
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

    private final CartReceiver zdlpuopuiu(gy.btonecajqb btonecajqbVar) {
        return new CartReceiver(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
    }

    private final AvailableInterval zoijcleaow(CartProductEntity cartProductEntity) {
        if (cartProductEntity.getAvailableFrom() == null || cartProductEntity.getAvailableTo() == null) {
            return null;
        }
        return new AvailableInterval(cartProductEntity.getAvailableFrom(), cartProductEntity.getAvailableTo());
    }

    public final List eablkybsjg(gy.zoijcleaow zoijcleaowVar) {
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
            MeasureType currentMeasure = this.f68087zdlpuopuiu.ppxfxbqfkf(lereixgezr(cartProductEntity.getUnits()), cartProductEntity.getMeasure()).getCurrentMeasure();
            List<ProductLimitEntity> limits = cartProductEntity.getLimits();
            if (limits != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
                for (ProductLimitEntity productLimitEntity : limits) {
                    arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new u00.iobyxmoadg(id2, article, quantity, currentMeasure, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList));
        }
        return arrayList2;
    }

    public final y00.iobyxmoadg gxszxtbevo(gy.zoijcleaow entity) {
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
        return new y00.iobyxmoadg(strPpxfxbqfkf2, deliveryCodeIobyxmoadg, new DateWithInterval(strIobyxmoadg, strPpxfxbqfkf3 != null ? strPpxfxbqfkf3 : ""));
    }

    public final DeliveryInfo lqeggnwhkg(gy.zoijcleaow entity) {
        zdlpuopuiu.btonecajqb(entity, "entity");
        return iwizpuwonk(entity.wkgbmnqykc());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Cart invoke(gy.zoijcleaow entity) {
        ArrayList arrayList;
        CartUnavailableOrderReason cartUnavailableOrderReasonIobyxmoadg;
        zdlpuopuiu.btonecajqb(entity, "entity");
        long jGxszxtbevo = entity.gxszxtbevo();
        DeliveryInfo deliveryInfoIwizpuwonk = iwizpuwonk(entity.wkgbmnqykc());
        agtfadlqog agtfadlqogVarLqeggnwhkg = entity.lqeggnwhkg();
        IntervalInfo intervalInfoCqumvgiudr = agtfadlqogVarLqeggnwhkg != null ? cqumvgiudr(agtfadlqogVarLqeggnwhkg) : null;
        String strDraadjrbmk = entity.draadjrbmk();
        String strWflxmlrfwp = entity.wflxmlrfwp();
        gy.gtknphoqwx gtknphoqwxVarOxmwwwfdhm = entity.oxmwwwfdhm();
        CartSum cartSumYggfygwlhe = gtknphoqwxVarOxmwwwfdhm != null ? yggfygwlhe(gtknphoqwxVarOxmwwwfdhm) : null;
        fy.zoijcleaow zoijcleaowVarRgvfuqvkyq = entity.rgvfuqvkyq();
        Promocode promocodeEsjtqupxsv = zoijcleaowVarRgvfuqvkyq != null ? esjtqupxsv(zoijcleaowVarRgvfuqvkyq) : null;
        btonecajqb btonecajqbVarDxjokdxxww = entity.dxjokdxxww();
        OrderProperties orderPropertiesBtonecajqb = btonecajqbVarDxjokdxxww != null ? btonecajqb(btonecajqbVarDxjokdxxww) : null;
        List listIobyxmoadg = entity.iobyxmoadg();
        if (listIobyxmoadg == null) {
            listIobyxmoadg = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList2.add(ojitshcjhn((CartProductEntity) it.next()));
        }
        ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = entity.eablkybsjg();
        CartEvropolis cartEvropolisWflxmlrfwp = ppxfxbqfkfVarEablkybsjg != null ? wflxmlrfwp(ppxfxbqfkfVarEablkybsjg) : null;
        gy.iobyxmoadg iobyxmoadgVarZoijcleaow = entity.zoijcleaow();
        CartBonuses cartBonusesGtknphoqwx = iobyxmoadgVarZoijcleaow != null ? gtknphoqwx(iobyxmoadgVarZoijcleaow) : null;
        gy.btonecajqb btonecajqbVarVdvldrhtss = entity.vdvldrhtss();
        CartReceiver cartReceiverZdlpuopuiu = btonecajqbVarVdvldrhtss != null ? zdlpuopuiu(btonecajqbVarVdvldrhtss) : null;
        gy.nufgyqmvbu nufgyqmvbuVarOjitshcjhn = entity.ojitshcjhn();
        CartProgressBar cartProgressBarOxmwwwfdhm = nufgyqmvbuVarOjitshcjhn != null ? oxmwwwfdhm(nufgyqmvbuVarOjitshcjhn) : null;
        List listPpxfxbqfkf = entity.ppxfxbqfkf();
        if (listPpxfxbqfkf != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
            Iterator it2 = listPpxfxbqfkf.iterator();
            while (it2.hasNext()) {
                arrayList3.add(agtfadlqog((CartInfoItemEntity) it2.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List listZoijcleaow = py.nufgyqmvbu.zoijcleaow(entity.nufgyqmvbu());
        double dBtonecajqb = entity.btonecajqb();
        String strGtknphoqwx = entity.gtknphoqwx();
        gy.draadjrbmk draadjrbmkVarKcexrzcfyt = entity.kcexrzcfyt();
        if (draadjrbmkVarKcexrzcfyt == null || (cartUnavailableOrderReasonIobyxmoadg = jyumaefscl(draadjrbmkVarKcexrzcfyt)) == null) {
            cartUnavailableOrderReasonIobyxmoadg = CartUnavailableOrderReason.INSTANCE.iobyxmoadg();
        }
        CartUnavailableOrderReason cartUnavailableOrderReason = cartUnavailableOrderReasonIobyxmoadg;
        List listAgtfadlqog = entity.agtfadlqog();
        List listZoijcleaow2 = listAgtfadlqog != null ? dw.iobyxmoadg.zoijcleaow(listAgtfadlqog) : null;
        return new Cart(jGxszxtbevo, deliveryInfoIwizpuwonk, intervalInfoCqumvgiudr, strDraadjrbmk, strWflxmlrfwp, cartSumYggfygwlhe, promocodeEsjtqupxsv, orderPropertiesBtonecajqb, arrayList2, null, false, null, cartEvropolisWflxmlrfwp, null, cartBonusesGtknphoqwx, cartReceiverZdlpuopuiu, cartProgressBarOxmwwwfdhm, arrayList, listZoijcleaow, dBtonecajqb, strGtknphoqwx, cartUnavailableOrderReason, listZoijcleaow2 == null ? jyumaefscl.wflxmlrfwp() : listZoijcleaow2, null, 8400384, null);
    }
}
