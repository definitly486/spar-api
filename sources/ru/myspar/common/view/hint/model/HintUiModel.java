package ru.myspar.common.view.hint.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import gg.draadjrbmk;
import h.oipsdeybqn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/myspar/common/view/hint/model/HintUiModel;", "Landroid/os/Parcelable;", "Lru/myspar/common/view/hint/model/HintNavLink;", "cqumvgiudr", "()Lru/myspar/common/view/hint/model/HintNavLink;", "navLink", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "vdvldrhtss", "()Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "bottomSheetInfo", "iobyxmoadg", "Text", "Picture", "Animation", "Lru/myspar/common/view/hint/model/HintUiModel$Animation;", "Lru/myspar/common/view/hint/model/HintUiModel$Picture;", "Lru/myspar/common/view/hint/model/HintUiModel$Text;", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HintUiModel extends Parcelable {

    public enum iobyxmoadg {
        BIG,
        SMALL;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f86178iwizpuwonk = zoijcleaow.iobyxmoadg(iobyxmoadg());

        public final boolean lqeggnwhkg() {
            return this == SMALL;
        }

        public final boolean wkgbmnqykc() {
            return this == BIG;
        }
    }

    /* JADX INFO: renamed from: cqumvgiudr */
    HintNavLink getNavLink();

    /* JADX INFO: renamed from: vdvldrhtss */
    HintBottomSheetInfoUiModel getBottomSheetInfo();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/myspar/common/view/hint/model/HintUiModel$Picture;", "Lru/myspar/common/view/hint/model/HintUiModel;", "", ImagesContract.URL, "backgroundColor", "id", "Lru/myspar/common/view/hint/model/HintNavLink;", "navLink", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "bottomSheetInfo", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;)Lru/myspar/common/view/hint/model/HintUiModel$Picture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "agtfadlqog", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "getId", "iwizpuwonk", "Lru/myspar/common/view/hint/model/HintNavLink;", "cqumvgiudr", "()Lru/myspar/common/view/hint/model/HintNavLink;", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "vdvldrhtss", "()Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "esjtqupxsv", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "gxszxtbevo", "()Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Picture implements HintUiModel {
        public static final Parcelable.Creator<Picture> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintBottomSheetInfoUiModel bottomSheetInfo;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final iobyxmoadg size;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintNavLink navLink;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String backgroundColor;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Picture createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Picture(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HintNavLink.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HintBottomSheetInfoUiModel.CREATOR.createFromParcel(parcel) : null, iobyxmoadg.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Picture[] newArray(int i13) {
                return new Picture[i13];
            }
        }

        public Picture(String url, String backgroundColor, String id2, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg size) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(size, "size");
            this.url = url;
            this.backgroundColor = backgroundColor;
            this.id = id2;
            this.navLink = hintNavLink;
            this.bottomSheetInfo = hintBottomSheetInfoUiModel;
            this.size = size;
        }

        public static /* synthetic */ Picture ppxfxbqfkf(Picture picture, String str, String str2, String str3, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = picture.url;
            }
            if ((i13 & 2) != 0) {
                str2 = picture.backgroundColor;
            }
            String str4 = str2;
            if ((i13 & 4) != 0) {
                str3 = picture.id;
            }
            String str5 = str3;
            if ((i13 & 8) != 0) {
                hintNavLink = picture.navLink;
            }
            HintNavLink hintNavLink2 = hintNavLink;
            if ((i13 & 16) != 0) {
                hintBottomSheetInfoUiModel = picture.bottomSheetInfo;
            }
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel2 = hintBottomSheetInfoUiModel;
            if ((i13 & 32) != 0) {
                iobyxmoadgVar = picture.size;
            }
            return picture.zoijcleaow(str, str4, str5, hintNavLink2, hintBottomSheetInfoUiModel2, iobyxmoadgVar);
        }

        /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: cqumvgiudr, reason: from getter */
        public HintNavLink getNavLink() {
            return this.navLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Picture)) {
                return false;
            }
            Picture picture = (Picture) other;
            return zdlpuopuiu.eablkybsjg(this.url, picture.url) && zdlpuopuiu.eablkybsjg(this.backgroundColor, picture.backgroundColor) && zdlpuopuiu.eablkybsjg(this.id, picture.id) && zdlpuopuiu.eablkybsjg(this.navLink, picture.navLink) && zdlpuopuiu.eablkybsjg(this.bottomSheetInfo, picture.bottomSheetInfo) && this.size == picture.size;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public iobyxmoadg getSize() {
            return this.size;
        }

        public int hashCode() {
            int iHashCode = ((((this.url.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.id.hashCode()) * 31;
            HintNavLink hintNavLink = this.navLink;
            int iHashCode2 = (iHashCode + (hintNavLink == null ? 0 : hintNavLink.hashCode())) * 31;
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            return ((iHashCode2 + (hintBottomSheetInfoUiModel != null ? hintBottomSheetInfoUiModel.hashCode() : 0)) * 31) + this.size.hashCode();
        }

        public String toString() {
            return "Picture(url=" + this.url + ", backgroundColor=" + this.backgroundColor + ", id=" + this.id + ", navLink=" + this.navLink + ", bottomSheetInfo=" + this.bottomSheetInfo + ", size=" + this.size + ")";
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: vdvldrhtss, reason: from getter */
        public HintBottomSheetInfoUiModel getBottomSheetInfo() {
            return this.bottomSheetInfo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.url);
            dest.writeString(this.backgroundColor);
            dest.writeString(this.id);
            HintNavLink hintNavLink = this.navLink;
            if (hintNavLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintNavLink.writeToParcel(dest, flags);
            }
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            if (hintBottomSheetInfoUiModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintBottomSheetInfoUiModel.writeToParcel(dest, flags);
            }
            dest.writeString(this.size.name());
        }

        public final Picture zoijcleaow(String url, String backgroundColor, String id2, HintNavLink navLink, HintBottomSheetInfoUiModel bottomSheetInfo, iobyxmoadg size) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(size, "size");
            return new Picture(url, backgroundColor, id2, navLink, bottomSheetInfo, size);
        }

        public /* synthetic */ Picture(String str, String str2, String str3, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, hintNavLink, hintBottomSheetInfoUiModel, (i13 & 32) != 0 ? iobyxmoadg.SMALL : iobyxmoadgVar);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R#\u0010=\u001a\u0004\u0018\u0001068FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lru/myspar/common/view/hint/model/HintUiModel$Animation;", "Lru/myspar/common/view/hint/model/HintUiModel;", "Lyt/iobyxmoadg;", "type", "", "backgroundColor", "id", "Lru/myspar/common/view/hint/model/HintNavLink;", "navLink", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "bottomSheetInfo", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "size", "<init>", "(Lyt/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Lyt/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;)Lru/myspar/common/view/hint/model/HintUiModel$Animation;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lyt/iobyxmoadg;", "nufgyqmvbu", "()Lyt/iobyxmoadg;", "yggfygwlhe", "Ljava/lang/String;", "eablkybsjg", "jyumaefscl", "getId", "iwizpuwonk", "Lru/myspar/common/view/hint/model/HintNavLink;", "cqumvgiudr", "()Lru/myspar/common/view/hint/model/HintNavLink;", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "vdvldrhtss", "()Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "esjtqupxsv", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "lqeggnwhkg", "()Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "Lh/oipsdeybqn;", "lereixgezr", "Lgg/gtknphoqwx;", "gxszxtbevo", "()Lh/oipsdeybqn;", "getComposeBackgroundColor-QN2ZGVo$annotations", "()V", "composeBackgroundColor", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Animation implements HintUiModel {
        public static final Parcelable.Creator<Animation> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintBottomSheetInfoUiModel bottomSheetInfo;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final iobyxmoadg size;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintNavLink navLink;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
        private final gg.gtknphoqwx composeBackgroundColor;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String backgroundColor;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final yt.iobyxmoadg type;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Animation createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Animation(yt.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HintNavLink.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HintBottomSheetInfoUiModel.CREATOR.createFromParcel(parcel) : null, iobyxmoadg.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Animation[] newArray(int i13) {
                return new Animation[i13];
            }
        }

        static final class zoijcleaow implements tg.iobyxmoadg {
            zoijcleaow() {
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final oipsdeybqn invoke() {
                return w50.iobyxmoadg.iobyxmoadg(Animation.this.getBackgroundColor());
            }
        }

        public Animation(yt.iobyxmoadg type, String backgroundColor, String id2, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg size) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(size, "size");
            this.type = type;
            this.backgroundColor = backgroundColor;
            this.id = id2;
            this.navLink = hintNavLink;
            this.bottomSheetInfo = hintBottomSheetInfoUiModel;
            this.size = size;
            this.composeBackgroundColor = draadjrbmk.zoijcleaow(new zoijcleaow());
        }

        public static /* synthetic */ Animation ppxfxbqfkf(Animation animation, yt.iobyxmoadg iobyxmoadgVar, String str, String str2, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                iobyxmoadgVar = animation.type;
            }
            if ((i13 & 2) != 0) {
                str = animation.backgroundColor;
            }
            String str3 = str;
            if ((i13 & 4) != 0) {
                str2 = animation.id;
            }
            String str4 = str2;
            if ((i13 & 8) != 0) {
                hintNavLink = animation.navLink;
            }
            HintNavLink hintNavLink2 = hintNavLink;
            if ((i13 & 16) != 0) {
                hintBottomSheetInfoUiModel = animation.bottomSheetInfo;
            }
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel2 = hintBottomSheetInfoUiModel;
            if ((i13 & 32) != 0) {
                iobyxmoadgVar2 = animation.size;
            }
            return animation.zoijcleaow(iobyxmoadgVar, str3, str4, hintNavLink2, hintBottomSheetInfoUiModel2, iobyxmoadgVar2);
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: cqumvgiudr, reason: from getter */
        public HintNavLink getNavLink() {
            return this.navLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Animation)) {
                return false;
            }
            Animation animation = (Animation) other;
            return this.type == animation.type && zdlpuopuiu.eablkybsjg(this.backgroundColor, animation.backgroundColor) && zdlpuopuiu.eablkybsjg(this.id, animation.id) && zdlpuopuiu.eablkybsjg(this.navLink, animation.navLink) && zdlpuopuiu.eablkybsjg(this.bottomSheetInfo, animation.bottomSheetInfo) && this.size == animation.size;
        }

        public final oipsdeybqn gxszxtbevo() {
            return (oipsdeybqn) this.composeBackgroundColor.getValue();
        }

        public int hashCode() {
            int iHashCode = ((((this.type.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.id.hashCode()) * 31;
            HintNavLink hintNavLink = this.navLink;
            int iHashCode2 = (iHashCode + (hintNavLink == null ? 0 : hintNavLink.hashCode())) * 31;
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            return ((iHashCode2 + (hintBottomSheetInfoUiModel != null ? hintBottomSheetInfoUiModel.hashCode() : 0)) * 31) + this.size.hashCode();
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public iobyxmoadg getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final yt.iobyxmoadg getType() {
            return this.type;
        }

        public String toString() {
            return "Animation(type=" + this.type + ", backgroundColor=" + this.backgroundColor + ", id=" + this.id + ", navLink=" + this.navLink + ", bottomSheetInfo=" + this.bottomSheetInfo + ", size=" + this.size + ")";
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: vdvldrhtss, reason: from getter */
        public HintBottomSheetInfoUiModel getBottomSheetInfo() {
            return this.bottomSheetInfo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeString(this.backgroundColor);
            dest.writeString(this.id);
            HintNavLink hintNavLink = this.navLink;
            if (hintNavLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintNavLink.writeToParcel(dest, flags);
            }
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            if (hintBottomSheetInfoUiModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintBottomSheetInfoUiModel.writeToParcel(dest, flags);
            }
            dest.writeString(this.size.name());
        }

        public final Animation zoijcleaow(yt.iobyxmoadg type, String backgroundColor, String id2, HintNavLink navLink, HintBottomSheetInfoUiModel bottomSheetInfo, iobyxmoadg size) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(size, "size");
            return new Animation(type, backgroundColor, id2, navLink, bottomSheetInfo, size);
        }

        public /* synthetic */ Animation(yt.iobyxmoadg iobyxmoadgVar, String str, String str2, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, iobyxmoadg iobyxmoadgVar2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(iobyxmoadgVar, str, str2, hintNavLink, hintBottomSheetInfoUiModel, (i13 & 32) != 0 ? iobyxmoadg.SMALL : iobyxmoadgVar2);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/myspar/common/view/hint/model/HintUiModel$Text;", "Lru/myspar/common/view/hint/model/HintUiModel;", "", "id", ExternalMetricsManagerImpl.NAME, "color", "colorText", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "size", "Lru/myspar/common/view/hint/model/HintNavLink;", "navLink", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "bottomSheetInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;Lru/myspar/common/view/hint/model/HintNavLink;Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;)Lru/myspar/common/view/hint/model/HintUiModel$Text;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "lqeggnwhkg", "()Lru/myspar/common/view/hint/model/HintUiModel$iobyxmoadg;", "esjtqupxsv", "Lru/myspar/common/view/hint/model/HintNavLink;", "()Lru/myspar/common/view/hint/model/HintNavLink;", "lereixgezr", "Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "vdvldrhtss", "()Lru/myspar/common/view/hint/model/HintBottomSheetInfoUiModel;", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Text implements HintUiModel {
        public static final Parcelable.Creator<Text> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final iobyxmoadg size;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintNavLink navLink;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String colorText;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String color;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final HintBottomSheetInfoUiModel bottomSheetInfo;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Text createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Text(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : HintNavLink.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HintBottomSheetInfoUiModel.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Text[] newArray(int i13) {
                return new Text[i13];
            }
        }

        public Text(String id2, String name, String color, String colorText, iobyxmoadg size, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(color, "color");
            zdlpuopuiu.btonecajqb(colorText, "colorText");
            zdlpuopuiu.btonecajqb(size, "size");
            this.id = id2;
            this.name = name;
            this.color = color;
            this.colorText = colorText;
            this.size = size;
            this.navLink = hintNavLink;
            this.bottomSheetInfo = hintBottomSheetInfoUiModel;
        }

        public static /* synthetic */ Text ppxfxbqfkf(Text text, String str, String str2, String str3, String str4, iobyxmoadg iobyxmoadgVar, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = text.id;
            }
            if ((i13 & 2) != 0) {
                str2 = text.name;
            }
            String str5 = str2;
            if ((i13 & 4) != 0) {
                str3 = text.color;
            }
            String str6 = str3;
            if ((i13 & 8) != 0) {
                str4 = text.colorText;
            }
            String str7 = str4;
            if ((i13 & 16) != 0) {
                iobyxmoadgVar = text.size;
            }
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
            if ((i13 & 32) != 0) {
                hintNavLink = text.navLink;
            }
            HintNavLink hintNavLink2 = hintNavLink;
            if ((i13 & 64) != 0) {
                hintBottomSheetInfoUiModel = text.bottomSheetInfo;
            }
            return text.zoijcleaow(str, str5, str6, str7, iobyxmoadgVar2, hintNavLink2, hintBottomSheetInfoUiModel);
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: cqumvgiudr, reason: from getter */
        public HintNavLink getNavLink() {
            return this.navLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return zdlpuopuiu.eablkybsjg(this.id, text.id) && zdlpuopuiu.eablkybsjg(this.name, text.name) && zdlpuopuiu.eablkybsjg(this.color, text.color) && zdlpuopuiu.eablkybsjg(this.colorText, text.colorText) && this.size == text.size && zdlpuopuiu.eablkybsjg(this.navLink, text.navLink) && zdlpuopuiu.eablkybsjg(this.bottomSheetInfo, text.bottomSheetInfo);
        }

        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getColorText() {
            return this.colorText;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.color.hashCode()) * 31) + this.colorText.hashCode()) * 31) + this.size.hashCode()) * 31;
            HintNavLink hintNavLink = this.navLink;
            int iHashCode2 = (iHashCode + (hintNavLink == null ? 0 : hintNavLink.hashCode())) * 31;
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            return iHashCode2 + (hintBottomSheetInfoUiModel != null ? hintBottomSheetInfoUiModel.hashCode() : 0);
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public iobyxmoadg getSize() {
            return this.size;
        }

        public String toString() {
            return "Text(id=" + this.id + ", name=" + this.name + ", color=" + this.color + ", colorText=" + this.colorText + ", size=" + this.size + ", navLink=" + this.navLink + ", bottomSheetInfo=" + this.bottomSheetInfo + ")";
        }

        @Override // ru.myspar.common.view.hint.model.HintUiModel
        /* JADX INFO: renamed from: vdvldrhtss, reason: from getter */
        public HintBottomSheetInfoUiModel getBottomSheetInfo() {
            return this.bottomSheetInfo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.color);
            dest.writeString(this.colorText);
            dest.writeString(this.size.name());
            HintNavLink hintNavLink = this.navLink;
            if (hintNavLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintNavLink.writeToParcel(dest, flags);
            }
            HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel = this.bottomSheetInfo;
            if (hintBottomSheetInfoUiModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                hintBottomSheetInfoUiModel.writeToParcel(dest, flags);
            }
        }

        public final Text zoijcleaow(String id2, String name, String color, String colorText, iobyxmoadg size, HintNavLink navLink, HintBottomSheetInfoUiModel bottomSheetInfo) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(color, "color");
            zdlpuopuiu.btonecajqb(colorText, "colorText");
            zdlpuopuiu.btonecajqb(size, "size");
            return new Text(id2, name, color, colorText, size, navLink, bottomSheetInfo);
        }

        public /* synthetic */ Text(String str, String str2, String str3, String str4, iobyxmoadg iobyxmoadgVar, HintNavLink hintNavLink, HintBottomSheetInfoUiModel hintBottomSheetInfoUiModel, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, str4, (i13 & 16) != 0 ? iobyxmoadg.SMALL : iobyxmoadgVar, hintNavLink, hintBottomSheetInfoUiModel);
        }
    }
}
