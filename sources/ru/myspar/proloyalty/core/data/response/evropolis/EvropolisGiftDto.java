package ru.myspar.proloyalty.core.data.response.evropolis;

import androidx.annotation.Keep;
import bk.wflxmlrfwp;
import bk.zoijcleaow;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ek.eablkybsjg;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.gxszxtbevo;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import fk.wizcaqwiak;
import fy0.ppxfxbqfkf;
import gg.draadjrbmk;
import gg.ojitshcjhn;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;
import ly0.ProductDto;
import ly0.ProductsReferencesDto;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto;

/* JADX INFO: loaded from: classes5.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b0\b\u0087\b\u0018\u0000 [2\u00020\u0001:\t52\\FC=80ABµ\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010)R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010)R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u00104\u001a\u0004\b5\u0010?R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u00104\u001a\u0004\bC\u0010DR(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00109\u0012\u0004\bG\u00104\u001a\u0004\bF\u0010;R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010H\u0012\u0004\bK\u00104\u001a\u0004\bI\u0010JR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010H\u0012\u0004\bL\u00104\u001a\u0004\bA\u0010JR(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u00109\u0012\u0004\bO\u00104\u001a\u0004\bN\u0010;R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010P\u0012\u0004\bR\u00104\u001a\u0004\bM\u0010QR(\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u00109\u0012\u0004\bT\u00104\u001a\u0004\b8\u0010;R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010U\u0012\u0004\bW\u00104\u001a\u0004\b=\u0010VR \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010X\u0012\u0004\bZ\u00104\u001a\u0004\bS\u0010Y¨\u0006]"}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto;", "", "", "seen0", "", "id", "title", "", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg;", "tabs", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;", "bonus", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;", "products", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$nufgyqmvbu;", "instructions", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;", "qr", "coupon", "terms", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;", "puzzle", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf;", "buttons", "Lfy0/ppxfxbqfkf;", "colorThemeType", "Lly0/ojitshcjhn;", "refs", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;Ljava/util/List;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;Ljava/util/List;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;Ljava/util/List;Lfy0/ppxfxbqfkf;Lly0/ojitshcjhn;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "gxszxtbevo", "getId$annotations", "()V", "zoijcleaow", "agtfadlqog", "getTitle$annotations", "ppxfxbqfkf", "Ljava/util/List;", "draadjrbmk", "()Ljava/util/List;", "getTabs$annotations", "wkgbmnqykc", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;", "getBonus$annotations", "eablkybsjg", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;", "getProducts$annotations", "lqeggnwhkg", "getInstructions$annotations", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;", "btonecajqb", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;", "getQr$annotations", "getCoupon$annotations", "dxjokdxxww", "wflxmlrfwp", "getTerms$annotations", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;", "getPuzzle$annotations", "gtknphoqwx", "getButtons$annotations", "Lfy0/ppxfxbqfkf;", "()Lfy0/ppxfxbqfkf;", "getColorThemeType$annotations", "Lly0/ojitshcjhn;", "()Lly0/ojitshcjhn;", "getRefs$annotations", "Companion", "ProductsDto", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EvropolisGiftDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final zoijcleaow[] f94338agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name and from kotlin metadata and from toString */
    private final PuzzleDto puzzle;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf colorThemeType;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata and from toString */
    private final List terms;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsDto products;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name and from kotlin metadata and from toString */
    private final List buttons;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final List instructions;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private final CodeWrapperDto qr;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata and from toString */
    private final CodeWrapperDto coupon;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final List tabs;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsReferencesDto refs;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final BonusDto bonus;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    @wflxmlrfwp
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006."}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;", "", "", "type", "", "Lly0/dxjokdxxww;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "write$Self$data_release", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ProductsDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/List;", "getItems", "getItems$annotations", "Companion", "iobyxmoadg", "zoijcleaow", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsDto {
        private final List<ProductDto> items;
        private final String type;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final zoijcleaow[] $childSerializers = {null, new gxszxtbevo(ProductDto.iobyxmoadg.f64436iobyxmoadg)};

        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94352iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94352iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.ProductsDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("type", false);
                iyctptxqztVar.ojitshcjhn("items", true);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                return new zoijcleaow[]{wizcaqwiak.f34245iobyxmoadg, ck.iobyxmoadg.yggfygwlhe(ProductsDto.$childSerializers[1])};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final ProductsDto zoijcleaow(eablkybsjg decoder) {
                List list;
                String strVdvldrhtss;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                zoijcleaow[] zoijcleaowVarArr = ProductsDto.$childSerializers;
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                    list = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, zoijcleaowVarArr[1], null);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    List list2 = null;
                    String strVdvldrhtss2 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            list2 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, zoijcleaowVarArr[1], list2);
                            i14 |= 2;
                        }
                    }
                    list = list2;
                    strVdvldrhtss = strVdvldrhtss2;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new ProductsDto(i13, strVdvldrhtss, list, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, ProductsDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                ProductsDto.write$Self$data_release(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ProductsDto$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94352iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ ProductsDto(int i13, String str, List list, dvvnrvtcbc dvvnrvtcbcVar) {
            if (1 != (i13 & 1)) {
                sflfametgt.zoijcleaow(i13, 1, iobyxmoadg.f94352iobyxmoadg.iobyxmoadg());
            }
            this.type = str;
            if ((i13 & 2) == 0) {
                this.items = null;
            } else {
                this.items = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductsDto copy$default(ProductsDto productsDto, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = productsDto.type;
            }
            if ((i13 & 2) != 0) {
                list = productsDto.items;
            }
            return productsDto.copy(str, list);
        }

        public static /* synthetic */ void getItems$annotations() {
        }

        public static /* synthetic */ void getType$annotations() {
        }

        public static final /* synthetic */ void write$Self$data_release(ProductsDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            zoijcleaow[] zoijcleaowVarArr = $childSerializers;
            output.istkbnxepw(serialDesc, 0, self.type);
            if (!output.zdlpuopuiu(serialDesc, 1) && self.items == null) {
                return;
            }
            output.yggfygwlhe(serialDesc, 1, zoijcleaowVarArr[1], self.items);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final List<ProductDto> component2() {
            return this.items;
        }

        public final ProductsDto copy(String type, List<ProductDto> items) {
            zdlpuopuiu.btonecajqb(type, "type");
            return new ProductsDto(type, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsDto)) {
                return false;
            }
            ProductsDto productsDto = (ProductsDto) other;
            return zdlpuopuiu.eablkybsjg(this.type, productsDto.type) && zdlpuopuiu.eablkybsjg(this.items, productsDto.items);
        }

        public final List<ProductDto> getItems() {
            return this.items;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            List<ProductDto> list = this.items;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "ProductsDto(type=" + this.type + ", items=" + this.items + ")";
        }

        public ProductsDto(String type, List<ProductDto> list) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.type = type;
            this.items = list;
        }

        public /* synthetic */ ProductsDto(String str, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : list);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$eablkybsjg, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final zoijcleaow serializer() {
            return iobyxmoadg.f94356iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$gxszxtbevo, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010\u0014¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;", "", "", "seen0", "", "title", "image", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$gxszxtbevo;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "zoijcleaow", "getTitle$annotations", "()V", "getImage$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PuzzleDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$gxszxtbevo$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94355iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94355iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.PuzzleDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("text", false);
                iyctptxqztVar.ojitshcjhn("pic", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
                return new zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final PuzzleDto zoijcleaow(eablkybsjg decoder) {
                String strVdvldrhtss;
                String strVdvldrhtss2;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                    strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    strVdvldrhtss = null;
                    String strVdvldrhtss3 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 |= 2;
                        }
                    }
                    strVdvldrhtss2 = strVdvldrhtss3;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new PuzzleDto(i13, strVdvldrhtss, strVdvldrhtss2, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, PuzzleDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                PuzzleDto.ppxfxbqfkf(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$gxszxtbevo$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94355iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ PuzzleDto(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
            if (3 != (i13 & 3)) {
                sflfametgt.zoijcleaow(i13, 3, iobyxmoadg.f94355iobyxmoadg.iobyxmoadg());
            }
            this.title = str;
            this.image = str2;
        }

        public static final /* synthetic */ void ppxfxbqfkf(PuzzleDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            output.istkbnxepw(serialDesc, 0, self.title);
            output.istkbnxepw(serialDesc, 1, self.image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PuzzleDto)) {
                return false;
            }
            PuzzleDto puzzleDto = (PuzzleDto) other;
            return zdlpuopuiu.eablkybsjg(this.title, puzzleDto.title) && zdlpuopuiu.eablkybsjg(this.image, puzzleDto.image);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.image.hashCode();
        }

        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public String toString() {
            return "PuzzleDto(title=" + this.title + ", image=" + this.image + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f94356iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f94356iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto", iobyxmoadgVar, 13);
            iyctptxqztVar.ojitshcjhn("id", false);
            iyctptxqztVar.ojitshcjhn(ExternalMetricsManagerImpl.NAME, false);
            iyctptxqztVar.ojitshcjhn("tabs", true);
            iyctptxqztVar.ojitshcjhn("item", true);
            iyctptxqztVar.ojitshcjhn("product", true);
            iyctptxqztVar.ojitshcjhn("instruction", true);
            iyctptxqztVar.ojitshcjhn("qr", true);
            iyctptxqztVar.ojitshcjhn("coupon", true);
            iyctptxqztVar.ojitshcjhn("terms", true);
            iyctptxqztVar.ojitshcjhn("puzzle", true);
            iyctptxqztVar.ojitshcjhn("buttons", true);
            iyctptxqztVar.ojitshcjhn("color", true);
            iyctptxqztVar.ojitshcjhn("refs", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final zoijcleaow[] eablkybsjg() {
            zoijcleaow[] zoijcleaowVarArr = EvropolisGiftDto.f94338agtfadlqog;
            zoijcleaow zoijcleaowVarYggfygwlhe = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[2]);
            zoijcleaow zoijcleaowVarYggfygwlhe2 = ck.iobyxmoadg.yggfygwlhe(BonusDto.iobyxmoadg.f94387iobyxmoadg);
            zoijcleaow zoijcleaowVarYggfygwlhe3 = ck.iobyxmoadg.yggfygwlhe(ProductsDto.iobyxmoadg.f94352iobyxmoadg);
            zoijcleaow zoijcleaowVarYggfygwlhe4 = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[5]);
            CodeWrapperDto.iobyxmoadg iobyxmoadgVar = CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg;
            zoijcleaow zoijcleaowVarYggfygwlhe5 = ck.iobyxmoadg.yggfygwlhe(iobyxmoadgVar);
            zoijcleaow zoijcleaowVarYggfygwlhe6 = ck.iobyxmoadg.yggfygwlhe(iobyxmoadgVar);
            zoijcleaow zoijcleaowVarYggfygwlhe7 = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[8]);
            zoijcleaow zoijcleaowVarYggfygwlhe8 = ck.iobyxmoadg.yggfygwlhe(PuzzleDto.iobyxmoadg.f94355iobyxmoadg);
            zoijcleaow zoijcleaowVarYggfygwlhe9 = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[10]);
            zoijcleaow zoijcleaowVarYggfygwlhe10 = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[11]);
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            return new zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar, zoijcleaowVarYggfygwlhe, zoijcleaowVarYggfygwlhe2, zoijcleaowVarYggfygwlhe3, zoijcleaowVarYggfygwlhe4, zoijcleaowVarYggfygwlhe5, zoijcleaowVarYggfygwlhe6, zoijcleaowVarYggfygwlhe7, zoijcleaowVarYggfygwlhe8, zoijcleaowVarYggfygwlhe9, zoijcleaowVarYggfygwlhe10, ProductsReferencesDto.iobyxmoadg.f64472iobyxmoadg};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final EvropolisGiftDto zoijcleaow(eablkybsjg decoder) {
            List list;
            ppxfxbqfkf ppxfxbqfkfVar;
            PuzzleDto puzzleDto;
            List list2;
            List list3;
            CodeWrapperDto codeWrapperDto;
            int i13;
            ProductsReferencesDto ojitshcjhnVar;
            CodeWrapperDto codeWrapperDto2;
            List list4;
            ProductsDto productsDto;
            BonusDto bonusDto;
            String str;
            String str2;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            zoijcleaow[] zoijcleaowVarArr = EvropolisGiftDto.f94338agtfadlqog;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                String strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                String strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                List list5 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 2, zoijcleaowVarArr[2], null);
                BonusDto bonusDto2 = (BonusDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, BonusDto.iobyxmoadg.f94387iobyxmoadg, null);
                ProductsDto productsDto2 = (ProductsDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 4, ProductsDto.iobyxmoadg.f94352iobyxmoadg, null);
                List list6 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 5, zoijcleaowVarArr[5], null);
                CodeWrapperDto.iobyxmoadg iobyxmoadgVar = CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg;
                CodeWrapperDto codeWrapperDto3 = (CodeWrapperDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 6, iobyxmoadgVar, null);
                CodeWrapperDto codeWrapperDto4 = (CodeWrapperDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 7, iobyxmoadgVar, null);
                List list7 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 8, zoijcleaowVarArr[8], null);
                PuzzleDto puzzleDto2 = (PuzzleDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 9, PuzzleDto.iobyxmoadg.f94355iobyxmoadg, null);
                List list8 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 10, zoijcleaowVarArr[10], null);
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 11, zoijcleaowVarArr[11], null);
                ojitshcjhnVar = (ProductsReferencesDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 12, ProductsReferencesDto.iobyxmoadg.f64472iobyxmoadg, null);
                str2 = strVdvldrhtss;
                str = strVdvldrhtss2;
                puzzleDto = puzzleDto2;
                codeWrapperDto2 = codeWrapperDto4;
                codeWrapperDto = codeWrapperDto3;
                bonusDto = bonusDto2;
                productsDto = productsDto2;
                i13 = 8191;
                list4 = list8;
                list3 = list6;
                list2 = list7;
                list = list5;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
            } else {
                String strVdvldrhtss3 = null;
                ppxfxbqfkf ppxfxbqfkfVar3 = null;
                PuzzleDto puzzleDto3 = null;
                List list9 = null;
                List list10 = null;
                CodeWrapperDto codeWrapperDto5 = null;
                ProductsReferencesDto ojitshcjhnVar2 = null;
                CodeWrapperDto codeWrapperDto6 = null;
                List list11 = null;
                ProductsDto productsDto3 = null;
                String strVdvldrhtss4 = null;
                boolean z13 = true;
                int i14 = 0;
                List list12 = null;
                BonusDto bonusDto3 = null;
                while (true) {
                    String str3 = strVdvldrhtss3;
                    if (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        switch (iYadqdtsiqt) {
                            case -1:
                                list12 = list12;
                                z13 = false;
                                zoijcleaowVarArr = zoijcleaowVarArr;
                                strVdvldrhtss3 = str3;
                                break;
                            case 0:
                                i14 |= 1;
                                list12 = list12;
                                strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                                zoijcleaowVarArr = zoijcleaowVarArr;
                                break;
                            case 1:
                                strVdvldrhtss4 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                                i14 |= 2;
                                list12 = list12;
                                zoijcleaowVarArr = zoijcleaowVarArr;
                                strVdvldrhtss3 = str3;
                                break;
                            case 2:
                                list12 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 2, zoijcleaowVarArr[2], list12);
                                i14 |= 4;
                                zoijcleaowVarArr = zoijcleaowVarArr;
                                strVdvldrhtss3 = str3;
                                break;
                            case 3:
                                bonusDto3 = (BonusDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, BonusDto.iobyxmoadg.f94387iobyxmoadg, bonusDto3);
                                i14 |= 8;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 4:
                                productsDto3 = (ProductsDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 4, ProductsDto.iobyxmoadg.f94352iobyxmoadg, productsDto3);
                                i14 |= 16;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 5:
                                list10 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 5, zoijcleaowVarArr[5], list10);
                                i14 |= 32;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 6:
                                codeWrapperDto5 = (CodeWrapperDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 6, CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg, codeWrapperDto5);
                                i14 |= 64;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 7:
                                codeWrapperDto6 = (CodeWrapperDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 7, CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg, codeWrapperDto6);
                                i14 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 8:
                                list9 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 8, zoijcleaowVarArr[8], list9);
                                i14 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 9:
                                puzzleDto3 = (PuzzleDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 9, PuzzleDto.iobyxmoadg.f94355iobyxmoadg, puzzleDto3);
                                i14 |= UserVerificationMethods.USER_VERIFY_NONE;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 10:
                                list11 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 10, zoijcleaowVarArr[10], list11);
                                i14 |= UserVerificationMethods.USER_VERIFY_ALL;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 11:
                                ppxfxbqfkfVar3 = (ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 11, zoijcleaowVarArr[11], ppxfxbqfkfVar3);
                                i14 |= 2048;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            case 12:
                                ojitshcjhnVar2 = (ProductsReferencesDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 12, ProductsReferencesDto.iobyxmoadg.f64472iobyxmoadg, ojitshcjhnVar2);
                                i14 |= 4096;
                                strVdvldrhtss3 = str3;
                                list12 = list12;
                                break;
                            default:
                                throw new UnknownFieldException(iYadqdtsiqt);
                        }
                    } else {
                        list = list12;
                        ppxfxbqfkfVar = ppxfxbqfkfVar3;
                        puzzleDto = puzzleDto3;
                        list2 = list9;
                        list3 = list10;
                        codeWrapperDto = codeWrapperDto5;
                        i13 = i14;
                        ojitshcjhnVar = ojitshcjhnVar2;
                        codeWrapperDto2 = codeWrapperDto6;
                        list4 = list11;
                        productsDto = productsDto3;
                        bonusDto = bonusDto3;
                        str = strVdvldrhtss4;
                        str2 = str3;
                    }
                }
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new EvropolisGiftDto(i13, str2, str, list, bonusDto, productsDto, list3, codeWrapperDto, codeWrapperDto2, list2, puzzleDto, list4, ppxfxbqfkfVar, ojitshcjhnVar, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, EvropolisGiftDto value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            EvropolisGiftDto.ojitshcjhn(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0004\u001e\u0012\u001c\"B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg;", "", "", "seen0", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "type", "", "title", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "getType$annotations", "()V", "zoijcleaow", "Ljava/lang/String;", "getTitle$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow[] f94357ppxfxbqfkf = {ppxfxbqfkf.INSTANCE.serializer(), null};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final ppxfxbqfkf type;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94360iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94360iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.TabDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("code", true);
                iyctptxqztVar.ojitshcjhn("title", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                return new zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(TabDto.f94357ppxfxbqfkf[0]), wizcaqwiak.f34245iobyxmoadg};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final TabDto zoijcleaow(eablkybsjg decoder) {
                ppxfxbqfkf ppxfxbqfkfVar;
                String strVdvldrhtss;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                zoijcleaow[] zoijcleaowVarArr = TabDto.f94357ppxfxbqfkf;
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    ppxfxbqfkfVar = (ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], null);
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    ppxfxbqfkf ppxfxbqfkfVar2 = null;
                    String strVdvldrhtss2 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], ppxfxbqfkfVar2);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 |= 2;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    strVdvldrhtss = strVdvldrhtss2;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new TabDto(i13, ppxfxbqfkfVar, strVdvldrhtss, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, TabDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                TabDto.wkgbmnqykc(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf */
        @wflxmlrfwp(with = wkgbmnqykc.class)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "", "", "apiValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "dxjokdxxww", "()Ljava/lang/String;", "Companion", "iobyxmoadg", "jyumaefscl", "iwizpuwonk", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum ppxfxbqfkf {
            OFFLINE("offline"),
            ONLINE("online");


            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
            private final String apiValue;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f94362esjtqupxsv = ng.zoijcleaow.iobyxmoadg(wkgbmnqykc());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private static final gg.gtknphoqwx f94365yggfygwlhe = draadjrbmk.iobyxmoadg(ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: iy0.iobyxmoadg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return EvropolisGiftDto.TabDto.ppxfxbqfkf.lqeggnwhkg();
                }
            });

            /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf$iobyxmoadg, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ zoijcleaow iobyxmoadg() {
                    return (zoijcleaow) ppxfxbqfkf.f94365yggfygwlhe.getValue();
                }

                public final zoijcleaow serializer() {
                    return iobyxmoadg();
                }

                public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                    this();
                }
            }

            ppxfxbqfkf(String str) {
                this.apiValue = str;
            }

            public static ng.iobyxmoadg btonecajqb() {
                return f94362esjtqupxsv;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ zoijcleaow lqeggnwhkg() {
                return new wkgbmnqykc();
            }

            /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
            public final String getApiValue() {
                return this.apiValue;
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg$wkgbmnqykc */
        private static final class wkgbmnqykc implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final dk.gxszxtbevo f94367iobyxmoadg = dk.wflxmlrfwp.ppxfxbqfkf("TabTypeDto", dk.eablkybsjg.dxjokdxxww.f29077iobyxmoadg);

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public ppxfxbqfkf zoijcleaow(eablkybsjg decoder) {
                Object next;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                String strPmvmpeiblj = decoder.pmvmpeiblj();
                Iterator<E> it = ppxfxbqfkf.btonecajqb().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).getApiValue(), strPmvmpeiblj)) {
                        return (ppxfxbqfkf) next;
                    }
                }
                next = null;
                return (ppxfxbqfkf) next;
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public dk.gxszxtbevo iobyxmoadg() {
                return this.f94367iobyxmoadg;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ek.gxszxtbevo encoder, ppxfxbqfkf ppxfxbqfkfVar) {
                String apiValue;
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                if (ppxfxbqfkfVar == null || (apiValue = ppxfxbqfkfVar.getApiValue()) == null) {
                    apiValue = "";
                }
                encoder.lmojexxdyd(apiValue);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$lqeggnwhkg$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94360iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ TabDto(int i13, ppxfxbqfkf ppxfxbqfkfVar, String str, dvvnrvtcbc dvvnrvtcbcVar) {
            if (2 != (i13 & 2)) {
                sflfametgt.zoijcleaow(i13, 2, iobyxmoadg.f94360iobyxmoadg.iobyxmoadg());
            }
            if ((i13 & 1) == 0) {
                this.type = null;
            } else {
                this.type = ppxfxbqfkfVar;
            }
            this.title = str;
        }

        public static final /* synthetic */ void wkgbmnqykc(TabDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            zoijcleaow[] zoijcleaowVarArr = f94357ppxfxbqfkf;
            if (output.zdlpuopuiu(serialDesc, 0) || self.type != null) {
                output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.type);
            }
            output.istkbnxepw(serialDesc, 1, self.title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDto)) {
                return false;
            }
            TabDto tabDto = (TabDto) other;
            return this.type == tabDto.type && zdlpuopuiu.eablkybsjg(this.title, tabDto.title);
        }

        public int hashCode() {
            ppxfxbqfkf ppxfxbqfkfVar = this.type;
            return ((ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode()) * 31) + this.title.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final ppxfxbqfkf getType() {
            return this.type;
        }

        public String toString() {
            return "TabDto(type=" + this.type + ", title=" + this.title + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$nufgyqmvbu, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001c\u001eB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$nufgyqmvbu;", "", "", "seen0", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "tab", "", "text", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$nufgyqmvbu;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "zoijcleaow", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "getTab$annotations", "()V", "Ljava/lang/String;", "ppxfxbqfkf", "getText$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextWrapperDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow[] f94368ppxfxbqfkf = {TabDto.ppxfxbqfkf.INSTANCE.serializer(), null};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final TabDto.ppxfxbqfkf tab;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$nufgyqmvbu$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94371iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94371iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.TextWrapperDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("tab", true);
                iyctptxqztVar.ojitshcjhn("text", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                return new zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(TextWrapperDto.f94368ppxfxbqfkf[0]), wizcaqwiak.f34245iobyxmoadg};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final TextWrapperDto zoijcleaow(eablkybsjg decoder) {
                TabDto.ppxfxbqfkf ppxfxbqfkfVar;
                String strVdvldrhtss;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                zoijcleaow[] zoijcleaowVarArr = TextWrapperDto.f94368ppxfxbqfkf;
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    ppxfxbqfkfVar = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], null);
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    TabDto.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                    String strVdvldrhtss2 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            ppxfxbqfkfVar2 = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], ppxfxbqfkfVar2);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 |= 2;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    strVdvldrhtss = strVdvldrhtss2;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new TextWrapperDto(i13, ppxfxbqfkfVar, strVdvldrhtss, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, TextWrapperDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                TextWrapperDto.wkgbmnqykc(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$nufgyqmvbu$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94371iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ TextWrapperDto(int i13, TabDto.ppxfxbqfkf ppxfxbqfkfVar, String str, dvvnrvtcbc dvvnrvtcbcVar) {
            if (2 != (i13 & 2)) {
                sflfametgt.zoijcleaow(i13, 2, iobyxmoadg.f94371iobyxmoadg.iobyxmoadg());
            }
            if ((i13 & 1) == 0) {
                this.tab = null;
            } else {
                this.tab = ppxfxbqfkfVar;
            }
            this.text = str;
        }

        public static final /* synthetic */ void wkgbmnqykc(TextWrapperDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            zoijcleaow[] zoijcleaowVarArr = f94368ppxfxbqfkf;
            if (output.zdlpuopuiu(serialDesc, 0) || self.tab != null) {
                output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.tab);
            }
            output.istkbnxepw(serialDesc, 1, self.text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWrapperDto)) {
                return false;
            }
            TextWrapperDto textWrapperDto = (TextWrapperDto) other;
            return this.tab == textWrapperDto.tab && zdlpuopuiu.eablkybsjg(this.text, textWrapperDto.text);
        }

        public int hashCode() {
            TabDto.ppxfxbqfkf ppxfxbqfkfVar = this.tab;
            return ((ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode()) * 31) + this.text.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public String toString() {
            return "TextWrapperDto(tab=" + this.tab + ", text=" + this.text + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final TabDto.ppxfxbqfkf getTab() {
            return this.tab;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003#\u001d\u001fB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010\"\u001a\u0004\b#\u0010%¨\u0006("}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf;", "", "", "seen0", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "tab", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;", "button", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "getTab$annotations", "()V", "zoijcleaow", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;", "getButton$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWrapperDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow[] f94372ppxfxbqfkf = {TabDto.ppxfxbqfkf.INSTANCE.serializer(), null};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final TabDto.ppxfxbqfkf tab;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonDto button;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94375iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94375iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.ButtonWrapperDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("tab", true);
                iyctptxqztVar.ojitshcjhn("button", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                return new zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(ButtonWrapperDto.f94372ppxfxbqfkf[0]), ButtonDto.iobyxmoadg.f94380iobyxmoadg};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final ButtonWrapperDto zoijcleaow(eablkybsjg decoder) {
                TabDto.ppxfxbqfkf ppxfxbqfkfVar;
                ButtonDto buttonDto;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                zoijcleaow[] zoijcleaowVarArr = ButtonWrapperDto.f94372ppxfxbqfkf;
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    ppxfxbqfkfVar = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], null);
                    buttonDto = (ButtonDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 1, ButtonDto.iobyxmoadg.f94380iobyxmoadg, null);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    TabDto.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                    ButtonDto buttonDto2 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            ppxfxbqfkfVar2 = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], ppxfxbqfkfVar2);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            buttonDto2 = (ButtonDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 1, ButtonDto.iobyxmoadg.f94380iobyxmoadg, buttonDto2);
                            i14 |= 2;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    buttonDto = buttonDto2;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new ButtonWrapperDto(i13, ppxfxbqfkfVar, buttonDto, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, ButtonWrapperDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                ButtonWrapperDto.wkgbmnqykc(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94375iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf$zoijcleaow, reason: from toString */
        @wflxmlrfwp
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u001d\"BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0016R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b\u001d\u0010\u0016R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b&\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006("}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;", "", "", "seen0", "", "type", "text", "navLink", "reference", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$ppxfxbqfkf$zoijcleaow;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "wkgbmnqykc", "getType$annotations", "()V", "zoijcleaow", "ppxfxbqfkf", "getText$annotations", "getNavLink$annotations", "getReference$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonDto {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
            private final String type;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
            private final String navLink;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
            private final String reference;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
            private final String text;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf$zoijcleaow$iobyxmoadg */
            public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
                private static final dk.gxszxtbevo descriptor;

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final iobyxmoadg f94380iobyxmoadg;

                static {
                    iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                    f94380iobyxmoadg = iobyxmoadgVar;
                    iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.ButtonWrapperDto.ButtonDto", iobyxmoadgVar, 4);
                    iyctptxqztVar.ojitshcjhn("type", false);
                    iyctptxqztVar.ojitshcjhn("caption", false);
                    iyctptxqztVar.ojitshcjhn("navlink", false);
                    iyctptxqztVar.ojitshcjhn("reference", false);
                    descriptor = iyctptxqztVar;
                }

                private iobyxmoadg() {
                }

                @Override // fk.iozdgvuglv
                public final zoijcleaow[] eablkybsjg() {
                    wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
                    return new zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar, wizcaqwiakVar, wizcaqwiakVar};
                }

                @Override // bk.iobyxmoadg
                /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
                public final ButtonDto zoijcleaow(eablkybsjg decoder) {
                    String str;
                    String strVdvldrhtss;
                    String str2;
                    String str3;
                    int i13;
                    zdlpuopuiu.btonecajqb(decoder, "decoder");
                    dk.gxszxtbevo gxszxtbevoVar = descriptor;
                    ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                    if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                        String strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                        String strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                        String strVdvldrhtss4 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                        str = strVdvldrhtss2;
                        strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 3);
                        str2 = strVdvldrhtss4;
                        str3 = strVdvldrhtss3;
                        i13 = 15;
                    } else {
                        String strVdvldrhtss5 = null;
                        String strVdvldrhtss6 = null;
                        String strVdvldrhtss7 = null;
                        String strVdvldrhtss8 = null;
                        boolean z13 = true;
                        int i14 = 0;
                        while (z13) {
                            int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                            if (iYadqdtsiqt == -1) {
                                z13 = false;
                            } else if (iYadqdtsiqt == 0) {
                                strVdvldrhtss5 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                                i14 |= 1;
                            } else if (iYadqdtsiqt == 1) {
                                strVdvldrhtss8 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                                i14 |= 2;
                            } else if (iYadqdtsiqt == 2) {
                                strVdvldrhtss7 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                                i14 |= 4;
                            } else {
                                if (iYadqdtsiqt != 3) {
                                    throw new UnknownFieldException(iYadqdtsiqt);
                                }
                                strVdvldrhtss6 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 3);
                                i14 |= 8;
                            }
                        }
                        str = strVdvldrhtss5;
                        strVdvldrhtss = strVdvldrhtss6;
                        str2 = strVdvldrhtss7;
                        str3 = strVdvldrhtss8;
                        i13 = i14;
                    }
                    ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                    return new ButtonDto(i13, str, str3, str2, strVdvldrhtss, null);
                }

                @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
                public final dk.gxszxtbevo iobyxmoadg() {
                    return descriptor;
                }

                @Override // bk.agtfadlqog
                /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
                public final void wkgbmnqykc(ek.gxszxtbevo encoder, ButtonDto value) {
                    zdlpuopuiu.btonecajqb(encoder, "encoder");
                    zdlpuopuiu.btonecajqb(value, "value");
                    dk.gxszxtbevo gxszxtbevoVar = descriptor;
                    wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                    ButtonDto.eablkybsjg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                    wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                }

                @Override // fk.iozdgvuglv
                public zoijcleaow[] ppxfxbqfkf() {
                    return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
                }
            }

            /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$ppxfxbqfkf$zoijcleaow$zoijcleaow, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public final zoijcleaow serializer() {
                    return iobyxmoadg.f94380iobyxmoadg;
                }

                public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                    this();
                }
            }

            public /* synthetic */ ButtonDto(int i13, String str, String str2, String str3, String str4, dvvnrvtcbc dvvnrvtcbcVar) {
                if (15 != (i13 & 15)) {
                    sflfametgt.zoijcleaow(i13, 15, iobyxmoadg.f94380iobyxmoadg.iobyxmoadg());
                }
                this.type = str;
                this.text = str2;
                this.navLink = str3;
                this.reference = str4;
            }

            public static final /* synthetic */ void eablkybsjg(ButtonDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
                output.istkbnxepw(serialDesc, 0, self.type);
                output.istkbnxepw(serialDesc, 1, self.text);
                output.istkbnxepw(serialDesc, 2, self.navLink);
                output.istkbnxepw(serialDesc, 3, self.reference);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonDto)) {
                    return false;
                }
                ButtonDto buttonDto = (ButtonDto) other;
                return zdlpuopuiu.eablkybsjg(this.type, buttonDto.type) && zdlpuopuiu.eablkybsjg(this.text, buttonDto.text) && zdlpuopuiu.eablkybsjg(this.navLink, buttonDto.navLink) && zdlpuopuiu.eablkybsjg(this.reference, buttonDto.reference);
            }

            public int hashCode() {
                return (((((this.type.hashCode() * 31) + this.text.hashCode()) * 31) + this.navLink.hashCode()) * 31) + this.reference.hashCode();
            }

            /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
            public final String getNavLink() {
                return this.navLink;
            }

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public String toString() {
                return "ButtonDto(type=" + this.type + ", text=" + this.text + ", navLink=" + this.navLink + ", reference=" + this.reference + ")";
            }

            /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
            public final String getReference() {
                return this.reference;
            }
        }

        public /* synthetic */ ButtonWrapperDto(int i13, TabDto.ppxfxbqfkf ppxfxbqfkfVar, ButtonDto buttonDto, dvvnrvtcbc dvvnrvtcbcVar) {
            if (2 != (i13 & 2)) {
                sflfametgt.zoijcleaow(i13, 2, iobyxmoadg.f94375iobyxmoadg.iobyxmoadg());
            }
            if ((i13 & 1) == 0) {
                this.tab = null;
            } else {
                this.tab = ppxfxbqfkfVar;
            }
            this.button = buttonDto;
        }

        public static final /* synthetic */ void wkgbmnqykc(ButtonWrapperDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            zoijcleaow[] zoijcleaowVarArr = f94372ppxfxbqfkf;
            if (output.zdlpuopuiu(serialDesc, 0) || self.tab != null) {
                output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.tab);
            }
            output.lqeggnwhkg(serialDesc, 1, ButtonDto.iobyxmoadg.f94380iobyxmoadg, self.button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWrapperDto)) {
                return false;
            }
            ButtonWrapperDto buttonWrapperDto = (ButtonWrapperDto) other;
            return this.tab == buttonWrapperDto.tab && zdlpuopuiu.eablkybsjg(this.button, buttonWrapperDto.button);
        }

        public int hashCode() {
            TabDto.ppxfxbqfkf ppxfxbqfkfVar = this.tab;
            return ((ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode()) * 31) + this.button.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final TabDto.ppxfxbqfkf getTab() {
            return this.tab;
        }

        public String toString() {
            return "ButtonWrapperDto(tab=" + this.tab + ", button=" + this.button + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final ButtonDto getButton() {
            return this.button;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$wkgbmnqykc, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001c\"B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;", "", "", "seen0", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "tab", "", "code", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$wkgbmnqykc;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$lqeggnwhkg$ppxfxbqfkf;", "getTab$annotations", "()V", "zoijcleaow", "Ljava/lang/String;", "getCode$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CodeWrapperDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow[] f94381ppxfxbqfkf = {TabDto.ppxfxbqfkf.INSTANCE.serializer(), null};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final TabDto.ppxfxbqfkf tab;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$wkgbmnqykc$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94384iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94384iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.CodeWrapperDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("tab", true);
                iyctptxqztVar.ojitshcjhn("code", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                return new zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(CodeWrapperDto.f94381ppxfxbqfkf[0]), wizcaqwiak.f34245iobyxmoadg};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final CodeWrapperDto zoijcleaow(eablkybsjg decoder) {
                TabDto.ppxfxbqfkf ppxfxbqfkfVar;
                String strVdvldrhtss;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                zoijcleaow[] zoijcleaowVarArr = CodeWrapperDto.f94381ppxfxbqfkf;
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    ppxfxbqfkfVar = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], null);
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    TabDto.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                    String strVdvldrhtss2 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            ppxfxbqfkfVar2 = (TabDto.ppxfxbqfkf) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, zoijcleaowVarArr[0], ppxfxbqfkfVar2);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 |= 2;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    strVdvldrhtss = strVdvldrhtss2;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new CodeWrapperDto(i13, ppxfxbqfkfVar, strVdvldrhtss, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, CodeWrapperDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                CodeWrapperDto.wkgbmnqykc(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$wkgbmnqykc$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94384iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ CodeWrapperDto(int i13, TabDto.ppxfxbqfkf ppxfxbqfkfVar, String str, dvvnrvtcbc dvvnrvtcbcVar) {
            if (2 != (i13 & 2)) {
                sflfametgt.zoijcleaow(i13, 2, iobyxmoadg.f94384iobyxmoadg.iobyxmoadg());
            }
            if ((i13 & 1) == 0) {
                this.tab = null;
            } else {
                this.tab = ppxfxbqfkfVar;
            }
            this.code = str;
        }

        public static final /* synthetic */ void wkgbmnqykc(CodeWrapperDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            zoijcleaow[] zoijcleaowVarArr = f94381ppxfxbqfkf;
            if (output.zdlpuopuiu(serialDesc, 0) || self.tab != null) {
                output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.tab);
            }
            output.istkbnxepw(serialDesc, 1, self.code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CodeWrapperDto)) {
                return false;
            }
            CodeWrapperDto codeWrapperDto = (CodeWrapperDto) other;
            return this.tab == codeWrapperDto.tab && zdlpuopuiu.eablkybsjg(this.code, codeWrapperDto.code);
        }

        public int hashCode() {
            TabDto.ppxfxbqfkf ppxfxbqfkfVar = this.tab;
            return ((ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode()) * 31) + this.code.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final TabDto.ppxfxbqfkf getTab() {
            return this.tab;
        }

        public String toString() {
            return "CodeWrapperDto(tab=" + this.tab + ", code=" + this.code + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$zoijcleaow, reason: from toString */
    @wflxmlrfwp
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010\u0014¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;", "", "", "seen0", "", "title", "image", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lru/myspar/proloyalty/core/data/response/evropolis/EvropolisGiftDto$zoijcleaow;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "zoijcleaow", "getTitle$annotations", "()V", "getImage$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$zoijcleaow$iobyxmoadg */
        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final dk.gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f94387iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f94387iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto.BonusDto", iobyxmoadgVar, 2);
                iyctptxqztVar.ojitshcjhn("text", false);
                iyctptxqztVar.ojitshcjhn("pic", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
                return new zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final BonusDto zoijcleaow(eablkybsjg decoder) {
                String strVdvldrhtss;
                String strVdvldrhtss2;
                int i13;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                dvvnrvtcbc dvvnrvtcbcVar = null;
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                    strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                    i13 = 3;
                } else {
                    boolean z13 = true;
                    int i14 = 0;
                    strVdvldrhtss = null;
                    String strVdvldrhtss3 = null;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                            i14 |= 1;
                        } else {
                            if (iYadqdtsiqt != 1) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 |= 2;
                        }
                    }
                    strVdvldrhtss2 = strVdvldrhtss3;
                    i13 = i14;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new BonusDto(i13, strVdvldrhtss, strVdvldrhtss2, dvvnrvtcbcVar);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final dk.gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, BonusDto value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                dk.gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                BonusDto.ppxfxbqfkf(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto$zoijcleaow$zoijcleaow, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f94387iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ BonusDto(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
            if (3 != (i13 & 3)) {
                sflfametgt.zoijcleaow(i13, 3, iobyxmoadg.f94387iobyxmoadg.iobyxmoadg());
            }
            this.title = str;
            this.image = str2;
        }

        public static final /* synthetic */ void ppxfxbqfkf(BonusDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
            output.istkbnxepw(serialDesc, 0, self.title);
            output.istkbnxepw(serialDesc, 1, self.image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusDto)) {
                return false;
            }
            BonusDto bonusDto = (BonusDto) other;
            return zdlpuopuiu.eablkybsjg(this.title, bonusDto.title) && zdlpuopuiu.eablkybsjg(this.image, bonusDto.image);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.image.hashCode();
        }

        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public String toString() {
            return "BonusDto(title=" + this.title + ", image=" + this.image + ")";
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    static {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(TabDto.iobyxmoadg.f94360iobyxmoadg);
        TextWrapperDto.iobyxmoadg iobyxmoadgVar = TextWrapperDto.iobyxmoadg.f94371iobyxmoadg;
        f94338agtfadlqog = new zoijcleaow[]{null, null, gxszxtbevoVar, null, null, new gxszxtbevo(iobyxmoadgVar), null, null, new gxszxtbevo(iobyxmoadgVar), null, new gxszxtbevo(ButtonWrapperDto.iobyxmoadg.f94375iobyxmoadg), ppxfxbqfkf.INSTANCE.serializer(), null};
    }

    public /* synthetic */ EvropolisGiftDto(int i13, String str, String str2, List list, BonusDto bonusDto, ProductsDto productsDto, List list2, CodeWrapperDto codeWrapperDto, CodeWrapperDto codeWrapperDto2, List list3, PuzzleDto puzzleDto, List list4, ppxfxbqfkf ppxfxbqfkfVar, ProductsReferencesDto ojitshcjhnVar, dvvnrvtcbc dvvnrvtcbcVar) {
        if (4099 != (i13 & 4099)) {
            sflfametgt.zoijcleaow(i13, 4099, iobyxmoadg.f94356iobyxmoadg.iobyxmoadg());
        }
        this.id = str;
        this.title = str2;
        if ((i13 & 4) == 0) {
            this.tabs = null;
        } else {
            this.tabs = list;
        }
        if ((i13 & 8) == 0) {
            this.bonus = null;
        } else {
            this.bonus = bonusDto;
        }
        if ((i13 & 16) == 0) {
            this.products = null;
        } else {
            this.products = productsDto;
        }
        if ((i13 & 32) == 0) {
            this.instructions = null;
        } else {
            this.instructions = list2;
        }
        if ((i13 & 64) == 0) {
            this.qr = null;
        } else {
            this.qr = codeWrapperDto;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            this.coupon = null;
        } else {
            this.coupon = codeWrapperDto2;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.terms = null;
        } else {
            this.terms = list3;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            this.puzzle = null;
        } else {
            this.puzzle = puzzleDto;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.buttons = null;
        } else {
            this.buttons = list4;
        }
        if ((i13 & 2048) == 0) {
            this.colorThemeType = null;
        } else {
            this.colorThemeType = ppxfxbqfkfVar;
        }
        this.refs = ojitshcjhnVar;
    }

    public static final /* synthetic */ void ojitshcjhn(EvropolisGiftDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        zoijcleaow[] zoijcleaowVarArr = f94338agtfadlqog;
        output.istkbnxepw(serialDesc, 0, self.id);
        output.istkbnxepw(serialDesc, 1, self.title);
        if (output.zdlpuopuiu(serialDesc, 2) || self.tabs != null) {
            output.yggfygwlhe(serialDesc, 2, zoijcleaowVarArr[2], self.tabs);
        }
        if (output.zdlpuopuiu(serialDesc, 3) || self.bonus != null) {
            output.yggfygwlhe(serialDesc, 3, BonusDto.iobyxmoadg.f94387iobyxmoadg, self.bonus);
        }
        if (output.zdlpuopuiu(serialDesc, 4) || self.products != null) {
            output.yggfygwlhe(serialDesc, 4, ProductsDto.iobyxmoadg.f94352iobyxmoadg, self.products);
        }
        if (output.zdlpuopuiu(serialDesc, 5) || self.instructions != null) {
            output.yggfygwlhe(serialDesc, 5, zoijcleaowVarArr[5], self.instructions);
        }
        if (output.zdlpuopuiu(serialDesc, 6) || self.qr != null) {
            output.yggfygwlhe(serialDesc, 6, CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg, self.qr);
        }
        if (output.zdlpuopuiu(serialDesc, 7) || self.coupon != null) {
            output.yggfygwlhe(serialDesc, 7, CodeWrapperDto.iobyxmoadg.f94384iobyxmoadg, self.coupon);
        }
        if (output.zdlpuopuiu(serialDesc, 8) || self.terms != null) {
            output.yggfygwlhe(serialDesc, 8, zoijcleaowVarArr[8], self.terms);
        }
        if (output.zdlpuopuiu(serialDesc, 9) || self.puzzle != null) {
            output.yggfygwlhe(serialDesc, 9, PuzzleDto.iobyxmoadg.f94355iobyxmoadg, self.puzzle);
        }
        if (output.zdlpuopuiu(serialDesc, 10) || self.buttons != null) {
            output.yggfygwlhe(serialDesc, 10, zoijcleaowVarArr[10], self.buttons);
        }
        if (output.zdlpuopuiu(serialDesc, 11) || self.colorThemeType != null) {
            output.yggfygwlhe(serialDesc, 11, zoijcleaowVarArr[11], self.colorThemeType);
        }
        output.lqeggnwhkg(serialDesc, 12, ProductsReferencesDto.iobyxmoadg.f64472iobyxmoadg, self.refs);
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final CodeWrapperDto getQr() {
        return this.qr;
    }

    /* JADX INFO: renamed from: draadjrbmk, reason: from getter */
    public final List getTabs() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final PuzzleDto getPuzzle() {
        return this.puzzle;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final CodeWrapperDto getCoupon() {
        return this.coupon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvropolisGiftDto)) {
            return false;
        }
        EvropolisGiftDto evropolisGiftDto = (EvropolisGiftDto) other;
        return zdlpuopuiu.eablkybsjg(this.id, evropolisGiftDto.id) && zdlpuopuiu.eablkybsjg(this.title, evropolisGiftDto.title) && zdlpuopuiu.eablkybsjg(this.tabs, evropolisGiftDto.tabs) && zdlpuopuiu.eablkybsjg(this.bonus, evropolisGiftDto.bonus) && zdlpuopuiu.eablkybsjg(this.products, evropolisGiftDto.products) && zdlpuopuiu.eablkybsjg(this.instructions, evropolisGiftDto.instructions) && zdlpuopuiu.eablkybsjg(this.qr, evropolisGiftDto.qr) && zdlpuopuiu.eablkybsjg(this.coupon, evropolisGiftDto.coupon) && zdlpuopuiu.eablkybsjg(this.terms, evropolisGiftDto.terms) && zdlpuopuiu.eablkybsjg(this.puzzle, evropolisGiftDto.puzzle) && zdlpuopuiu.eablkybsjg(this.buttons, evropolisGiftDto.buttons) && this.colorThemeType == evropolisGiftDto.colorThemeType && zdlpuopuiu.eablkybsjg(this.refs, evropolisGiftDto.refs);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final ProductsReferencesDto getRefs() {
        return this.refs;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        List list = this.tabs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BonusDto bonusDto = this.bonus;
        int iHashCode3 = (iHashCode2 + (bonusDto == null ? 0 : bonusDto.hashCode())) * 31;
        ProductsDto productsDto = this.products;
        int iHashCode4 = (iHashCode3 + (productsDto == null ? 0 : productsDto.hashCode())) * 31;
        List list2 = this.instructions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CodeWrapperDto codeWrapperDto = this.qr;
        int iHashCode6 = (iHashCode5 + (codeWrapperDto == null ? 0 : codeWrapperDto.hashCode())) * 31;
        CodeWrapperDto codeWrapperDto2 = this.coupon;
        int iHashCode7 = (iHashCode6 + (codeWrapperDto2 == null ? 0 : codeWrapperDto2.hashCode())) * 31;
        List list3 = this.terms;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PuzzleDto puzzleDto = this.puzzle;
        int iHashCode9 = (iHashCode8 + (puzzleDto == null ? 0 : puzzleDto.hashCode())) * 31;
        List list4 = this.buttons;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.colorThemeType;
        return ((iHashCode10 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0)) * 31) + this.refs.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getInstructions() {
        return this.instructions;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ProductsDto getProducts() {
        return this.products;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    public String toString() {
        return "EvropolisGiftDto(id=" + this.id + ", title=" + this.title + ", tabs=" + this.tabs + ", bonus=" + this.bonus + ", products=" + this.products + ", instructions=" + this.instructions + ", qr=" + this.qr + ", coupon=" + this.coupon + ", terms=" + this.terms + ", puzzle=" + this.puzzle + ", buttons=" + this.buttons + ", colorThemeType=" + this.colorThemeType + ", refs=" + this.refs + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final ppxfxbqfkf getColorThemeType() {
        return this.colorThemeType;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final BonusDto getBonus() {
        return this.bonus;
    }
}
