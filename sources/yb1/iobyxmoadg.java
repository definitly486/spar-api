package yb1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.domain.feature.specificrestaurantproduct.store.State;
import tg.draadjrbmk;
import xb1.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f124335zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final C3145iobyxmoadg f124334yggfygwlhe = new C3145iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final int f124333jyumaefscl = 8;

    /* JADX INFO: renamed from: yb1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C3145iobyxmoadg {
        public /* synthetic */ C3145iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3145iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f124336iobyxmoadg;

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
            f124336iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f124335zdlpuopuiu = resourcesManager;
    }

    private final lqeggnwhkg ppxfxbqfkf(State state) {
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f60512iobyxmoadg;
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, state.getProductDetails().getPrice(), 0, false, 6, null);
        Price priceWkgbmnqykc2 = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, ppxfxbqfkfVar.iobyxmoadg(state.getCurrentAmount(), state.getProductDetails().getMeasureTypeModel().getCurrentMeasure(), Double.valueOf(state.getProductDetails().getPrice()), null, state.getProductDetails().getIsDispPer100()), 0, false, 6, null);
        boolean isLoading = state.getIsLoading();
        boolean z13 = state.getProductDetails().getId().length() > 0;
        String name = state.getProductDetails().getName();
        String article = state.getProductDetails().getArticle();
        String photoUrl = state.getProductDetails().getPhotoUrl();
        String description = state.getProductDetails().getDescription();
        boolean z14 = state.getProductDetails().getDescription().length() > 0;
        String price = priceWkgbmnqykc.getPrice();
        String priceFractional = priceWkgbmnqykc.getPriceFractional();
        String price2 = priceWkgbmnqykc2.getPrice();
        String priceFractional2 = priceWkgbmnqykc2.getPriceFractional();
        String string = this.f124335zdlpuopuiu.getString(vk0.lqeggnwhkg.proloyalty_avg_weight_gram_format, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(state.getProductDetails().getWeight() * 1000.0d)));
        boolean z15 = !(state.getProductDetails().getWeight() == 0.0d);
        Double energy = state.getProductDetails().getEnergy();
        double dDoubleValue = energy != null ? energy.doubleValue() : 0.0d;
        boolean z16 = state.getProductDetails().getEnergy() != null;
        Double fats = state.getProductDetails().getFats();
        double dDoubleValue2 = fats != null ? fats.doubleValue() : 0.0d;
        boolean z17 = state.getProductDetails().getFats() != null;
        Double carbo = state.getProductDetails().getCarbo();
        double dDoubleValue3 = carbo != null ? carbo.doubleValue() : 0.0d;
        boolean z18 = state.getProductDetails().getCarbo() != null;
        Double protein = state.getProductDetails().getProtein();
        return new lqeggnwhkg(isLoading, z13, name, article, description, z14, photoUrl, price, priceFractional, price2, priceFractional2, string, z15, dDoubleValue2, z17, protein != null ? protein.doubleValue() : 0.0d, state.getProductDetails().getProtein() != null, dDoubleValue3, z18, z16, dDoubleValue, state.getEnableDecrease(), zoijcleaow(state.getBuyState()), state.getCurrentAmount(), state.getMeasure(), state.getProductDetails().getMeasureTypeModel().getCurrentMeasure().getRatio(), state.getProductDetails().getMeasureTypeModel().getCurrentMeasure().getMinAvailable());
    }

    private final bc1.zoijcleaow zoijcleaow(gz0.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaow.f124336iobyxmoadg[zoijcleaowVar.ordinal()];
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

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return ppxfxbqfkf(state);
    }
}
