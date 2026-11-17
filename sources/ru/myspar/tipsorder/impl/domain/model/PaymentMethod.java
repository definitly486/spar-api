package ru.myspar.tipsorder.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/PaymentMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "zoijcleaow", "iconUrl", "getName", ExternalMetricsManagerImpl.NAME, "UserCard", "SbpOnline", "Online", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$Online;", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$SbpOnline;", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$UserCard;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentMethod implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R \u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0011¨\u0006\""}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$Online;", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod;", "", "iconUrl", ExternalMetricsManagerImpl.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "getId", "getId$annotations", "()V", "id", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Online extends PaymentMethod {
        public static final Parcelable.Creator<Online> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String iconUrl;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Online createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Online(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Online[] newArray(int i13) {
                return new Online[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Online(String iconUrl, String name) {
            super(null);
            zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
            zdlpuopuiu.btonecajqb(name, "name");
            this.iconUrl = iconUrl;
            this.name = name;
            String simpleName = Online.class.getSimpleName();
            zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
            this.id = simpleName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Online)) {
                return false;
            }
            Online online = (Online) other;
            return zdlpuopuiu.eablkybsjg(this.iconUrl, online.iconUrl) && zdlpuopuiu.eablkybsjg(this.name, online.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getId() {
            return this.id;
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.iconUrl.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Online(iconUrl=" + this.iconUrl + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.iconUrl);
            dest.writeString(this.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getIconUrl() {
            return this.iconUrl;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R \u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0011¨\u0006\""}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$SbpOnline;", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod;", "", "iconUrl", ExternalMetricsManagerImpl.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "getId", "getId$annotations", "()V", "id", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SbpOnline extends PaymentMethod {
        public static final Parcelable.Creator<SbpOnline> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String iconUrl;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final SbpOnline createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new SbpOnline(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final SbpOnline[] newArray(int i13) {
                return new SbpOnline[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SbpOnline(String iconUrl, String name) {
            super(null);
            zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
            zdlpuopuiu.btonecajqb(name, "name");
            this.iconUrl = iconUrl;
            this.name = name;
            String simpleName = SbpOnline.class.getSimpleName();
            zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
            this.id = simpleName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SbpOnline)) {
                return false;
            }
            SbpOnline sbpOnline = (SbpOnline) other;
            return zdlpuopuiu.eablkybsjg(this.iconUrl, sbpOnline.iconUrl) && zdlpuopuiu.eablkybsjg(this.name, sbpOnline.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getId() {
            return this.id;
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.iconUrl.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "SbpOnline(iconUrl=" + this.iconUrl + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.iconUrl);
            dest.writeString(this.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getIconUrl() {
            return this.iconUrl;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/PaymentMethod$UserCard;", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod;", "", "id", "iconUrl", ExternalMetricsManagerImpl.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getName", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserCard extends PaymentMethod {
        public static final Parcelable.Creator<UserCard> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String iconUrl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final UserCard createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new UserCard(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final UserCard[] newArray(int i13) {
                return new UserCard[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCard(String id2, String iconUrl, String name) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
            zdlpuopuiu.btonecajqb(name, "name");
            this.id = id2;
            this.iconUrl = iconUrl;
            this.name = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserCard)) {
                return false;
            }
            UserCard userCard = (UserCard) other;
            return zdlpuopuiu.eablkybsjg(this.id, userCard.id) && zdlpuopuiu.eablkybsjg(this.iconUrl, userCard.iconUrl) && zdlpuopuiu.eablkybsjg(this.name, userCard.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getId() {
            return this.id;
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode();
        }

        public String toString() {
            return "UserCard(id=" + this.id + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.iconUrl);
            dest.writeString(this.name);
        }

        @Override // ru.myspar.tipsorder.impl.domain.model.PaymentMethod
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public String getIconUrl() {
            return this.iconUrl;
        }
    }

    public /* synthetic */ PaymentMethod(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String getId();

    public abstract String getName();

    /* JADX INFO: renamed from: zoijcleaow */
    public abstract String getIconUrl();

    private PaymentMethod() {
    }
}
