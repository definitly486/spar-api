package zd0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.myspar.core.domain.models.BaseProduct;
import ru.myspar.core.domain.models.LoadingBase;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.core.domain.models.restaurants.RestaurantProduct;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.domain.feature.specificrestaurant.store.State;
import ru.myspar.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import xd0.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final d60.iobyxmoadg f129668yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final pb0.zoijcleaow f129669zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f129670iobyxmoadg;

        static {
            int[] iArr = new int[o00.zoijcleaow.values().length];
            try {
                iArr[o00.zoijcleaow.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o00.zoijcleaow.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o00.zoijcleaow.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o00.zoijcleaow.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f129670iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: zd0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C3299zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        C3299zoijcleaow(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public zoijcleaow(pb0.zoijcleaow productUiModelMapper, d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f129669zdlpuopuiu = productUiModelMapper;
        this.f129668yggfygwlhe = resourcesManager;
    }

    private final ae0.iobyxmoadg eablkybsjg(RestaurantProduct restaurantProduct) {
        return new ae0.iobyxmoadg(restaurantProduct.getId(), restaurantProduct.getName(), restaurantProduct.getArticle(), restaurantProduct.getPhotoUrl(), restaurantProduct.getMeasureTypeModel(), restaurantProduct.getWeight(), restaurantProduct.getPrice(), restaurantProduct.getIsDispPer100(), ppxfxbqfkf(restaurantProduct.getBuyState()));
    }

    private final RestaurantSectionUiModel gxszxtbevo(RestaurantSection restaurantSection, String str) {
        return new RestaurantSectionUiModel(restaurantSection.getCode(), restaurantSection.getName(), zdlpuopuiu.eablkybsjg(restaurantSection.getCode(), str));
    }

    private final ge0.zoijcleaow ppxfxbqfkf(o00.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaowVar == null ? -1 : iobyxmoadg.f129670iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            return ge0.zoijcleaow.READY;
        }
        if (i13 == 2) {
            return ge0.zoijcleaow.PROGRESS;
        }
        if (i13 == 3) {
            return ge0.zoijcleaow.DONE;
        }
        if (i13 == 4) {
            return ge0.zoijcleaow.UNDEFINED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final pu.zoijcleaow zoijcleaow(BaseProduct baseProduct, DeliveryCode deliveryCode) {
        if (baseProduct instanceof LoadingBase) {
            return pu.iobyxmoadg.f77322zdlpuopuiu;
        }
        if (baseProduct instanceof RestaurantProduct) {
            return eablkybsjg((RestaurantProduct) baseProduct);
        }
        return baseProduct instanceof Product ? this.f129669zdlpuopuiu.ppxfxbqfkf((Product) baseProduct, null, deliveryCode, false, false, false, (64 & 64) != 0 ? null : null, new C3299zoijcleaow(this.f129668yggfygwlhe)) : pu.iobyxmoadg.f77322zdlpuopuiu;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        boolean isLoading = state.getIsLoading();
        boolean isRestaurantVisible = state.getIsRestaurantVisible();
        RestaurantDetails restaurantDetails = state.getRestaurantDetails();
        String code = restaurantDetails != null ? restaurantDetails.getCode() : null;
        if (code == null) {
            code = "";
        }
        RestaurantDetails restaurantDetails2 = state.getRestaurantDetails();
        String name = restaurantDetails2 != null ? restaurantDetails2.getName() : null;
        if (name == null) {
            name = "";
        }
        RestaurantDetails restaurantDetails3 = state.getRestaurantDetails();
        String shortDescription = restaurantDetails3 != null ? restaurantDetails3.getShortDescription() : null;
        if (shortDescription == null) {
            shortDescription = "";
        }
        RestaurantDetails restaurantDetails4 = state.getRestaurantDetails();
        String logo = restaurantDetails4 != null ? restaurantDetails4.getLogo() : null;
        if (logo == null) {
            logo = "";
        }
        RestaurantDetails restaurantDetails5 = state.getRestaurantDetails();
        String image = restaurantDetails5 != null ? restaurantDetails5.getImage() : null;
        if (image == null) {
            image = "";
        }
        d60.iobyxmoadg iobyxmoadgVar = this.f129668yggfygwlhe;
        int i13 = dxjokdxxww.restaurant_min_order_sum_format;
        RestaurantDetails restaurantDetails6 = state.getRestaurantDetails();
        String string = iobyxmoadgVar.getString(i13, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(restaurantDetails6 != null ? restaurantDetails6.getMinOrderSum() : 0.0d)));
        RestaurantDetails restaurantDetails7 = state.getRestaurantDetails();
        String avgOrderTime = restaurantDetails7 != null ? restaurantDetails7.getAvgOrderTime() : null;
        if (avgOrderTime == null) {
            avgOrderTime = "";
        }
        List products = state.getProducts();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
        Iterator it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((BaseProduct) it.next(), state.getDeliveryType()));
        }
        List<RestaurantSection> sections = state.getSections();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(sections, 10));
        for (RestaurantSection restaurantSection : sections) {
            RestaurantSection selectedSection = state.getSelectedSection();
            arrayList2.add(gxszxtbevo(restaurantSection, selectedSection != null ? selectedSection.getCode() : null));
        }
        return new lqeggnwhkg(isLoading, isRestaurantVisible, code, name, shortDescription, logo, image, string, avgOrderTime, arrayList, arrayList2);
    }
}
