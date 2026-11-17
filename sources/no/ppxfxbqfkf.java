package no;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf extends mo.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f70452ppxfxbqfkf;

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final no.iobyxmoadg f70453wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(no.iobyxmoadg analyticProductParams) {
            super("Добавление товара в корзину", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f70453wkgbmnqykc = analyticProductParams;
        }

        @Override // no.ppxfxbqfkf
        public no.iobyxmoadg ppxfxbqfkf() {
            return this.f70453wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: no.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1521ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final no.iobyxmoadg f70454wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1521ppxfxbqfkf(no.iobyxmoadg analyticProductParams) {
            super("Удаление товара из корзины", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f70454wkgbmnqykc = analyticProductParams;
        }

        @Override // no.ppxfxbqfkf
        public no.iobyxmoadg ppxfxbqfkf() {
            return this.f70454wkgbmnqykc;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final no.iobyxmoadg f70455wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(no.iobyxmoadg analyticProductParams) {
            super("Изменение кол-ва товара в корзине", null);
            zdlpuopuiu.btonecajqb(analyticProductParams, "analyticProductParams");
            this.f70455wkgbmnqykc = analyticProductParams;
        }

        @Override // no.ppxfxbqfkf
        public no.iobyxmoadg ppxfxbqfkf() {
            return this.f70455wkgbmnqykc;
        }
    }

    public /* synthetic */ ppxfxbqfkf(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public abstract no.iobyxmoadg ppxfxbqfkf();

    @Override // mo.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, ppxfxbqfkf().ppxfxbqfkf());
        ru.myspar.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, ppxfxbqfkf().zoijcleaow());
        ru.myspar.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, ppxfxbqfkf().iobyxmoadg());
        return linkedHashMap;
    }

    private ppxfxbqfkf(String str) {
        super(str);
        this.f70452ppxfxbqfkf = str;
    }
}
