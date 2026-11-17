package ly;

import az.btonecajqb;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lz.RecommendationDto;
import lz.RecommendationsDto;
import ru.myspar.core.domain.models.recommendations.Recommendation;
import tz.ProductDto;
import tz.ProductsReferencesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f64368iobyxmoadg;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f64369iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            try {
                iArr[btonecajqb.ANALOGUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.RELATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[btonecajqb.PERSONAL_COMPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[btonecajqb.POPULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64369iobyxmoadg = iArr;
        }
    }

    public lqeggnwhkg(wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f64368iobyxmoadg = productDtoToDomainMapper;
    }

    private final n10.iobyxmoadg ppxfxbqfkf(btonecajqb btonecajqbVar) {
        int i13 = iobyxmoadg.f64369iobyxmoadg[btonecajqbVar.ordinal()];
        if (i13 == 1) {
            return n10.iobyxmoadg.ANALOGUE;
        }
        if (i13 == 2) {
            return n10.iobyxmoadg.RELATED;
        }
        if (i13 == 3) {
            return n10.iobyxmoadg.PERSONAL_COMPOSITE;
        }
        if (i13 == 4) {
            return n10.iobyxmoadg.POPULAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Recommendation wkgbmnqykc(RecommendationDto recommendationDto, ProductsReferencesDto productsReferencesDto) {
        return new Recommendation(recommendationDto.getTitle(), ppxfxbqfkf(recommendationDto.getType()), recommendationDto.getRecomBlockId(), zoijcleaow(recommendationDto.getProductList(), productsReferencesDto));
    }

    private final List zoijcleaow(List list, ProductsReferencesDto productsReferencesDto) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f64368iobyxmoadg.ppxfxbqfkf((ProductDto) it.next(), productsReferencesDto, null));
        }
        return arrayList;
    }

    public final List iobyxmoadg(RecommendationsDto model) {
        zdlpuopuiu.btonecajqb(model, "model");
        List blocks = model.getBlocks();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(blocks, 10));
        Iterator it = blocks.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((RecommendationDto) it.next(), model.getReferences()));
        }
        return arrayList;
    }
}
