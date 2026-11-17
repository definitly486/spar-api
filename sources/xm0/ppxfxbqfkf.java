package xm0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf extends wm0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f122891ppxfxbqfkf;

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final xm0.iobyxmoadg f122892wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(xm0.iobyxmoadg analyticProductParams) {
            super("Добавление товара в корзину", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f122892wkgbmnqykc = analyticProductParams;
        }

        @Override // xm0.ppxfxbqfkf
        public xm0.iobyxmoadg ppxfxbqfkf() {
            return this.f122892wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: xm0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C3094ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final xm0.iobyxmoadg f122893wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3094ppxfxbqfkf(xm0.iobyxmoadg analyticProductParams) {
            super("Удаление товара из корзины", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f122893wkgbmnqykc = analyticProductParams;
        }

        @Override // xm0.ppxfxbqfkf
        public xm0.iobyxmoadg ppxfxbqfkf() {
            return this.f122893wkgbmnqykc;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final xm0.iobyxmoadg f122894wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(xm0.iobyxmoadg analyticProductParams) {
            super("Изменение кол-ва товара в корзине", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f122894wkgbmnqykc = analyticProductParams;
        }

        @Override // xm0.ppxfxbqfkf
        public xm0.iobyxmoadg ppxfxbqfkf() {
            return this.f122894wkgbmnqykc;
        }
    }

    public /* synthetic */ ppxfxbqfkf(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public abstract xm0.iobyxmoadg ppxfxbqfkf();

    @Override // wm0.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, ppxfxbqfkf().ppxfxbqfkf());
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, ppxfxbqfkf().zoijcleaow());
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, ppxfxbqfkf().iobyxmoadg());
        return linkedHashMap;
    }

    private ppxfxbqfkf(String str) {
        super(str);
        this.f122891ppxfxbqfkf = str;
    }
}
