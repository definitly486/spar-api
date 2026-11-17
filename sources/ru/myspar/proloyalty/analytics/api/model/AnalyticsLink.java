package ru.myspar.proloyalty.analytics.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink;", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "()Ljava/lang/String;", "yggfygwlhe", "ppxfxbqfkf", "transition", "jyumaefscl", "zoijcleaow", "reference", "DeepLink", "NavLink", "Push", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$DeepLink;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$NavLink;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$Push;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnalyticsLink implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final String reference;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String transition;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String type;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$DeepLink;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink;", "", "transition", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeepLink extends AnalyticsLink {
        public static final Parcelable.Creator<DeepLink> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reference;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transition;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final DeepLink createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new DeepLink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final DeepLink[] newArray(int i13) {
                return new DeepLink[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(String transition, String str) {
            super("deeplink", null);
            zdlpuopuiu.btonecajqb(transition, "transition");
            this.transition = transition;
            this.reference = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeepLink)) {
                return false;
            }
            DeepLink deepLink = (DeepLink) other;
            return zdlpuopuiu.eablkybsjg(this.transition, deepLink.transition) && zdlpuopuiu.eablkybsjg(this.reference, deepLink.reference);
        }

        public int hashCode() {
            int iHashCode = this.transition.hashCode() * 31;
            String str = this.reference;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public String getTransition() {
            return this.transition;
        }

        public String toString() {
            return "DeepLink(transition=" + this.transition + ", reference=" + this.reference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.transition);
            dest.writeString(this.reference);
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getReference() {
            return this.reference;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$NavLink;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink;", "", "transition", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavLink extends AnalyticsLink {
        public static final Parcelable.Creator<NavLink> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reference;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transition;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final NavLink createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new NavLink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final NavLink[] newArray(int i13) {
                return new NavLink[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavLink(String transition, String str) {
            super("navlink", null);
            zdlpuopuiu.btonecajqb(transition, "transition");
            this.transition = transition;
            this.reference = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavLink)) {
                return false;
            }
            NavLink navLink = (NavLink) other;
            return zdlpuopuiu.eablkybsjg(this.transition, navLink.transition) && zdlpuopuiu.eablkybsjg(this.reference, navLink.reference);
        }

        public int hashCode() {
            int iHashCode = this.transition.hashCode() * 31;
            String str = this.reference;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public String getTransition() {
            return this.transition;
        }

        public String toString() {
            return "NavLink(transition=" + this.transition + ", reference=" + this.reference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.transition);
            dest.writeString(this.reference);
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getReference() {
            return this.reference;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink$Push;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLink;", "", "transition", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Push extends AnalyticsLink {
        public static final Parcelable.Creator<Push> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reference;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transition;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Push createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Push(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Push[] newArray(int i13) {
                return new Push[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Push(String transition, String str) {
            super("push", null);
            zdlpuopuiu.btonecajqb(transition, "transition");
            this.transition = transition;
            this.reference = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Push)) {
                return false;
            }
            Push push = (Push) other;
            return zdlpuopuiu.eablkybsjg(this.transition, push.transition) && zdlpuopuiu.eablkybsjg(this.reference, push.reference);
        }

        public int hashCode() {
            int iHashCode = this.transition.hashCode() * 31;
            String str = this.reference;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public String getTransition() {
            return this.transition;
        }

        public String toString() {
            return "Push(transition=" + this.transition + ", reference=" + this.reference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.transition);
            dest.writeString(this.reference);
        }

        @Override // ru.myspar.proloyalty.analytics.api.model.AnalyticsLink
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getReference() {
            return this.reference;
        }
    }

    public /* synthetic */ AnalyticsLink(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public String getTransition() {
        return this.transition;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public String getReference() {
        return this.reference;
    }

    private AnalyticsLink(String str) {
        this.type = str;
        this.transition = "";
    }
}
