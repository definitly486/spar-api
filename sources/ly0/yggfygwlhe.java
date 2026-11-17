package ly0;

import ru.myspar.proloyalty.core.domain.models.product.SearchFeatureModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yggfygwlhe {
    public static final SearchFeatureModel iobyxmoadg(SearchFeatureDto searchFeatureDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchFeatureDto, "<this>");
        String id2 = searchFeatureDto.getId();
        String str = id2 == null ? "" : id2;
        String name = searchFeatureDto.getName();
        String str2 = name == null ? "" : name;
        String pic = searchFeatureDto.getPic();
        String str3 = pic == null ? "" : pic;
        k21.ojitshcjhn ojitshcjhnVarIobyxmoadg = k21.ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(searchFeatureDto.getNavlink());
        String reference = searchFeatureDto.getReference();
        if (reference == null) {
            reference = "";
        }
        return new SearchFeatureModel(str, str2, str3, ojitshcjhnVarIobyxmoadg, reference);
    }
}
