package ru.myspar.proloyalty.evropolis.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001:\u0006OPQRSTB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bD\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006U"}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift;", "Landroid/os/Parcelable;", "", "id", "title", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "product", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Bonus;", "bonus", "", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab;", "tabs", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;", "instructions", "qr", "coupon", "terms", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Puzzle;", "puzzle", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button;", "buttons", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/Product;Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Bonus;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;Ljava/util/List;Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Puzzle;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "oxmwwwfdhm", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/domain/models/product/Product;", "iwizpuwonk", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Bonus;", "zoijcleaow", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Bonus;", "cqumvgiudr", "Ljava/util/List;", "gtknphoqwx", "()Ljava/util/List;", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;", "btonecajqb", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;", "pmvmpeiblj", "gxszxtbevo", "zynmafqrjb", "wflxmlrfwp", "istkbnxepw", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Puzzle;", "dxjokdxxww", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Puzzle;", "cdpycssgdh", "ppxfxbqfkf", "yadqdtsiqt", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "Bonus", "Puzzle", "Info", "Tab", "Button", "TextWithTab", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EvropolisGift implements Parcelable {
    public static final Parcelable.Creator<EvropolisGift> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final List buttons;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List tabs;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List instructions;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Puzzle puzzle;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bonus bonus;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Product product;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextWithTab qr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextWithTab coupon;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorModel;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List terms;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Bonus;", "Landroid/os/Parcelable;", "", "title", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonus implements Parcelable {
        public static final Parcelable.Creator<Bonus> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Bonus createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Bonus(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Bonus[] newArray(int i13) {
                return new Bonus[i13];
            }
        }

        public Bonus(String title, String image) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(image, "image");
            this.title = title;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonus)) {
                return false;
            }
            Bonus bonus = (Bonus) other;
            return zdlpuopuiu.eablkybsjg(this.title, bonus.title) && zdlpuopuiu.eablkybsjg(this.image, bonus.image);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.image.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            return "Bonus(title=" + this.title + ", image=" + this.image + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.image);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getImage() {
            return this.image;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "tab", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button$zoijcleaow;", "type", "", "text", "Lk21/ojitshcjhn;", "navLink", "reference", "<init>", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button$zoijcleaow;Ljava/lang/String;Lk21/ojitshcjhn;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "eablkybsjg", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "yggfygwlhe", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button$zoijcleaow;", "lqeggnwhkg", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Button$zoijcleaow;", "jyumaefscl", "Ljava/lang/String;", "gxszxtbevo", "iwizpuwonk", "Lk21/ojitshcjhn;", "zoijcleaow", "()Lk21/ojitshcjhn;", "cqumvgiudr", "ppxfxbqfkf", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reference;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final ojitshcjhn navLink;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final zoijcleaow type;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tab.zoijcleaow tab;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Button createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Button(parcel.readInt() == 0 ? null : Tab.zoijcleaow.valueOf(parcel.readString()), zoijcleaow.valueOf(parcel.readString()), parcel.readString(), ojitshcjhn.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Button[] newArray(int i13) {
                return new Button[i13];
            }
        }

        public enum zoijcleaow {
            PRIMARY,
            SECONDARY;


            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f96103iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
        }

        public Button(Tab.zoijcleaow zoijcleaowVar, zoijcleaow type, String text, ojitshcjhn navLink, String str) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.tab = zoijcleaowVar;
            this.type = type;
            this.text = text;
            this.navLink = navLink;
            this.reference = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final Tab.zoijcleaow getTab() {
            return this.tab;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return this.tab == button.tab && this.type == button.type && zdlpuopuiu.eablkybsjg(this.text, button.text) && this.navLink == button.navLink && zdlpuopuiu.eablkybsjg(this.reference, button.reference);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            int iHashCode = (((((((zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode()) * 31) + this.type.hashCode()) * 31) + this.text.hashCode()) * 31) + this.navLink.hashCode()) * 31;
            String str = this.reference;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final zoijcleaow getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public String toString() {
            return "Button(tab=" + this.tab + ", type=" + this.type + ", text=" + this.text + ", navLink=" + this.navLink + ", reference=" + this.reference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            if (zoijcleaowVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(zoijcleaowVar.name());
            }
            dest.writeString(this.type.name());
            dest.writeString(this.text);
            dest.writeString(this.navLink.name());
            dest.writeString(this.reference);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final ojitshcjhn getNavLink() {
            return this.navLink;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Info;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "tab", "", "title", "<init>", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "getTab", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "getTitle", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Info implements Parcelable {
        public static final Parcelable.Creator<Info> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tab.zoijcleaow tab;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Info createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Info(parcel.readInt() == 0 ? null : Tab.zoijcleaow.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Info[] newArray(int i13) {
                return new Info[i13];
            }
        }

        public Info(Tab.zoijcleaow zoijcleaowVar, String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.tab = zoijcleaowVar;
            this.title = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return this.tab == info.tab && zdlpuopuiu.eablkybsjg(this.title, info.title);
        }

        public int hashCode() {
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            return ((zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode()) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Info(tab=" + this.tab + ", title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            if (zoijcleaowVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(zoijcleaowVar.name());
            }
            dest.writeString(this.title);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Puzzle;", "Landroid/os/Parcelable;", "", "title", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Puzzle implements Parcelable {
        public static final Parcelable.Creator<Puzzle> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Puzzle createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Puzzle(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Puzzle[] newArray(int i13) {
                return new Puzzle[i13];
            }
        }

        public Puzzle(String title, String image) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(image, "image");
            this.title = title;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Puzzle)) {
                return false;
            }
            Puzzle puzzle = (Puzzle) other;
            return zdlpuopuiu.eablkybsjg(this.title, puzzle.title) && zdlpuopuiu.eablkybsjg(this.image, puzzle.image);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.image.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            return "Puzzle(title=" + this.title + ", image=" + this.image + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.image);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getImage() {
            return this.image;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "type", "", "title", "<init>", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {
        public static final Parcelable.Creator<Tab> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final zoijcleaow type;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Tab createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Tab(zoijcleaow.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Tab[] newArray(int i13) {
                return new Tab[i13];
            }
        }

        public enum zoijcleaow {
            OFFLINE,
            ONLINE;


            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f96113iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
        }

        public Tab(zoijcleaow type, String title) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(title, "title");
            this.type = type;
            this.title = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return this.type == tab.type && zdlpuopuiu.eablkybsjg(this.title, tab.title);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.title.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final zoijcleaow getType() {
            return this.type;
        }

        public String toString() {
            return "Tab(type=" + this.type + ", title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeString(this.title);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$TextWithTab;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "tab", "", "text", "<init>", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "zoijcleaow", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextWithTab implements Parcelable {
        public static final Parcelable.Creator<TextWithTab> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tab.zoijcleaow tab;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final TextWithTab createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new TextWithTab(parcel.readInt() == 0 ? null : Tab.zoijcleaow.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final TextWithTab[] newArray(int i13) {
                return new TextWithTab[i13];
            }
        }

        public TextWithTab(Tab.zoijcleaow zoijcleaowVar, String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.tab = zoijcleaowVar;
            this.text = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithTab)) {
                return false;
            }
            TextWithTab textWithTab = (TextWithTab) other;
            return this.tab == textWithTab.tab && zdlpuopuiu.eablkybsjg(this.text, textWithTab.text);
        }

        public int hashCode() {
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            return ((zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode()) * 31) + this.text.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public String toString() {
            return "TextWithTab(tab=" + this.tab + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            Tab.zoijcleaow zoijcleaowVar = this.tab;
            if (zoijcleaowVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(zoijcleaowVar.name());
            }
            dest.writeString(this.text);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final Tab.zoijcleaow getTab() {
            return this.tab;
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final EvropolisGift createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Product product = (Product) parcel.readParcelable(EvropolisGift.class.getClassLoader());
            ArrayList arrayList4 = null;
            Bonus bonusCreateFromParcel = parcel.readInt() == 0 ? null : Bonus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(Tab.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(TextWithTab.CREATOR.createFromParcel(parcel));
                }
            }
            TextWithTab textWithTabCreateFromParcel = parcel.readInt() == 0 ? null : TextWithTab.CREATOR.createFromParcel(parcel);
            TextWithTab textWithTabCreateFromParcel2 = parcel.readInt() == 0 ? null : TextWithTab.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(TextWithTab.CREATOR.createFromParcel(parcel));
                }
            }
            Puzzle puzzleCreateFromParcel = parcel.readInt() == 0 ? null : Puzzle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i19 = parcel.readInt();
                arrayList4 = new ArrayList(i19);
                for (int i23 = 0; i23 != i19; i23++) {
                    arrayList4.add(Button.CREATOR.createFromParcel(parcel));
                }
            }
            return new EvropolisGift(string, string2, product, bonusCreateFromParcel, arrayList, arrayList2, textWithTabCreateFromParcel, textWithTabCreateFromParcel2, arrayList3, puzzleCreateFromParcel, arrayList4, (ColorsModel) parcel.readParcelable(EvropolisGift.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final EvropolisGift[] newArray(int i13) {
            return new EvropolisGift[i13];
        }
    }

    public EvropolisGift(String id2, String title, Product product, Bonus bonus, List list, List list2, TextWithTab textWithTab, TextWithTab textWithTab2, List list3, Puzzle puzzle, List list4, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        this.id = id2;
        this.title = title;
        this.product = product;
        this.bonus = bonus;
        this.tabs = list;
        this.instructions = list2;
        this.qr = textWithTab;
        this.coupon = textWithTab2;
        this.terms = list3;
        this.puzzle = puzzle;
        this.buttons = list4;
        this.colorModel = colorsModel;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final TextWithTab getQr() {
        return this.qr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Puzzle getPuzzle() {
        return this.puzzle;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ColorsModel getColorModel() {
        return this.colorModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvropolisGift)) {
            return false;
        }
        EvropolisGift evropolisGift = (EvropolisGift) other;
        return zdlpuopuiu.eablkybsjg(this.id, evropolisGift.id) && zdlpuopuiu.eablkybsjg(this.title, evropolisGift.title) && zdlpuopuiu.eablkybsjg(this.product, evropolisGift.product) && zdlpuopuiu.eablkybsjg(this.bonus, evropolisGift.bonus) && zdlpuopuiu.eablkybsjg(this.tabs, evropolisGift.tabs) && zdlpuopuiu.eablkybsjg(this.instructions, evropolisGift.instructions) && zdlpuopuiu.eablkybsjg(this.qr, evropolisGift.qr) && zdlpuopuiu.eablkybsjg(this.coupon, evropolisGift.coupon) && zdlpuopuiu.eablkybsjg(this.terms, evropolisGift.terms) && zdlpuopuiu.eablkybsjg(this.puzzle, evropolisGift.puzzle) && zdlpuopuiu.eablkybsjg(this.buttons, evropolisGift.buttons) && zdlpuopuiu.eablkybsjg(this.colorModel, evropolisGift.colorModel);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getTabs() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final TextWithTab getCoupon() {
        return this.coupon;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        Product product = this.product;
        int iHashCode2 = (iHashCode + (product == null ? 0 : product.hashCode())) * 31;
        Bonus bonus = this.bonus;
        int iHashCode3 = (iHashCode2 + (bonus == null ? 0 : bonus.hashCode())) * 31;
        List list = this.tabs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.instructions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TextWithTab textWithTab = this.qr;
        int iHashCode6 = (iHashCode5 + (textWithTab == null ? 0 : textWithTab.hashCode())) * 31;
        TextWithTab textWithTab2 = this.coupon;
        int iHashCode7 = (iHashCode6 + (textWithTab2 == null ? 0 : textWithTab2.hashCode())) * 31;
        List list3 = this.terms;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Puzzle puzzle = this.puzzle;
        int iHashCode9 = (iHashCode8 + (puzzle == null ? 0 : puzzle.hashCode())) * 31;
        List list4 = this.buttons;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ColorsModel colorsModel = this.colorModel;
        return iHashCode10 + (colorsModel != null ? colorsModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getInstructions() {
        return this.instructions;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    public String toString() {
        return "EvropolisGift(id=" + this.id + ", title=" + this.title + ", product=" + this.product + ", bonus=" + this.bonus + ", tabs=" + this.tabs + ", instructions=" + this.instructions + ", qr=" + this.qr + ", coupon=" + this.coupon + ", terms=" + this.terms + ", puzzle=" + this.puzzle + ", buttons=" + this.buttons + ", colorModel=" + this.colorModel + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeParcelable(this.product, flags);
        Bonus bonus = this.bonus;
        if (bonus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bonus.writeToParcel(dest, flags);
        }
        List list = this.tabs;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Tab) it.next()).writeToParcel(dest, flags);
            }
        }
        List list2 = this.instructions;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((TextWithTab) it2.next()).writeToParcel(dest, flags);
            }
        }
        TextWithTab textWithTab = this.qr;
        if (textWithTab == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textWithTab.writeToParcel(dest, flags);
        }
        TextWithTab textWithTab2 = this.coupon;
        if (textWithTab2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textWithTab2.writeToParcel(dest, flags);
        }
        List list3 = this.terms;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((TextWithTab) it3.next()).writeToParcel(dest, flags);
            }
        }
        Puzzle puzzle = this.puzzle;
        if (puzzle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            puzzle.writeToParcel(dest, flags);
        }
        List list4 = this.buttons;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                ((Button) it4.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeParcelable(this.colorModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Bonus getBonus() {
        return this.bonus;
    }
}
