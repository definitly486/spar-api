package ru.myspar.core.domain.models.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.domain.models.ColorsModel;
import v00.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b.\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b*\u0010J¨\u0006K"}, d2 = {"Lru/myspar/core/domain/models/catalog/CatalogSection;", "Landroid/os/Parcelable;", "", "id", "parentId", ExternalMetricsManagerImpl.NAME, "titleImage", "pic", "icon", "image", "appImage", "iconPng", "", "ageCheckedNeeded", "showOnMain", "", "sortMain", "adv", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "Lv00/ppxfxbqfkf;", "sortType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Lru/myspar/core/domain/models/ColorsModel;Lv00/ppxfxbqfkf;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "btonecajqb", "jyumaefscl", "getName", "iwizpuwonk", "cqumvgiudr", "gtknphoqwx", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "eablkybsjg", "zynmafqrjb", "nufgyqmvbu", "istkbnxepw", "Z", "ppxfxbqfkf", "()Z", "cdpycssgdh", "wflxmlrfwp", "yadqdtsiqt", "I", "oxmwwwfdhm", "iozdgvuglv", "zoijcleaow", "lmojexxdyd", "Lru/myspar/core/domain/models/ColorsModel;", "gxszxtbevo", "()Lru/myspar/core/domain/models/ColorsModel;", "wwaezpbzkn", "Lv00/ppxfxbqfkf;", "()Lv00/ppxfxbqfkf;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CatalogSection implements Parcelable {
    public static final Parcelable.Creator<CatalogSection> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showOnMain;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String icon;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ageCheckedNeeded;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleImage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appImage;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf sortType;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sortMain;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iconPng;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CatalogSection createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CatalogSection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ColorsModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ppxfxbqfkf.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CatalogSection[] newArray(int i13) {
            return new CatalogSection[i13];
        }
    }

    public CatalogSection(String id2, String str, String name, String str2, String pic, String icon, String image, String appImage, String iconPng, boolean z13, boolean z14, int i13, String adv, ColorsModel colorsModel, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(appImage, "appImage");
        zdlpuopuiu.btonecajqb(iconPng, "iconPng");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.id = id2;
        this.parentId = str;
        this.name = name;
        this.titleImage = str2;
        this.pic = pic;
        this.icon = icon;
        this.image = image;
        this.appImage = appImage;
        this.iconPng = iconPng;
        this.ageCheckedNeeded = z13;
        this.showOnMain = z14;
        this.sortMain = i13;
        this.adv = adv;
        this.colorsModel = colorsModel;
        this.sortType = ppxfxbqfkfVar;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getAppImage() {
        return this.appImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogSection)) {
            return false;
        }
        CatalogSection catalogSection = (CatalogSection) other;
        return zdlpuopuiu.eablkybsjg(this.id, catalogSection.id) && zdlpuopuiu.eablkybsjg(this.parentId, catalogSection.parentId) && zdlpuopuiu.eablkybsjg(this.name, catalogSection.name) && zdlpuopuiu.eablkybsjg(this.titleImage, catalogSection.titleImage) && zdlpuopuiu.eablkybsjg(this.pic, catalogSection.pic) && zdlpuopuiu.eablkybsjg(this.icon, catalogSection.icon) && zdlpuopuiu.eablkybsjg(this.image, catalogSection.image) && zdlpuopuiu.eablkybsjg(this.appImage, catalogSection.appImage) && zdlpuopuiu.eablkybsjg(this.iconPng, catalogSection.iconPng) && this.ageCheckedNeeded == catalogSection.ageCheckedNeeded && this.showOnMain == catalogSection.showOnMain && this.sortMain == catalogSection.sortMain && zdlpuopuiu.eablkybsjg(this.adv, catalogSection.adv) && zdlpuopuiu.eablkybsjg(this.colorsModel, catalogSection.colorsModel) && this.sortType == catalogSection.sortType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.parentId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.titleImage;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.pic.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.image.hashCode()) * 31) + this.appImage.hashCode()) * 31) + this.iconPng.hashCode()) * 31) + Boolean.hashCode(this.ageCheckedNeeded)) * 31) + Boolean.hashCode(this.showOnMain)) * 31) + Integer.hashCode(this.sortMain)) * 31) + this.adv.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        int iHashCode4 = (iHashCode3 + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.sortType;
        return iHashCode4 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getIconPng() {
        return this.iconPng;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final int getSortMain() {
        return this.sortMain;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getAgeCheckedNeeded() {
        return this.ageCheckedNeeded;
    }

    public String toString() {
        return "CatalogSection(id=" + this.id + ", parentId=" + this.parentId + ", name=" + this.name + ", titleImage=" + this.titleImage + ", pic=" + this.pic + ", icon=" + this.icon + ", image=" + this.image + ", appImage=" + this.appImage + ", iconPng=" + this.iconPng + ", ageCheckedNeeded=" + this.ageCheckedNeeded + ", showOnMain=" + this.showOnMain + ", sortMain=" + this.sortMain + ", adv=" + this.adv + ", colorsModel=" + this.colorsModel + ", sortType=" + this.sortType + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getShowOnMain() {
        return this.showOnMain;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.parentId);
        dest.writeString(this.name);
        dest.writeString(this.titleImage);
        dest.writeString(this.pic);
        dest.writeString(this.icon);
        dest.writeString(this.image);
        dest.writeString(this.appImage);
        dest.writeString(this.iconPng);
        dest.writeInt(this.ageCheckedNeeded ? 1 : 0);
        dest.writeInt(this.showOnMain ? 1 : 0);
        dest.writeInt(this.sortMain);
        dest.writeString(this.adv);
        ColorsModel colorsModel = this.colorsModel;
        if (colorsModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            colorsModel.writeToParcel(dest, flags);
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.sortType;
        if (ppxfxbqfkfVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ppxfxbqfkfVar.name());
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final ppxfxbqfkf getSortType() {
        return this.sortType;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAdv() {
        return this.adv;
    }
}
