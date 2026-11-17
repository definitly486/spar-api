package hc0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements vdvldrhtss {

    /* JADX INFO: renamed from: hc0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0928iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f40045cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f40046iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f40047jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f40048yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f40049zdlpuopuiu;

        /* JADX INFO: renamed from: hc0.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0929iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ List f40050cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ int f40051esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ CartProductUiModel f40052iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f40053jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ List f40054yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f40055zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0929iobyxmoadg(List list, iobyxmoadg iobyxmoadgVar, CartProductUiModel cartProductUiModel, List list2, int i13, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f40054yggfygwlhe = list;
                this.f40053jyumaefscl = iobyxmoadgVar;
                this.f40052iwizpuwonk = cartProductUiModel;
                this.f40050cqumvgiudr = list2;
                this.f40051esjtqupxsv = i13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C0929iobyxmoadg(this.f40054yggfygwlhe, this.f40053jyumaefscl, this.f40052iwizpuwonk, this.f40050cqumvgiudr, this.f40051esjtqupxsv, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zoijcleaow.gxszxtbevo();
                if (this.f40055zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                List list = this.f40054yggfygwlhe;
                CartProductUiModel cartProductUiModel = this.f40052iwizpuwonk;
                for (Object obj2 : list) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), cartProductUiModel.getId())) {
                        this.f40050cqumvgiudr.set(this.f40051esjtqupxsv, this.f40053jyumaefscl.ppxfxbqfkf(this.f40052iwizpuwonk, (ProductUIData) obj2));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                obj2 = null;
                this.f40050cqumvgiudr.set(this.f40051esjtqupxsv, this.f40053jyumaefscl.ppxfxbqfkf(this.f40052iwizpuwonk, (ProductUIData) obj2));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C0929iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0928iobyxmoadg(List list, List list2, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f40047jyumaefscl = list;
            this.f40046iwizpuwonk = list2;
            this.f40045cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C0928iobyxmoadg c0928iobyxmoadg = new C0928iobyxmoadg(this.f40047jyumaefscl, this.f40046iwizpuwonk, this.f40045cqumvgiudr, gxszxtbevoVar);
            c0928iobyxmoadg.f40048yggfygwlhe = obj;
            return c0928iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.f40049zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.f40048yggfygwlhe;
                zdlpuopuiu.zoijcleaow(obj);
                return list;
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f40048yggfygwlhe;
            List listP = jyumaefscl.p(this.f40047jyumaefscl);
            List list2 = this.f40046iwizpuwonk;
            iobyxmoadg iobyxmoadgVar = this.f40045cqumvgiudr;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listP, 10));
            int i14 = 0;
            for (Object obj2 : listP) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                arrayList.add(gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C0929iobyxmoadg(list2, iobyxmoadgVar, (CartProductUiModel) obj2, listP, i14, null), 3, null));
                i14 = i15;
            }
            this.f40048yggfygwlhe = listP;
            this.f40049zdlpuopuiu = 1;
            return pj.gxszxtbevo.iobyxmoadg(arrayList, this) == objGxszxtbevo ? objGxszxtbevo : listP;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C0928iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartProductUiModel ppxfxbqfkf(CartProductUiModel cartProductUiModel, ProductUIData productUIData) {
        MeasureType originalMeasure;
        ProductMessageType messageType;
        if (productUIData == null || (originalMeasure = productUIData.getMeasureType()) == null) {
            originalMeasure = cartProductUiModel.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(cartProductUiModel.getMeasureTypeModel(), null, null, originalMeasure, 3, null);
        double quantity = productUIData != null ? productUIData.getQuantity() : 0.0d;
        CounterModel counterModel = cartProductUiModel.getCounterModel();
        return cartProductUiModel.eablkybsjg((1862270975 & 1) != 0 ? cartProductUiModel.id : null, (1862270975 & 2) != 0 ? cartProductUiModel.article : null, (1862270975 & 4) != 0 ? cartProductUiModel.name : null, (1862270975 & 8) != 0 ? cartProductUiModel.photoUrl : null, (1862270975 & 16) != 0 ? cartProductUiModel.avgWeight : null, (1862270975 & 32) != 0 ? cartProductUiModel.price : 0.0d, (1862270975 & 64) != 0 ? cartProductUiModel.oldPrice : null, (1862270975 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartProductUiModel.discount : null, (1862270975 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cartProductUiModel.quantity : 0.0d, (1862270975 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartProductUiModel.hasDiscount : false, (1862270975 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartProductUiModel.isRatingFeatureEnabled : false, (1862270975 & 2048) != 0 ? cartProductUiModel.isPurchaseListsFeatureEnabled : false, (1862270975 & 4096) != 0 ? cartProductUiModel.isProductWithZeroPrice : false, (1862270975 & 8192) != 0 ? cartProductUiModel.rating : null, (1862270975 & 16384) != 0 ? cartProductUiModel.reviewsCount : 0, (1862270975 & 32768) != 0 ? cartProductUiModel.isDispPer100 : false, (1862270975 & 65536) != 0 ? cartProductUiModel.isFavorite : false, (1862270975 & 131072) != 0 ? cartProductUiModel.hints : null, (1862270975 & 262144) != 0 ? cartProductUiModel.country : null, (1862270975 & 524288) != 0 ? cartProductUiModel.region : null, (1862270975 & 1048576) != 0 ? cartProductUiModel.countryFlagEmoji : null, (1862270975 & 2097152) != 0 ? cartProductUiModel.availability : null, (1862270975 & 4194304) != 0 ? cartProductUiModel.changeState : null, (1862270975 & 8388608) != 0 ? cartProductUiModel.availableInterval : null, (1862270975 & 16777216) != 0 ? cartProductUiModel.measureTypeModel : measureTypeModelPpxfxbqfkf, (1862270975 & 33554432) != 0 ? cartProductUiModel.colorsUiModel : null, (1862270975 & 67108864) != 0 ? cartProductUiModel.availabilityModel : null, (1862270975 & 134217728) != 0 ? cartProductUiModel.deliveryCode : null, (1862270975 & 268435456) != 0 ? cartProductUiModel.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : productUIData != null ? productUIData.getIsLoading() : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : productUIData != null, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : quantity, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : measureTypeModelPpxfxbqfkf.getCurrentMeasure(), (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : (productUIData == null || (messageType = productUIData.getMessageType()) == null) ? null : pt.iobyxmoadg.ppxfxbqfkf(messageType, quantity, measureTypeModelPpxfxbqfkf.getCurrentMeasure()), (10235 & 2048) != 0 ? counterModel.message : null, (10235 & 4096) != 0 ? counterModel.autoHideMessage : false, (10235 & 8192) != 0 ? counterModel.colorsModel : null), (1862270975 & 536870912) != 0 ? cartProductUiModel.vivino : null, (1862270975 & 1073741824) != 0 ? cartProductUiModel.limits : null);
    }

    @Override // tg.vdvldrhtss
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Object invoke(List list, List list2, gxszxtbevo gxszxtbevoVar) {
        return dsvhmnatus.gxszxtbevo(new C0928iobyxmoadg(list, list2, this, null), gxszxtbevoVar);
    }
}
