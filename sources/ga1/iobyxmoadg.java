package ga1;

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
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements vdvldrhtss {

    /* JADX INFO: renamed from: ga1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0827iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f36720cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f36721iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f36722jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f36723yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36724zdlpuopuiu;

        /* JADX INFO: renamed from: ga1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0828iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ List f36725cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ int f36726esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ CartProductUiModel f36727iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f36728jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ List f36729yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f36730zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0828iobyxmoadg(List list, iobyxmoadg iobyxmoadgVar, CartProductUiModel cartProductUiModel, List list2, int i13, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f36729yggfygwlhe = list;
                this.f36728jyumaefscl = iobyxmoadgVar;
                this.f36727iwizpuwonk = cartProductUiModel;
                this.f36725cqumvgiudr = list2;
                this.f36726esjtqupxsv = i13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C0828iobyxmoadg(this.f36729yggfygwlhe, this.f36728jyumaefscl, this.f36727iwizpuwonk, this.f36725cqumvgiudr, this.f36726esjtqupxsv, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zoijcleaow.gxszxtbevo();
                if (this.f36730zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                List list = this.f36729yggfygwlhe;
                CartProductUiModel cartProductUiModel = this.f36727iwizpuwonk;
                for (Object obj2 : list) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), cartProductUiModel.getId())) {
                        this.f36725cqumvgiudr.set(this.f36726esjtqupxsv, this.f36728jyumaefscl.ppxfxbqfkf(this.f36727iwizpuwonk, (ProductUIData) obj2));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                obj2 = null;
                this.f36725cqumvgiudr.set(this.f36726esjtqupxsv, this.f36728jyumaefscl.ppxfxbqfkf(this.f36727iwizpuwonk, (ProductUIData) obj2));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C0828iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0827iobyxmoadg(List list, List list2, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36722jyumaefscl = list;
            this.f36721iwizpuwonk = list2;
            this.f36720cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C0827iobyxmoadg c0827iobyxmoadg = new C0827iobyxmoadg(this.f36722jyumaefscl, this.f36721iwizpuwonk, this.f36720cqumvgiudr, gxszxtbevoVar);
            c0827iobyxmoadg.f36723yggfygwlhe = obj;
            return c0827iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.f36724zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.f36723yggfygwlhe;
                zdlpuopuiu.zoijcleaow(obj);
                return list;
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f36723yggfygwlhe;
            List listP = jyumaefscl.p(this.f36722jyumaefscl);
            List list2 = this.f36721iwizpuwonk;
            iobyxmoadg iobyxmoadgVar = this.f36720cqumvgiudr;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listP, 10));
            int i14 = 0;
            for (Object obj2 : listP) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                arrayList.add(gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C0828iobyxmoadg(list2, iobyxmoadgVar, (CartProductUiModel) obj2, listP, i14, null), 3, null));
                i14 = i15;
            }
            this.f36723yggfygwlhe = listP;
            this.f36724zdlpuopuiu = 1;
            return pj.gxszxtbevo.iobyxmoadg(arrayList, this) == objGxszxtbevo ? objGxszxtbevo : listP;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C0827iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
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
        return cartProductUiModel.eablkybsjg((2076180479 & 1) != 0 ? cartProductUiModel.id : null, (2076180479 & 2) != 0 ? cartProductUiModel.article : null, (2076180479 & 4) != 0 ? cartProductUiModel.name : null, (2076180479 & 8) != 0 ? cartProductUiModel.photoUrl : null, (2076180479 & 16) != 0 ? cartProductUiModel.avgWeight : null, (2076180479 & 32) != 0 ? cartProductUiModel.price : 0.0d, (2076180479 & 64) != 0 ? cartProductUiModel.oldPrice : null, (2076180479 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartProductUiModel.discount : null, (2076180479 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cartProductUiModel.quantity : 0.0d, (2076180479 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartProductUiModel.hasDiscount : false, (2076180479 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartProductUiModel.isRatingFeatureEnabled : false, (2076180479 & 2048) != 0 ? cartProductUiModel.isPurchaseListsFeatureEnabled : false, (2076180479 & 4096) != 0 ? cartProductUiModel.isProductWithZeroPrice : false, (2076180479 & 8192) != 0 ? cartProductUiModel.rating : null, (2076180479 & 16384) != 0 ? cartProductUiModel.reviewsCount : 0, (2076180479 & 32768) != 0 ? cartProductUiModel.isDispPer100 : false, (2076180479 & 65536) != 0 ? cartProductUiModel.isFavorite : false, (2076180479 & 131072) != 0 ? cartProductUiModel.hints : null, (2076180479 & 262144) != 0 ? cartProductUiModel.country : null, (2076180479 & 524288) != 0 ? cartProductUiModel.region : null, (2076180479 & 1048576) != 0 ? cartProductUiModel.countryFlagEmoji : null, (2076180479 & 2097152) != 0 ? cartProductUiModel.changeState : null, (2076180479 & 4194304) != 0 ? cartProductUiModel.measureTypeModel : measureTypeModelPpxfxbqfkf, (2076180479 & 8388608) != 0 ? cartProductUiModel.colorsUiModel : null, (2076180479 & 16777216) != 0 ? cartProductUiModel.availabilityModel : null, (2076180479 & 33554432) != 0 ? cartProductUiModel.deliveryCode : null, (2076180479 & 67108864) != 0 ? cartProductUiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : productUIData != null ? productUIData.getIsLoading() : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : productUIData != null, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : quantity, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : measureTypeModelPpxfxbqfkf.getCurrentMeasure(), (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : (productUIData == null || (messageType = productUIData.getMessageType()) == null) ? null : is0.iobyxmoadg.ppxfxbqfkf(messageType, quantity, measureTypeModelPpxfxbqfkf.getCurrentMeasure()), (14714 & 2048) != 0 ? counterModel.message : null, (14714 & 4096) != 0 ? counterModel.autoHideMessage : false, (14714 & 8192) != 0 ? counterModel.colorsModel : null), (2076180479 & 134217728) != 0 ? cartProductUiModel.vivino : null, (2076180479 & 268435456) != 0 ? cartProductUiModel.limits : null, (2076180479 & 536870912) != 0 ? cartProductUiModel.isAvailable : false, (2076180479 & 1073741824) != 0 ? cartProductUiModel.unavailableReason : null);
    }

    @Override // tg.vdvldrhtss
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Object invoke(List list, List list2, gxszxtbevo gxszxtbevoVar) {
        return dsvhmnatus.gxszxtbevo(new C0827iobyxmoadg(list, list2, this, null), gxszxtbevoVar);
    }
}
