package vb1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.BaseProduct;
import ru.myspar.proloyalty.core.domain.models.LoadingBase;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProduct;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.State;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tb1.lqeggnwhkg;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final q41.iobyxmoadg f116459yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final o91.zoijcleaow f116460zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116461iobyxmoadg;

        static {
            int[] iArr = new int[gz0.zoijcleaow.values().length];
            try {
                iArr[gz0.zoijcleaow.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gz0.zoijcleaow.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gz0.zoijcleaow.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gz0.zoijcleaow.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116461iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: vb1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C2903zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        C2903zoijcleaow(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public zoijcleaow(o91.zoijcleaow productUiModelMapper, q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f116460zdlpuopuiu = productUiModelMapper;
        this.f116459yggfygwlhe = resourcesManager;
    }

    private final wb1.iobyxmoadg eablkybsjg(RestaurantProduct restaurantProduct) {
        return new wb1.iobyxmoadg(restaurantProduct.getId(), restaurantProduct.getName(), restaurantProduct.getArticle(), restaurantProduct.getPhotoUrl(), restaurantProduct.getMeasureTypeModel(), restaurantProduct.getWeight(), restaurantProduct.getPrice(), restaurantProduct.getIsDispPer100(), ppxfxbqfkf(restaurantProduct.getBuyState()));
    }

    private final RestaurantSectionUiModel gxszxtbevo(RestaurantSection restaurantSection, String str) {
        return new RestaurantSectionUiModel(restaurantSection.getCode(), restaurantSection.getName(), zdlpuopuiu.eablkybsjg(restaurantSection.getCode(), str));
    }

    private final bc1.zoijcleaow ppxfxbqfkf(gz0.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaowVar == null ? -1 : iobyxmoadg.f116461iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            return bc1.zoijcleaow.READY;
        }
        if (i13 == 2) {
            return bc1.zoijcleaow.PROGRESS;
        }
        if (i13 == 3) {
            return bc1.zoijcleaow.DONE;
        }
        if (i13 == 4) {
            return bc1.zoijcleaow.UNDEFINED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final jt0.zoijcleaow zoijcleaow(BaseProduct baseProduct, DeliveryCode deliveryCode) {
        if (baseProduct instanceof LoadingBase) {
            return jt0.iobyxmoadg.f52316zdlpuopuiu;
        }
        if (baseProduct instanceof RestaurantProduct) {
            return eablkybsjg((RestaurantProduct) baseProduct);
        }
        return baseProduct instanceof Product ? this.f116460zdlpuopuiu.ppxfxbqfkf((Product) baseProduct, null, deliveryCode, false, false, false, (64 & 64) != 0 ? null : null, new C2903zoijcleaow(this.f116459yggfygwlhe)) : jt0.iobyxmoadg.f52316zdlpuopuiu;
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
        q41.iobyxmoadg iobyxmoadgVar = this.f116459yggfygwlhe;
        int i13 = vk0.lqeggnwhkg.proloyalty_restaurant_min_order_sum_format;
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
