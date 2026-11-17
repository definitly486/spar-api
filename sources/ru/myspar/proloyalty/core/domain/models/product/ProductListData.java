package ru.myspar.proloyalty.core.domain.models.product;

import a01.ppxfxbqfkf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.models.paging.Paging;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0001cB÷\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u0088\u0002\u0010-\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00022\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b1\u0010,J\u001a\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b8\u0010C\u001a\u0004\bD\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u00100R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bG\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bJ\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bD\u0010Z\u001a\u0004\b[\u0010\\R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\b]\u00109R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0006¢\u0006\f\n\u0004\b^\u00107\u001a\u0004\b_\u00109R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b:\u0010b¨\u0006d"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "Landroid/os/Parcelable;", "", "", "searchSuggestions", "Lru/myspar/proloyalty/core/domain/models/product/SearchCategoryModel;", "searchCategories", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "productList", "Lru/myspar/proloyalty/core/models/paging/Paging;", "paging", "Lru/myspar/proloyalty/core/domain/models/product/FilterSection;", "filterSections", "titleImage", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;", "selectionsData", "textModal", "headerModal", "buttonModal", "textBefore", "", "isAgeCheckNeeded", "Lru/myspar/proloyalty/core/domain/models/product/Section;", "section", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "Lru/myspar/proloyalty/core/domain/models/product/PromoProduct;", "promo", "Lru/myspar/proloyalty/core/domain/models/product/SearchFeatureModel;", "features", "La01/ppxfxbqfkf;", "additionalBlocks", "Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "promoBanner", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;Ljava/util/List;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/domain/models/product/Section;Lru/myspar/proloyalty/core/domain/models/ColorsModel;Lru/myspar/proloyalty/core/domain/models/product/PromoProduct;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;Ljava/util/List;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/domain/models/product/Section;Lru/myspar/proloyalty/core/domain/models/ColorsModel;Lru/myspar/proloyalty/core/domain/models/product/PromoProduct;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;)Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "esjtqupxsv", "()Ljava/util/List;", "yggfygwlhe", "iwizpuwonk", "jyumaefscl", "wflxmlrfwp", "Lru/myspar/proloyalty/core/models/paging/Paging;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/models/paging/Paging;", "cqumvgiudr", "dxjokdxxww", "Ljava/lang/String;", "wwaezpbzkn", "lereixgezr", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;", "yadqdtsiqt", "()Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;", "pmvmpeiblj", "lmojexxdyd", "zynmafqrjb", "btonecajqb", "istkbnxepw", "gxszxtbevo", "cdpycssgdh", "iozdgvuglv", "Z", "ylkuphrtab", "()Z", "Lru/myspar/proloyalty/core/domain/models/product/Section;", "getSection", "()Lru/myspar/proloyalty/core/domain/models/product/Section;", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "Lru/myspar/proloyalty/core/domain/models/product/PromoProduct;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/core/domain/models/product/PromoProduct;", "nufgyqmvbu", "pkzmftpjix", "eablkybsjg", "hcddaimhww", "Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "()Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "SelectionsData", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductListData implements Parcelable {
    public static final Parcelable.Creator<ProductListData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String textBefore;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filterSections;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleImage;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsPromoBanner promoBanner;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Section section;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonModal;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productList;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelectionsData selectionsData;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final List additionalBlocks;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String textModal;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromoProduct promo;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAgeCheckNeeded;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List searchCategories;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final List features;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List searchSuggestions;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headerModal;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/product/ProductListData$SelectionsData;", "Landroid/os/Parcelable;", "", "currentSelectionId", "currentSelectionName", "", "Lru/myspar/proloyalty/core/domain/models/product/Selection;", "selections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getCurrentSelectionId", "yggfygwlhe", "getCurrentSelectionName", "jyumaefscl", "Ljava/util/List;", "getSelections", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionsData implements Parcelable {
        public static final Parcelable.Creator<SelectionsData> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final List selections;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currentSelectionName;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currentSelectionId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final SelectionsData createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(Selection.CREATOR.createFromParcel(parcel));
                }
                return new SelectionsData(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final SelectionsData[] newArray(int i13) {
                return new SelectionsData[i13];
            }
        }

        public SelectionsData(String currentSelectionId, String currentSelectionName, List selections) {
            zdlpuopuiu.btonecajqb(currentSelectionId, "currentSelectionId");
            zdlpuopuiu.btonecajqb(currentSelectionName, "currentSelectionName");
            zdlpuopuiu.btonecajqb(selections, "selections");
            this.currentSelectionId = currentSelectionId;
            this.currentSelectionName = currentSelectionName;
            this.selections = selections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionsData)) {
                return false;
            }
            SelectionsData selectionsData = (SelectionsData) other;
            return zdlpuopuiu.eablkybsjg(this.currentSelectionId, selectionsData.currentSelectionId) && zdlpuopuiu.eablkybsjg(this.currentSelectionName, selectionsData.currentSelectionName) && zdlpuopuiu.eablkybsjg(this.selections, selectionsData.selections);
        }

        public int hashCode() {
            return (((this.currentSelectionId.hashCode() * 31) + this.currentSelectionName.hashCode()) * 31) + this.selections.hashCode();
        }

        public String toString() {
            return "SelectionsData(currentSelectionId=" + this.currentSelectionId + ", currentSelectionName=" + this.currentSelectionName + ", selections=" + this.selections + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.currentSelectionId);
            dest.writeString(this.currentSelectionName);
            List list = this.selections;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Selection) it.next()).writeToParcel(dest, flags);
            }
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductListData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(SearchCategoryModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(Product.CREATOR.createFromParcel(parcel));
                }
            }
            Paging paging = (Paging) parcel.readParcelable(ProductListData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList5.add(FilterSection.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList5;
            }
            String string = parcel.readString();
            SelectionsData selectionsDataCreateFromParcel = parcel.readInt() == 0 ? null : SelectionsData.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            Section sectionCreateFromParcel = parcel.readInt() == 0 ? null : Section.CREATOR.createFromParcel(parcel);
            ColorsModel colorsModelCreateFromParcel = parcel.readInt() == 0 ? null : ColorsModel.CREATOR.createFromParcel(parcel);
            PromoProduct promoProductCreateFromParcel = parcel.readInt() == 0 ? null : PromoProduct.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i19);
                int i23 = 0;
                while (i23 != i19) {
                    arrayList6.add(SearchFeatureModel.CREATOR.createFromParcel(parcel));
                    i23++;
                    i19 = i19;
                }
                arrayList4 = arrayList6;
            }
            int i24 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i24);
            int i25 = 0;
            while (i25 != i24) {
                arrayList7.add(ppxfxbqfkf.valueOf(parcel.readString()));
                i25++;
                i24 = i24;
            }
            return new ProductListData(arrayListCreateStringArrayList, arrayList, arrayList2, paging, arrayList3, string, selectionsDataCreateFromParcel, string2, string3, string4, string5, z13, sectionCreateFromParcel, colorsModelCreateFromParcel, promoProductCreateFromParcel, arrayList4, arrayList7, parcel.readInt() == 0 ? null : ProductsPromoBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductListData[] newArray(int i13) {
            return new ProductListData[i13];
        }
    }

    public ProductListData(List list, List list2, List list3, Paging paging, List list4, String str, SelectionsData selectionsData, String str2, String str3, String str4, String str5, boolean z13, Section section, ColorsModel colorsModel, PromoProduct promoProduct, List list5, List additionalBlocks, ProductsPromoBanner productsPromoBanner) {
        zdlpuopuiu.btonecajqb(additionalBlocks, "additionalBlocks");
        this.searchSuggestions = list;
        this.searchCategories = list2;
        this.productList = list3;
        this.paging = paging;
        this.filterSections = list4;
        this.titleImage = str;
        this.selectionsData = selectionsData;
        this.textModal = str2;
        this.headerModal = str3;
        this.buttonModal = str4;
        this.textBefore = str5;
        this.isAgeCheckNeeded = z13;
        this.section = section;
        this.colorsModel = colorsModel;
        this.promo = promoProduct;
        this.features = list5;
        this.additionalBlocks = additionalBlocks;
        this.promoBanner = productsPromoBanner;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getHeaderModal() {
        return this.headerModal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getFilterSections() {
        return this.filterSections;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getAdditionalBlocks() {
        return this.additionalBlocks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListData)) {
            return false;
        }
        ProductListData productListData = (ProductListData) other;
        return zdlpuopuiu.eablkybsjg(this.searchSuggestions, productListData.searchSuggestions) && zdlpuopuiu.eablkybsjg(this.searchCategories, productListData.searchCategories) && zdlpuopuiu.eablkybsjg(this.productList, productListData.productList) && zdlpuopuiu.eablkybsjg(this.paging, productListData.paging) && zdlpuopuiu.eablkybsjg(this.filterSections, productListData.filterSections) && zdlpuopuiu.eablkybsjg(this.titleImage, productListData.titleImage) && zdlpuopuiu.eablkybsjg(this.selectionsData, productListData.selectionsData) && zdlpuopuiu.eablkybsjg(this.textModal, productListData.textModal) && zdlpuopuiu.eablkybsjg(this.headerModal, productListData.headerModal) && zdlpuopuiu.eablkybsjg(this.buttonModal, productListData.buttonModal) && zdlpuopuiu.eablkybsjg(this.textBefore, productListData.textBefore) && this.isAgeCheckNeeded == productListData.isAgeCheckNeeded && zdlpuopuiu.eablkybsjg(this.section, productListData.section) && zdlpuopuiu.eablkybsjg(this.colorsModel, productListData.colorsModel) && zdlpuopuiu.eablkybsjg(this.promo, productListData.promo) && zdlpuopuiu.eablkybsjg(this.features, productListData.features) && zdlpuopuiu.eablkybsjg(this.additionalBlocks, productListData.additionalBlocks) && zdlpuopuiu.eablkybsjg(this.promoBanner, productListData.promoBanner);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final List getSearchSuggestions() {
        return this.searchSuggestions;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getButtonModal() {
        return this.buttonModal;
    }

    public int hashCode() {
        List list = this.searchSuggestions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.searchCategories;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.productList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Paging paging = this.paging;
        int iHashCode4 = (iHashCode3 + (paging == null ? 0 : paging.hashCode())) * 31;
        List list4 = this.filterSections;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.titleImage;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        SelectionsData selectionsData = this.selectionsData;
        int iHashCode7 = (iHashCode6 + (selectionsData == null ? 0 : selectionsData.hashCode())) * 31;
        String str2 = this.textModal;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerModal;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonModal;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textBefore;
        int iHashCode11 = (((iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isAgeCheckNeeded)) * 31;
        Section section = this.section;
        int iHashCode12 = (iHashCode11 + (section == null ? 0 : section.hashCode())) * 31;
        ColorsModel colorsModel = this.colorsModel;
        int iHashCode13 = (iHashCode12 + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31;
        PromoProduct promoProduct = this.promo;
        int iHashCode14 = (iHashCode13 + (promoProduct == null ? 0 : promoProduct.hashCode())) * 31;
        List list5 = this.features;
        int iHashCode15 = (((iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31) + this.additionalBlocks.hashCode()) * 31;
        ProductsPromoBanner productsPromoBanner = this.promoBanner;
        return iHashCode15 + (productsPromoBanner != null ? productsPromoBanner.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final String getTextBefore() {
        return this.textBefore;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final List getSearchCategories() {
        return this.searchCategories;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final String getTextModal() {
        return this.textModal;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final PromoProduct getPromo() {
        return this.promo;
    }

    public String toString() {
        return "ProductListData(searchSuggestions=" + this.searchSuggestions + ", searchCategories=" + this.searchCategories + ", productList=" + this.productList + ", paging=" + this.paging + ", filterSections=" + this.filterSections + ", titleImage=" + this.titleImage + ", selectionsData=" + this.selectionsData + ", textModal=" + this.textModal + ", headerModal=" + this.headerModal + ", buttonModal=" + this.buttonModal + ", textBefore=" + this.textBefore + ", isAgeCheckNeeded=" + this.isAgeCheckNeeded + ", section=" + this.section + ", colorsModel=" + this.colorsModel + ", promo=" + this.promo + ", features=" + this.features + ", additionalBlocks=" + this.additionalBlocks + ", promoBanner=" + this.promoBanner + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeStringList(this.searchSuggestions);
        List list = this.searchCategories;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((SearchCategoryModel) it.next()).writeToParcel(dest, flags);
            }
        }
        List list2 = this.productList;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((Product) it2.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeParcelable(this.paging, flags);
        List list3 = this.filterSections;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((FilterSection) it3.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.titleImage);
        SelectionsData selectionsData = this.selectionsData;
        if (selectionsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectionsData.writeToParcel(dest, flags);
        }
        dest.writeString(this.textModal);
        dest.writeString(this.headerModal);
        dest.writeString(this.buttonModal);
        dest.writeString(this.textBefore);
        dest.writeInt(this.isAgeCheckNeeded ? 1 : 0);
        Section section = this.section;
        if (section == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            section.writeToParcel(dest, flags);
        }
        ColorsModel colorsModel = this.colorsModel;
        if (colorsModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            colorsModel.writeToParcel(dest, flags);
        }
        PromoProduct promoProduct = this.promo;
        if (promoProduct == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            promoProduct.writeToParcel(dest, flags);
        }
        List list4 = this.features;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                ((SearchFeatureModel) it4.next()).writeToParcel(dest, flags);
            }
        }
        List list5 = this.additionalBlocks;
        dest.writeInt(list5.size());
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            dest.writeString(((ppxfxbqfkf) it5.next()).name());
        }
        ProductsPromoBanner productsPromoBanner = this.promoBanner;
        if (productsPromoBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productsPromoBanner.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final SelectionsData getSelectionsData() {
        return this.selectionsData;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final ProductsPromoBanner getPromoBanner() {
        return this.promoBanner;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final boolean getIsAgeCheckNeeded() {
        return this.isAgeCheckNeeded;
    }

    public final ProductListData zoijcleaow(List searchSuggestions, List searchCategories, List productList, Paging paging, List filterSections, String titleImage, SelectionsData selectionsData, String textModal, String headerModal, String buttonModal, String textBefore, boolean isAgeCheckNeeded, Section section, ColorsModel colorsModel, PromoProduct promo, List features, List additionalBlocks, ProductsPromoBanner promoBanner) {
        zdlpuopuiu.btonecajqb(additionalBlocks, "additionalBlocks");
        return new ProductListData(searchSuggestions, searchCategories, productList, paging, filterSections, titleImage, selectionsData, textModal, headerModal, buttonModal, textBefore, isAgeCheckNeeded, section, colorsModel, promo, features, additionalBlocks, promoBanner);
    }

    public /* synthetic */ ProductListData(List list, List list2, List list3, Paging paging, List list4, String str, SelectionsData selectionsData, String str2, String str3, String str4, String str5, boolean z13, Section section, ColorsModel colorsModel, PromoProduct promoProduct, List list5, List list6, ProductsPromoBanner productsPromoBanner, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : list2, list3, paging, list4, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : selectionsData, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str2, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str3, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str4, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str5, (i13 & 2048) != 0 ? false : z13, (i13 & 4096) != 0 ? null : section, (i13 & 8192) != 0 ? null : colorsModel, (i13 & 16384) != 0 ? null : promoProduct, list5, (65536 & i13) != 0 ? jyumaefscl.wflxmlrfwp() : list6, (i13 & 131072) != 0 ? null : productsPromoBanner);
    }
}
