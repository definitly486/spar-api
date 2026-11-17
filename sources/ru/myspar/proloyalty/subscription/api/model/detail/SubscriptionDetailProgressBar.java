package ru.myspar.proloyalty.subscription.api.model.detail;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailProgressBar;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "currentValue", "neededValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "I", "zoijcleaow", "iwizpuwonk", "ppxfxbqfkf", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubscriptionDetailProgressBar implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetailProgressBar> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final int neededValue;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentValue;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailProgressBar createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SubscriptionDetailProgressBar(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailProgressBar[] newArray(int i13) {
            return new SubscriptionDetailProgressBar[i13];
        }
    }

    public SubscriptionDetailProgressBar(String title, String subtitle, int i13, int i14) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.currentValue = i13;
        this.neededValue = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetailProgressBar)) {
            return false;
        }
        SubscriptionDetailProgressBar subscriptionDetailProgressBar = (SubscriptionDetailProgressBar) other;
        return zdlpuopuiu.eablkybsjg(this.title, subscriptionDetailProgressBar.title) && zdlpuopuiu.eablkybsjg(this.subtitle, subscriptionDetailProgressBar.subtitle) && this.currentValue == subscriptionDetailProgressBar.currentValue && this.neededValue == subscriptionDetailProgressBar.neededValue;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.currentValue)) * 31) + Integer.hashCode(this.neededValue);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getNeededValue() {
        return this.neededValue;
    }

    public String toString() {
        return "SubscriptionDetailProgressBar(title=" + this.title + ", subtitle=" + this.subtitle + ", currentValue=" + this.currentValue + ", neededValue=" + this.neededValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeInt(this.currentValue);
        dest.writeInt(this.neededValue);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getCurrentValue() {
        return this.currentValue;
    }
}
