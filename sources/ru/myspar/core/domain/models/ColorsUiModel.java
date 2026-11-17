package ru.myspar.core.domain.models;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import k30.draadjrbmk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import rs.wkgbmnqykc;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import s40.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/myspar/core/domain/models/ColorsUiModel;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Lru/myspar/core/domain/models/ColorsUiModel$iobyxmoadg;", "tintType", "", "wypolnanlu", "(Landroid/content/Context;Lru/myspar/core/domain/models/ColorsUiModel$iobyxmoadg;)I", "Landroid/content/res/ColorStateList;", "okpsazkaxt", "(Landroid/content/Context;Lru/myspar/core/domain/models/ColorsUiModel$iobyxmoadg;)Landroid/content/res/ColorStateList;", "Hex", "AttributesRes", "iobyxmoadg", "Lru/myspar/core/domain/models/ColorsUiModel$AttributesRes;", "Lru/myspar/core/domain/models/ColorsUiModel$Hex;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ColorsUiModel extends Parcelable {

    public enum iobyxmoadg {
        PRIMARY,
        ON_PRIMARY,
        SECONDARY;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f86704cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f86709iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.ON_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iobyxmoadg.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86709iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String ipoelvxyzq(iobyxmoadg iobyxmoadgVar, Hex.Tints it) {
        zdlpuopuiu.btonecajqb(it, "it");
        int i13 = zoijcleaow.f86709iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return it.getPrimary();
        }
        if (i13 == 2) {
            return it.getOnPrimary();
        }
        if (i13 == 3) {
            return it.getSecondary();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static ColorStateList rlfsiqarku(ColorsUiModel colorsUiModel, Context context, iobyxmoadg iobyxmoadgVar) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorsUiModel.wypolnanlu(context, iobyxmoadgVar));
        zdlpuopuiu.dxjokdxxww(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    default ColorStateList okpsazkaxt(Context context, iobyxmoadg tintType) {
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        ColorStateList colorStateList;
        vdvldrhtss vdvldrhtssVarIobyxmoadg2;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tintType, "tintType");
        int[][] iArr = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
        if (this instanceof AttributesRes) {
            int i13 = zoijcleaow.f86709iobyxmoadg[tintType.ordinal()];
            if (i13 == 1) {
                AttributesRes attributesRes = (AttributesRes) this;
                vdvldrhtssVarIobyxmoadg2 = cqumvgiudr.iobyxmoadg(Integer.valueOf(attributesRes.getPrimary()), Integer.valueOf(attributesRes.getPrimaryDisabled()));
            } else {
                if (i13 == 2) {
                    return rlfsiqarku(this, context, tintType);
                }
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AttributesRes attributesRes2 = (AttributesRes) this;
                vdvldrhtssVarIobyxmoadg2 = cqumvgiudr.iobyxmoadg(Integer.valueOf(attributesRes2.getSecondary()), Integer.valueOf(attributesRes2.getSecondaryDisabled()));
            }
            return new ColorStateList(iArr, new int[]{c60.zoijcleaow.ppxfxbqfkf(context, ((Number) vdvldrhtssVarIobyxmoadg2.iobyxmoadg()).intValue()), c60.zoijcleaow.ppxfxbqfkf(context, ((Number) vdvldrhtssVarIobyxmoadg2.wkgbmnqykc()).intValue())});
        }
        if (!(this instanceof Hex)) {
            throw new NoWhenBranchMatchedException();
        }
        Hex.Tints dark = c60.zoijcleaow.eablkybsjg(context) ? ((Hex) this).getDark() : ((Hex) this).getLight();
        int i14 = zoijcleaow.f86709iobyxmoadg[tintType.ordinal()];
        if (i14 == 1) {
            vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(dark.getPrimary(), dark.getPrimaryDisabled());
        } else {
            if (i14 == 2) {
                return rlfsiqarku(this, context, tintType);
            }
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(dark.getSecondary(), dark.getSecondaryDisabled());
        }
        try {
            colorStateList = new ColorStateList(iArr, new int[]{Color.parseColor((String) vdvldrhtssVarIobyxmoadg.iobyxmoadg()), Color.parseColor((String) vdvldrhtssVarIobyxmoadg.wkgbmnqykc())});
        } catch (Throwable th2) {
            wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            colorStateList = null;
        }
        if (colorStateList == null) {
            return new AttributesRes(0, 0, 0, 0, 0, 31, null).okpsazkaxt(context, tintType);
        }
        return colorStateList;
    }

    default int wypolnanlu(Context context, final iobyxmoadg tintType) {
        Integer numValueOf;
        int primary;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tintType, "tintType");
        if (this instanceof AttributesRes) {
            int i13 = zoijcleaow.f86709iobyxmoadg[tintType.ordinal()];
            if (i13 == 1) {
                primary = ((AttributesRes) this).getPrimary();
            } else if (i13 == 2) {
                primary = ((AttributesRes) this).getOnPrimary();
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                primary = ((AttributesRes) this).getSecondary();
            }
            return c60.zoijcleaow.ppxfxbqfkf(context, primary);
        }
        if (!(this instanceof Hex)) {
            throw new NoWhenBranchMatchedException();
        }
        String strWkgbmnqykc = draadjrbmk.wkgbmnqykc((String) new tg.draadjrbmk() { // from class: o00.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ColorsUiModel.ipoelvxyzq(tintType, (ColorsUiModel.Hex.Tints) obj);
            }
        }.invoke(c60.zoijcleaow.eablkybsjg(context) ? ((Hex) this).getDark() : ((Hex) this).getLight()));
        if (strWkgbmnqykc == null) {
            return new AttributesRes(0, 0, 0, 0, 0, 31, null).wypolnanlu(context, tintType);
        }
        try {
            numValueOf = Integer.valueOf(Color.parseColor(strWkgbmnqykc));
        } catch (Throwable th2) {
            wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return new AttributesRes(0, 0, 0, 0, 0, 31, null).wypolnanlu(context, tintType);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lru/myspar/core/domain/models/ColorsUiModel$AttributesRes;", "Lru/myspar/core/domain/models/ColorsUiModel;", "", "primary", "primaryDisabled", "onPrimary", "secondary", "secondaryDisabled", "<init>", "(IIIII)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "ppxfxbqfkf", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "lqeggnwhkg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttributesRes implements ColorsUiModel {
        public static final Parcelable.Creator<AttributesRes> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final int secondaryDisabled;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final int secondary;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final int onPrimary;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final int primaryDisabled;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final int primary;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final AttributesRes createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new AttributesRes(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final AttributesRes[] newArray(int i13) {
                return new AttributesRes[i13];
            }
        }

        public AttributesRes(int i13, int i14, int i15, int i16, int i17) {
            this.primary = i13;
            this.primaryDisabled = i14;
            this.onPrimary = i15;
            this.secondary = i16;
            this.secondaryDisabled = i17;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final int getPrimaryDisabled() {
            return this.primaryDisabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttributesRes)) {
                return false;
            }
            AttributesRes attributesRes = (AttributesRes) other;
            return this.primary == attributesRes.primary && this.primaryDisabled == attributesRes.primaryDisabled && this.onPrimary == attributesRes.onPrimary && this.secondary == attributesRes.secondary && this.secondaryDisabled == attributesRes.secondaryDisabled;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final int getSecondary() {
            return this.secondary;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.primary) * 31) + Integer.hashCode(this.primaryDisabled)) * 31) + Integer.hashCode(this.onPrimary)) * 31) + Integer.hashCode(this.secondary)) * 31) + Integer.hashCode(this.secondaryDisabled);
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final int getSecondaryDisabled() {
            return this.secondaryDisabled;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final int getPrimary() {
            return this.primary;
        }

        public String toString() {
            return "AttributesRes(primary=" + this.primary + ", primaryDisabled=" + this.primaryDisabled + ", onPrimary=" + this.onPrimary + ", secondary=" + this.secondary + ", secondaryDisabled=" + this.secondaryDisabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.primary);
            dest.writeInt(this.primaryDisabled);
            dest.writeInt(this.onPrimary);
            dest.writeInt(this.secondary);
            dest.writeInt(this.secondaryDisabled);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final int getOnPrimary() {
            return this.onPrimary;
        }

        public /* synthetic */ AttributesRes(int i13, int i14, int i15, int i16, int i17, int i18, gtknphoqwx gtknphoqwxVar) {
            this((i18 & 1) != 0 ? ppxfxbqfkf.colorPrimary1 : i13, (i18 & 2) != 0 ? ppxfxbqfkf.colorPrimary2 : i14, (i18 & 4) != 0 ? da.zoijcleaow.colorOnPrimary : i15, (i18 & 8) != 0 ? ppxfxbqfkf.colorPrimary3 : i16, (i18 & 16) != 0 ? ppxfxbqfkf.colorSpecialSurface2 : i17);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lru/myspar/core/domain/models/ColorsUiModel$Hex;", "Lru/myspar/core/domain/models/ColorsUiModel;", "Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;", "light", "dark", "<init>", "(Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;)V", "", "isDarkModeEnabled", "ppxfxbqfkf", "(Z)Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;", "eablkybsjg", "()Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;", "yggfygwlhe", "zoijcleaow", "Tints", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hex implements ColorsUiModel {
        public static final Parcelable.Creator<Hex> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tints dark;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tints light;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Hex createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                Parcelable.Creator<Tints> creator = Tints.CREATOR;
                return new Hex(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Hex[] newArray(int i13) {
                return new Hex[i13];
            }
        }

        public Hex(Tints light, Tints dark) {
            zdlpuopuiu.btonecajqb(light, "light");
            zdlpuopuiu.btonecajqb(dark, "dark");
            this.light = light;
            this.dark = dark;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final Tints getLight() {
            return this.light;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hex)) {
                return false;
            }
            Hex hex = (Hex) other;
            return zdlpuopuiu.eablkybsjg(this.light, hex.light) && zdlpuopuiu.eablkybsjg(this.dark, hex.dark);
        }

        public int hashCode() {
            return (this.light.hashCode() * 31) + this.dark.hashCode();
        }

        public final Tints ppxfxbqfkf(boolean isDarkModeEnabled) {
            return isDarkModeEnabled ? this.dark : this.light;
        }

        public String toString() {
            return "Hex(light=" + this.light + ", dark=" + this.dark + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            this.light.writeToParcel(dest, flags);
            this.dark.writeToParcel(dest, flags);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final Tints getDark() {
            return this.dark;
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lru/myspar/core/domain/models/ColorsUiModel$Hex$Tints;", "Landroid/os/Parcelable;", "", "primary", "primaryDisabled", "onPrimary", "secondary", "secondaryDisabled", "feedTitle", "feedBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tints implements Parcelable {
            public static final Parcelable.Creator<Tints> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
            private final String secondaryDisabled;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
            private final String feedTitle;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
            private final String secondary;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
            private final String onPrimary;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
            private final String feedBackground;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final String primaryDisabled;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final String primary;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Tints createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new Tints(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Tints[] newArray(int i13) {
                    return new Tints[i13];
                }
            }

            public Tints(String primary, String primaryDisabled, String onPrimary, String secondary, String secondaryDisabled, String str, String str2) {
                zdlpuopuiu.btonecajqb(primary, "primary");
                zdlpuopuiu.btonecajqb(primaryDisabled, "primaryDisabled");
                zdlpuopuiu.btonecajqb(onPrimary, "onPrimary");
                zdlpuopuiu.btonecajqb(secondary, "secondary");
                zdlpuopuiu.btonecajqb(secondaryDisabled, "secondaryDisabled");
                this.primary = primary;
                this.primaryDisabled = primaryDisabled;
                this.onPrimary = onPrimary;
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
                if (!(other instanceof Tints)) {
                    return false;
                }
                Tints tints = (Tints) other;
                return zdlpuopuiu.eablkybsjg(this.primary, tints.primary) && zdlpuopuiu.eablkybsjg(this.primaryDisabled, tints.primaryDisabled) && zdlpuopuiu.eablkybsjg(this.onPrimary, tints.onPrimary) && zdlpuopuiu.eablkybsjg(this.secondary, tints.secondary) && zdlpuopuiu.eablkybsjg(this.secondaryDisabled, tints.secondaryDisabled) && zdlpuopuiu.eablkybsjg(this.feedTitle, tints.feedTitle) && zdlpuopuiu.eablkybsjg(this.feedBackground, tints.feedBackground);
            }

            /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
            public final String getPrimary() {
                return this.primary;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.primary.hashCode() * 31) + this.primaryDisabled.hashCode()) * 31) + this.onPrimary.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.secondaryDisabled.hashCode()) * 31;
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
                return "Tints(primary=" + this.primary + ", primaryDisabled=" + this.primaryDisabled + ", onPrimary=" + this.onPrimary + ", secondary=" + this.secondary + ", secondaryDisabled=" + this.secondaryDisabled + ", feedTitle=" + this.feedTitle + ", feedBackground=" + this.feedBackground + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.primary);
                dest.writeString(this.primaryDisabled);
                dest.writeString(this.onPrimary);
                dest.writeString(this.secondary);
                dest.writeString(this.secondaryDisabled);
                dest.writeString(this.feedTitle);
                dest.writeString(this.feedBackground);
            }

            /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
            public final String getFeedBackground() {
                return this.feedBackground;
            }

            public /* synthetic */ Tints(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, gtknphoqwx gtknphoqwxVar) {
                this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7);
            }
        }
    }
}
