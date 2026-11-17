package ru.myspar.support_service.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/myspar/support_service/impl/domain/model/SupportAction;", "Landroid/os/Parcelable;", "", "iconUrl", ExternalMetricsManagerImpl.NAME, "Lru/myspar/core/navigation/model/NavigationPayload;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/core/navigation/model/NavigationPayload;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "Lru/myspar/core/navigation/model/NavigationPayload;", "ppxfxbqfkf", "()Lru/myspar/core/navigation/model/NavigationPayload;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportAction implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final NavigationPayload payload;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iconUrl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f104454iwizpuwonk = NavigationPayload.f87549istkbnxepw;
    public static final Parcelable.Creator<SupportAction> CREATOR = new iobyxmoadg();

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SupportAction createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SupportAction(parcel.readString(), parcel.readString(), (NavigationPayload) parcel.readParcelable(SupportAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SupportAction[] newArray(int i13) {
            return new SupportAction[i13];
        }
    }

    public SupportAction(String iconUrl, String name, NavigationPayload payload) {
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(payload, "payload");
        this.iconUrl = iconUrl;
        this.name = name;
        this.payload = payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportAction)) {
            return false;
        }
        SupportAction supportAction = (SupportAction) other;
        return zdlpuopuiu.eablkybsjg(this.iconUrl, supportAction.iconUrl) && zdlpuopuiu.eablkybsjg(this.name, supportAction.name) && zdlpuopuiu.eablkybsjg(this.payload, supportAction.payload);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.iconUrl.hashCode() * 31) + this.name.hashCode()) * 31) + this.payload.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final NavigationPayload getPayload() {
        return this.payload;
    }

    public String toString() {
        return "SupportAction(iconUrl=" + this.iconUrl + ", name=" + this.name + ", payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeString(this.name);
        dest.writeParcelable(this.payload, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }
}
