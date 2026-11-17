package tz;

import ru.myspar.core.domain.models.product.SearchFeatureModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kcexrzcfyt {
    public static final SearchFeatureModel iobyxmoadg(SearchFeatureDto searchFeatureDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchFeatureDto, "<this>");
        String id2 = searchFeatureDto.getId();
        String str = id2 == null ? "" : id2;
        String name = searchFeatureDto.getName();
        String str2 = name == null ? "" : name;
        String pic = searchFeatureDto.getPic();
        String str3 = pic == null ? "" : pic;
        f40.zoijcleaow zoijcleaowVarIobyxmoadg = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(searchFeatureDto.getNavlink());
        String reference = searchFeatureDto.getReference();
        if (reference == null) {
            reference = "";
        }
        return new SearchFeatureModel(str, str2, str3, zoijcleaowVarIobyxmoadg, reference);
    }
}
