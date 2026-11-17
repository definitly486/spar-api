package ru.myspar.proloyalty.core.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import gz0.ppxfxbqfkf;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "Landroid/os/Parcelable;", "Lgz0/ppxfxbqfkf;", "type", "Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;", "light", "dark", "<init>", "(Lgz0/ppxfxbqfkf;Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lgz0/ppxfxbqfkf;", "getType", "()Lgz0/ppxfxbqfkf;", "yggfygwlhe", "Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;", "jyumaefscl", "zoijcleaow", "TintsModel", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ColorsModel implements Parcelable {
    public static final Parcelable.Creator<ColorsModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final TintsModel dark;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final TintsModel light;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf type;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/ColorsModel$TintsModel;", "Landroid/os/Parcelable;", "", "primary", "onPrimary", "primaryDisabled", "secondary", "secondaryDisabled", "feedTitle", "feedBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "lqeggnwhkg", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TintsModel implements Parcelable {
        public static final Parcelable.Creator<TintsModel> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondaryDisabled;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final String feedTitle;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondary;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String primaryDisabled;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String feedBackground;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onPrimary;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String primary;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final TintsModel createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new TintsModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final TintsModel[] newArray(int i13) {
                return new TintsModel[i13];
            }
        }

        public TintsModel(String primary, String onPrimary, String primaryDisabled, String secondary, String secondaryDisabled, String str, String str2) {
            zdlpuopuiu.btonecajqb(primary, "primary");
            zdlpuopuiu.btonecajqb(onPrimary, "onPrimary");
            zdlpuopuiu.btonecajqb(primaryDisabled, "primaryDisabled");
            zdlpuopuiu.btonecajqb(secondary, "secondary");
            zdlpuopuiu.btonecajqb(secondaryDisabled, "secondaryDisabled");
            this.primary = primary;
            this.onPrimary = onPrimary;
            this.primaryDisabled = primaryDisabled;
            this.secondary = secondary;
            this.secondaryDisabled = secondaryDisabled;
            this.feedTitle = str;
            this.feedBackground = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
        public final String getSecondaryDisabled() {
            return this.secondaryDisabled;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getOnPrimary() {
            return this.onPrimary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TintsModel)) {
                return false;
            }
            TintsModel tintsModel = (TintsModel) other;
            return zdlpuopuiu.eablkybsjg(this.primary, tintsModel.primary) && zdlpuopuiu.eablkybsjg(this.onPrimary, tintsModel.onPrimary) && zdlpuopuiu.eablkybsjg(this.primaryDisabled, tintsModel.primaryDisabled) && zdlpuopuiu.eablkybsjg(this.secondary, tintsModel.secondary) && zdlpuopuiu.eablkybsjg(this.secondaryDisabled, tintsModel.secondaryDisabled) && zdlpuopuiu.eablkybsjg(this.feedTitle, tintsModel.feedTitle) && zdlpuopuiu.eablkybsjg(this.feedBackground, tintsModel.feedBackground);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getPrimary() {
            return this.primary;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.primary.hashCode() * 31) + this.onPrimary.hashCode()) * 31) + this.primaryDisabled.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.secondaryDisabled.hashCode()) * 31;
            String str = this.feedTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.feedBackground;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final String getPrimaryDisabled() {
            return this.primaryDisabled;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getSecondary() {
            return this.secondary;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getFeedTitle() {
            return this.feedTitle;
        }

        public String toString() {
            return "TintsModel(primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryDisabled=" + this.primaryDisabled + ", secondary=" + this.secondary + ", secondaryDisabled=" + this.secondaryDisabled + ", feedTitle=" + this.feedTitle + ", feedBackground=" + this.feedBackground + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.primary);
            dest.writeString(this.onPrimary);
            dest.writeString(this.primaryDisabled);
            dest.writeString(this.secondary);
            dest.writeString(this.secondaryDisabled);
            dest.writeString(this.feedTitle);
            dest.writeString(this.feedBackground);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getFeedBackground() {
            return this.feedBackground;
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ColorsModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ppxfxbqfkf ppxfxbqfkfVarValueOf = ppxfxbqfkf.valueOf(parcel.readString());
            Parcelable.Creator<TintsModel> creator = TintsModel.CREATOR;
            return new ColorsModel(ppxfxbqfkfVarValueOf, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ColorsModel[] newArray(int i13) {
            return new ColorsModel[i13];
        }
    }

    public ColorsModel(ppxfxbqfkf type, TintsModel light, TintsModel dark) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(light, "light");
        zdlpuopuiu.btonecajqb(dark, "dark");
        this.type = type;
        this.light = light;
        this.dark = dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorsModel)) {
            return false;
        }
        ColorsModel colorsModel = (ColorsModel) other;
        return this.type == colorsModel.type && zdlpuopuiu.eablkybsjg(this.light, colorsModel.light) && zdlpuopuiu.eablkybsjg(this.dark, colorsModel.dark);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.light.hashCode()) * 31) + this.dark.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final TintsModel getLight() {
        return this.light;
    }

    public String toString() {
        return "ColorsModel(type=" + this.type + ", light=" + this.light + ", dark=" + this.dark + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.type.name());
        this.light.writeToParcel(dest, flags);
        this.dark.writeToParcel(dest, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final TintsModel getDark() {
        return this.dark;
    }
}
